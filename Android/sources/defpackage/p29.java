package defpackage;

/* renamed from: p29  reason: default package */
public final class p29 implements dla {
    public final u08 a;
    public final dla b;
    public int c = -1;

    public p29(u08 u08, dla dla) {
        this.a = u08;
        this.b = dla;
    }

    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.f(this);
    }
}
