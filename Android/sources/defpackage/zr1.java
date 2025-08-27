package defpackage;

/* renamed from: zr1  reason: default package */
public final class zr1 extends q29 {
    public u08 m;
    public final Object n;

    public zr1(Object obj) {
        this.n = obj;
    }

    public final Object d() {
        u08 u08 = this.m;
        return u08 == null ? this.n : u08.d();
    }

    public final void l(u08 u08, dla dla) {
        throw null;
    }

    public final void m(u08 u08) {
        p29 p29;
        u08 u082 = this.m;
        if (!(u082 == null || (p29 = (p29) this.l.e(u082)) == null)) {
            p29.a.j(p29);
        }
        this.m = u08;
        super.l(u08, new yr1(0, this));
    }
}
