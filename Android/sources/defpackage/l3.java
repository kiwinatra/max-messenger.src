package defpackage;

import kotlin.UByte;

/* renamed from: l3  reason: default package */
public final class l3 implements sf5 {
    public final n3 a = new n3((String) null, 0);
    public final g1g b = new g1g(2786);
    public boolean c;

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final void g(wf5 wf5) {
        this.a.l(wf5, new qtf(0, 1, 0, (byte) 0));
        wf5.v();
        wf5.K(new tq5(-9223372036854775807L));
    }

    public final boolean h(uf5 uf5) {
        gf4 gf4;
        int i;
        g1g g1g = new g1g(10);
        int i2 = 0;
        while (true) {
            gf4 = (gf4) uf5;
            gf4.q(g1g.a, 0, 10, false);
            g1g.H(0);
            if (g1g.x() != 4801587) {
                break;
            }
            g1g.I(3);
            int u = g1g.u();
            i2 += u + 10;
            gf4.a(u, false);
        }
        gf4.w = 0;
        gf4.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            gf4.q(g1g.a, 0, 6, false);
            g1g.H(0);
            if (g1g.A() != 2935) {
                gf4.w = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                gf4.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = g1g.a;
                if (bArr.length < 6) {
                    i = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    i = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    i = bs0.G((b2 & 192) >> 6, b2 & 63);
                }
                if (i == -1) {
                    return false;
                }
                gf4.a(i - 6, false);
            }
        }
    }

    public final int i(uf5 uf5, yl4 yl4) {
        g1g g1g = this.b;
        int read = ((gf4) uf5).read(g1g.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        g1g.H(0);
        g1g.G(read);
        boolean z = this.c;
        n3 n3Var = this.a;
        if (!z) {
            n3Var.i(4, 0);
            this.c = true;
        }
        n3Var.h(g1g);
        return 0;
    }

    public final void release() {
    }
}
