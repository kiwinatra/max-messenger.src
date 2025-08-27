package com.my.tracker.obfuscated;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public final class i1 {
    private int a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return -1;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            return type != 1 ? 1 : 3;
        }
        return 2;
    }

    private String b(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.getType() == 0 ? networkInfo.getSubtypeName() : networkInfo.getTypeName();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ SecurityException -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.h1 a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.my.tracker.obfuscated.m1.a(r0, r6)
            r1 = -1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch:{ SecurityException -> 0x0028 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ SecurityException -> 0x0028 }
            if (r0 == 0) goto L_0x001e
            android.net.NetworkInfo r4 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0028 }
            int r3 = r5.a((android.net.ConnectivityManager) r0)     // Catch:{ SecurityException -> 0x0028 }
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            int r1 = r5.a((android.net.NetworkInfo) r4)     // Catch:{ SecurityException -> 0x0028 }
            java.lang.String r5 = r5.b(r4)     // Catch:{ SecurityException -> 0x0028 }
            goto L_0x002e
        L_0x0028:
            java.lang.String r5 = "NetworkInfoDataProvider: No permissions for access to network state"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r5)
        L_0x002d:
            r5 = r2
        L_0x002e:
            boolean r0 = com.my.tracker.obfuscated.m1.a()
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "android.permission.BLUETOOTH"
            boolean r6 = com.my.tracker.obfuscated.m1.a(r0, r6)
            if (r6 == 0) goto L_0x0054
            android.bluetooth.BluetoothAdapter r6 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ SecurityException -> 0x004f }
            if (r6 == 0) goto L_0x0054
            boolean r6 = r6.isEnabled()     // Catch:{ SecurityException -> 0x004f }
            if (r6 == 0) goto L_0x004c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ SecurityException -> 0x004f }
        L_0x004a:
            r2 = r6
            goto L_0x0054
        L_0x004c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ SecurityException -> 0x004f }
            goto L_0x004a
        L_0x004f:
            java.lang.String r6 = "NetworkInfoDataProvider: Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r6)
        L_0x0054:
            com.my.tracker.obfuscated.h1 r6 = new com.my.tracker.obfuscated.h1
            r6.<init>(r1, r5, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i1.a(android.content.Context):com.my.tracker.obfuscated.h1");
    }

    private int a(ConnectivityManager connectivityManager) {
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(4) ? 2 : 1;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
