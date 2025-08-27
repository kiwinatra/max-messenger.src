package defpackage;

/* renamed from: wh8  reason: default package */
public final class wh8 extends nh8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wh8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void g(pi8 pi8) {
        switch (this.a) {
            case 0:
                ((lbe) this.b).l(new vh8(pi8, (nsb) this.c, 0));
                return;
            case 1:
                ((ti8) this.b).a(new zh8(pi8, (zi6) this.c, 0));
                return;
            default:
                ((lbe) this.b).l(new zh8(pi8, (zi6) this.c, 1));
                return;
        }
    }
}
