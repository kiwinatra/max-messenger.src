package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: eta  reason: default package */
public final class eta {
    public final Context a;
    public final ws b;
    public final ws c;
    public final ws d;
    public NotificationManager e;

    public eta(Context context, ed4 ed4) {
        this.a = context;
        this.b = n54.b(ed4.d(), ed4.c(), ed4.f());
        this.c = n54.b(ed4.b(), ed4.a());
        this.d = n54.b(ed4.h(), ed4.e(), ed4.g());
    }

    public final void a(int i, String str) {
        Context context = this.a;
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(str, context.getString(i));
        if (this.e == null) {
            this.e = (NotificationManager) context.getSystemService("notification");
        }
        NotificationManager notificationManager = this.e;
        if (notificationManager != null) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
