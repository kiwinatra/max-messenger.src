package defpackage;

/* renamed from: jc3  reason: default package */
public final class jc3 extends qr0 {
    public final yo7 c;
    public int o;

    public jc3(ni0 ni0, yo7 yo7) {
        super(ni0);
        this.c = yo7;
    }

    public final void k() {
        this.a = true;
        this.o++;
    }

    public final void n() {
        this.a = false;
        ((ni0) this.b).U("\n");
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            t(this.c.a.g);
        }
    }

    public final void o() {
        if (this.a) {
            this.a = false;
        } else {
            n();
        }
    }

    public final void x() {
        s(' ');
    }

    public final void y() {
        this.o--;
    }
}
