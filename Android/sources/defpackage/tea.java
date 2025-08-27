package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: tea  reason: default package */
public final class tea {
    public static final Object c = new Object();
    public static String d;
    public static HashSet e = new HashSet();
    public static final Object f = new Object();
    public static sea g;
    public final Context a;
    public final NotificationManager b;

    public tea(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i, notification);
            return;
        }
        pea pea = new pea(this.a.getPackageName(), i, str, notification);
        synchronized (f) {
            try {
                if (g == null) {
                    g = new sea(this.a.getApplicationContext());
                }
                g.b.obtainMessage(0, pea).sendToTarget();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        notificationManager.cancel(str, i);
    }
}
