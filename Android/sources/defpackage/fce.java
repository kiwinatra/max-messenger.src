package defpackage;

/* renamed from: fce  reason: default package */
public final class fce extends lbe {
    public final /* synthetic */ int a;
    public final lbe b;
    public final lfd c;

    public /* synthetic */ fce(lbe lbe, lfd lfd, int i) {
        this.a = i;
        this.b = lbe;
        this.c = lfd;
    }

    public final void m(gce gce) {
        switch (this.a) {
            case 0:
                this.b.l(new ni8(gce, this.c, 1));
                return;
            default:
                wa3 wa3 = new wa3(gce, this.b);
                gce.c(wa3);
                mq4 c2 = this.c.c(wa3);
                mw1 mw1 = (mw1) wa3.c;
                mw1.getClass();
                qq4.c(mw1, c2);
                return;
        }
    }
}
