package defpackage;

/* renamed from: na3  reason: default package */
public final class na3 extends ma3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ na3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void k(ya3 ya3) {
        switch (this.a) {
            case 0:
                ((ma3) this.b).j(new ao1(1, ya3, (ma3) this.c));
                return;
            case 1:
                ((ma3) this.b).j(new fj((Object) this, (Object) ya3, false, 7));
                return;
            case 2:
                ((ma3) this.b).j(new xe8(this, ya3));
                return;
            case 3:
                xh8 xh8 = new xh8(ya3, (zi6) this.c, 0);
                ya3.c(xh8);
                ((ti8) this.b).a(xh8);
                return;
            default:
                xh8 xh82 = new xh8(ya3, (zi6) this.c, 1);
                ya3.c(xh82);
                ((lbe) this.b).l(xh82);
                return;
        }
    }

    public na3(ma3 ma3) {
        this.a = 2;
        dbe dbe = m58.h;
        this.b = ma3;
        this.c = dbe;
    }
}
