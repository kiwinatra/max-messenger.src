package defpackage;

import kotlin.UByte;

/* renamed from: q3  reason: default package */
public final class q3 implements tf5 {
    public final o3 a = new o3((String) null, 0, 1);
    public final l8b b = new l8b(16384);
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
        int read = ((hf4) vf5).read(l8b.a, 0, 16384);
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
            int i5 = 7;
            hf4.q(l8b.a, 0, 7, false);
            l8b.G(0);
            int A = l8b.A();
            if (A == 44096 || A == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = l8b.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    byte b2 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
                    if (b2 == 65535) {
                        b2 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
                    } else {
                        i5 = 4;
                    }
                    if (A == 44097) {
                        i5 += 2;
                    }
                    i = b2 + i5;
                }
                if (i == -1) {
                    return false;
                }
                hf4.a(i - 7, false);
            } else {
                hf4.w = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                hf4.a(i4, false);
                i3 = 0;
            }
        }
    }

    public final void release() {
    }
}
