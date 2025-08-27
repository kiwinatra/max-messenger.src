package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: oe4  reason: default package */
public final class oe4 implements ow4 {
    public final UUID b;
    public final ts1 c;
    public final lf6 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final xe8 i = new xe8(10);
    public final gga j;
    public final xv1 k = new xv1(16, (Object) this);
    public final long l;
    public final ArrayList m = new ArrayList();
    public final Set n = ryg.K();
    public final Set o = ryg.K();
    public int p;
    public qb5 q;
    public je4 r;
    public je4 s;
    public Looper t;
    public Handler u;
    public int v = 0;
    public byte[] w;
    public lpb x;
    public volatile hy y;

    public oe4(UUID uuid, lf6 lf6, HashMap hashMap, boolean z, int[] iArr, boolean z2, gga gga, long j2) {
        ts1 ts1 = ve6.v;
        uuid.getClass();
        y64.f("Use C.CLEARKEY_UUID instead", !ww0.b.equals(uuid));
        this.b = uuid;
        this.c = ts1;
        this.d = lf6;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = gga;
        this.l = j2;
    }

    public static boolean f(je4 je4) {
        if (je4.o == 1) {
            if (t0g.a < 19) {
                return true;
            }
            DrmSession$DrmSessionException d2 = je4.d();
            d2.getClass();
            if (d2.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(xv4 xv4, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(xv4.o);
        for (int i2 = 0; i2 < xv4.o; i2++) {
            vv4 vv4 = xv4.a[i2];
            if ((vv4.a(uuid) || (ww0.c.equals(uuid) && vv4.a(ww0.b))) && (vv4.v != null || z)) {
                arrayList.add(vv4);
            }
        }
        return arrayList;
    }

    public final zv4 a(fw4 fw4, ca6 ca6) {
        y64.j(this.p > 0);
        y64.k(this.t);
        return e(this.t, fw4, ca6, true);
    }

    public final int b(ca6 ca6) {
        qb5 qb5 = this.q;
        qb5.getClass();
        int l2 = qb5.l();
        xv4 xv4 = ca6.x0;
        if (xv4 == null) {
            int g2 = uq9.g(ca6.Z);
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
            if (i(xv4, uuid, true).isEmpty()) {
                if (xv4.o == 1 && xv4.a[0].a(ww0.b)) {
                    new StringBuilder(String.valueOf(uuid).length() + 72);
                }
                return 1;
            }
            String str = xv4.c;
            if (str == null || "cenc".equals(str)) {
                return l2;
            }
            if ("cbcs".equals(str)) {
                if (t0g.a >= 25) {
                    return l2;
                }
            } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                return l2;
            }
            return 1;
        }
    }

    public final void c(Looper looper, lpb lpb) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    y64.j(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.x = lpb;
    }

    public final mw4 d(fw4 fw4, ca6 ca6) {
        y64.j(this.p > 0);
        y64.k(this.t);
        le4 le4 = new le4(this, fw4);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new ir1(22, le4, ca6));
        return le4;
    }

    public final zv4 e(Looper looper, fw4 fw4, ca6 ca6, boolean z) {
        ArrayList arrayList;
        if (this.y == null) {
            this.y = new hy(this, looper, 4);
        }
        xv4 xv4 = ca6.x0;
        int i2 = 0;
        je4 je4 = null;
        if (xv4 == null) {
            int g2 = uq9.g(ca6.Z);
            qb5 qb5 = this.q;
            qb5.getClass();
            if (qb5.l() == 2 && qe6.d) {
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
            if (i2 == -1 || qb5.l() == 1) {
                return null;
            }
            je4 je42 = this.r;
            if (je42 == null) {
                lx5 lx5 = tb7.b;
                je4 h2 = h(k0d.v, true, (fw4) null, z);
                this.m.add(h2);
                this.r = h2;
            } else {
                je42.g((fw4) null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = i(xv4, this.b, false);
            if (arrayList.isEmpty()) {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Media does not support uuid: ");
                sb.append(valueOf);
                Exception exc = new Exception(sb.toString());
                iq.a("DRM error", exc);
                if (fw4 != null) {
                    fw4.e(exc);
                }
                return new e85(new DrmSession$DrmSessionException(exc, 6003));
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
                je4 je43 = (je4) it.next();
                if (t0g.a(je43.a, arrayList)) {
                    je4 = je43;
                    break;
                }
            }
        } else {
            je4 = this.s;
        }
        if (je4 == null) {
            je4 = h(arrayList, false, fw4, z);
            if (!this.f) {
                this.s = je4;
            }
            this.m.add(je4);
        } else {
            je4.g(fw4);
        }
        return je4;
    }

    public final je4 g(List list, boolean z, fw4 fw4) {
        this.q.getClass();
        qb5 qb5 = this.q;
        int i2 = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        lpb lpb = this.x;
        lpb.getClass();
        lf6 lf6 = this.d;
        gga gga = this.j;
        gga gga2 = gga;
        je4 je4 = new je4(this.b, qb5, this.i, this.k, list, i2, this.h | z, z, bArr, this.e, lf6, looper, gga2, lpb);
        je4.g(fw4);
        if (this.l != -9223372036854775807L) {
            je4.g((fw4) null);
        }
        return je4;
    }

    public final je4 h(List list, boolean z, fw4 fw4, boolean z2) {
        je4 g2 = g(list, z, fw4);
        boolean f2 = f(g2);
        long j2 = this.l;
        Set set = this.o;
        if (f2 && !set.isEmpty()) {
            wvf m2 = dc7.p(set).iterator();
            while (m2.hasNext()) {
                ((zv4) m2.next()).f((fw4) null);
            }
            g2.f(fw4);
            if (j2 != -9223372036854775807L) {
                g2.f((fw4) null);
            }
            g2 = g(list, z, fw4);
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
            ((le4) m3.next()).release();
        }
        if (!set.isEmpty()) {
            wvf m4 = dc7.p(set).iterator();
            while (m4.hasNext()) {
                ((zv4) m4.next()).f((fw4) null);
            }
        }
        g2.f(fw4);
        if (j2 != -9223372036854775807L) {
            g2.f((fw4) null);
        }
        return g(list, z, fw4);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            qb5 qb5 = this.q;
            qb5.getClass();
            qb5.release();
            this.q = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ve6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ve6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: ve6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void prepare() {
        /*
            r4 = this;
            int r0 = r4.p
            int r1 = r0 + 1
            r4.p = r1
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            qb5 r0 = r4.q
            if (r0 != 0) goto L_0x004c
            java.util.UUID r0 = r4.b
            ts1 r1 = r4.c
            r1.getClass()
            ve6 r1 = new ve6     // Catch:{ UnsupportedSchemeException -> 0x001d, Exception -> 0x001b }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ UnsupportedSchemeException -> 0x001d, Exception -> 0x001b }
            goto L_0x003f
        L_0x001b:
            r1 = move-exception
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x0025
        L_0x001f:
            com.google.android.exoplayer2.drm.UnsupportedDrmException r2 = new com.google.android.exoplayer2.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002b }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002b }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002b }
        L_0x0025:
            com.google.android.exoplayer2.drm.UnsupportedDrmException r2 = new com.google.android.exoplayer2.drm.UnsupportedDrmException     // Catch:{ UnsupportedDrmException -> 0x002b }
            r2.<init>(r1)     // Catch:{ UnsupportedDrmException -> 0x002b }
            throw r2     // Catch:{ UnsupportedDrmException -> 0x002b }
        L_0x002b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = r0.length()
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            mz4 r1 = new mz4
            r1.<init>()
        L_0x003f:
            r4.q = r1
            u6h r0 = new u6h
            r2 = 14
            r0.<init>(r2, r4)
            r1.q(r0)
            goto L_0x006d
        L_0x004c:
            long r0 = r4.l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r0 = 0
        L_0x0058:
            java.util.ArrayList r1 = r4.m
            int r2 = r1.size()
            if (r0 >= r2) goto L_0x006d
            java.lang.Object r1 = r1.get(r0)
            je4 r1 = (defpackage.je4) r1
            r2 = 0
            r1.g(r2)
            int r0 = r0 + 1
            goto L_0x0058
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe4.prepare():void");
    }

    public final void release() {
        int i2 = this.p - 1;
        this.p = i2;
        if (i2 == 0) {
            if (this.l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.m);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((je4) arrayList.get(i3)).f((fw4) null);
                }
            }
            wvf m2 = dc7.p(this.n).iterator();
            while (m2.hasNext()) {
                ((le4) m2.next()).release();
            }
            j();
        }
    }
}
