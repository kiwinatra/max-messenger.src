package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: z6a  reason: default package */
public abstract class z6a {
    public static final String a = h88.V("NetworkStateTracker");

    public static final x6a a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = true;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities a2 = l6a.a(connectivityManager, m6a.a(connectivityManager));
            if (a2 != null) {
                z = l6a.b(a2, 16);
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
                    z2 = false;
                }
                return new x6a(z3, z, isActiveNetworkMetered, z2);
            }
        } catch (SecurityException e) {
            h88.x().u(a, "Unable to validate active network", e);
        }
        z = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        z2 = false;
        return new x6a(z3, z, isActiveNetworkMetered2, z2);
    }
}
