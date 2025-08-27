package defpackage;

/* renamed from: ajf  reason: default package */
public final class ajf extends hl4 {
    public final yvb c;
    public final int d;
    public final v3d e;
    public final /* synthetic */ oa f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajf(oa oaVar, zi0 zi0, yvb yvb, int i) {
        super(zi0);
        this.f = oaVar;
        this.c = yvb;
        this.d = i;
        this.e = ((ik0) yvb).a.i;
    }

    public final void f(Throwable th) {
        oa oaVar = this.f;
        zi0 zi0 = this.b;
        if (!oaVar.c(this.d + 1, zi0, this.c)) {
            zi0.e(th);
        }
    }

    public final void h(int i, Object obj) {
        j55 j55 = (j55) obj;
        zi0 zi0 = this.b;
        if (j55 != null && (zi0.b(i) || o54.B(j55, this.e))) {
            zi0.g(i, j55);
        } else if (zi0.a(i)) {
            j55.b(j55);
            if (!this.f.c(this.d + 1, zi0, this.c)) {
                zi0.g(1, (Object) null);
            }
        }
    }
}
