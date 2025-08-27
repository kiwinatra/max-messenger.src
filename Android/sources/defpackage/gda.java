package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* renamed from: gda  reason: default package */
public abstract class gda {
    public static Parcelable a(Icon icon) {
        return icon;
    }

    public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static void c(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }
}
