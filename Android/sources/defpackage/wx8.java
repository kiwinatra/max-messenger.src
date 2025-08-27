package defpackage;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* renamed from: wx8  reason: default package */
public final class wx8 implements sob {
    public final WeakReference a;
    public final WeakReference b;

    public wx8(yx8 yx8, ypb ypb) {
        this.a = new WeakReference(yx8);
        this.b = new WeakReference(ypb);
    }

    public final void H(int i, ir8 ir8) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                qwd qwd2 = qwd;
                ppb ppb3 = new ppb(ppb.a, i, qwd2, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, ppb.B, ppb.C, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.s(ir8);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void O(boolean z) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.k(z);
                a2.c.a(true, true);
                try {
                    a2.h.y.C(z);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void S(o44 o44) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                PlaybackException playbackException = ppb.a;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                qqf qqf = ppb.D;
                kqf kqf = ppb.E;
                ppb ppb2 = r2;
                int i = ppb.b;
                ppb ppb3 = new ppb(playbackException, i, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, o44, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, ppb.B, ppb.C, qqf, kqf);
                a2.r = ppb2;
                a2.c.a(true, true);
            }
        }
    }

    public final void X(qqf qqf) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.b(qqf);
                a2.c.a(true, false);
                a2.c(new vx8(0));
            }
        }
    }

    public final yx8 a() {
        return (yx8) this.a.get();
    }

    public final void a0(long j) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, j, ppb.B, ppb.C, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.getClass();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void b0(us8 us8) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                long j = ppb.B;
                long j2 = ppb.C;
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, us8, ppb.A, j, j2, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.E();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void c(int i) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                a2.r = ppb.d(ppb.u, i, ppb.t);
                a2.c.a(true, true);
                try {
                    a2.h.y.w();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void c0(us8 us8) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.r = a2.r.g(us8);
            a2.c.a(true, true);
            try {
                a2.h.y.z(us8);
            } catch (RemoteException e) {
                i8b.p("Exception in using media1 API", e);
            }
        }
    }

    public final void d(boolean z) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, z, ppb.z, ppb.A, ppb.B, ppb.C, ppb.D, ppb.E);
                yx8 yx8 = a2;
                yx8.r = ppb2;
                yx8.c.a(true, true);
                try {
                    yx8.h.y.getClass();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
                yx8.t();
            }
        }
    }

    public final void d0(long j) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, j, ppb.C, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.getClass();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void e(int i, boolean z) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                a2.r = ppb.d(i, ppb.x, z);
                a2.c.a(true, true);
                try {
                    a2.h.y.t();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void f(float f) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.r = a2.r.p(f);
            a2.c.a(true, true);
            try {
                a2.h.y.getClass();
            } catch (RemoteException e) {
                i8b.p("Exception in using media1 API", e);
            }
        }
    }

    public final void f0(jkf jkf, int i) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            ypb ypb = (ypb) this.b.get();
            if (ypb != null) {
                a2.r = a2.r.n(jkf, ypb.I0(), i);
                a2.c.a(false, true);
                try {
                    a2.h.y.D(jkf);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void h(int i) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            ypb ypb = (ypb) this.b.get();
            if (ypb != null) {
                a2.r = a2.r.f(i, ypb.N());
                a2.c.a(true, true);
                try {
                    gy8 gy8 = a2.h.y;
                    ypb.N();
                    gy8.v();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void i(int i, boolean z) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.c(i, z);
                a2.c.a(true, true);
                try {
                    a2.h.y.q(i, z);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void n(boolean z) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, z, ppb.w, ppb.z, ppb.A, ppb.B, ppb.C, ppb.D, ppb.E);
                yx8 yx8 = a2;
                yx8.r = ppb2;
                yx8.c.a(true, true);
                try {
                    yx8.h.y.r();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
                yx8.t();
            }
        }
    }

    public final void o0(gob gob) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.e(gob);
                a2.c.a(true, true);
                try {
                    a2.h.y.u();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void onRepeatModeChanged(int i) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.i(i);
                a2.c.a(true, true);
                try {
                    a2.h.y.B(i);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void p0(pob pob) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.f(pob);
            }
        }
    }

    public final void q(uob uob, uob uob2, int i) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.h(uob, uob2, i);
                a2.c.a(true, true);
                try {
                    a2.h.y.A();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void r() {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            a2.c(new vx8(2));
        }
    }

    public final void s0(in4 in4) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                long j = ppb.B;
                long j2 = ppb.C;
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, in4, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, j, j2, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.p();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void t0(long j) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                ppb ppb2 = r2;
                ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, ppb.l, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, ppb.B, j, ppb.D, ppb.E);
                a2.r = ppb2;
                a2.c.a(true, true);
            }
        }
    }

    public final void w(i30 i30) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.a(i30);
                a2.c.a(true, true);
                try {
                    a2.h.y.o(i30);
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void w0(PlaybackException playbackException) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                ppb ppb = a2.r;
                jkf jkf = ppb.j;
                boolean q = jkf.q();
                qwd qwd = ppb.c;
                n79.n(q || qwd.a.b < jkf.p());
                long j = ppb.B;
                long j2 = ppb.C;
                int i = ppb.b;
                uob uob = ppb.d;
                uob uob2 = ppb.e;
                int i2 = ppb.f;
                gob gob = ppb.g;
                int i3 = ppb.h;
                boolean z = ppb.i;
                v8g v8g = ppb.l;
                int i4 = ppb.k;
                ppb ppb2 = r2;
                us8 us8 = ppb.m;
                float f = ppb.n;
                i30 i30 = ppb.o;
                o44 o44 = ppb.p;
                in4 in4 = ppb.q;
                int i5 = ppb.r;
                boolean z2 = ppb.s;
                boolean z3 = ppb.t;
                int i6 = ppb.u;
                int i7 = ppb.x;
                int i8 = ppb.y;
                boolean z4 = ppb.v;
                boolean z5 = ppb.w;
                us8 us82 = ppb.z;
                qwd qwd2 = qwd;
                kqf kqf = ppb.E;
                qwd qwd3 = qwd2;
                ppb ppb3 = new ppb(playbackException, i, qwd2, uob, uob2, i2, gob, i3, z, v8g, jkf, i4, us8, f, i30, o44, in4, i5, z2, z3, i6, i7, i8, z4, z5, us82, ppb.A, j, j2, ppb.D, kqf);
                a2.r = ppb2;
                a2.c.a(true, true);
                try {
                    a2.h.y.y();
                } catch (RemoteException e) {
                    i8b.p("Exception in using media1 API", e);
                }
            }
        }
    }

    public final void x(v8g v8g) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            ppb ppb = a2.r;
            jkf jkf = ppb.j;
            boolean q = jkf.q();
            qwd qwd = ppb.c;
            n79.n(q || qwd.a.b < jkf.p());
            long j = ppb.B;
            long j2 = ppb.C;
            ppb ppb2 = r2;
            ppb ppb3 = new ppb(ppb.a, ppb.b, qwd, ppb.d, ppb.e, ppb.f, ppb.g, ppb.h, ppb.i, v8g, jkf, ppb.k, ppb.m, ppb.n, ppb.o, ppb.p, ppb.q, ppb.r, ppb.s, ppb.t, ppb.u, ppb.x, ppb.y, ppb.v, ppb.w, ppb.z, ppb.A, j, j2, ppb.D, ppb.E);
            a2.r = ppb2;
            a2.c.a(true, true);
            try {
                a2.h.y.getClass();
            } catch (RemoteException e) {
                i8b.p("Exception in using media1 API", e);
            }
        }
    }

    public final void z(kqf kqf) {
        yx8 a2 = a();
        if (a2 != null) {
            a2.u();
            if (((ypb) this.b.get()) != null) {
                a2.r = a2.r.o(kqf);
                a2.c.a(true, true);
                a2.c(new vx8(1));
            }
        }
    }
}
