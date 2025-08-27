package defpackage;

import android.app.NotificationManager;

/* renamed from: nea  reason: default package */
public abstract class nea {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
