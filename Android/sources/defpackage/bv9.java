package defpackage;

/* renamed from: bv9  reason: default package */
public final class bv9 {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public /* synthetic */ bv9(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        switch (this.a) {
            case 0:
                if (!((i & -2097152) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                    return false;
                }
                this.b = i2;
                this.c = gsg.b[3 - i3];
                int i10 = gsg.c[i5];
                this.e = i10;
                int i11 = 2;
                if (i2 == 2) {
                    this.e = i10 / 2;
                } else if (i2 == 0) {
                    this.e = i10 / 4;
                }
                int i12 = (i >>> 9) & 1;
                int i13 = 1152;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            i13 = 384;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                } else if (i2 != 3) {
                    i13 = 576;
                }
                this.h = i13;
                if (i3 == 3) {
                    int i14 = i2 == 3 ? gsg.d[i4 - 1] : gsg.e[i4 - 1];
                    this.g = i14;
                    this.d = (((i14 * 12) / this.e) + i12) * 4;
                } else {
                    int i15 = 144;
                    if (i2 == 3) {
                        int i16 = i3 == 2 ? gsg.f[i4 - 1] : gsg.g[i4 - 1];
                        this.g = i16;
                        this.d = ((i16 * 144) / this.e) + i12;
                    } else {
                        int i17 = gsg.h[i4 - 1];
                        this.g = i17;
                        if (i3 == 1) {
                            i15 = 72;
                        }
                        this.d = ((i15 * i17) / this.e) + i12;
                    }
                }
                if (((i >> 6) & 3) == 3) {
                    i11 = 1;
                }
                this.f = i11;
                return true;
            default:
                if (!((i & -2097152) == -2097152) || (i6 = (i >>> 19) & 3) == 1 || (i7 = (i >>> 17) & 3) == 0 || (i8 = (i >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i >>> 10) & 3) == 3) {
                    return false;
                }
                this.b = i6;
                this.c = hsg.b[3 - i7];
                int i18 = hsg.c[i9];
                this.e = i18;
                int i19 = 2;
                if (i6 == 2) {
                    this.e = i18 / 2;
                } else if (i6 == 0) {
                    this.e = i18 / 4;
                }
                int i20 = (i >>> 9) & 1;
                int i21 = 1152;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            i21 = 384;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                } else if (i6 != 3) {
                    i21 = 576;
                }
                this.h = i21;
                if (i7 == 3) {
                    int i22 = i6 == 3 ? hsg.d[i8 - 1] : hsg.e[i8 - 1];
                    this.g = i22;
                    this.d = (((i22 * 12) / this.e) + i20) * 4;
                } else {
                    int i23 = 144;
                    if (i6 == 3) {
                        int i24 = i7 == 2 ? hsg.f[i8 - 1] : hsg.g[i8 - 1];
                        this.g = i24;
                        this.d = ((i24 * 144) / this.e) + i20;
                    } else {
                        int i25 = hsg.h[i8 - 1];
                        this.g = i25;
                        if (i7 == 1) {
                            i23 = 72;
                        }
                        this.d = ((i23 * i25) / this.e) + i20;
                    }
                }
                if (((i >> 6) & 3) == 3) {
                    i19 = 1;
                }
                this.f = i19;
                return true;
        }
    }
}
