package defpackage;

/* renamed from: wbe  reason: default package */
public final class wbe extends lbe {
    public final /* synthetic */ int a;
    public final lbe b;
    public final zi6 c;

    public /* synthetic */ wbe(lbe lbe, zi6 zi6, int i) {
        this.a = i;
        this.c = zi6;
        this.b = lbe;
    }

    public final void m(gce gce) {
        switch (this.a) {
            case 0:
                this.b.l(new vbe(0, this.c, gce));
                return;
            case 1:
                this.b.l(new ox0(23, (Object) gce, (Object) this.c));
                return;
            default:
                this.b.l(new vbe(1, this.c, gce));
                return;
        }
    }
}
