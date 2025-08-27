package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* renamed from: yg4  reason: default package */
public abstract class yg4 {
    public static void a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
        if (v0g.a <= 27) {
            notificationChannel.setShowBadge(false);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
