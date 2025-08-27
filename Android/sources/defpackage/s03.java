package defpackage;

/* renamed from: s03  reason: default package */
public final class s03 implements lcd {
    public final w03 a;
    public final jcd b;
    public final int c;
    public boolean o;
    public final /* synthetic */ w03 v;

    public s03(w03 w03, w03 w032, jcd jcd, int i) {
        this.v = w03;
        this.a = w032;
        this.b = jcd;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            w03 w03 = this.v;
            cs csVar = w03.x;
            int[] iArr = w03.b;
            int i = this.c;
            csVar.l(iArr[i], w03.c[i], 0, (Object) null, w03.C0);
            this.o = true;
        }
    }

    public final void b() {
    }

    public final boolean c() {
        w03 w03 = this.v;
        return !w03.p() && this.b.s(w03.F0);
    }

    public final void d() {
        w03 w03 = this.v;
        boolean[] zArr = w03.o;
        int i = this.c;
        n79.n(zArr[i]);
        w03.o[i] = false;
    }

    public final int e(long j) {
        w03 w03 = this.v;
        if (w03.p()) {
            return 0;
        }
        boolean z = w03.F0;
        jcd jcd = this.b;
        int p = jcd.p(j, z);
        uj0 uj0 = w03.E0;
        if (uj0 != null) {
            p = Math.min(p, uj0.d(this.c + 1) - jcd.n());
        }
        jcd.B(p);
        if (p > 0) {
            a();
        }
        return p;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        w03 w03 = this.v;
        if (w03.p()) {
            return -3;
        }
        uj0 uj0 = w03.E0;
        jcd jcd = this.b;
        if (uj0 != null && uj0.d(this.c + 1) <= jcd.n()) {
            return -3;
        }
        a();
        return jcd.x(ox0, ba4, i, w03.F0);
    }
}
