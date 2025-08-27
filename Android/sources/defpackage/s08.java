package defpackage;

/* renamed from: s08  reason: default package */
public final class s08 extends t08 implements zu7 {
    public final jv7 v;
    public final /* synthetic */ u08 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s08(u08 u08, jv7 jv7, dla dla) {
        super(u08, dla);
        this.w = u08;
        this.v = jv7;
    }

    public final void b() {
        this.v.getLifecycle().b(this);
    }

    public final boolean c(jv7 jv7) {
        return this.v == jv7;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        jv7 jv72 = this.v;
        iu7 iu7 = ((lv7) jv72.getLifecycle()).d;
        if (iu7 == iu7.a) {
            this.w.j(this.a);
            return;
        }
        iu7 iu72 = null;
        while (iu72 != iu7) {
            a(e());
            iu72 = iu7;
            iu7 = ((lv7) jv72.getLifecycle()).d;
        }
    }

    public final boolean e() {
        return ((lv7) this.v.getLifecycle()).d.a(iu7.o);
    }
}
