package defpackage;

/* renamed from: gs0  reason: default package */
public final class gs0 extends fm {
    public final fs0 b;
    public final hs0 c;

    public gs0(fs0 fs0, hs0 hs0) {
        super(fs0.a);
        this.b = fs0;
        this.c = hs0;
    }

    public final boolean a() {
        this.b.getClass();
        return this.c.canRepeat();
    }

    public final boolean b() {
        return this.c.isSupplied();
    }

    public final boolean c() {
        this.b.getClass();
        return this.c.shouldPost();
    }

    public final void d(zp7 zp7) {
        hs0 hs0 = this.c;
        if (hs0.shouldSkipParam()) {
            zp7.getClass();
            return;
        }
        zp7.h0(this.b.a);
        hs0.write(zp7);
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
