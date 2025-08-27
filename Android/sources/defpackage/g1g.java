package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: g1g  reason: default package */
public final class g1g {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public byte[] a;
    public int b;
    public int c;

    public g1g(int i, boolean z) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                return;
            case 3:
                this.a = t0g.f;
                return;
            default:
                this.a = new byte[8];
                return;
        }
    }

    public static long a(int i, byte[] bArr, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static long b(int i, byte[] bArr, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int e(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((d[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static int f(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((e[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8);
    }

    public long B(gf4 gf4, boolean z, boolean z2, int i) {
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 == 0) {
            if (!gf4.j(bArr, 0, 1, z)) {
                return -1;
            }
            int e2 = e(bArr[0] & UByte.MAX_VALUE);
            this.c = e2;
            if (e2 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.c;
        if (i3 > i) {
            this.b = 0;
            return -2;
        }
        if (i3 != 1) {
            gf4.j(bArr, 1, i3 - 1, false);
        }
        this.b = 0;
        return a(this.c, bArr, z2);
    }

    public long C(hf4 hf4, boolean z, boolean z2, int i) {
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 == 0) {
            if (!hf4.j(bArr, 0, 1, z)) {
                return -1;
            }
            int f = f(bArr[0] & UByte.MAX_VALUE);
            this.c = f;
            if (f != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.c;
        if (i3 > i) {
            this.b = 0;
            return -2;
        }
        if (i3 != 1) {
            hf4.j(bArr, 1, i3 - 1, false);
        }
        this.b = 0;
        return b(this.c, bArr, z2);
    }

    public long D() {
        int i;
        int i2;
        long j = (long) this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b2 = this.a[this.b + i];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    public void E(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        F(i, bArr);
    }

    public void F(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void G(int i) {
        y64.g(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void H(int i) {
        y64.g(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void I(int i) {
        H(this.b + i);
    }

    public int c() {
        return this.c - this.b;
    }

    public void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public void g(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        byte b2 = ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24);
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (bArr[i4] & UByte.MAX_VALUE) | b2 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
    }

    public String i() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c) {
            byte b2 = this.a[i];
            int i2 = t0g.a;
            if (b2 == 10 || b2 == 13) {
                break;
            }
            i++;
        }
        int i3 = this.b;
        if (i - i3 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.b = i3 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i4 = this.b;
        int i5 = t0g.a;
        String str = new String(bArr2, i4, i - i4, x22.c);
        this.b = i;
        int i6 = this.c;
        if (i == i6) {
            return str;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i] == 13) {
            int i7 = i + 1;
            this.b = i7;
            if (i7 == i6) {
                return str;
            }
        }
        int i8 = this.b;
        if (bArr3[i8] == 10) {
            this.b = i8 + 1;
        }
        return str;
    }

    public int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = i + 2;
        this.b = i3;
        byte b3 = ((bArr[i2] & UByte.MAX_VALUE) << 8) | b2;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((bArr[i4] & UByte.MAX_VALUE) << 24) | b3 | ((bArr[i3] & UByte.MAX_VALUE) << 16);
    }

    public long k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.b = i4;
        int i5 = i + 4;
        this.b = i5;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.b = i6;
        int i7 = i + 6;
        this.b = i7;
        long j3 = j2 | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j3 | ((((long) bArr[i7]) & 255) << 48);
    }

    public short l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i] & UByte.MAX_VALUE;
        this.b = i + 2;
        return (short) (((bArr[i2] & UByte.MAX_VALUE) << 8) | b2);
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
    }

    public int n() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(i2a.h(29, j, "Top bit not zero: "));
    }

    public int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i] & UByte.MAX_VALUE;
        this.b = i + 2;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | b2;
    }

    public long p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (((long) bArr[i8]) & 255) | j2 | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    public String q() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = t0g.a;
        String str = new String(bArr, i2, i - i2, x22.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public String r(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = t0g.a;
        String str = new String(bArr, i2, i4, x22.c);
        this.b += i;
        return str;
    }

    public short s() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public String t(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int u() {
        return v() | (v() << 21) | (v() << 14) | (v() << 7);
    }

    public int v() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public long w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        this.b = i + 4;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.b = i + 3;
        return (bArr[i3] & UByte.MAX_VALUE) | i4 | ((bArr[i] & UByte.MAX_VALUE) << 16);
    }

    public int y() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException(i2a.h(29, h, "Top bit not zero: "));
    }

    public long z() {
        long p = p();
        if (p >= 0) {
            return p;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(p);
        throw new IllegalStateException(sb.toString());
    }

    public g1g(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public g1g(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public g1g(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
