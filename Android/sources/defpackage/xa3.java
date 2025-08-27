package defpackage;

/* renamed from: xa3  reason: default package */
public final class xa3 extends ma3 {
    public final /* synthetic */ int a;
    public final ma3 b;
    public final lfd c;

    public /* synthetic */ xa3(ma3 ma3, lfd lfd, int i) {
        this.a = i;
        this.b = ma3;
        this.c = lfd;
    }

    public final void k(ya3 ya3) {
        switch (this.a) {
            case 0:
                this.b.j(new wa3(ya3, this.c));
                return;
            default:
                wa3 wa3 = new wa3(ya3, this.b);
                ya3.c(wa3);
                mq4 c2 = this.c.c(wa3);
                mw1 mw1 = (mw1) wa3.c;
                mw1.getClass();
                qq4.c(mw1, c2);
                return;
        }
    }
}
