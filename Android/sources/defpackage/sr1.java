package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sr1  reason: default package */
public final /* synthetic */ class sr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqg b;

    public /* synthetic */ sr1(aqg aqg, int i) {
        this.a = i;
        this.b = aqg;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                aqg aqg = this.b;
                if (!((AtomicBoolean) aqg.b).getAndSet(true)) {
                    ((xr1) ((xe8) aqg.c).c).c.execute(new sr1(aqg, 1));
                    return;
                }
                return;
            default:
                aqg aqg2 = this.b;
                if (((xr1) ((xe8) aqg2.c).c).Q0 != 8) {
                    xr1 xr1 = (xr1) ((xe8) aqg2.c).c;
                    int i = xr1.Q0;
                    xr1.toString();
                    return;
                }
                ((xr1) ((xe8) aqg2.c).c).toString();
                ((xr1) ((xe8) aqg2.c).c).E(7);
                ((xr1) ((xe8) aqg2.c).c).y.b();
                return;
        }
    }
}
