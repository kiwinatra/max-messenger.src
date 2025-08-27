package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z6f  reason: default package */
public final class z6f implements u95 {
    public static final String X = h88.V("SystemAlarmDispatcher");
    public final Context a;
    public final wdf b;
    public final dqg c;
    public final rvb o;
    public final dpg v;
    public final f63 w;
    public final ArrayList x = new ArrayList();
    public Intent y = null;
    public y6f z;

    public z6f(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.w = new f63(applicationContext, new dm4(26));
        dpg d = dpg.d(context);
        this.v = d;
        this.c = new dqg(d.b.e);
        rvb rvb = d.f;
        this.o = rvb;
        this.b = d.d;
        rvb.a(this);
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        h88 x2 = h88.x();
        String str = X;
        x2.p(str, "Adding command " + intent + " (" + i + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h88.x().Z(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.x) {
                try {
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.x) {
            try {
                boolean z2 = !this.x.isEmpty();
                this.x.add(intent);
                if (!z2) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(wog wog, boolean z2) {
        String str = f63.v;
        Intent intent = new Intent(this.a, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        f63.d(intent, wog);
        ((ky6) ((g6d) this.b).o).execute(new cp((Object) this, (Object) intent, 0, 4));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a2 = teg.a(this.a, "ProcessCommand");
        try {
            a2.acquire();
            this.v.d.h(new x6f(this, 0));
        } finally {
            a2.release();
        }
    }
}
