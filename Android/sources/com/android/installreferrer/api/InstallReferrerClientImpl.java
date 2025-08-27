package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.uuid.Uuid;

class InstallReferrerClientImpl extends InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "InstallReferrerClient";
    /* access modifiers changed from: private */
    public int clientState = 0;
    private final Context mApplicationContext;
    /* access modifiers changed from: private */
    public z57 service;
    private ServiceConnection serviceConnection;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;

        /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
                r2 = this;
                java.lang.String r3 = "InstallReferrerClient"
                java.lang.String r0 = "Install Referrer service connected."
                com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r3, r0)
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                int r0 = defpackage.y57.c
                if (r4 != 0) goto L_0x000f
                r4 = 0
                goto L_0x0023
            L_0x000f:
                java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
                android.os.IInterface r0 = r4.queryLocalInterface(r0)
                boolean r1 = r0 instanceof defpackage.z57
                if (r1 == 0) goto L_0x001d
                r4 = r0
                z57 r4 = (defpackage.z57) r4
                goto L_0x0023
            L_0x001d:
                x57 r0 = new x57
                r0.<init>(r4)
                r4 = r0
            L_0x0023:
                defpackage.z57 unused = r3.service = r4
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                r4 = 2
                int unused = r3.clientState = r4
                com.android.installreferrer.api.InstallReferrerStateListener r2 = r2.mListener
                r3 = 0
                r2.onInstallReferrerSetupFinished(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.InstallReferrerServiceConnection.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn(InstallReferrerClientImpl.TAG, "Install Referrer service disconnected.");
            z57 unused = InstallReferrerClientImpl.this.service = null;
            int unused2 = InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }

        private InstallReferrerServiceConnection(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.mListener = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        try {
            return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, Uuid.SIZE_BITS).versionCode >= PLAY_STORE_MIN_APP_VER;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            InstallReferrerCommons.logVerbose(TAG, "Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.mApplicationContext.getPackageName());
            try {
                return new ReferrerDetails(((x57) this.service).l(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn(TAG, "RemoteException getting install referrer information");
                this.clientState = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose(TAG, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.clientState;
        if (i == 1) {
            InstallReferrerCommons.logWarn(TAG, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            InstallReferrerCommons.logWarn(TAG, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            InstallReferrerCommons.logVerbose(TAG, "Starting install referrer service setup.");
            Intent intent = new Intent(SERVICE_ACTION_NAME);
            intent.setComponent(new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));
            List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.clientState = 0;
                InstallReferrerCommons.logVerbose(TAG, "Install Referrer service unavailable on device.");
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!SERVICE_PACKAGE_NAME.equals(str) || str2 == null || !isPlayStoreCompatible()) {
                InstallReferrerCommons.logWarn(TAG, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.clientState = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(2);
                return;
            }
            Intent intent2 = new Intent(intent);
            InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);
            this.serviceConnection = installReferrerServiceConnection;
            try {
                if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {
                    InstallReferrerCommons.logVerbose(TAG, "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn(TAG, "Connection to service is blocked.");
                this.clientState = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
            } catch (SecurityException unused) {
                InstallReferrerCommons.logWarn(TAG, "No permission to connect to service.");
                this.clientState = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(4);
            }
        }
    }
}
