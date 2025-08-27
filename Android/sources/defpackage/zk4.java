package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: zk4  reason: default package */
public final class zk4 implements pog, bqg {
    public static final String v0 = h88.V("DelayMetCommandHandler");
    public PowerManager.WakeLock X;
    public boolean Y = false;
    public final bme Z;
    public final Context a;
    public final int b;
    public final wog c;
    public final z6f o;
    public final d19 v;
    public final Object w = new Object();
    public int x = 0;
    public final qn y;
    public final ky6 z;

    public zk4(Context context, int i, z6f z6f, bme bme) {
        this.a = context;
        this.b = i;
        this.o = z6f;
        this.c = bme.a;
        this.Z = bme;
        m7f m7f = z6f.v.j;
        g6d g6d = (g6d) z6f.b;
        this.y = (qn) g6d.b;
        this.z = (ky6) g6d.o;
        this.v = new d19(m7f, (pog) this);
    }

    public static void b(zk4 zk4) {
        wog wog = zk4.c;
        String str = wog.a;
        int i = zk4.x;
        String str2 = v0;
        if (i < 2) {
            zk4.x = 2;
            h88 x2 = h88.x();
            x2.p(str2, "Stopping work for WorkSpec " + str);
            Context context = zk4.a;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_STOP_WORK");
            f63.d(intent, wog);
            z6f z6f = zk4.o;
            int i2 = zk4.b;
            cp cpVar = new cp((Object) z6f, (Object) intent, i2, 4);
            ky6 ky6 = zk4.z;
            ky6.execute(cpVar);
            if (z6f.o.d(wog.a)) {
                h88 x3 = h88.x();
                x3.p(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, cls);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                f63.d(intent2, wog);
                ky6.execute(new cp((Object) z6f, (Object) intent2, i2, 4));
                return;
            }
            h88 x4 = h88.x();
            x4.p(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        h88 x5 = h88.x();
        x5.p(str2, "Already stopped work for " + str);
    }

    public final void a(List list) {
        this.y.execute(new yk4(this, 0));
    }

    public final void c() {
        synchronized (this.w) {
            try {
                this.v.E();
                this.o.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.X;
                if (wakeLock != null && wakeLock.isHeld()) {
                    h88 x2 = h88.x();
                    String str = v0;
                    x2.p(str, "Releasing wakelock " + this.X + "for WorkSpec " + this.c);
                    this.X.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.c.a;
        this.X = teg.a(this.a, wj6.l(g63.m(str, " ("), this.b, ")"));
        String str2 = v0;
        h88.x().p(str2, "Acquiring wakelock " + this.X + "for WorkSpec " + str);
        this.X.acquire();
        xpg m = this.o.v.c.y().m(str);
        if (m == null) {
            this.y.execute(new yk4(this, 0));
            return;
        }
        boolean c2 = m.c();
        this.Y = c2;
        if (!c2) {
            h88.x().p(str2, "No constraints for " + str);
            f(Collections.singletonList(m));
            return;
        }
        this.v.D(Collections.singletonList(m));
    }

    public final void e(boolean z2) {
        h88 x2 = h88.x();
        StringBuilder sb = new StringBuilder("onExecuted ");
        wog wog = this.c;
        sb.append(wog);
        sb.append(", ");
        sb.append(z2);
        x2.p(v0, sb.toString());
        c();
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        int i = this.b;
        z6f z6f = this.o;
        ky6 ky6 = this.z;
        Context context = this.a;
        if (z2) {
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_SCHEDULE_WORK");
            f63.d(intent, wog);
            ky6.execute(new cp((Object) z6f, (Object) intent, i, 4));
        }
        if (this.Y) {
            Intent intent2 = new Intent(context, cls);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            ky6.execute(new cp((Object) z6f, (Object) intent2, i, 4));
        }
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m5a.z((xpg) it.next()).equals(this.c)) {
                this.y.execute(new yk4(this, 1));
                return;
            }
        }
    }
}
