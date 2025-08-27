package defpackage;

/* renamed from: oi8  reason: default package */
public final class oi8 extends m2 {
    public final /* synthetic */ int b;
    public final lfd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi8(ti8 ti8, lfd lfd, int i) {
        super(ti8);
        this.b = i;
        this.c = lfd;
    }

    public final void g(pi8 pi8) {
        switch (this.b) {
            case 0:
                this.a.a(new ni8(pi8, this.c, 0));
                return;
            default:
                ao1 ao1 = new ao1(pi8);
                pi8.c(ao1);
                mq4 c2 = this.c.c(new vj6(9, (Object) ao1, (Object) this.a));
                mw1 mw1 = (mw1) ao1.b;
                mw1.getClass();
                qq4.c(mw1, c2);
                return;
        }
    }
}
