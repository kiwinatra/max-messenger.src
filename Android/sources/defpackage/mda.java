package defpackage;

import android.app.Notification;

/* renamed from: mda  reason: default package */
public abstract class mda {
    public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addHistoricMessage(message);
    }
}
