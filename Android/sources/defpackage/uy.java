package defpackage;

/* renamed from: uy  reason: default package */
public final class uy {
    public final /* synthetic */ int a = 0;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public uy(g1g g1g, g1g g1g2, boolean z) {
        this.j = g1g;
        this.i = g1g2;
        this.f = z;
        g1g2.H(12);
        this.b = g1g2.y();
        g1g.H(12);
        this.h = g1g.y();
        te8.e("first_chunk must be 1", g1g.h() != 1 ? false : true);
        this.c = -1;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 == this.b) {
                    return false;
                }
                boolean z = this.f;
                g1g g1g = (g1g) this.i;
                this.e = z ? g1g.z() : g1g.w();
                if (this.c != this.g) {
                    return true;
                }
                g1g g1g2 = (g1g) this.j;
                this.d = g1g2.y();
                g1g2.I(4);
                int i3 = this.h - 1;
                this.h = i3;
                this.g = i3 > 0 ? g1g2.y() - 1 : -1;
                return true;
            default:
                int i4 = this.c + 1;
                this.c = i4;
                if (i4 == this.b) {
                    return false;
                }
                boolean z2 = this.f;
                l8b l8b = (l8b) this.i;
                this.e = z2 ? l8b.z() : l8b.w();
                if (this.c != this.g) {
                    return true;
                }
                l8b l8b2 = (l8b) this.j;
                this.d = l8b2.y();
                l8b2.H(4);
                int i5 = this.h - 1;
                this.h = i5;
                this.g = i5 > 0 ? l8b2.y() - 1 : -1;
                return true;
        }
    }

    public uy(l8b l8b, l8b l8b2, boolean z) {
        this.j = l8b;
        this.i = l8b2;
        this.f = z;
        l8b2.G(12);
        this.b = l8b2.y();
        l8b.G(12);
        this.h = l8b.y();
        b59.h("first_chunk must be 1", l8b.g() != 1 ? false : true);
        this.c = -1;
    }
}
