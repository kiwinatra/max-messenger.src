package defpackage;

/* renamed from: p01  reason: default package */
public final class p01 {
    public final /* synthetic */ int a;
    public final int b;
    public final long c;

    public /* synthetic */ p01(long j, int i, int i2, boolean z) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    public static p01 b(gf4 gf4, g1g g1g) {
        gf4.q(g1g.a, 0, 8, false);
        g1g.H(0);
        return new p01(g1g.m(), g1g.h(), 7, false);
    }

    public static p01 c(hf4 hf4, l8b l8b) {
        hf4.q(l8b.a, 0, 8, false);
        l8b.G(0);
        return new p01(l8b.l(), l8b.g(), 8, false);
    }

    public boolean a() {
        switch (this.a) {
            case 4:
                int i = this.b;
                return i == 0 || i == 1;
            default:
                int i2 = this.b;
                return i2 == 0 || i2 == 1;
        }
    }

    public p01(int i, long j, boolean z) {
        this.a = 0;
        this.c = j;
        this.b = i;
    }

    public p01(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 3:
                n79.g(j >= 0);
                this.b = i;
                this.c = j;
                return;
            default:
                y64.g(j >= 0);
                this.b = i;
                this.c = j;
                return;
        }
    }
}
