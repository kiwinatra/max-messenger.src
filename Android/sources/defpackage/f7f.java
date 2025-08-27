package defpackage;

import android.app.Notification;
import android.app.Service;

/* renamed from: f7f  reason: default package */
public abstract class f7f {
    public static void a(Service service, int i, Notification notification, int i2) {
        service.startForeground(i, notification, i2);
    }
}
