package defpackage;

/* renamed from: r03  reason: default package */
public final class r03 implements kcd {
    public final v03 a;
    public final icd b;
    public final int c;
    public boolean o;
    public final /* synthetic */ v03 v;

    public r03(v03 v03, v03 v032, icd icd, int i) {
        this.v = v03;
        this.a = v032;
        this.b = icd;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            v03 v03 = this.v;
            uz8 uz8 = v03.x;
            int[] iArr = v03.b;
            int i = this.c;
            uz8.b(iArr[i], v03.c[i], 0, (Object) null, v03.C0);
            this.o = true;
        }
    }

    public final void b() {
    }

    public final boolean c() {
        v03 v03 = this.v;
        return !v03.k() && this.b.t(v03.F0);
    }

    public final int e(long j) {
        v03 v03 = this.v;
        if (v03.k()) {
            return 0;
        }
        boolean z = v03.F0;
        icd icd = this.b;
        int q = icd.q(j, z);
        tj0 tj0 = v03.E0;
        if (tj0 != null) {
            q = Math.min(q, tj0.d(this.c + 1) - icd.o());
        }
        icd.B(q);
        if (q > 0) {
            a();
        }
        return q;
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        v03 v03 = this.v;
        if (v03.k()) {
            return -3;
        }
        tj0 tj0 = v03.E0;
        icd icd = this.b;
        if (tj0 != null && tj0.d(this.c + 1) <= icd.o()) {
            return -3;
        }
        a();
        return icd.y(xe8, aa4, i, v03.F0);
    }
}
