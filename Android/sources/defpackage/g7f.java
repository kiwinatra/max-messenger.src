package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: g7f  reason: default package */
public abstract class g7f {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            h88.x().a0(SystemForegroundService.w, "Unable to start foreground service", e);
        }
    }
}
