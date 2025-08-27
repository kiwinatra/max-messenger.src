package defpackage;

import java.util.concurrent.Executor;

/* renamed from: w94  reason: default package */
public final class w94 implements xvb {
    public final qp6 a;
    public final Executor b;
    public final e97 c;
    public final d6a d;
    public final nt4 e;
    public final boolean f;
    public final boolean g;
    public final xvb h;
    public final int i;
    public final b8d j;

    public w94(qp6 qp6, Executor executor, e97 e97, d6a d6a, nt4 nt4, boolean z, boolean z2, xvb xvb, int i2, b8d b8d) {
        this.a = qp6;
        this.b = executor;
        this.c = e97;
        this.d = d6a;
        this.e = nt4;
        this.f = z;
        this.g = z2;
        this.h = xvb;
        this.i = i2;
        this.j = b8d;
    }

    public final void a(zi0 zi0, yvb yvb) {
        v94 v94;
        tf6.P();
        qa7 qa7 = ((ik0) yvb).a;
        if (mzf.e(qa7.b) || ra7.c(qa7.b)) {
            zi0 zi02 = zi0;
            yvb yvb2 = yvb;
            v94 = new t94(this, zi02, yvb2, new s7c(this.a), this.d, this.g, this.i);
        } else {
            v94 = new v94(this, zi0, yvb, this.g, this.i);
        }
        this.h.a(v94, yvb);
    }
}
