package defpackage;

/* renamed from: x0a  reason: default package */
public final /* synthetic */ class x0a implements bj6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x0a(z0a z0a, Object obj, int i) {
        this.a = i;
        this.b = z0a;
        this.c = obj;
    }

    public final Object apply(Object obj) {
        z48 z48 = (z48) obj;
        switch (this.a) {
            case 0:
                z0a z0a = this.b;
                z0a.getClass();
                y0a y0a = (y0a) this.c;
                z48.j = y0a.b.a;
                z48.a = true;
                z48.b = true;
                z48.a();
                z48.c = false;
                z48.p = z0a.y.d;
                z48.q = y0a.e;
                return z48;
            default:
                z0a z0a2 = this.b;
                z0a2.getClass();
                z48.a = false;
                z48.b = true;
                z48.c = false;
                z48.j = (qac) this.c;
                z48.a();
                z48.p = z0a2.y.d;
                return z48;
        }
    }
}
