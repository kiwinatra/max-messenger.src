package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: uda  reason: default package */
public abstract class uda {
    public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}
