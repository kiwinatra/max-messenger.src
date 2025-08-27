package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

public class SystemAlarmService extends mv7 implements y6f {
    public static final String o = h88.V("SystemAlarmService");
    public z6f b;
    public boolean c;

    public final void a() {
        this.c = true;
        h88.x().p(o, "All commands completed in dispatcher");
        String str = teg.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (ueg.a) {
            linkedHashMap.putAll(ueg.b);
            Unit unit = Unit.INSTANCE;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                h88 x = h88.x();
                String str3 = teg.a;
                x.Z(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        z6f z6f = new z6f(this);
        this.b = z6f;
        if (z6f.z != null) {
            h88.x().t(z6f.X, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            z6f.z = this;
        }
        this.c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        z6f z6f = this.b;
        z6f.getClass();
        h88.x().p(z6f.X, "Destroying SystemAlarmDispatcher");
        z6f.o.e(z6f);
        z6f.z = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            h88.x().G(o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            z6f z6f = this.b;
            z6f.getClass();
            h88 x = h88.x();
            String str = z6f.X;
            x.p(str, "Destroying SystemAlarmDispatcher");
            z6f.o.e(z6f);
            z6f.z = null;
            z6f z6f2 = new z6f(this);
            this.b = z6f2;
            if (z6f2.z != null) {
                h88.x().t(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                z6f2.z = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(i2, intent);
        return 3;
    }
}
