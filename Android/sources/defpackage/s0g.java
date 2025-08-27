package defpackage;

import android.app.Notification;
import android.app.Service;

/* renamed from: s0g  reason: default package */
public abstract class s0g {
    public static void a(Service service, int i, Notification notification, int i2, String str) {
        try {
            service.startForeground(i, notification, i2);
        } catch (RuntimeException e) {
            i8b.o("The service must be declared with a foregroundServiceType that includes " + str);
            throw e;
        }
    }
}
