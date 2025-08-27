package defpackage;

import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;

/* renamed from: pea  reason: default package */
public final class pea {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public pea(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(INotificationSideChannel iNotificationSideChannel) {
        iNotificationSideChannel.notify(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return wj6.n(sb, this.c, "]");
    }
}
