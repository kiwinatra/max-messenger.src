package defpackage;

/* renamed from: nce  reason: default package */
public final class nce implements tf5 {
    public final int a;
    public final int b;
    public final String c;
    public int o;
    public int v;
    public xf5 w;
    public zpf x;

    public nce(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [snd, java.lang.Object] */
    public final void U(xf5 xf5) {
        this.w = xf5;
        zpf B = xf5.B(1024, 4);
        this.x = B;
        ba6 ba6 = new ba6();
        ba6.m = vq9.l(this.c);
        B.e(new ea6(ba6));
        this.w.v();
        this.w.M(new Object());
        this.v = 1;
    }

    public final void d(long j, long j2) {
        if (j == 0 || this.v == 1) {
            this.v = 1;
            this.o = 0;
        }
    }

    public final int g(vf5 vf5, yl4 yl4) {
        int i = this.v;
        if (i == 1) {
            zpf zpf = this.x;
            zpf.getClass();
            int c2 = zpf.c(vf5, 1024, true);
            if (c2 == -1) {
                this.v = 2;
                this.x.a(0, 1, this.o, 0, (xpf) null);
                this.o = 0;
            } else {
                this.o += c2;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final boolean n(vf5 vf5) {
        int i = this.b;
        int i2 = this.a;
        n79.n((i2 == -1 || i == -1) ? false : true);
        l8b l8b = new l8b(i);
        ((hf4) vf5).q(l8b.a, 0, i, false);
        return l8b.A() == i2;
    }

    public final void release() {
    }
}
