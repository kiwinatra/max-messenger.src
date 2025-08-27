package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: f63  reason: default package */
public final class f63 implements u95 {
    public static final String v = h88.V("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final dm4 o;

    public f63(Context context, dm4 dm4) {
        this.a = context;
        this.o = dm4;
    }

    public static wog c(Intent intent) {
        return new wog(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, wog wog) {
        intent.putExtra("KEY_WORKSPEC_ID", wog.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", wog.b);
    }

    public final void a(Intent intent, int i, z6f z6f) {
        List<bme> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h88.x().p(v, "Handling constraints changed " + intent);
            yj3 yj3 = new yj3(this.a, i, z6f);
            ArrayList i2 = z6f.v.c.y().i();
            String str = hj3.a;
            Iterator it = i2.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                wj3 wj3 = ((xpg) it.next()).j;
                z |= wj3.d;
                z2 |= wj3.b;
                z3 |= wj3.e;
                z4 |= wj3.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = yj3.a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            d19 d19 = yj3.c;
            d19.D(i2);
            ArrayList arrayList = new ArrayList(i2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = i2.iterator();
            while (it2.hasNext()) {
                xpg xpg = (xpg) it2.next();
                String str3 = xpg.a;
                if (currentTimeMillis >= xpg.a() && (!xpg.c() || d19.e(str3))) {
                    arrayList.add(xpg);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                xpg xpg2 = (xpg) it3.next();
                String str4 = xpg2.a;
                int i3 = xpg2.t;
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                intent3.putExtra("KEY_WORKSPEC_ID", str4);
                intent3.putExtra("KEY_WORKSPEC_GENERATION", i3);
                h88.x().p(yj3.d, wj6.k("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((ky6) ((g6d) z6f.b).o).execute(new cp((Object) z6f, (Object) intent3, yj3.b, 4));
            }
            d19.E();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            h88.x().p(v, "Handling reschedule " + intent + ", " + i);
            z6f.v.g();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                h88.x().t(v, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                wog c2 = c(intent);
                String str5 = v;
                h88.x().p(str5, "Handling schedule work for " + c2);
                WorkDatabase workDatabase = z6f.v.c;
                workDatabase.c();
                try {
                    xpg m = workDatabase.y().m(c2.a);
                    if (m == null) {
                        h88.x().Z(str5, "Skipping scheduling " + c2 + " because it's no longer in the DB");
                    } else if (m.b.a()) {
                        h88.x().Z(str5, "Skipping scheduling " + c2 + "because it is finished.");
                    } else {
                        long a2 = m.a();
                        boolean c3 = m.c();
                        Context context2 = this.a;
                        if (!c3) {
                            h88.x().p(str5, "Setting up Alarms for " + c2 + "at " + a2);
                            ic.b(context2, workDatabase, c2, a2);
                        } else {
                            h88.x().p(str5, "Opportunistically setting an alarm for " + c2 + "at " + a2);
                            ic.b(context2, workDatabase, c2, a2);
                            Intent intent4 = new Intent(context2, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            ((ky6) ((g6d) z6f.b).o).execute(new cp((Object) z6f, (Object) intent4, i, 4));
                        }
                        workDatabase.r();
                    }
                } finally {
                    workDatabase.l();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.c) {
                    try {
                        wog c4 = c(intent);
                        h88 x = h88.x();
                        String str6 = v;
                        x.p(str6, "Handing delay met for " + c4);
                        if (!this.b.containsKey(c4)) {
                            zk4 zk4 = new zk4(this.a, i, z6f, this.o.w(c4));
                            this.b.put(c4, zk4);
                            zk4.d();
                        } else {
                            h88.x().p(str6, "WorkSpec " + c4 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                dm4 dm4 = this.o;
                if (containsKey) {
                    int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    bme r = dm4.r(new wog(string, i4));
                    list = arrayList2;
                    if (r != null) {
                        arrayList2.add(r);
                        list = arrayList2;
                    }
                } else {
                    list = dm4.s(string);
                }
                for (bme bme : list) {
                    h88.x().p(v, a81.m("Handing stopWork work for ", string));
                    dpg dpg = z6f.v;
                    dpg.d.h(new swe(dpg, bme, false));
                    WorkDatabase workDatabase2 = z6f.v.c;
                    wog wog = bme.a;
                    String str7 = ic.a;
                    m7f v2 = workDatabase2.v();
                    l7f m2 = v2.m(wog);
                    if (m2 != null) {
                        ic.a(this.a, wog, m2.c);
                        h88.x().p(ic.a, "Removing SystemIdInfo for workSpecId (" + wog + ")");
                        i6d i6d = (i6d) v2.a;
                        i6d.b();
                        t5d t5d = (t5d) v2.c;
                        gf6 E = t5d.E();
                        String str8 = wog.a;
                        if (str8 == null) {
                            E.X(1);
                        } else {
                            E.h(1, str8);
                        }
                        E.k(2, (long) wog.b);
                        i6d.c();
                        try {
                            E.n();
                            i6d.r();
                        } finally {
                            i6d.l();
                            t5d.S(E);
                        }
                    }
                    z6f.b(bme.a, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                wog c5 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                h88.x().p(v, "Handling onExecutionCompleted " + intent + ", " + i);
                b(c5, z5);
            } else {
                h88.x().Z(v, "Ignoring intent " + intent);
            }
        }
    }

    public final void b(wog wog, boolean z) {
        synchronized (this.c) {
            try {
                zk4 zk4 = (zk4) this.b.remove(wog);
                this.o.r(wog);
                if (zk4 != null) {
                    zk4.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
