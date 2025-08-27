package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: z0a  reason: default package */
public final class z0a extends w1 implements qqd, pqd {
    public ao1 A0;
    public final nd X;
    public final sqd Y;
    public final ln5 Z;
    public final s0a b;
    public a58 c;
    public d48 o;
    public final y3g v;
    public final z3a v0;
    public List w;
    public final m95 w0;
    public long x;
    public final boolean x0;
    public p4g y;
    public final boolean y0;
    public dfb z;
    public ao1 z0;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, z48] */
    public z0a(e3a e3a, s0a s0a, boolean z2, boolean z3, nd ndVar, sqd sqd, po5 po5, z3a z3a, m95 m95, y3g y3g) {
        super(e3a);
        this.b = s0a;
        this.x0 = z2;
        this.y0 = z3;
        this.Y = sqd;
        this.X = ndVar;
        this.Z = po5;
        this.v0 = z3a;
        this.w0 = m95;
        this.v = y3g;
        e3a.R(this);
        ? obj = new Object();
        obj.b = false;
        obj.d = z2;
        obj.e = false;
        obj.a();
        obj.j = qac.P_2160;
        obj.l = 0;
        obj.p = false;
        if (sqd.k == 2) {
            obj.b = false;
        }
        a58 a58 = new a58(obj);
        this.c = a58;
        e3a.Z(a58);
    }

    public final void K(uqd uqd) {
        c0(new t0a(this, 0));
        c0(new t0a(this, 1));
        c0(new t0a(this, 5));
    }

    public final void N(Set set) {
        c0(new t0a(this, 4));
    }

    public final boolean W() {
        d48 d48 = this.o;
        return d48 != null && d48.a == 1 && !d48.d();
    }

    public final void X(d48 d48) {
        z68.c("z0a", "setLocalMedia: %s", d48.c);
        this.o = d48;
        this.z = this.Y.f(d48);
        jbd.c(this.z0);
        jbd.c(this.A0);
        if (d48.b()) {
            c0(new t0a(this, 2));
            z68.c("z0a", "setupVideoLocalMedia", new Object[0]);
            jbd.c(this.z0);
            if ((!(d48 instanceof k00) || !cvg.A(((k00) d48).X.r)) && this.y0) {
                c0(new es1(14));
                z68.c("z0a", "initVideoLocalMedias", new Object[0]);
                tbe tbe = new tbe(new mka(1, new u0a(this, 1)).n(xfd.a()).j(qe.a()), new u0a(this, 4), 3);
                b5 b5Var = new b5(27, this);
                ao1 ao1 = new ao1(3, m58.f, m58.g);
                Objects.requireNonNull(ao1, "observer is null");
                try {
                    tbe.l(new ab3(7, ao1, b5Var));
                    this.z0 = ao1;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    hd8.Z(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                z68.c("z0a", "localMedia instanceof EditAttachLocalMedia -> can't edit video -> hide controls", new Object[0]);
                c0(new es1(13));
            }
        } else if (d48.a != 1 || d48.d()) {
            c0(new es1(12));
        } else {
            c0(new t0a(this, 3));
            c0(new t0a(this, 5));
            c0(new t0a(this, 1));
            c0(new t0a(this, 0));
        }
        c0(new t0a(this, 4));
    }

    public final void Y(Uri uri, File file, Uri uri2, File file2, d44 d44) {
        z68.c("z0a", "startCrop()", new Object[0]);
        dfb dfb = this.z;
        Uri uri3 = dfb != null ? dfb.v : null;
        if (uri3 != null) {
            z68.c("z0a", "startCrop() media has overlay, processing", new Object[0]);
            z3a z3a = this.v0;
            z3a.getClass();
            new hb3(6, new lbe[]{new mka(1, new u00((Object) z3a, (Object) uri, (Object) uri3, 21)), uri2 != null ? new mka(1, new u00((Object) z3a, (Object) uri2, (Object) uri3, 21)) : lbe.h(Uri.EMPTY)}, new ch2(10, new q0a(2))).l(new ao1(3, new u00((Object) this, (Object) file, (Object) file2, 20), new u0a(this, 3)));
            return;
        }
        ((ActLocalMedias) this.b).f0(uri, file, uri2, file2, d44);
    }

    public final void Z() {
        Set<go6> set;
        d48 d48 = this.o;
        if (d48 != null) {
            boolean b2 = d48.b();
            sqd sqd = this.Y;
            if (!b2) {
                d48 d482 = this.o;
                if (d482.a != 1) {
                    sqd.u(d482);
                } else if (sqd.l(d482)) {
                    uqd i = sqd.i(this.o);
                    if (i != null) {
                        i.f = false;
                    }
                    sqd.p();
                    if (i != null && (set = sqd.e) != null) {
                        for (go6 a : set) {
                            try {
                                a.a(i);
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                    }
                } else {
                    sqd.u(this.o);
                }
            } else if (sqd.l(this.o)) {
                sqd.u(this.o);
            } else {
                b0();
            }
        }
    }

    public final void a0() {
        d48 d48 = this.o;
        dfb dfb = this.z;
        sqd sqd = this.Y;
        sqd.b(d48, sqd.a.size());
        uqd i = sqd.i(d48);
        if (i != null) {
            i.c = dfb;
        }
        sqd.b.put(Long.valueOf(d48.b), dfb);
        sqd.o(i);
    }

    public final void b0() {
        Object obj;
        boolean z2;
        p4g p4g = this.y;
        sqd sqd = this.Y;
        if (p4g == null) {
            sqd.t(this.o, (p4g) null);
            return;
        }
        List list = this.w;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((rac) obj).a == this.y.a) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            rac rac = (rac) obj;
            if (rac == null || rac.f) {
                p4g p4g2 = this.y;
                if (p4g2.b == c44.DEFAULT_ASPECT_RATIO && p4g2.c == 1.0f && !p4g2.d) {
                    sqd.t(this.o, (p4g) null);
                }
            }
            sqd.t(this.o, this.y);
            return;
        }
        obj = null;
        rac rac2 = (rac) obj;
        p4g p4g22 = this.y;
        sqd.t(this.o, (p4g) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, z48] */
    public final void c0(bj6 bj6) {
        a58 a58 = this.c;
        ? obj = new Object();
        obj.a = a58.a;
        obj.b = a58.b;
        obj.c = a58.c;
        obj.d = a58.o;
        obj.e = a58.v;
        obj.f = a58.w;
        obj.g = a58.x;
        obj.h = a58.y;
        obj.i = a58.z;
        obj.j = a58.X;
        obj.k = a58.Y;
        obj.l = a58.Z;
        obj.m = a58.v0;
        obj.n = a58.w0;
        obj.o = a58.x0;
        obj.p = a58.y0;
        obj.q = a58.z0;
        z48 z48 = (z48) bj6.apply(obj);
        z48.getClass();
        a58 a582 = new a58(z48);
        if (!a582.equals(this.c)) {
            z68.c("z0a", "updateViewState: %s", this.c);
            this.c = a582;
            ((e3a) this.a).Z(a582);
        }
    }
}
