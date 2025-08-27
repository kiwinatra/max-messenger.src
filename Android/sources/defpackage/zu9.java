package defpackage;

import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* renamed from: zu9  reason: default package */
public final class zu9 implements v05 {
    public final g1g a;
    public final bv9 b;
    public final String c;
    public ypf d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public zu9(String str) {
        g1g g1g = new g1g(4);
        this.a = g1g;
        g1g.a[0] = -1;
        this.b = new bv9(0);
        this.l = -9223372036854775807L;
        this.c = str;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public final void h(g1g g1g) {
        y64.k(this.d);
        while (g1g.c() > 0) {
            int i2 = this.f;
            g1g g1g2 = this.a;
            if (i2 == 0) {
                byte[] bArr = g1g.a;
                int i3 = g1g.b;
                int i4 = g1g.c;
                while (true) {
                    if (i3 >= i4) {
                        g1g.H(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z = (b2 & UByte.MAX_VALUE) == 255;
                    boolean z2 = this.i && (b2 & 224) == 224;
                    this.i = z;
                    if (z2) {
                        g1g.H(i3 + 1);
                        this.i = false;
                        g1g2.a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(g1g.c(), 4 - this.g);
                g1g.g(this.g, g1g2.a, min);
                int i5 = this.g + min;
                this.g = i5;
                if (i5 >= 4) {
                    g1g2.H(0);
                    int h2 = g1g2.h();
                    bv9 bv9 = this.b;
                    if (!bv9.a(h2)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = bv9.d;
                        if (!this.h) {
                            int i6 = bv9.e;
                            this.j = (((long) bv9.h) * 1000000) / ((long) i6);
                            aa6 aa6 = new aa6();
                            aa6.a = this.e;
                            aa6.k = bv9.c;
                            aa6.l = ConstantsKt.DEFAULT_BLOCK_SIZE;
                            aa6.x = bv9.f;
                            aa6.y = i6;
                            aa6.c = this.c;
                            this.d.d(new ca6(aa6));
                            this.h = true;
                        }
                        g1g2.H(0);
                        this.d.c(4, g1g2);
                        this.f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(g1g.c(), this.k - this.g);
                this.d.c(min2, g1g);
                int i7 = this.g + min2;
                this.g = i7;
                int i8 = this.k;
                if (i7 >= i8) {
                    long j2 = this.l;
                    if (j2 != -9223372036854775807L) {
                        this.d.b(j2, 1, i8, 0, (wpf) null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void i(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.l = j2;
        }
    }

    public final void j() {
    }

    public final void l(wf5 wf5, qtf qtf) {
        qtf.a();
        qtf.b();
        this.e = qtf.f;
        qtf.b();
        this.d = wf5.B(qtf.e, 1);
    }
}
