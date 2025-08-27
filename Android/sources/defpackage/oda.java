package defpackage;

import android.app.Notification;
import android.net.Uri;

/* renamed from: oda  reason: default package */
public abstract class oda {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
