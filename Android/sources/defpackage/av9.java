package defpackage;

import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* renamed from: av9  reason: default package */
public final class av9 implements w05 {
    public final l8b a;
    public final bv9 b;
    public final String c;
    public final int d;
    public zpf e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public av9(String str, int i2) {
        l8b l8b = new l8b(4);
        this.a = l8b;
        l8b.a[0] = -1;
        this.b = new bv9(1);
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i2;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public final void f(l8b l8b) {
        n79.o(this.e);
        while (l8b.a() > 0) {
            int i2 = this.g;
            boolean z = true;
            l8b l8b2 = this.a;
            if (i2 == 0) {
                byte[] bArr = l8b.a;
                int i3 = l8b.b;
                int i4 = l8b.c;
                while (true) {
                    if (i3 >= i4) {
                        l8b.G(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & UByte.MAX_VALUE) == 255;
                    boolean z3 = this.j && (b2 & 224) == 224;
                    this.j = z2;
                    if (z3) {
                        l8b.G(i3 + 1);
                        this.j = false;
                        l8b2.a[1] = bArr[i3];
                        this.h = 2;
                        this.g = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(l8b.a(), 4 - this.h);
                l8b.e(this.h, l8b2.a, min);
                int i5 = this.h + min;
                this.h = i5;
                if (i5 >= 4) {
                    l8b2.G(0);
                    int g2 = l8b2.g();
                    bv9 bv9 = this.b;
                    if (!bv9.a(g2)) {
                        this.h = 0;
                        this.g = 1;
                    } else {
                        this.l = bv9.d;
                        if (!this.i) {
                            this.k = (((long) bv9.h) * 1000000) / ((long) bv9.e);
                            ba6 ba6 = new ba6();
                            ba6.a = this.f;
                            ba6.m = vq9.l(bv9.c);
                            ba6.n = ConstantsKt.DEFAULT_BLOCK_SIZE;
                            ba6.A = bv9.f;
                            ba6.B = bv9.e;
                            ba6.d = this.c;
                            ba6.f = this.d;
                            this.e.e(new ea6(ba6));
                            this.i = true;
                        }
                        l8b2.G(0);
                        this.e.b(l8b2, 4, 0);
                        this.g = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(l8b.a(), this.l - this.h);
                this.e.b(l8b, min2, 0);
                int i6 = this.h + min2;
                this.h = i6;
                if (i6 >= this.l) {
                    if (this.m == -9223372036854775807L) {
                        z = false;
                    }
                    n79.n(z);
                    this.e.a(this.m, 1, this.l, 0, (xpf) null);
                    this.m += this.k;
                    this.h = 0;
                    this.g = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void g(boolean z) {
    }

    public final void i(int i2, long j2) {
        this.m = j2;
    }

    public final void k(xf5 xf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.f = qtf.f;
        qtf.b();
        this.e = xf5.B(qtf.e, 1);
    }
}
