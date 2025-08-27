package defpackage;

import android.app.Notification;

/* renamed from: wda  reason: default package */
public abstract class wda {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
