package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: qn0  reason: default package */
public abstract class qn0 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public qn0(ln0 ln0, on0 on0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = on0;
        this.b = i;
        this.c = new in0(ln0, j, j2, j3, j4, j5);
    }

    public static int c(gf4 gf4, long j, yl4 yl4) {
        if (j == gf4.o) {
            return 0;
        }
        yl4.b = j;
        return 1;
    }

    public static int d(hf4 hf4, long j, yl4 yl4) {
        if (j == hf4.o) {
            return 0;
        }
        yl4.b = j;
        return 1;
    }

    public int a(gf4 gf4, yl4 yl4) {
        gf4 gf42;
        yl4 yl42;
        long j;
        while (true) {
            gf42 = gf4;
            yl42 = yl4;
            kn0 kn0 = (kn0) this.e;
            y64.k(kn0);
            long j2 = kn0.f;
            long j3 = kn0.g;
            j = kn0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            on0 on0 = (on0) this.d;
            if (i <= 0) {
                this.e = null;
                on0.e();
                return c(gf42, j2, yl42);
            }
            long j4 = j - gf42.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                gf42.z((int) j4);
                gf42.w = 0;
                nn0 f = on0.f(gf42, kn0.b);
                int i2 = f.a;
                if (i2 != -3) {
                    long j5 = f.b;
                    long j6 = f.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        kn0.d = j7;
                        kn0.f = j6;
                        kn0.h = kn0.a(kn0.b, j7, kn0.e, j6, kn0.g, kn0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        kn0.e = j8;
                        kn0.g = j6;
                        kn0.h = kn0.a(kn0.b, kn0.d, j8, kn0.f, j6, kn0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - gf42.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            gf42.z((int) j9);
                        }
                        this.e = null;
                        on0.e();
                        return c(gf42, j6, yl42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    on0.e();
                    return c(gf4, j, yl4);
                }
            }
        }
        return c(gf42, j, yl42);
    }

    public int b(hf4 hf4, yl4 yl4) {
        hf4 hf42;
        yl4 yl42;
        long j;
        while (true) {
            hf42 = hf4;
            yl42 = yl4;
            kn0 kn0 = (kn0) this.e;
            n79.o(kn0);
            long j2 = kn0.f;
            long j3 = kn0.g;
            j = kn0.h;
            int i = ((j3 - j2) > ((long) this.b) ? 1 : ((j3 - j2) == ((long) this.b) ? 0 : -1));
            pn0 pn0 = (pn0) this.d;
            if (i <= 0) {
                this.e = null;
                pn0.e();
                return d(hf42, j2, yl42);
            }
            long j4 = j - hf42.o;
            if (j4 >= 0 && j4 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                hf42.z((int) j4);
                hf42.w = 0;
                nn0 o = pn0.o(hf42, kn0.b);
                int i2 = o.a;
                if (i2 != -3) {
                    long j5 = o.b;
                    long j6 = o.c;
                    if (i2 == -2) {
                        long j7 = j5;
                        kn0.d = j7;
                        kn0.f = j6;
                        kn0.h = kn0.b(kn0.b, j7, kn0.e, j6, kn0.g, kn0.c);
                    } else if (i2 == -1) {
                        long j8 = j5;
                        kn0.e = j8;
                        kn0.g = j6;
                        kn0.h = kn0.b(kn0.b, kn0.d, j8, kn0.f, j6, kn0.c);
                    } else if (i2 == 0) {
                        long j9 = j6 - hf42.o;
                        if (j9 >= 0 && j9 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            hf42.z((int) j9);
                        }
                        this.e = null;
                        pn0.e();
                        return d(hf42, j6, yl42);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    this.e = null;
                    pn0.e();
                    return d(hf4, j, yl4);
                }
            }
        }
        return d(hf42, j, yl42);
    }

    public final void e(long j) {
        long j2 = j;
        switch (this.a) {
            case 0:
                kn0 kn0 = (kn0) this.e;
                if (kn0 == null || kn0.a != j2) {
                    in0 in0 = (in0) this.c;
                    long j3 = j;
                    this.e = new kn0(j3, in0.a.a(j2), in0.d, in0.e, in0.f, in0.g, 0);
                    return;
                }
                return;
            default:
                kn0 kn02 = (kn0) this.e;
                if (kn02 == null || kn02.a != j2) {
                    jn0 jn0 = (jn0) this.c;
                    long j4 = j;
                    this.e = new kn0(j4, jn0.a.a(j2), jn0.o, jn0.v, jn0.w, jn0.x, 1);
                    return;
                }
                return;
        }
    }

    public qn0(mn0 mn0, pn0 pn0, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = pn0;
        this.b = i;
        this.c = new jn0(mn0, j, j2, j3, j4, j5);
    }
}
