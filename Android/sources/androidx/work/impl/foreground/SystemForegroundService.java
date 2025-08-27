package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;

public class SystemForegroundService extends mv7 implements d7f {
    public static final String w = h88.V("SystemFgService");
    public Handler b;
    public boolean c;
    public e7f o;
    public NotificationManager v;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.v = (NotificationManager) getApplicationContext().getSystemService("notification");
        e7f e7f = new e7f(getApplicationContext());
        this.o = e7f;
        if (e7f.z != null) {
            h88.x().t(e7f.X, "A callback already exists.");
        } else {
            e7f.z = this;
        }
    }

    public final void onCreate() {
        super.onCreate();
        a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.o.e();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = w;
        if (z) {
            h88.x().G(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.o.e();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        e7f e7f = this.o;
        e7f.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = e7f.X;
        if (equals) {
            h88 x = h88.x();
            x.G(str2, "Started foreground service " + intent);
            e7f.b.h(new vj6((Object) e7f, (Object) intent.getStringExtra("KEY_WORKSPEC_ID"), false, 23));
            e7f.d(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            e7f.d(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h88 x2 = h88.x();
            x2.G(str2, "Stopping foreground work for " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra);
            dpg dpg = e7f.a;
            dpg.getClass();
            dpg.d.h(new ew1(dpg, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            h88.x().G(str2, "Stopping foreground service");
            d7f d7f = e7f.z;
            if (d7f == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) d7f;
            systemForegroundService.c = true;
            h88.x().p(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
