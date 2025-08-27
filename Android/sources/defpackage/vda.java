package defpackage;

import android.app.Notification;

/* renamed from: vda  reason: default package */
public abstract class vda {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }
}
