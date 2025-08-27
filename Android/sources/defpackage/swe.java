package defpackage;

import java.util.Set;

/* renamed from: swe  reason: default package */
public final class swe implements Runnable {
    public static final String o = h88.V("StopWorkRunnable");
    public final dpg a;
    public final bme b;
    public final boolean c;

    public swe(dpg dpg, bme bme, boolean z) {
        this.a = dpg;
        this.b = bme;
        this.c = z;
    }

    public final void run() {
        boolean z;
        mqg mqg;
        if (this.c) {
            rvb rvb = this.a.f;
            bme bme = this.b;
            rvb.getClass();
            String str = bme.a.a;
            synchronized (rvb.Z) {
                try {
                    h88.x().p(rvb.v0, "Processor stopping foreground work " + str);
                    mqg = (mqg) rvb.w.remove(str);
                    if (mqg != null) {
                        rvb.y.remove(str);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = rvb.c(str, mqg);
        } else {
            rvb rvb2 = this.a.f;
            bme bme2 = this.b;
            rvb2.getClass();
            String str2 = bme2.a.a;
            synchronized (rvb2.Z) {
                try {
                    mqg mqg2 = (mqg) rvb2.x.remove(str2);
                    if (mqg2 == null) {
                        h88.x().p(rvb.v0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) rvb2.y.get(str2);
                        if (set != null) {
                            if (set.contains(bme2)) {
                                h88.x().p(rvb.v0, "Processor stopping background work " + str2);
                                rvb2.y.remove(str2);
                                z = rvb.c(str2, mqg2);
                            }
                        }
                    }
                    z = false;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        h88.x().p(o, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + z);
    }
}
