package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CountDownLatch;

/* renamed from: az1  reason: default package */
public final /* synthetic */ class az1 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ az1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                ((fs6) ((l15) this.b).a).b((gs6) this.c);
                return;
            case 1:
                kf5 kf5 = (kf5) this.b;
                kf5.w0 = 0;
                kf5.v = (gf5) ((fs6) this.c);
                return;
            case 2:
                vo5 vo5 = (vo5) this.b;
                r3f r3f = (r3f) this.c;
                synchronized (vo5) {
                    try {
                        if (vo5.p == null) {
                            if (!v0g.a(vo5.D, r3f)) {
                                r3f r3f2 = vo5.D;
                                if (r3f2 != null) {
                                    if (r3f != null) {
                                        if (!r3f2.a.equals(r3f.a)) {
                                        }
                                    }
                                    vo5.i();
                                }
                                r3f r3f3 = vo5.D;
                                if (r3f3 != null && r3f != null && r3f3.b == r3f.b && r3f3.c == r3f.c) {
                                    if (r3f3.d == r3f.d) {
                                        z = false;
                                        vo5.C = z;
                                        vo5.D = r3f;
                                        return;
                                    }
                                }
                                z = true;
                                vo5.C = z;
                                vo5.D = r3f;
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
            case 3:
                mqf mqf = (mqf) this.b;
                mqf.getClass();
                Pair pair = (Pair) this.c;
                long longValue = ((Long) pair.second).longValue();
                ((fs6) mqf.v).a((yr6) mqf.o, (gs6) pair.first, longValue);
                return;
            case 4:
                qx9 qx9 = ((sef) this.b).v;
                qx9.getClass();
                int i = ((gs6) this.c).a;
                ld8.t();
                qrf qrf = qx9.a;
                SparseArray sparseArray = qrf.v0;
                n79.n(v0g.l(sparseArray, i));
                sx9 sx9 = (sx9) sparseArray.get(i);
                sx9.a.d(sx9.b);
                sparseArray.remove(i);
                qrf.a();
                return;
            default:
                gy0 gy0 = (gy0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (gy0.x) {
                    gy0.w = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
