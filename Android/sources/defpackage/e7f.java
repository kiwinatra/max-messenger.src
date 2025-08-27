package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: e7f  reason: default package */
public final class e7f implements pog, u95 {
    public static final String X = h88.V("SystemFgDispatcher");
    public final dpg a;
    public final wdf b;
    public final Object c = new Object();
    public wog o;
    public final LinkedHashMap v;
    public final HashMap w;
    public final HashSet x;
    public final d19 y;
    public d7f z;

    public e7f(Context context) {
        dpg d = dpg.d(context);
        this.a = d;
        this.b = d.d;
        this.o = null;
        this.v = new LinkedHashMap();
        this.x = new HashSet();
        this.w = new HashMap();
        this.y = new d19(d.j, (pog) this);
        d.f.a(this);
    }

    public static Intent c(Context context, wog wog, o96 o96) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", wog.a);
        intent.putExtra("KEY_GENERATION", wog.b);
        intent.putExtra("KEY_NOTIFICATION_ID", o96.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", o96.b);
        intent.putExtra("KEY_NOTIFICATION", o96.c);
        return intent;
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xpg xpg = (xpg) it.next();
                String str = xpg.a;
                h88.x().p(X, a81.m("Constraints unmet for WorkSpec ", str));
                wog wog = new wog(xpg.a, xpg.t);
                dpg dpg = this.a;
                dpg.d.h(new swe(dpg, new bme(wog), true));
            }
        }
    }

    public final void b(wog wog, boolean z2) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                xpg xpg = (xpg) this.w.remove(wog);
                if (xpg != null ? this.x.remove(xpg) : false) {
                    this.y.D(this.x);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        o96 o96 = (o96) this.v.remove(wog);
        if (wog.equals(this.o) && this.v.size() > 0) {
            Iterator it = this.v.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.o = (wog) entry.getKey();
            if (this.z != null) {
                o96 o962 = (o96) entry.getValue();
                d7f d7f = this.z;
                SystemForegroundService systemForegroundService = (SystemForegroundService) d7f;
                systemForegroundService.b.post(new gk6(systemForegroundService, o962.a, o962.c, o962.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.z;
                systemForegroundService2.b.post(new tk0(systemForegroundService2, o962.a, 3));
            }
        }
        d7f d7f2 = this.z;
        if (o96 != null && d7f2 != null) {
            h88 x2 = h88.x();
            String str = X;
            x2.p(str, "Removing Notification (id: " + o96.a + ", workSpecId: " + wog + ", notificationType: " + o96.b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) d7f2;
            systemForegroundService3.b.post(new tk0(systemForegroundService3, o96.a, 3));
        }
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        wog wog = new wog(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h88 x2 = h88.x();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        x2.p(X, wj6.l(sb, intExtra2, ")"));
        if (notification != null && this.z != null) {
            o96 o96 = new o96(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.v;
            linkedHashMap.put(wog, o96);
            if (this.o == null) {
                this.o = wog;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.z;
                systemForegroundService.b.post(new gk6(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.z;
            systemForegroundService2.b.post(new cp((Object) systemForegroundService2, intExtra, (Object) notification, 5));
            if (intExtra2 != 0) {
                for (Map.Entry value : linkedHashMap.entrySet()) {
                    i |= ((o96) value.getValue()).b;
                }
                o96 o962 = (o96) linkedHashMap.get(this.o);
                if (o962 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.z;
                    systemForegroundService3.b.post(new gk6(systemForegroundService3, o962.a, o962.c, i));
                }
            }
        }
    }

    public final void e() {
        this.z = null;
        synchronized (this.c) {
            this.y.E();
        }
        this.a.f.e(this);
    }

    public final void f(List list) {
    }
}
