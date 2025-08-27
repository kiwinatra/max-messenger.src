package org.webrtc;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import org.webrtc.NetworkMonitorAutoDetect;

public final /* synthetic */ class c implements WifiP2pManager.GroupInfoListener {
    public final /* synthetic */ NetworkMonitorAutoDetect.WifiDirectManagerDelegate a;

    public /* synthetic */ c(NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate) {
        this.a = wifiDirectManagerDelegate;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.a.lambda$new$0(wifiP2pGroup);
    }
}
