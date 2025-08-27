package defpackage;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: khd  reason: default package */
public final /* synthetic */ class khd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lhd b;

    public /* synthetic */ khd(lhd lhd, int i) {
        this.a = i;
        this.b = lhd;
    }

    public final void run() {
        int i = this.a;
        lhd lhd = this.b;
        switch (i) {
            case 0:
                if (lhd.x) {
                    xd6 xd6 = lhd.o;
                    if (xd6 != null) {
                        xd6.o.c(new wd6(xd6, 0));
                    }
                    be6 be6 = lhd.v;
                    if (be6 != null) {
                        be6.c.c(new ae6(be6, 1));
                    }
                    if (lhd.w != null) {
                        lhd.w.c(false);
                    }
                }
                xd6 xd62 = lhd.o;
                if (xd62 != null) {
                    xd62.x = null;
                    xd62.o.a(new wd6(xd62, 1));
                }
                be6 be62 = lhd.v;
                if (be62 != null) {
                    be62.c.c(new ae6(be62, 1));
                    be62.c.a(new ae6(be62, 2));
                }
                if (lhd.w != null) {
                    lhd.w.c(false);
                }
                xd6 xd63 = lhd.o;
                if (xd63 != null) {
                    rx3 rx3 = xd63.o;
                    rx3.getClass();
                    try {
                        ((CountDownLatch) rx3.d).await();
                    } catch (InterruptedException unused) {
                    }
                }
                lhd.o = null;
                lhd.v = null;
                lhd.w = null;
                lhd.c = true;
                return;
            case 1:
                xd6 xd64 = lhd.o;
                if (xd64 != null) {
                    xd64.o.c(new wd6(xd64, 0));
                }
                be6 be63 = lhd.v;
                if (be63 != null) {
                    be63.c.c(new ae6(be63, 1));
                }
                if (lhd.w != null) {
                    lhd.w.c(false);
                    return;
                }
                return;
            default:
                double b2 = lhd.o.y.b();
                double b3 = lhd.v.X.b();
                double b4 = lhd.v.Y.b();
                double b5 = lhd.w.f.b();
                voc voc = lhd.a;
                voc.log("SSStat", "capturer: " + b2 + " , encoder: " + b3 + " | " + b4 + " , sender: " + b5);
                rx3 rx32 = lhd.b;
                ((Handler) rx32.b).postDelayed(lhd.y, 1000);
                return;
        }
    }
}
