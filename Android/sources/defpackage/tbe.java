package defpackage;

/* renamed from: tbe  reason: default package */
public final class tbe extends lbe {
    public final /* synthetic */ int a;
    public final lbe b;
    public final qk3 c;

    public /* synthetic */ tbe(lbe lbe, qk3 qk3, int i) {
        this.a = i;
        this.b = lbe;
        this.c = qk3;
    }

    public final void m(gce gce) {
        switch (this.a) {
            case 0:
                this.b.l(new ab3(6, gce, this.c));
                return;
            case 1:
                this.b.l(new zqd(this, gce, false, 24));
                return;
            case 2:
                this.b.l(new he(16, (Object) gce, (Object) this.c));
                return;
            default:
                this.b.l(new dm4(this, gce, false, 25));
                return;
        }
    }
}
