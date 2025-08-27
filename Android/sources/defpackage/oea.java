package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: oea  reason: default package */
public abstract class oea {
    public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
        notificationManager.createNotificationChannels(list);
    }

    public static void e(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void f(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static String g(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static String h(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static NotificationChannel i(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static List<NotificationChannel> k(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }
}
