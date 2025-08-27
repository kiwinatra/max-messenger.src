package defpackage;

/* renamed from: is0  reason: default package */
public final class is0 extends hl4 {
    public final yvb c;
    public final /* synthetic */ hif d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is0(hif hif, zi0 zi0, yvb yvb) {
        super(zi0);
        this.d = hif;
        this.c = yvb;
    }

    public final void f(Throwable th) {
        ((xvb) this.d.c).a(this.b, this.c);
    }

    public final void h(int i, Object obj) {
        j55 j55 = (j55) obj;
        yvb yvb = this.c;
        qa7 qa7 = ((ik0) yvb).a;
        boolean a = zi0.a(i);
        boolean B = o54.B(j55, qa7.i);
        zi0 zi0 = this.b;
        if (j55 != null && (B || qa7.f)) {
            if (!a || !B) {
                zi0.g(i & -2, j55);
            } else {
                zi0.g(i, j55);
            }
        }
        if (a && !B && !qa7.g) {
            j55.b(j55);
            ((xvb) this.d.c).a(zi0, yvb);
        }
    }
}
