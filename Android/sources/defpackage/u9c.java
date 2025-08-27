package defpackage;

import kotlin.UByte;

/* renamed from: u9c  reason: default package */
public final class u9c {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public final Object g;
    public final Object h;

    public u9c(int i) {
        switch (i) {
            case 1:
                this.g = new rkf(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new l8b();
                return;
            default:
                this.g = new qkf(0);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new g1g(3, false);
                return;
        }
    }

    public static int c(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long e(l8b l8b) {
        l8b l8b2 = l8b;
        int i = l8b2.b;
        if (l8b.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        l8b2.e(0, bArr, 9);
        l8b2.G(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long f(g1g g1g) {
        g1g g1g2 = g1g;
        int i = g1g2.b;
        if (g1g.c() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        g1g2.g(0, bArr, 9);
        g1g2.H(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b2;
                    long j2 = (long) b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public void a(gf4 gf4) {
        byte[] bArr = t0g.f;
        g1g g1g = (g1g) this.h;
        g1g.getClass();
        g1g.F(bArr.length, bArr);
        this.a = true;
        gf4.w = 0;
    }

    public void b(hf4 hf4) {
        byte[] bArr = v0g.f;
        l8b l8b = (l8b) this.h;
        l8b.getClass();
        l8b.E(bArr.length, bArr);
        this.a = true;
        hf4.w = 0;
    }
}
