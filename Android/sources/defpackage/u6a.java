package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: u6a  reason: default package */
public final class u6a implements xvb {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public u6a(xvb xvb, ynb ynb, Executor executor) {
        xvb.getClass();
        this.b = xvb;
        this.c = ynb;
        executor.getClass();
        this.d = executor;
    }

    public static void e(f69 f69, int i, zi0 zi0) {
        jd4 p0 = y33.p0(f69.n());
        j55 j55 = null;
        try {
            j55 j552 = new j55(p0);
            try {
                j552.U();
                zi0.g(i, j552);
                j55.b(j552);
                y33.U(p0);
            } catch (Throwable th) {
                th = th;
                j55 = j552;
                j55.b(j55);
                y33.U(p0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j55.b(j55);
            y33.U(p0);
            throw th;
        }
    }

    public final void a(zi0 zi0, yvb yvb) {
        switch (this.a) {
            case 0:
                ((ik0) yvb).c.j(yvb, "NetworkFetchProducer");
                kne kne = (kne) this.d;
                lk5 m = kne.m(zi0, yvb);
                kne.p(m, new p7d(this, m, false, 18));
                return;
            default:
                ik0 ik0 = (ik0) yvb;
                bwb bwb = ik0.c;
                bsb bsb = ik0.a.q;
                bsb.getClass();
                ((xvb) this.b).a(new na(new csb(this, zi0, bwb, bsb, yvb), 1), yvb);
                return;
        }
    }

    public void c(f69 f69, lk5 lk5) {
        int i = f69.c;
        bwb a2 = lk5.a();
        yvb yvb = lk5.b;
        HashMap v = !a2.i(yvb, "NetworkFetchProducer") ? null : ((kne) this.d).v(lk5, i);
        bwb a3 = lk5.a();
        a3.a(yvb, "NetworkFetchProducer", v);
        a3.e(yvb, "NetworkFetchProducer", true);
        ((ik0) yvb).h("network", "default");
        e(f69, 1, lk5.a);
    }

    public void d(f69 f69, lk5 lk5) {
        ik0 ik0 = (ik0) lk5.b;
        if (ik0.Z.o != null && ik0.f()) {
            ((kne) this.d).getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - lk5.c >= 100) {
                lk5.c = uptimeMillis;
                lk5.a().b(lk5.b);
                e(f69, 0, lk5.a);
            }
        }
    }

    public u6a(p7d p7d, qp6 qp6, kne kne) {
        this.b = p7d;
        this.c = qp6;
        this.d = kne;
    }
}
