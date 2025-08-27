package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xp1  reason: default package */
public final /* synthetic */ class xp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zp1 b;

    public /* synthetic */ xp1(zp1 zp1, int i) {
        this.a = i;
        this.b = zp1;
    }

    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                zp1 zp1 = this.b;
                zp1.getClass();
                zp1.c = new yp1();
                new File(((po5) zp1.y0).b(), "call_history_state").delete();
                return;
            case 1:
                zp1 zp12 = this.b;
                zp12.g();
                if (zp12.x == 0) {
                    if (zp12.c.b == 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    z68.c("zp1", "sync: from: " + zp12.c.b + " forward: " + z2, new Object[0]);
                    rl rlVar = zp12.Z;
                    jna jna = (jna) rlVar;
                    zp12.x = jna.z(jna, new t3g(((ltb) jna.D()).a.n(), zp12.c.b, z2));
                    return;
                }
                return;
            case 2:
                Iterator it = this.b.w.iterator();
                while (it.hasNext()) {
                    n71 n71 = (n71) it.next();
                    z68.c("CallHistoryPageViewModel", "loaded history for type=" + n71.b, new Object[0]);
                    n71.m();
                }
                return;
            case 3:
                zp1 zp13 = this.b;
                zp13.z0.d(zp13);
                return;
            case 4:
                zp1 zp14 = this.b;
                zp14.z0.f(zp14);
                return;
            default:
                zp1 zp15 = this.b;
                if (!zp15.a) {
                    zp15.g();
                    if (zp15.c.a.a == 0 && zp15.c.a.b == 0 && zp15.c.v) {
                        zp15.i(new xp1(zp15, 1));
                        return;
                    }
                    ArrayList n = zp15.v0.n(zp15.c.a.a, zp15.c.a.b);
                    z68.c("zp1", "loadInitial: loaded from db: " + n.size() + " messages", new Object[0]);
                    zp15.b(zp15.o.size(), n);
                    zp15.a = true;
                    zp15.b = n.isEmpty();
                    zp15.h();
                    if (zp15.c.o) {
                        zp15.i(new c70((Object) zp15, true, 5));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
