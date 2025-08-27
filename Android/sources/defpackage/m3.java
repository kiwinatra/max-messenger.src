package defpackage;

import kotlin.UByte;

/* renamed from: m3  reason: default package */
public final class m3 implements tf5 {
    public final o3 a = new o3();
    public final l8b b = new l8b(2786);
    public boolean c;

    public final void U(xf5 xf5) {
        this.a.k(xf5, new qtf(0, 1, 1, (byte) 0));
        xf5.v();
        xf5.M(new me0(-9223372036854775807L));
    }

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final int g(vf5 vf5, yl4 yl4) {
        l8b l8b = this.b;
        int read = ((hf4) vf5).read(l8b.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        l8b.G(0);
        l8b.F(read);
        boolean z = this.c;
        o3 o3Var = this.a;
        if (!z) {
            o3Var.n = 0;
            this.c = true;
        }
        o3Var.f(l8b);
        return 0;
    }

    public final boolean n(vf5 vf5) {
        int i;
        l8b l8b = new l8b(10);
        int i2 = 0;
        while (true) {
            ((hf4) vf5).q(l8b.a, 0, 10, false);
            l8b.G(0);
            if (l8b.x() != 4801587) {
                break;
            }
            l8b.H(3);
            int t = l8b.t();
            i2 += t + 10;
            ((hf4) vf5).a(t, false);
        }
        hf4 hf4 = (hf4) vf5;
        hf4.w = 0;
        hf4.a(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            hf4.q(l8b.a, 0, 6, false);
            l8b.G(0);
            if (l8b.A() != 2935) {
                hf4.w = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                hf4.a(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = l8b.a;
                if (bArr.length < 6) {
                    i = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    i = ((((bArr[2] & 7) << 8) | (bArr[3] & UByte.MAX_VALUE)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    i = ev0.n((b2 & 192) >> 6, b2 & 63);
                }
                if (i == -1) {
                    return false;
                }
                hf4.a(i - 6, false);
            }
        }
    }

    public final void release() {
    }
}
