package defpackage;

import android.app.Notification;

/* renamed from: o96  reason: default package */
public final class o96 {
    public final int a;
    public final int b;
    public final Notification c;

    public o96(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o96.class != obj.getClass()) {
            return false;
        }
        o96 o96 = (o96) obj;
        if (this.a == o96.a && this.b == o96.b) {
            return this.c.equals(o96.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
