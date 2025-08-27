package org.webrtc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.http.util.LangUtils;
import org.webrtc.NetworkChangeDetector;
import ru.ok.tamtam.nano.Protos;

public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    private static final long INVALID_NET_ID = -1;
    private static final String TAG = "NetworkMonitorAutoDetect";
    private static boolean includeWifiDirect;
    private final ConnectivityManager.NetworkCallback allNetworkCallback;
    final Set<Network> availableNetworks;
    private NetworkChangeDetector.ConnectionType connectionType;
    /* access modifiers changed from: private */
    public ConnectivityManagerDelegate connectivityManagerDelegate;
    private final Context context;
    private final IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private boolean isRegistered;
    private final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    /* access modifiers changed from: private */
    public final NetworkChangeDetector.Observer observer;
    private WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private WifiManagerDelegate wifiManagerDelegate;
    private String wifiSSID;

    public static class ConnectivityManagerDelegate {
        private final Set<Network> availableNetworks;
        private final ConnectivityManager connectivityManager;
        private final boolean getAllNetworksFromCache;
        private final boolean includeOtherUidNetworks;
        private final boolean requestVPN;

        public ConnectivityManagerDelegate(Context context, Set<Network> set, String str) {
            this((ConnectivityManager) context.getSystemService("connectivity"), set, str);
        }

        private static boolean checkFieldTrial(String str, String str2, boolean z) {
            if (str.contains(str2 + ":true")) {
                return true;
            }
            if (str.contains(str2 + ":false")) {
                return false;
            }
            return z;
        }

        /* access modifiers changed from: private */
        @SuppressLint({"NewApi"})
        public NetworkChangeDetector.NetworkInformation networkToInfo(Network network) {
            ConnectivityManager connectivityManager2;
            if (network == null || (connectivityManager2 = this.connectivityManager) == null) {
                return null;
            }
            LinkProperties linkProperties = connectivityManager2.getLinkProperties(network);
            if (linkProperties == null) {
                String network2 = network.toString();
                Logging.w(NetworkMonitorAutoDetect.TAG, "Detected unknown network: " + network2);
                return null;
            } else if (linkProperties.getInterfaceName() == null) {
                String network3 = network.toString();
                Logging.w(NetworkMonitorAutoDetect.TAG, "Null interface name for network " + network3);
                return null;
            } else {
                NetworkState networkState = getNetworkState(network);
                NetworkChangeDetector.ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
                if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                    String network4 = network.toString();
                    Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network4 + " is disconnected");
                    return null;
                }
                if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    String network5 = network.toString();
                    int networkType = networkState.getNetworkType();
                    int networkSubType = networkState.getNetworkSubType();
                    Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network5 + " connection type is " + connectionType + " because it has type " + networkType + " and subtype " + networkSubType);
                }
                return new NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), NetworkMonitorAutoDetect.networkToNetId(network), getIPAddresses(linkProperties));
            }
        }

        @SuppressLint({"NewApi"})
        public NetworkRequest createNetworkRequest() {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            if (this.requestVPN) {
                addCapability.removeCapability(15);
            }
            if (Build.VERSION.SDK_INT >= 31 && this.includeOtherUidNetworks) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            return addCapability.build();
        }

        public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            if (!supportNetworkCallback()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Network networkToInfo : getAllNetworks()) {
                NetworkChangeDetector.NetworkInformation networkToInfo2 = networkToInfo(networkToInfo);
                if (networkToInfo2 != null) {
                    arrayList.add(networkToInfo2);
                }
            }
            return arrayList;
        }

        @SuppressLint({"NewApi"})
        public Network[] getAllNetworks() {
            Network[] networkArr;
            if (this.connectivityManager == null) {
                return new Network[0];
            }
            if (!supportNetworkCallback() || !this.getAllNetworksFromCache) {
                return this.connectivityManager.getAllNetworks();
            }
            synchronized (this.availableNetworks) {
                networkArr = (Network[]) this.availableNetworks.toArray(new Network[0]);
            }
            return networkArr;
        }

        @SuppressLint({"NewApi"})
        public long getDefaultNetId() {
            NetworkInfo activeNetworkInfo;
            NetworkInfo networkInfo;
            if (!supportNetworkCallback() || (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            long j = -1;
            for (Network network : getAllNetworks()) {
                if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j == -1) {
                        j = NetworkMonitorAutoDetect.networkToNetId(network);
                    } else {
                        throw new RuntimeException("Multiple connected networks of same type are not supported.");
                    }
                }
            }
            return j;
        }

        @SuppressLint({"NewApi"})
        public NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            int i = 0;
            for (LinkAddress address : linkProperties.getLinkAddresses()) {
                iPAddressArr[i] = new NetworkChangeDetector.IPAddress(address.getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        public NetworkState getNetworkState() {
            ConnectivityManager connectivityManager2 = this.connectivityManager;
            if (connectivityManager2 == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(connectivityManager2.getActiveNetworkInfo());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r1 = r1.getNetworkCapabilities(r2);
         */
        @android.annotation.SuppressLint({"NewApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasInternetCapability(android.net.Network r2) {
            /*
                r1 = this;
                android.net.ConnectivityManager r1 = r1.connectivityManager
                r0 = 0
                if (r1 != 0) goto L_0x0006
                return r0
            L_0x0006:
                android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r2)
                if (r1 == 0) goto L_0x0015
                r2 = 12
                boolean r1 = r1.hasCapability(r2)
                if (r1 == 0) goto L_0x0015
                r0 = 1
            L_0x0015:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate.hasInternetCapability(android.net.Network):boolean");
        }

        @SuppressLint({"NewApi"})
        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(createNetworkRequest(), networkCallback);
        }

        @SuppressLint({"NewApi"})
        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                Logging.d(NetworkMonitorAutoDetect.TAG, "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        @SuppressLint({"NewApi"})
        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        public boolean supportNetworkCallback() {
            return this.connectivityManager != null;
        }

        public ConnectivityManagerDelegate(ConnectivityManager connectivityManager2, Set<Network> set, String str) {
            this.connectivityManager = connectivityManager2;
            this.availableNetworks = set;
            this.getAllNetworksFromCache = checkFieldTrial(str, "getAllNetworksFromCache", false);
            this.requestVPN = checkFieldTrial(str, "requestVPN", false);
            this.includeOtherUidNetworks = checkFieldTrial(str, "includeOtherUidNetworks", false);
        }

        @SuppressLint({"NewApi"})
        public NetworkState getNetworkState(Network network) {
            ConnectivityManager connectivityManager2;
            NetworkInfo activeNetworkInfo;
            Network network2 = network;
            if (network2 == null || (connectivityManager2 = this.connectivityManager) == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network2);
            if (networkInfo == null) {
                String network3 = network.toString();
                Logging.w(NetworkMonitorAutoDetect.TAG, "Couldn't retrieve information from network " + network3);
                return new NetworkState(false, -1, -1, -1, -1);
            } else if (networkInfo.getType() != 17) {
                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network2);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    return getNetworkState(networkInfo);
                }
                return new NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
            } else if (networkInfo.getType() != 17) {
                return getNetworkState(networkInfo);
            } else {
                if (!network2.equals(this.connectivityManager.getActiveNetwork()) || (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                    return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                }
                return new NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
            }
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo == null || !networkInfo.isConnected()) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }
    }

    public static class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }
    }

    @SuppressLint({"NewApi"})
    public class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        final Set<Network> availableNetworks;

        public SimpleNetworkCallback(Set<Network> set) {
            this.availableNetworks = set;
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation a = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (a != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(a);
            }
        }

        public void onAvailable(Network network) {
            long d = NetworkMonitorAutoDetect.networkToNetId(network);
            String network2 = network.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "Network handle: " + d + " becomes available: " + network2);
            synchronized (this.availableNetworks) {
                this.availableNetworks.add(network);
            }
            onNetworkChanged(network);
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long d = NetworkMonitorAutoDetect.networkToNetId(network);
            String networkCapabilities2 = networkCapabilities.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "handle: " + d + " capabilities changed: " + networkCapabilities2);
            onNetworkChanged(network);
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            long d = NetworkMonitorAutoDetect.networkToNetId(network);
            Logging.d(NetworkMonitorAutoDetect.TAG, "handle: " + d + " link properties changed");
            onNetworkChanged(network);
        }

        public void onLosing(Network network, int i) {
            StringBuilder k = i2a.k("Network handle: ", NetworkMonitorAutoDetect.networkToNetId(network), ", ", network.toString());
            k.append(" is about to lose in ");
            k.append(i);
            k.append("ms");
            Logging.d(NetworkMonitorAutoDetect.TAG, k.toString());
        }

        public void onLost(Network network) {
            StringBuilder k = i2a.k("Network handle: ", NetworkMonitorAutoDetect.networkToNetId(network), ", ", network.toString());
            k.append(" is disconnected");
            Logging.d(NetworkMonitorAutoDetect.TAG, k.toString());
            synchronized (this.availableNetworks) {
                this.availableNetworks.remove(network);
            }
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(NetworkMonitorAutoDetect.networkToNetId(network));
        }
    }

    public static class WifiDirectManagerDelegate extends BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final Context context;
        private final NetworkChangeDetector.Observer observer;
        private NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        public WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer2, Context context2) {
            this.context = context2;
            this.observer = observer2;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context2.registerReceiver(this, intentFilter);
            WifiP2pManager wifiP2pManager = (WifiP2pManager) context2.getSystemService("wifip2p");
            wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context2, context2.getMainLooper(), (WifiP2pManager.ChannelListener) null), new c(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange */
        public void lambda$new$0(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
                try {
                    ArrayList<T> list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                    NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        iPAddressArr[i] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i)).getAddress());
                    }
                    NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0, iPAddressArr);
                    this.wifiP2pNetworkInfo = networkInformation;
                    this.observer.onNetworkConnect(networkInformation);
                } catch (SocketException e) {
                    Logging.e(NetworkMonitorAutoDetect.TAG, "Unable to get WifiP2p network interface", e);
                }
            }
        }

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0);
            }
        }

        public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            return networkInformation != null ? Collections.singletonList(networkInformation) : Collections.emptyList();
        }

        @SuppressLint({"InlinedApi"})
        public void onReceive(Context context2, Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                lambda$new$0((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }
    }

    @SuppressLint({"NewApi"})
    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer2, Context context2) {
        HashSet hashSet = new HashSet();
        this.availableNetworks = hashSet;
        this.observer = observer2;
        this.context = context2;
        this.connectivityManagerDelegate = new ConnectivityManagerDelegate(context2, (Set<Network>) hashSet, observer2.getFieldTrialsString());
        this.wifiManagerDelegate = new WifiManagerDelegate(context2);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer2, context2);
        }
        registerReceiver();
        if (this.connectivityManagerDelegate.supportNetworkCallback()) {
            SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback(hashSet);
            this.allNetworkCallback = simpleNetworkCallback;
            this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
        } else {
            this.allNetworkCallback = null;
        }
        this.mobileNetworkCallback = null;
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType2 = getConnectionType(networkState);
        String wifiSSID2 = getWifiSSID(networkState);
        if (connectionType2 != this.connectionType || !wifiSSID2.equals(this.wifiSSID)) {
            this.connectionType = connectionType2;
            this.wifiSSID = wifiSSID2;
            Logging.d(TAG, "Network connectivity changed, type is: " + connectionType2);
            this.observer.onConnectionTypeChanged(connectionType2);
        }
    }

    private static NetworkChangeDetector.ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i != 0) {
            if (i == 1) {
                return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
            }
            if (!(i == 4 || i == 5)) {
                if (i == 6) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
                }
                if (i == 7) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
                }
                if (i == 9) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
                }
                if (i != 17) {
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
                }
                return NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
            }
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
            case LangUtils.HASH_SEED:
                return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
            case 13:
            case 18:
                return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
            case 20:
                return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
            default:
                return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
        }
    }

    /* access modifiers changed from: private */
    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        return networkState.getNetworkType() != 17 ? NetworkChangeDetector.ConnectionType.CONNECTION_NONE : getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private String getWifiSSID(NetworkState networkState) {
        return getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI ? "" : this.wifiManagerDelegate.getWifiSSID();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private void registerReceiver() {
        if (!this.isRegistered) {
            this.isRegistered = true;
            this.context.registerReceiver(this, this.intentFilter);
        }
    }

    public static void setIncludeWifiDirect(boolean z) {
        includeWifiDirect = z;
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate2 = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate2 != null) {
            wifiDirectManagerDelegate2.release();
        }
        unregisterReceiver();
    }

    public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate2 = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate2 != null) {
            arrayList.addAll(wifiDirectManagerDelegate2.getActiveNetworkList());
        }
        return arrayList;
    }

    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(getCurrentNetworkState());
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    public void onReceive(Context context2, Intent intent) {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
    }

    public void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate2) {
        this.connectivityManagerDelegate = connectivityManagerDelegate2;
    }

    public void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate2) {
        this.wifiManagerDelegate = wifiManagerDelegate2;
    }

    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    public static class WifiManagerDelegate {
        private final Context context;

        public WifiManagerDelegate(Context context2) {
            this.context = context2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
            r2 = (r2 = (android.net.wifi.WifiInfo) r2.getParcelableExtra("wifiInfo")).getSSID();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getWifiSSID() {
            /*
                r2 = this;
                android.content.Context r2 = r2.context
                android.content.IntentFilter r0 = new android.content.IntentFilter
                java.lang.String r1 = "android.net.wifi.STATE_CHANGE"
                r0.<init>(r1)
                r1 = 0
                android.content.Intent r2 = r2.registerReceiver(r1, r0)
                if (r2 == 0) goto L_0x0021
                java.lang.String r0 = "wifiInfo"
                android.os.Parcelable r2 = r2.getParcelableExtra(r0)
                android.net.wifi.WifiInfo r2 = (android.net.wifi.WifiInfo) r2
                if (r2 == 0) goto L_0x0021
                java.lang.String r2 = r2.getSSID()
                if (r2 == 0) goto L_0x0021
                return r2
            L_0x0021:
                java.lang.String r2 = ""
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate.getWifiSSID():java.lang.String");
        }

        public WifiManagerDelegate() {
            this.context = null;
        }
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }
}
