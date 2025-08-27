package defpackage;

import android.net.ConnectivityManager;

/* renamed from: n6a  reason: default package */
public abstract class n6a {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
