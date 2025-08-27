package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* renamed from: pq5  reason: default package */
public final class pq5 implements sf5 {
    public final byte[] a = new byte[42];
    public final g1g b = new g1g(0, new byte[32768]);
    public final boolean c = false;
    public final yl4 d = new yl4(6, false);
    public wf5 e;
    public ypf f;
    public int g = 0;
    public rp9 h;
    public uq5 i;
    public int j;
    public int k;
    public nq5 l;
    public int m;
    public long n;

    public final void d(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.g = 0;
        } else {
            nq5 nq5 = this.l;
            if (nq5 != null) {
                nq5.e(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.n = j4;
        this.m = 0;
        this.b.E(0);
    }

    public final void g(wf5 wf5) {
        this.e = wf5;
        this.f = wf5.B(0, 1);
        wf5.v();
    }

    public final boolean h(uf5 uf5) {
        gf4 gf4 = (gf4) uf5;
        rp9 r = new y35(23).r(gf4, r77.v0);
        if (r != null) {
            int length = r.a.length;
        }
        byte[] bArr = new byte[4];
        gf4.q(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    public final int i(uf5 uf5, yl4 yl4) {
        rp9 rp9;
        uq5 uq5;
        rp9 rp92;
        rnd rnd;
        long j2;
        long j3;
        boolean z;
        long j4;
        boolean z2;
        int i2 = 1;
        int i3 = this.g;
        rp9 rp93 = null;
        if (i3 != 0) {
            byte[] bArr = this.a;
            if (i3 != 1) {
                int i4 = 3;
                if (i3 != 2) {
                    int i5 = 7;
                    if (i3 != 3) {
                        long j5 = 0;
                        if (i3 == 4) {
                            ((gf4) uf5).w = 0;
                            byte[] bArr2 = new byte[2];
                            gf4 gf4 = (gf4) uf5;
                            gf4.q(bArr2, 0, 2, false);
                            byte b2 = (bArr2[1] & UByte.MAX_VALUE) | ((bArr2[0] & UByte.MAX_VALUE) << 8);
                            if ((b2 >> 2) == 16382) {
                                gf4.w = 0;
                                this.k = b2;
                                wf5 wf5 = this.e;
                                int i6 = t0g.a;
                                long j6 = gf4.o;
                                this.i.getClass();
                                uq5 uq52 = this.i;
                                if (((dm4) uq52.l) != null) {
                                    rnd = new tq5(uq52, j6);
                                } else {
                                    long j7 = gf4.c;
                                    if (j7 == -1 || uq52.k <= 0) {
                                        rnd = new tq5(uq52.c());
                                    } else {
                                        int i7 = this.k;
                                        lc5 lc5 = new lc5(8, (Object) uq52);
                                        cs csVar = new cs(uq52, i7);
                                        long c2 = uq52.c();
                                        int i8 = uq52.d;
                                        int i9 = uq52.e;
                                        if (i9 > 0) {
                                            j3 = j6;
                                            j2 = ((((long) i9) + ((long) i8)) / 2) + 1;
                                        } else {
                                            j3 = j6;
                                            int i10 = uq52.c;
                                            int i11 = uq52.b;
                                            j2 = (((((i11 != i10 || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : (long) i11) * ((long) uq52.h)) * ((long) uq52.i)) / 8) + 64;
                                        }
                                        qn0 qn0 = new qn0((ln0) lc5, (on0) csVar, c2, uq52.k, j3, j7, j2, Math.max(6, i8));
                                        this.l = qn0;
                                        rnd = (in0) qn0.c;
                                    }
                                }
                                wf5.K(rnd);
                                this.g = 5;
                                return 0;
                            }
                            gf4.w = 0;
                            throw ParserException.a("First frame does not start with sync code.", (RuntimeException) null);
                        } else if (i3 == 5) {
                            this.f.getClass();
                            this.i.getClass();
                            nq5 nq5 = this.l;
                            if (nq5 != null && ((kn0) nq5.e) != null) {
                                return nq5.a((gf4) uf5, yl4);
                            }
                            if (this.n == -1) {
                                uq5 uq53 = this.i;
                                ((gf4) uf5).w = 0;
                                gf4 gf42 = (gf4) uf5;
                                gf42.a(1, false);
                                byte[] bArr3 = new byte[1];
                                gf42.q(bArr3, 0, 1, false);
                                boolean z3 = (bArr3[0] & 1) == 1;
                                gf42.a(2, false);
                                if (!z3) {
                                    i5 = 6;
                                }
                                g1g g1g = new g1g(i5);
                                byte[] bArr4 = g1g.a;
                                int i12 = 0;
                                while (i12 < i5) {
                                    int c3 = gf42.c(i12, bArr4, i5 - i12);
                                    if (c3 == -1) {
                                        break;
                                    }
                                    i12 += c3;
                                }
                                g1g.G(i12);
                                gf42.w = 0;
                                try {
                                    j5 = g1g.D();
                                    if (!z3) {
                                        j5 *= (long) uq53.c;
                                    }
                                } catch (NumberFormatException unused) {
                                    i2 = 0;
                                }
                                if (i2 != 0) {
                                    this.n = j5;
                                    return 0;
                                }
                                throw ParserException.a((String) null, (RuntimeException) null);
                            }
                            g1g g1g2 = this.b;
                            int i13 = g1g2.c;
                            if (i13 < 32768) {
                                int read = ((gf4) uf5).read(g1g2.a, i13, 32768 - i13);
                                z = read == -1;
                                if (!z) {
                                    g1g2.G(i13 + read);
                                } else if (g1g2.c() == 0) {
                                    uq5 uq54 = this.i;
                                    int i14 = t0g.a;
                                    this.f.b((this.n * 1000000) / ((long) uq54.f), 1, this.m, 0, (wpf) null);
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            int i15 = g1g2.b;
                            int i16 = this.m;
                            int i17 = this.j;
                            if (i16 < i17) {
                                g1g2.I(Math.min(i17 - i16, g1g2.c()));
                            }
                            this.i.getClass();
                            int i18 = g1g2.b;
                            while (true) {
                                int i19 = g1g2.c - 16;
                                yl4 yl42 = this.d;
                                if (i18 <= i19) {
                                    g1g2.H(i18);
                                    if (hsg.g(g1g2, this.i, this.k, yl42)) {
                                        g1g2.H(i18);
                                        j4 = yl42.b;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    if (z) {
                                        while (true) {
                                            int i20 = g1g2.c;
                                            if (i18 > i20 - this.j) {
                                                g1g2.H(i20);
                                                break;
                                            }
                                            g1g2.H(i18);
                                            try {
                                                z2 = hsg.g(g1g2, this.i, this.k, yl42);
                                            } catch (IndexOutOfBoundsException unused2) {
                                                z2 = false;
                                            }
                                            if (g1g2.b > g1g2.c) {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                g1g2.H(i18);
                                                j4 = yl42.b;
                                                break;
                                            }
                                            i18++;
                                        }
                                    } else {
                                        g1g2.H(i18);
                                    }
                                    j4 = -1;
                                }
                            }
                            int i21 = g1g2.b - i15;
                            g1g2.H(i15);
                            this.f.c(i21, g1g2);
                            int i22 = this.m + i21;
                            this.m = i22;
                            if (j4 != -1) {
                                uq5 uq55 = this.i;
                                int i23 = t0g.a;
                                this.f.b((this.n * 1000000) / ((long) uq55.f), 1, i22, 0, (wpf) null);
                                this.m = 0;
                                this.n = j4;
                            }
                            if (g1g2.c() >= 16) {
                                return 0;
                            }
                            int c4 = g1g2.c();
                            byte[] bArr5 = g1g2.a;
                            System.arraycopy(bArr5, g1g2.b, bArr5, 0, c4);
                            g1g2.H(0);
                            g1g2.G(c4);
                            return 0;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        boolean z4 = false;
                        uq5 uq56 = this.i;
                        boolean z5 = false;
                        while (!z5) {
                            ((gf4) uf5).w = z4 ? 1 : 0;
                            byte[] bArr6 = new byte[4];
                            ky1 ky1 = new ky1(bArr6, z4 ? (byte) 1 : 0, 4, i2);
                            gf4 gf43 = (gf4) uf5;
                            gf43.q(bArr6, z4, 4, z4);
                            boolean h2 = ky1.h();
                            int i24 = ky1.i(i5);
                            int i25 = ky1.i(24) + 4;
                            if (i24 == 0) {
                                byte[] bArr7 = new byte[38];
                                gf43.j(bArr7, z4, 38, z4);
                                uq56 = new uq5(bArr7, 4, z4);
                            } else if (uq56 != null) {
                                if (i24 == i4) {
                                    g1g g1g3 = new g1g(i25);
                                    gf43.j(g1g3.a, z4, i25, z4);
                                    uq5 = new uq5(uq56.b, uq56.c, uq56.d, uq56.e, uq56.f, uq56.h, uq56.i, uq56.k, cvg.H(g1g3), (rp9) uq56.m);
                                } else {
                                    rp9 rp94 = (rp9) uq56.m;
                                    if (i24 == 4) {
                                        g1g g1g4 = new g1g(i25);
                                        gf43.j(g1g4.a, 0, i25, false);
                                        g1g4.I(4);
                                        rp9 G = n54.G(Arrays.asList((String[]) n54.L(g1g4, false, false).b));
                                        if (rp94 == null) {
                                            rp92 = G;
                                        } else {
                                            if (G != null) {
                                                pp9[] pp9Arr = G.a;
                                                if (pp9Arr.length != 0) {
                                                    int i26 = t0g.a;
                                                    pp9[] pp9Arr2 = rp94.a;
                                                    Object[] copyOf = Arrays.copyOf(pp9Arr2, pp9Arr2.length + pp9Arr.length);
                                                    System.arraycopy(pp9Arr, 0, copyOf, pp9Arr2.length, pp9Arr.length);
                                                    rp94 = new rp9((pp9[]) copyOf);
                                                }
                                            }
                                            rp92 = rp94;
                                        }
                                        uq5 = new uq5(uq56.b, uq56.c, uq56.d, uq56.e, uq56.f, uq56.h, uq56.i, uq56.k, (dm4) uq56.l, rp92);
                                    } else if (i24 == 6) {
                                        g1g g1g5 = new g1g(i25);
                                        gf43.j(g1g5.a, 0, i25, false);
                                        g1g5.I(4);
                                        rp9 rp95 = new rp9((List) tb7.t(vkb.a(g1g5)));
                                        if (rp94 == null) {
                                            rp9 = rp95;
                                        } else {
                                            pp9[] pp9Arr3 = rp95.a;
                                            if (pp9Arr3.length != 0) {
                                                int i27 = t0g.a;
                                                pp9[] pp9Arr4 = rp94.a;
                                                Object[] copyOf2 = Arrays.copyOf(pp9Arr4, pp9Arr4.length + pp9Arr3.length);
                                                System.arraycopy(pp9Arr3, 0, copyOf2, pp9Arr4.length, pp9Arr3.length);
                                                rp94 = new rp9((pp9[]) copyOf2);
                                            }
                                            rp9 = rp94;
                                        }
                                        uq5 = new uq5(uq56.b, uq56.c, uq56.d, uq56.e, uq56.f, uq56.h, uq56.i, uq56.k, (dm4) uq56.l, rp9);
                                    } else {
                                        gf43.z(i25);
                                    }
                                }
                                uq56 = uq5;
                            } else {
                                throw new IllegalArgumentException();
                            }
                            int i28 = t0g.a;
                            this.i = uq56;
                            z5 = h2;
                            z4 = false;
                            i2 = 1;
                            i4 = 3;
                            i5 = 7;
                        }
                        this.i.getClass();
                        this.j = Math.max(this.i.d, 6);
                        ypf ypf = this.f;
                        int i29 = t0g.a;
                        ypf.d(this.i.d(bArr, this.h));
                        this.g = 4;
                        return 0;
                    }
                } else {
                    byte[] bArr8 = new byte[4];
                    ((gf4) uf5).j(bArr8, 0, 4, false);
                    if ((((((long) bArr8[2]) & 255) << 8) | ((((long) bArr8[0]) & 255) << 24) | ((((long) bArr8[1]) & 255) << 16) | (((long) bArr8[3]) & 255)) == 1716281667) {
                        this.g = 3;
                        return 0;
                    }
                    throw ParserException.a("Failed to read FLAC stream marker.", (RuntimeException) null);
                }
            } else {
                ((gf4) uf5).q(bArr, 0, bArr.length, false);
                ((gf4) uf5).w = 0;
                this.g = 2;
                return 0;
            }
        } else {
            boolean z6 = !this.c;
            ((gf4) uf5).w = 0;
            gf4 gf44 = (gf4) uf5;
            long r = gf44.r();
            rp9 r2 = new y35(23).r(gf44, z6 ? null : r77.v0);
            if (!(r2 == null || r2.a.length == 0)) {
                rp93 = r2;
            }
            gf44.z((int) (gf44.r() - r));
            this.h = rp93;
            this.g = 1;
            return 0;
        }
    }

    public final void release() {
    }
}
