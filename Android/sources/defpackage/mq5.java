package defpackage;

import kotlin.UByte;

/* renamed from: mq5  reason: default package */
public final class mq5 implements pn0 {
    public final uq5 a;
    public final int b;
    public final yl4 c = new yl4(7, false);

    public mq5(uq5 uq5, int i) {
        this.a = uq5;
        this.b = i;
    }

    public final long a(hf4 hf4) {
        long j;
        yl4 yl4;
        uq5 uq5;
        boolean z;
        int c2;
        hf4 hf42 = hf4;
        while (true) {
            long r = hf4.r();
            j = hf42.c;
            int i = (r > (j - 6) ? 1 : (r == (j - 6) ? 0 : -1));
            yl4 = this.c;
            uq5 = this.a;
            if (i >= 0) {
                break;
            }
            long r2 = hf4.r();
            int i2 = 2;
            byte[] bArr = new byte[2];
            hf42.q(bArr, 0, 2, false);
            byte b2 = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
            int i3 = this.b;
            if (b2 != i3) {
                hf42.w = 0;
                hf42.a((int) (r2 - hf42.o), false);
                z = false;
            } else {
                l8b l8b = new l8b(16);
                System.arraycopy(bArr, 0, l8b.a, 0, 2);
                byte[] bArr2 = l8b.a;
                int i4 = 0;
                while (i4 < 14 && (c2 = hf42.c(i2 + i4, bArr2, 14 - i4)) != -1) {
                    i4 += c2;
                    i2 = 2;
                }
                l8b.F(i4);
                hf42.w = 0;
                hf42.a((int) (r2 - hf42.o), false);
                z = ryg.g(l8b, uq5, i3, yl4);
            }
            if (z) {
                break;
            }
            hf42.a(1, false);
        }
        if (hf4.r() < j - 6) {
            return yl4.b;
        }
        hf42.a((int) (j - hf4.r()), false);
        return uq5.k;
    }

    public final nn0 o(hf4 hf4, long j) {
        hf4 hf42 = hf4;
        long j2 = hf42.o;
        long a2 = a(hf4);
        long r = hf4.r();
        hf42.a(Math.max(6, this.a.d), false);
        long a3 = a(hf4);
        return (a2 > j || a3 <= j) ? a3 <= j ? new nn0(-2, a3, hf4.r()) : new nn0(-1, a2, j2) : new nn0(0, -9223372036854775807L, r);
    }
}
