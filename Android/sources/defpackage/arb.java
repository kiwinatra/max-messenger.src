package defpackage;

/* renamed from: arb  reason: default package */
public final /* synthetic */ class arb implements grb {
    public final /* synthetic */ int a;
    public final /* synthetic */ nrb b;

    public /* synthetic */ arb(nrb nrb, int i) {
        this.a = i;
        this.b = nrb;
    }

    public final void a(Float f) {
        switch (this.a) {
            case 0:
                nrb.b(this.b, f);
                return;
            case 1:
                this.b.setBackgroundAlpha(f.floatValue());
                return;
            case 2:
                nrb.d(this.b, f);
                return;
            default:
                nrb nrb = this.b;
                nrb.b.j(nrb.getTop());
                return;
        }
    }
}
