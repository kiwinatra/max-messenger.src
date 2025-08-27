package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: iu6  reason: default package */
public final class iu6 implements mfd, pog, u95 {
    public static final String X = h88.V("GreedyScheduler");
    public final Context a;
    public final dpg b;
    public final d19 c;
    public final HashSet o = new HashSet();
    public final gl4 v;
    public boolean w;
    public final Object x;
    public final dm4 y = new dm4(26);
    public Boolean z;

    public iu6(Context context, ve3 ve3, m7f m7f, dpg dpg) {
        this.a = context;
        this.b = dpg;
        this.c = new d19(m7f, (pog) this);
        this.v = new gl4(this, ve3.e);
        this.x = new Object();
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wog z2 = m5a.z((xpg) it.next());
            h88 x2 = h88.x();
            x2.p(X, "Constraints not met: Cancelling work ID " + z2);
            bme r = this.y.r(z2);
            if (r != null) {
                dpg dpg = this.b;
                dpg.d.h(new swe(dpg, r, false));
            }
        }
    }

    public final void b(wog wog, boolean z2) {
        this.y.r(wog);
        synchronized (this.x) {
            try {
                Iterator it = this.o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    xpg xpg = (xpg) it.next();
                    if (m5a.z(xpg).equals(wog)) {
                        h88 x2 = h88.x();
                        String str = X;
                        x2.p(str, "Stopping tracking for " + wog);
                        this.o.remove(xpg);
                        this.c.D(this.o);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return false;
    }

    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.z;
        dpg dpg = this.b;
        if (bool == null) {
            ve3 ve3 = dpg.b;
            int i = lvb.a;
            String a2 = tl.a.a();
            ve3.getClass();
            this.z = Boolean.valueOf(Intrinsics.areEqual((Object) a2, (Object) this.a.getApplicationInfo().processName));
        }
        boolean booleanValue = this.z.booleanValue();
        String str2 = X;
        if (!booleanValue) {
            h88.x().G(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.w) {
            dpg.f.a(this);
            this.w = true;
        }
        h88 x2 = h88.x();
        x2.p(str2, "Cancelling work ID " + str);
        gl4 gl4 = this.v;
        if (!(gl4 == null || (runnable = (Runnable) gl4.c.remove(str)) == null)) {
            ((Handler) gl4.b.b).removeCallbacks(runnable);
        }
        for (bme swe : this.y.s(str)) {
            dpg.d.h(new swe(dpg, swe, false));
        }
    }

    public final void e(xpg... xpgArr) {
        boolean containsKey;
        boolean containsKey2;
        if (this.z == null) {
            ve3 ve3 = this.b.b;
            int i = lvb.a;
            String a2 = tl.a.a();
            ve3.getClass();
            this.z = Boolean.valueOf(Intrinsics.areEqual((Object) a2, (Object) this.a.getApplicationInfo().processName));
        }
        if (!this.z.booleanValue()) {
            h88.x().G(X, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.w) {
            this.b.f.a(this);
            this.w = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (xpg xpg : xpgArr) {
            wog z2 = m5a.z(xpg);
            dm4 dm4 = this.y;
            synchronized (dm4.b) {
                containsKey = ((LinkedHashMap) dm4.c).containsKey(z2);
            }
            if (!containsKey) {
                long a3 = xpg.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (xpg.b != xog.a) {
                    continue;
                } else if (currentTimeMillis < a3) {
                    gl4 gl4 = this.v;
                    if (gl4 != null) {
                        HashMap hashMap = gl4.c;
                        Runnable runnable = (Runnable) hashMap.remove(xpg.a);
                        grg grg = gl4.b;
                        if (runnable != null) {
                            ((Handler) grg.b).removeCallbacks(runnable);
                        }
                        uj6 uj6 = new uj6((Object) gl4, (Object) xpg, false, 5);
                        hashMap.put(xpg.a, uj6);
                        ((Handler) grg.b).postDelayed(uj6, xpg.a() - System.currentTimeMillis());
                    }
                } else if (xpg.c()) {
                    wj3 wj3 = xpg.j;
                    if (wj3.c) {
                        h88.x().p(X, "Ignoring " + xpg + ". Requires device idle.");
                    } else if (!wj3.h.isEmpty()) {
                        h88.x().p(X, "Ignoring " + xpg + ". Requires ContentUri triggers.");
                    } else {
                        hashSet.add(xpg);
                        hashSet2.add(xpg.a);
                    }
                } else {
                    dm4 dm42 = this.y;
                    wog wog = new wog(xpg.a, xpg.t);
                    synchronized (dm42.b) {
                        containsKey2 = ((LinkedHashMap) dm42.c).containsKey(wog);
                    }
                    if (!containsKey2) {
                        h88.x().p(X, "Starting work for " + xpg.a);
                        dpg dpg = this.b;
                        dm4 dm43 = this.y;
                        dm43.getClass();
                        dpg.h(dm43.w(new wog(xpg.a, xpg.t)), (aqg) null);
                    }
                }
            }
        }
        synchronized (this.x) {
            try {
                if (!hashSet.isEmpty()) {
                    h88.x().p(X, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.o.addAll(hashSet);
                    this.c.D(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        boolean containsKey;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            wog z2 = m5a.z((xpg) it.next());
            dm4 dm4 = this.y;
            synchronized (dm4.b) {
                containsKey = ((LinkedHashMap) dm4.c).containsKey(z2);
            }
            if (!containsKey) {
                h88 x2 = h88.x();
                x2.p(X, "Constraints met: Scheduling work ID " + z2);
                this.b.h(dm4.w(z2), (aqg) null);
            }
        }
    }
}
