package defpackage;

import android.app.Notification;

/* renamed from: xca  reason: default package */
public abstract class xca {
    public static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }
}
