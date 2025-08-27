package defpackage;

/* renamed from: gia  reason: default package */
public final class gia extends r2 {
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gia(oka oka, int i) {
        super(oka);
        this.b = i;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                this.a.a(new fia(cla));
                return;
            case 1:
                this.a.a(new gi8(1, cla));
                return;
            default:
                lf6 lf6 = new lf6(cla);
                cla.c((mw1) lf6.v);
                this.a.a(lf6);
                return;
        }
    }
}
