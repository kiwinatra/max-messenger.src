package defpackage;

/* renamed from: ndb  reason: default package */
public final class ndb implements stf {
    public final w05 a;
    public final ky1 b = new ky1(new byte[10], (byte) 0, 10, 2);
    public int c = 0;
    public int d;
    public rkf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public ndb(w05 w05) {
        this.a = w05;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(int i2, l8b l8b) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        l8b l8b2 = l8b;
        n79.o(this.e);
        int i7 = i2 & 1;
        w05 w05 = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        boolean z2 = false;
        if (i7 != 0) {
            int i11 = this.c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    i8b.V("Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.j != -1) {
                        i8b.V("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    w05.g(l8b2.c == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i2;
        while (l8b.a() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                ky1 ky1 = this.b;
                if (i13 == 1) {
                    i5 = i9;
                    boolean z3 = z2;
                    if (c(l8b2, ky1.b, 9)) {
                        ky1.q(z3 ? 1 : 0);
                        int i14 = ky1.i(24);
                        if (i14 != 1) {
                            i2a.m(i14, "Unexpected start code prefix: ");
                            this.j = -1;
                            i4 = -1;
                            i6 = 0;
                            i3 = 2;
                        } else {
                            ky1.t(8);
                            int i15 = ky1.i(16);
                            ky1.t(5);
                            this.k = ky1.h();
                            i3 = 2;
                            ky1.t(2);
                            this.f = ky1.h();
                            this.g = ky1.h();
                            ky1.t(6);
                            int i16 = ky1.i(8);
                            this.i = i16;
                            if (i15 == 0) {
                                this.j = -1;
                                i4 = -1;
                            } else {
                                int i17 = (i15 - 3) - i16;
                                this.j = i17;
                                if (i17 < 0) {
                                    i8b.V("Found negative packet payload size: " + this.j);
                                    i4 = -1;
                                    this.j = -1;
                                } else {
                                    i4 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        z = false;
                        this.d = 0;
                    } else {
                        z = z3;
                        i4 = -1;
                        i3 = 2;
                    }
                } else if (i13 == i10) {
                    if (!c(l8b2, ky1.b, Math.min(10, this.i)) || !c(l8b2, (byte[]) null, this.i)) {
                        i5 = i9;
                        i4 = -1;
                        boolean z4 = z2;
                        i3 = i10;
                        z = z4;
                    } else {
                        ky1.q(z2 ? 1 : 0);
                        this.l = -9223372036854775807L;
                        int i18 = 4;
                        if (this.f) {
                            ky1.t(4);
                            ky1.t(1);
                            long i19 = (long) (ky1.i(15) << 15);
                            ky1.t(1);
                            long i20 = i19 | (((long) ky1.i(i9)) << 30) | ((long) ky1.i(15));
                            ky1.t(1);
                            if (!this.h && this.g) {
                                ky1.t(4);
                                ky1.t(1);
                                long i21 = (long) (ky1.i(15) << 15);
                                ky1.t(1);
                                ky1.t(1);
                                this.e.b(i21 | (((long) ky1.i(i9)) << 30) | ((long) ky1.i(15)));
                                this.h = true;
                            }
                            this.l = this.e.b(i20);
                        }
                        if (!this.k) {
                            i18 = 0;
                        }
                        i12 |= i18;
                        w05.i(i12, this.l);
                        this.c = 3;
                        this.d = 0;
                        z2 = false;
                        i10 = 2;
                        i9 = 3;
                        i8 = -1;
                    }
                } else if (i13 == i9) {
                    int a2 = l8b.a();
                    int i22 = this.j;
                    int i23 = i22 == i8 ? z2 : a2 - i22;
                    if (i23 > 0) {
                        a2 -= i23;
                        l8b2.F(l8b2.b + a2);
                    }
                    w05.f(l8b2);
                    int i24 = this.j;
                    if (i24 != i8) {
                        int i25 = i24 - a2;
                        this.j = i25;
                        if (i25 == 0) {
                            w05.g(z2);
                            this.c = 1;
                            this.d = z2;
                        }
                    }
                    int i26 = i9;
                    i4 = i8;
                    i5 = i26;
                    boolean z5 = z2;
                    i3 = i10;
                    z = z5;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int i27 = i9;
                i4 = i8;
                i5 = i27;
                boolean z6 = z2;
                i3 = i10;
                z = z6;
                l8b2.H(l8b.a());
            }
            int i28 = i4;
            i9 = i5;
            i8 = i28;
            int i29 = i3;
            z2 = z;
            i10 = i29;
        }
    }

    public final boolean c(l8b l8b, byte[] bArr, int i2) {
        int min = Math.min(l8b.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            l8b.H(min);
        } else {
            l8b.e(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    public final void d(rkf rkf, xf5 xf5, qtf qtf) {
        this.e = rkf;
        this.a.k(xf5, qtf);
    }
}
