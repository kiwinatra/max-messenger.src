package defpackage;

import android.os.Handler;

/* renamed from: yk4  reason: default package */
public final /* synthetic */ class yk4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk4 b;

    public /* synthetic */ yk4(zk4 zk4, int i) {
        this.a = i;
        this.b = zk4;
    }

    public final void run() {
        int i = this.a;
        zk4 zk4 = this.b;
        switch (i) {
            case 0:
                zk4.b(zk4);
                return;
            default:
                if (zk4.x == 0) {
                    zk4.x = 1;
                    h88 x = h88.x();
                    String str = zk4.v0;
                    x.p(str, "onAllConstraintsMet for " + zk4.c);
                    if (zk4.o.o.h(zk4.Z, (aqg) null)) {
                        dqg dqg = zk4.o.c;
                        wog wog = zk4.c;
                        synchronized (dqg.d) {
                            h88 x2 = h88.x();
                            String str2 = dqg.e;
                            x2.p(str2, "Starting timer for " + wog);
                            dqg.a(wog);
                            cqg cqg = new cqg(dqg, wog);
                            dqg.b.put(wog, cqg);
                            dqg.c.put(wog, zk4);
                            ((Handler) dqg.a.b).postDelayed(cqg, 600000);
                        }
                        return;
                    }
                    zk4.c();
                    return;
                }
                h88 x3 = h88.x();
                String str3 = zk4.v0;
                x3.p(str3, "Already started work for " + zk4.c);
                return;
        }
    }
}
