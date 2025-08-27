package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: m6a  reason: default package */
public abstract class m6a {
    public static final Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}
