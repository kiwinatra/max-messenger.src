package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: pe4  reason: default package */
public final class pe4 implements pw4 {
    public final UUID b;
    public final ts1 c;
    public final lf6 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final ox0 i = new ox0(9);
    public final nfd j;
    public final y35 k = new y35(17, (Object) this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = ryg.K();
    public final Set o = ryg.K();
    public int p;
    public rb5 q;
    public ke4 r;
    public ke4 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public mpb x;
    public volatile hy y;

    public pe4(UUID uuid, lf6 lf6, HashMap hashMap, boolean z, int[] iArr, boolean z2, nfd nfd, long j2) {
        ts1 ts1 = ve6.w;
        uuid.getClass();
        n79.f("Use C.CLEARKEY_UUID instead", !zw0.b.equals(uuid));
        this.b = uuid;
        this.c = ts1;
        this.d = lf6;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = nfd;
        this.l = j2;
    }

    public static boolean f(ke4 ke4) {
        ke4.p();
        if (ke4.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException d2 = ke4.d();
        d2.getClass();
        Throwable cause = d2.getCause();
        return (cause instanceof ResourceBusyException) || cvg.C(cause);
    }

    public static ArrayList i(yv4 yv4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(yv4.o);
        for (int i2 = 0; i2 < yv4.o; i2++) {
            wv4 wv4 = yv4.a[i2];
            if ((wv4.a(uuid) || (zw0.c.equals(uuid) && wv4.a(zw0.b))) && (wv4.v != null || z)) {
                arrayList.add(wv4);
            }
        }
        return arrayList;
    }

    public final aw4 a(gw4 gw4, ea6 ea6) {
        boolean z = false;
        k(false);
        if (this.p > 0) {
            z = true;
        }
        n79.n(z);
        n79.o(this.t);
        return e(this.t, gw4, ea6, true);
    }

    public final nw4 b(gw4 gw4, ea6 ea6) {
        n79.n(this.p > 0);
        n79.o(this.t);
        me4 me4 = new me4(this, gw4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new ir1(23, me4, ea6));
        return me4;
    }

    public final void c(Looper looper, mpb mpb) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    n79.n(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = mpb;
    }

    public final int d(ea6 ea6) {
        k(false);
        rb5 rb5 = this.q;
        rb5.getClass();
        int l2 = rb5.l();
        yv4 yv4 = ea6.r;
        if (yv4 == null) {
            int g2 = vq9.g(ea6.n);
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                return l2;
            }
            return 0;
        } else if (this.w != null) {
            return l2;
        } else {
            UUID uuid = this.b;
            if (i(yv4, uuid, true).isEmpty()) {
                if (yv4.o == 1 && yv4.a[0].a(zw0.b)) {
                    i8b.V("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = yv4.c;
            if (str == null || "cenc".equals(str)) {
                return l2;
            }
            if ("cbcs".equals(str)) {
                if (v0g.a >= 25) {
                    return l2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return l2;
            }
            return 1;
        }
    }

    public final aw4 e(Looper looper, gw4 gw4, ea6 ea6, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new hy(this, looper, 5);
        }
        yv4 yv4 = ea6.r;
        int i2 = 0;
        ke4 ke4 = null;
        if (yv4 == null) {
            int g2 = vq9.g(ea6.n);
            rb5 rb5 = this.q;
            rb5.getClass();
            if (rb5.l() == 2 && re6.c) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == g2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1 || rb5.l() == 1) {
                return null;
            }
            ke4 ke42 = this.r;
            if (ke42 == null) {
                lx5 lx5 = tb7.b;
                ke4 h2 = h(k0d.v, true, (gw4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                ke42.g((gw4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(yv4, this.b, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.b);
                i8b.p("DRM error", exc);
                if (gw4 != null) {
                    gw4.e(exc);
                }
                return new f85(new DrmSession$DrmSessionException(exc, 6003));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ke4 ke43 = (ke4) it.next();
                if (v0g.a(ke43.a, arrayList)) {
                    ke4 = ke43;
                    break;
                }
            }
        } else {
            ke4 = this.s;
        }
        if (ke4 == null) {
            ke4 = h(arrayList, false, gw4, z);
            if (!this.f) {
                this.s = ke4;
            }
            this.m.add(ke4);
        } else {
            ke4.g(gw4);
        }
        return ke4;
    }

    public final ke4 g(List list, boolean z, gw4 gw4) {
        this.q.getClass();
        rb5 rb5 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        mpb mpb = this.x;
        mpb.getClass();
        lf6 lf6 = this.d;
        nfd nfd = this.j;
        nfd nfd2 = nfd;
        ke4 ke4 = new ke4(this.b, rb5, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, lf6, looper, nfd2, mpb);
        ke4.g(gw4);
        if (this.l != -9223372036854775807L) {
            ke4.g((gw4) null);
        }
        return ke4;
    }

    public final ke4 h(List list, boolean z, gw4 gw4, boolean z2) {
        ke4 g2 = g(list, z, gw4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            wvf m2 = dc7.p(set).iterator();
            while (m2.hasNext()) {
                ((aw4) m2.next()).f((gw4) null);
            }
            g2.f(gw4);
            if (j2 != -9223372036854775807L) {
                g2.f((gw4) null);
            }
            g2 = g(list, z, gw4);
        }
        if (!f(g2) || !z2) {
            return g2;
        }
        Set set2 = this.n;
        if (set2.isEmpty()) {
            return g2;
        }
        wvf m3 = dc7.p(set2).iterator();
        while (m3.hasNext()) {
            ((me4) m3.next()).release();
        }
        if (!set.isEmpty()) {
            wvf m4 = dc7.p(set).iterator();
            while (m4.hasNext()) {
                ((aw4) m4.next()).f((gw4) null);
            }
        }
        g2.f(gw4);
        if (j2 != -9223372036854775807L) {
            g2.f((gw4) null);
        }
        return g(list, z, gw4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            rb5 rb5 = this.q;
            rb5.getClass();
            rb5.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (!z || this.t != null) {
            Thread currentThread = Thread.currentThread();
            Looper looper = this.t;
            looper.getClass();
            if (currentThread != looper.getThread()) {
                i8b.W("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
                return;
            }
            return;
        }
        i8b.W("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
    }

    public final void prepare() {
        rb5 rb5;
        k(true);
        int i2 = this.p;
        this.p = i2 + 1;
        if (i2 == 0) {
            if (this.q == null) {
                UUID uuid = this.b;
                this.c.getClass();
                try {
                    rb5 = new ve6(uuid, 1);
                } catch (UnsupportedSchemeException e2) {
                    throw new Exception(e2);
                } catch (Exception e3) {
                    throw new Exception(e3);
                } catch (UnsupportedDrmException unused) {
                    i8b.o("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    rb5 = new sq6(11);
                }
                this.q = rb5;
                rb5.n(new b8d((Object) this));
            } else if (this.l != -9223372036854775807L) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.m;
                    if (i3 < arrayList.size()) {
                        ((ke4) arrayList.get(i3)).g((gw4) null);
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void release() {
        k(true);
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((ke4) arrayList.get(i3)).f((gw4) null);
                }
            }
            wvf m2 = dc7.p(this.n).iterator();
            while (m2.hasNext()) {
                ((me4) m2.next()).release();
            }
            j();
        }
    }
}
