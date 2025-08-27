package defpackage;

import android.app.Notification;

/* renamed from: fda  reason: default package */
public abstract class fda {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}
