package defpackage;

import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.uuid.Uuid;

/* renamed from: ky1  reason: default package */
public final class ky1 {
    public final /* synthetic */ int a;
    public byte[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ ky1(byte[] bArr, byte b2, int i, int i2) {
        this.a = i2;
        this.b = bArr;
        this.e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0048, code lost:
        r1 = r2.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x002f;
                case 3: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r2.d
            if (r0 < 0) goto L_0x0015
            int r1 = r2.c
            if (r0 < r1) goto L_0x0013
            if (r0 != r1) goto L_0x0015
            int r2 = r2.e
            if (r2 != 0) goto L_0x0015
        L_0x0013:
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            defpackage.n79.n(r2)
            return
        L_0x001a:
            int r0 = r2.d
            if (r0 < 0) goto L_0x002a
            int r1 = r2.c
            if (r0 < r1) goto L_0x0028
            if (r0 != r1) goto L_0x002a
            int r2 = r2.e
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            defpackage.y64.j(r2)
            return
        L_0x002f:
            int r0 = r2.c
            if (r0 < 0) goto L_0x003f
            int r1 = r2.e
            if (r0 < r1) goto L_0x003d
            if (r0 != r1) goto L_0x003f
            int r2 = r2.d
            if (r2 != 0) goto L_0x003f
        L_0x003d:
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            defpackage.n79.n(r2)
            return
        L_0x0044:
            int r0 = r2.c
            if (r0 < 0) goto L_0x0054
            int r1 = r2.e
            if (r0 < r1) goto L_0x0052
            if (r0 != r1) goto L_0x0054
            int r2 = r2.d
            if (r2 != 0) goto L_0x0054
        L_0x0052:
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            defpackage.y64.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky1.a():void");
    }

    public int b() {
        switch (this.a) {
            case 1:
                return ((this.e - this.c) * 8) - this.d;
            default:
                return ((this.e - this.c) * 8) - this.d;
        }
    }

    public void c() {
        switch (this.a) {
            case 1:
                if (this.d != 0) {
                    this.d = 0;
                    this.c++;
                    a();
                    return;
                }
                return;
            default:
                if (this.d != 0) {
                    this.d = 0;
                    this.c++;
                    a();
                    return;
                }
                return;
        }
    }

    public boolean d(int i) {
        switch (this.a) {
            case 3:
                int i2 = this.d;
                int i3 = i / 8;
                int i4 = i2 + i3;
                int i5 = (this.e + i) - (i3 * 8);
                if (i5 > 7) {
                    i4++;
                    i5 -= 8;
                }
                while (true) {
                    i2++;
                    if (i2 > i4 || i4 >= this.c) {
                        int i6 = this.c;
                    } else if (r(i2)) {
                        i4++;
                        i2 += 2;
                    }
                }
                int i62 = this.c;
                if (i4 >= i62) {
                    return i4 == i62 && i5 == 0;
                }
                return true;
            default:
                int i7 = this.d;
                int i8 = i / 8;
                int i9 = i7 + i8;
                int i10 = (this.e + i) - (i8 * 8);
                if (i10 > 7) {
                    i9++;
                    i10 -= 8;
                }
                while (true) {
                    i7++;
                    if (i7 > i9 || i9 >= this.c) {
                        int i11 = this.c;
                    } else if (r(i7)) {
                        i9++;
                        i7 += 2;
                    }
                }
                int i112 = this.c;
                if (i9 >= i112) {
                    return i9 == i112 && i10 == 0;
                }
                return true;
        }
    }

    public boolean e() {
        switch (this.a) {
            case 3:
                int i = this.d;
                int i2 = this.e;
                int i3 = 0;
                while (this.d < this.c && !h()) {
                    i3++;
                }
                boolean z = this.d == this.c;
                this.d = i;
                this.e = i2;
                return !z && d((i3 * 2) + 1);
            default:
                int i4 = this.d;
                int i5 = this.e;
                int i6 = 0;
                while (this.d < this.c && !h()) {
                    i6++;
                }
                boolean z2 = this.d == this.c;
                this.d = i4;
                this.e = i5;
                return !z2 && d((i6 * 2) + 1);
        }
    }

    public int f() {
        switch (this.a) {
            case 1:
                y64.j(this.d == 0);
                return this.c;
            default:
                n79.n(this.d == 0);
                return this.c;
        }
    }

    public int g() {
        switch (this.a) {
            case 1:
                return (this.c * 8) + this.d;
            default:
                return (this.c * 8) + this.d;
        }
    }

    public boolean h() {
        switch (this.a) {
            case 1:
                boolean z = (this.b[this.c] & (Uuid.SIZE_BITS >> this.d)) != 0;
                s();
                return z;
            case 2:
                boolean z2 = (this.b[this.c] & (Uuid.SIZE_BITS >> this.d)) != 0;
                s();
                return z2;
            case 3:
                boolean z3 = (this.b[this.d] & (Uuid.SIZE_BITS >> this.e)) != 0;
                s();
                return z3;
            case 4:
                boolean z4 = (this.b[this.d] & (Uuid.SIZE_BITS >> this.e)) != 0;
                s();
                return z4;
            case 5:
                boolean z5 = (((this.b[this.d] & UByte.MAX_VALUE) >> this.e) & 1) == 1;
                t(1);
                return z5;
            default:
                boolean z6 = (((this.b[this.d] & UByte.MAX_VALUE) >> this.e) & 1) == 1;
                t(1);
                return z6;
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 1:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i2 = 0;
                while (true) {
                    int i3 = this.d;
                    if (i3 > 8) {
                        int i4 = i3 - 8;
                        this.d = i4;
                        byte[] bArr = this.b;
                        int i5 = this.c;
                        this.c = i5 + 1;
                        i2 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
                    } else {
                        byte[] bArr2 = this.b;
                        int i6 = this.c;
                        int i7 = (-1 >>> (32 - i)) & (i2 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i3)));
                        if (i3 == 8) {
                            this.d = 0;
                            this.c = i6 + 1;
                        }
                        a();
                        return i7;
                    }
                }
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.d += i;
                int i8 = 0;
                while (true) {
                    int i9 = this.d;
                    if (i9 > 8) {
                        int i10 = i9 - 8;
                        this.d = i10;
                        byte[] bArr3 = this.b;
                        int i11 = this.c;
                        this.c = i11 + 1;
                        i8 |= (bArr3[i11] & UByte.MAX_VALUE) << i10;
                    } else {
                        byte[] bArr4 = this.b;
                        int i12 = this.c;
                        int i13 = (-1 >>> (32 - i)) & (i8 | ((bArr4[i12] & UByte.MAX_VALUE) >> (8 - i9)));
                        if (i9 == 8) {
                            this.d = 0;
                            this.c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                }
            case 3:
                this.e += i;
                int i14 = 0;
                while (true) {
                    int i15 = this.e;
                    int i16 = 2;
                    if (i15 > 8) {
                        int i17 = i15 - 8;
                        this.e = i17;
                        byte[] bArr5 = this.b;
                        int i18 = this.d;
                        i14 |= (bArr5[i18] & UByte.MAX_VALUE) << i17;
                        if (!r(i18 + 1)) {
                            i16 = 1;
                        }
                        this.d = i18 + i16;
                    } else {
                        byte[] bArr6 = this.b;
                        int i19 = this.d;
                        int i20 = (-1 >>> (32 - i)) & (i14 | ((bArr6[i19] & UByte.MAX_VALUE) >> (8 - i15)));
                        if (i15 == 8) {
                            this.e = 0;
                            if (!r(i19 + 1)) {
                                i16 = 1;
                            }
                            this.d = i19 + i16;
                        }
                        a();
                        return i20;
                    }
                }
            case 4:
                this.e += i;
                int i21 = 0;
                while (true) {
                    int i22 = this.e;
                    int i23 = 2;
                    if (i22 > 8) {
                        int i24 = i22 - 8;
                        this.e = i24;
                        byte[] bArr7 = this.b;
                        int i25 = this.d;
                        i21 |= (bArr7[i25] & UByte.MAX_VALUE) << i24;
                        if (!r(i25 + 1)) {
                            i23 = 1;
                        }
                        this.d = i25 + i23;
                    } else {
                        byte[] bArr8 = this.b;
                        int i26 = this.d;
                        int i27 = (-1 >>> (32 - i)) & (i21 | ((bArr8[i26] & UByte.MAX_VALUE) >> (8 - i22)));
                        if (i22 == 8) {
                            this.e = 0;
                            if (!r(i26 + 1)) {
                                i23 = 1;
                            }
                            this.d = i26 + i23;
                        }
                        a();
                        return i27;
                    }
                }
            case 5:
                int i28 = this.d;
                int min = Math.min(i, 8 - this.e);
                int i29 = i28 + 1;
                byte[] bArr9 = this.b;
                int i30 = ((bArr9[i28] & UByte.MAX_VALUE) >> this.e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
                while (min < i) {
                    i30 |= (bArr9[i29] & UByte.MAX_VALUE) << min;
                    min += 8;
                    i29++;
                }
                int i31 = i30 & (-1 >>> (32 - i));
                t(i);
                return i31;
            default:
                int i32 = this.d;
                int min2 = Math.min(i, 8 - this.e);
                int i33 = i32 + 1;
                byte[] bArr10 = this.b;
                int i34 = ((bArr10[i32] & UByte.MAX_VALUE) >> this.e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min2));
                while (min2 < i) {
                    i34 |= (bArr10[i33] & UByte.MAX_VALUE) << min2;
                    min2 += 8;
                    i33++;
                }
                int i35 = i34 & (-1 >>> (32 - i));
                t(i);
                return i35;
        }
    }

    public void j(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                int i2 = i >> 3;
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr2 = this.b;
                    int i4 = this.c;
                    int i5 = i4 + 1;
                    this.c = i5;
                    byte b2 = bArr2[i4];
                    int i6 = this.d;
                    byte b3 = (byte) (b2 << i6);
                    bArr[i3] = b3;
                    bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b3);
                }
                int i7 = i & 7;
                if (i7 != 0) {
                    byte b4 = (byte) (bArr[i2] & (KotlinVersion.MAX_COMPONENT_VALUE >> i7));
                    bArr[i2] = b4;
                    int i8 = this.d;
                    if (i8 + i7 > 8) {
                        byte[] bArr3 = this.b;
                        int i9 = this.c;
                        this.c = i9 + 1;
                        bArr[i2] = (byte) (b4 | ((bArr3[i9] & UByte.MAX_VALUE) << i8));
                        this.d = i8 - 8;
                    }
                    int i10 = this.d + i7;
                    this.d = i10;
                    byte[] bArr4 = this.b;
                    int i11 = this.c;
                    bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
                    if (i10 == 8) {
                        this.d = 0;
                        this.c = i11 + 1;
                    }
                    a();
                    return;
                }
                return;
            default:
                int i12 = i >> 3;
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr5 = this.b;
                    int i14 = this.c;
                    int i15 = i14 + 1;
                    this.c = i15;
                    byte b5 = bArr5[i14];
                    int i16 = this.d;
                    byte b6 = (byte) (b5 << i16);
                    bArr[i13] = b6;
                    bArr[i13] = (byte) (((255 & bArr5[i15]) >> (8 - i16)) | b6);
                }
                int i17 = i & 7;
                if (i17 != 0) {
                    byte b7 = (byte) (bArr[i12] & (KotlinVersion.MAX_COMPONENT_VALUE >> i17));
                    bArr[i12] = b7;
                    int i18 = this.d;
                    if (i18 + i17 > 8) {
                        byte[] bArr6 = this.b;
                        int i19 = this.c;
                        this.c = i19 + 1;
                        bArr[i12] = (byte) (b7 | ((bArr6[i19] & UByte.MAX_VALUE) << i18));
                        this.d = i18 - 8;
                    }
                    int i20 = this.d + i17;
                    this.d = i20;
                    byte[] bArr7 = this.b;
                    int i21 = this.c;
                    bArr[i12] = (byte) (((byte) (((255 & bArr7[i21]) >> (8 - i20)) << (8 - i17))) | bArr[i12]);
                    if (i20 == 8) {
                        this.d = 0;
                        this.c = i21 + 1;
                    }
                    a();
                    return;
                }
                return;
        }
    }

    public long k(int i) {
        if (i <= 32) {
            int i2 = i(i);
            int i3 = v0g.a;
            return ((long) i2) & 4294967295L;
        }
        int i4 = i(i - 32);
        int i5 = i(32);
        int i6 = v0g.a;
        return (((long) i5) & 4294967295L) | ((((long) i4) & 4294967295L) << 32);
    }

    public void l(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                y64.j(this.d == 0);
                System.arraycopy(this.b, this.c, bArr, 0, i);
                this.c += i;
                a();
                return;
            default:
                n79.n(this.d == 0);
                System.arraycopy(this.b, this.c, bArr, 0, i);
                this.c += i;
                a();
                return;
        }
    }

    public int m() {
        switch (this.a) {
            case 3:
                int i = 0;
                int i2 = 0;
                while (!h()) {
                    i2++;
                }
                int i3 = (1 << i2) - 1;
                if (i2 > 0) {
                    i = i(i2);
                }
                return i3 + i;
            default:
                int i4 = 0;
                int i5 = 0;
                while (!h()) {
                    i5++;
                }
                int i6 = (1 << i5) - 1;
                if (i5 > 0) {
                    i4 = i(i5);
                }
                return i6 + i4;
        }
    }

    public int n() {
        switch (this.a) {
            case 3:
                int m = m();
                return ((m + 1) / 2) * (m % 2 == 0 ? -1 : 1);
            default:
                int m2 = m();
                return ((m2 + 1) / 2) * (m2 % 2 == 0 ? -1 : 1);
        }
    }

    public void o(int i, byte[] bArr) {
        switch (this.a) {
            case 1:
                this.b = bArr;
                this.c = 0;
                this.d = 0;
                this.e = i;
                return;
            default:
                this.b = bArr;
                this.c = 0;
                this.d = 0;
                this.e = i;
                return;
        }
    }

    public void p(l8b l8b) {
        o(l8b.c, l8b.a);
        q(l8b.b * 8);
    }

    public void q(int i) {
        switch (this.a) {
            case 1:
                int i2 = i / 8;
                this.c = i2;
                this.d = i - (i2 * 8);
                a();
                return;
            default:
                int i3 = i / 8;
                this.c = i3;
                this.d = i - (i3 * 8);
                a();
                return;
        }
    }

    public boolean r(int i) {
        switch (this.a) {
            case 3:
                if (2 <= i && i < this.c) {
                    byte[] bArr = this.b;
                    return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
                }
            default:
                if (2 <= i && i < this.c) {
                    byte[] bArr2 = this.b;
                    return bArr2[i] == 3 && bArr2[i + -2] == 0 && bArr2[i - 1] == 0;
                }
        }
    }

    public void s() {
        switch (this.a) {
            case 1:
                int i = this.d + 1;
                this.d = i;
                if (i == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                return;
            case 2:
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 8) {
                    this.d = 0;
                    this.c++;
                }
                a();
                return;
            case 3:
                int i3 = 1;
                int i4 = this.e + 1;
                this.e = i4;
                if (i4 == 8) {
                    this.e = 0;
                    int i5 = this.d;
                    if (r(i5 + 1)) {
                        i3 = 2;
                    }
                    this.d = i5 + i3;
                }
                a();
                return;
            default:
                int i6 = 1;
                int i7 = this.e + 1;
                this.e = i7;
                if (i7 == 8) {
                    this.e = 0;
                    int i8 = this.d;
                    if (r(i8 + 1)) {
                        i6 = 2;
                    }
                    this.d = i8 + i6;
                }
                a();
                return;
        }
    }

    public void t(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 1:
                int i4 = i / 8;
                int i5 = this.c + i4;
                this.c = i5;
                int i6 = (i - (i4 * 8)) + this.d;
                this.d = i6;
                if (i6 > 7) {
                    this.c = i5 + 1;
                    this.d = i6 - 8;
                }
                a();
                return;
            case 2:
                int i7 = i / 8;
                int i8 = this.c + i7;
                this.c = i8;
                int i9 = (i - (i7 * 8)) + this.d;
                this.d = i9;
                if (i9 > 7) {
                    this.c = i8 + 1;
                    this.d = i9 - 8;
                }
                a();
                return;
            case 3:
                int i10 = this.d;
                int i11 = i / 8;
                int i12 = i10 + i11;
                this.d = i12;
                int i13 = (i - (i11 * 8)) + this.e;
                this.e = i13;
                if (i13 > 7) {
                    this.d = i12 + 1;
                    this.e = i13 - 8;
                }
                while (true) {
                    i10++;
                    if (i10 > this.d) {
                        a();
                        return;
                    } else if (r(i10)) {
                        this.d++;
                        i10 += 2;
                    }
                }
            case 4:
                int i14 = this.d;
                int i15 = i / 8;
                int i16 = i14 + i15;
                this.d = i16;
                int i17 = (i - (i15 * 8)) + this.e;
                this.e = i17;
                if (i17 > 7) {
                    this.d = i16 + 1;
                    this.e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.d) {
                        a();
                        return;
                    } else if (r(i14)) {
                        this.d++;
                        i14 += 2;
                    }
                }
            case 5:
                int i18 = i / 8;
                int i19 = this.d + i18;
                this.d = i19;
                int i20 = (i - (i18 * 8)) + this.e;
                this.e = i20;
                boolean z = true;
                if (i20 > 7) {
                    this.d = i19 + 1;
                    this.e = i20 - 8;
                }
                int i21 = this.d;
                if (i21 < 0 || (i21 >= (i2 = this.c) && !(i21 == i2 && this.e == 0))) {
                    z = false;
                }
                y64.j(z);
                return;
            default:
                int i22 = i / 8;
                int i23 = this.d + i22;
                this.d = i23;
                int i24 = (i - (i22 * 8)) + this.e;
                this.e = i24;
                boolean z2 = true;
                if (i24 > 7) {
                    this.d = i23 + 1;
                    this.e = i24 - 8;
                }
                int i25 = this.d;
                if (i25 < 0 || (i25 >= (i3 = this.c) && !(i25 == i3 && this.e == 0))) {
                    z2 = false;
                }
                n79.n(z2);
                return;
        }
    }

    public void u(int i) {
        switch (this.a) {
            case 1:
                y64.j(this.d == 0);
                this.c += i;
                a();
                return;
            default:
                n79.n(this.d == 0);
                this.c += i;
                a();
                return;
        }
    }

    public ky1(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = v0g.f;
                return;
            default:
                this.b = t0g.f;
                return;
        }
    }

    public ky1(int i, int i2, int i3, byte[] bArr) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                a();
                return;
            default:
                this.b = bArr;
                this.d = i;
                this.c = i2;
                this.e = 0;
                a();
                return;
        }
    }

    public ky1(int i, byte[] bArr) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = bArr;
                this.c = bArr.length;
                return;
            default:
                this.b = bArr;
                this.c = bArr.length;
                return;
        }
    }

    public ky1(int i, int i2) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = new byte[((i2 * 2) - 1)];
        this.e = 0;
    }
}
