package defpackage;

/* renamed from: mdb  reason: default package */
public final class mdb implements rtf {
    public final v05 a;
    public final ky1 b = new ky1(new byte[10], (byte) 0, 10, 1);
    public int c = 0;
    public int d;
    public qkf e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public mdb(v05 v05) {
        this.a = v05;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(int i2, g1g g1g) {
        int i3;
        int i4;
        g1g g1g2 = g1g;
        y64.k(this.e);
        int i5 = i2 & 1;
        v05 v05 = this.a;
        int i6 = 2;
        if (i5 != 0) {
            int i7 = this.c;
            if (!(i7 == 0 || i7 == 1 || i7 == 2)) {
                if (i7 == 3) {
                    v05.j();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i2;
        while (g1g.c() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                ky1 ky1 = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (c(g1g2, ky1.b, Math.min(10, this.i)) && c(g1g2, (byte[]) null, this.i)) {
                            ky1.q(0);
                            this.l = -9223372036854775807L;
                            int i10 = 4;
                            if (this.f) {
                                ky1.t(4);
                                ky1.t(1);
                                ky1.t(1);
                                long i11 = (((long) ky1.i(3)) << 30) | ((long) (ky1.i(15) << 15)) | ((long) ky1.i(15));
                                ky1.t(1);
                                if (!this.h && this.g) {
                                    ky1.t(4);
                                    ky1.t(1);
                                    long i12 = (long) (ky1.i(15) << 15);
                                    ky1.t(1);
                                    ky1.t(1);
                                    this.e.b(i12 | (((long) ky1.i(3)) << 30) | ((long) ky1.i(15)));
                                    this.h = true;
                                }
                                this.l = this.e.b(i11);
                            }
                            if (!this.k) {
                                i10 = 0;
                            }
                            i8 |= i10;
                            v05.i(i8, this.l);
                            this.c = 3;
                            this.d = 0;
                            i6 = 2;
                        }
                    } else if (i9 == 3) {
                        int c2 = g1g.c();
                        int i13 = this.j;
                        int i14 = i13 == -1 ? 0 : c2 - i13;
                        if (i14 > 0) {
                            c2 -= i14;
                            g1g2.G(g1g2.b + c2);
                        }
                        v05.h(g1g2);
                        int i15 = this.j;
                        if (i15 != -1) {
                            int i16 = i15 - c2;
                            this.j = i16;
                            if (i16 == 0) {
                                v05.j();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                    i3 = i6;
                } else if (c(g1g2, ky1.b, 9)) {
                    ky1.q(0);
                    if (ky1.i(24) != 1) {
                        this.j = -1;
                        i4 = 0;
                        i3 = 2;
                    } else {
                        ky1.t(8);
                        int i17 = ky1.i(16);
                        ky1.t(5);
                        this.k = ky1.h();
                        i3 = 2;
                        ky1.t(2);
                        this.f = ky1.h();
                        this.g = ky1.h();
                        ky1.t(6);
                        int i18 = ky1.i(8);
                        this.i = i18;
                        if (i17 == 0) {
                            this.j = -1;
                        } else {
                            int i19 = (i17 - 3) - i18;
                            this.j = i19;
                            if (i19 < 0) {
                                this.j = -1;
                            }
                        }
                        i4 = 2;
                    }
                    this.c = i4;
                    this.d = 0;
                } else {
                    i3 = 2;
                }
            } else {
                i3 = i6;
                g1g2.I(g1g.c());
            }
            i6 = i3;
        }
    }

    public final boolean c(g1g g1g, byte[] bArr, int i2) {
        int min = Math.min(g1g.c(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            g1g.I(min);
        } else {
            g1g.g(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    public final void e(qkf qkf, wf5 wf5, qtf qtf) {
        this.e = qkf;
        this.a.l(wf5, qtf);
    }
}
