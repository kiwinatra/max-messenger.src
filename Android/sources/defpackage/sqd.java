package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: sqd  reason: default package */
public final class sqd {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final fq h;
    public final p7d i;
    public CharSequence j;
    public int k;
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();

    public sqd(fq fqVar, p7d p7d) {
        this.h = fqVar;
        this.i = p7d;
        if (((hq) fqVar).g.getBoolean("app.send.media.as.collage", true)) {
            this.k = 3;
        } else {
            this.k = 1;
        }
    }

    public static boolean m(d48 d48, uqd uqd) {
        d48 d482 = uqd.a;
        if (d482 == null || d48 == null) {
            return false;
        }
        if ((d48 instanceof k00) && (d482 instanceof k00)) {
            return cvg.c(((k00) d48).X.q, ((k00) d482).X.q);
        }
        if (d482.b == d48.b) {
            return true;
        }
        return y64.a(d48.c(), d482.c());
    }

    public final void a() {
        this.a.clear();
        p();
        this.b.clear();
        if (((hq) this.h).g.getBoolean("app.send.media.as.collage", true)) {
            this.k = 3;
        } else {
            this.k = 1;
        }
    }

    public final int b(d48 d48, int i2) {
        boolean l2 = l(d48);
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (l2) {
            return copyOnWriteArraySet.size();
        }
        uqd i3 = i(d48);
        if (i3 != null) {
            i3.f = true;
            return h(d48);
        }
        uqd uqd = new uqd(d48);
        uqd.c = (dfb) this.b.get(Long.valueOf(d48.b));
        Set<go6> set = this.e;
        if (i2 < 0 || i2 >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(uqd);
            if (set != null) {
                for (go6 b2 : set) {
                    try {
                        b2.b(uqd);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            p();
            return copyOnWriteArraySet.size();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
        arrayList.add(i2, uqd);
        copyOnWriteArraySet.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            uqd uqd2 = (uqd) it.next();
            copyOnWriteArraySet.add(uqd2);
            if (set != null) {
                for (go6 b3 : set) {
                    try {
                        b3.b(uqd2);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            p();
        }
        return i2 + 1;
    }

    public final int c() {
        return d().size();
    }

    public final List d() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (((uqd) next).f) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            uqd uqd = (uqd) it.next();
            if (uqd.f) {
                d48 d48 = uqd.a;
                if ((d48 instanceof k00) && !dfb.b(uqd.c, d48)) {
                    arrayList.add(new l00(d48.a, d48.a(), ((k00) d48).X));
                } else {
                    String g2 = g(uqd);
                    if (g2 != null) {
                        arrayList.add(k(d48.a, g2));
                    } else {
                        arrayList.add(n(uqd));
                    }
                }
            }
        }
        return arrayList;
    }

    public final dfb f(d48 d48) {
        uqd i2 = i(d48);
        dfb dfb = i2 != null ? i2.c : null;
        return dfb == null ? (dfb) this.b.get(Long.valueOf(d48.b)) : dfb;
    }

    public final String g(uqd uqd) {
        dfb dfb = uqd.c;
        Uri uri = dfb != null ? dfb.v : null;
        Uri uri2 = dfb != null ? dfb.w : null;
        Uri uri3 = dfb != null ? dfb.b : null;
        Uri uri4 = dfb != null ? dfb.a : null;
        if (uri != null) {
            Uri a2 = dfb.a(dfb, uqd.a);
            try {
                p7d p7d = this.i;
                Bitmap u = p7d.u(a2, true);
                Bitmap u2 = p7d.u(uri, false);
                Canvas canvas = new Canvas(u);
                float width = ((float) u.getWidth()) / ((float) u2.getWidth());
                canvas.scale(width, width);
                canvas.drawBitmap(u2, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (Paint) null);
                File a3 = ((ln5) p7d.c).a("jpg");
                o5a.b0(a3.getAbsolutePath(), u, 100);
                return a3.getAbsolutePath();
            } catch (Exception e2) {
                z68.f("sqd", "getMediasForSend: exception", e2);
                return a2.toString();
            }
        } else if (uri2 != null) {
            return uri2.getPath();
        } else {
            if (uri3 != null) {
                return uri3.getPath();
            }
            if (uri4 != null) {
                return uri4.getPath();
            }
            return null;
        }
    }

    public final int h(d48 d48) {
        if (!l(d48)) {
            return 0;
        }
        Iterator it = this.a.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            uqd uqd = (uqd) it.next();
            if (uqd.f) {
                if (m(d48, uqd)) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: uqd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: uqd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: uqd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: uqd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uqd i(defpackage.d48 r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.a
            r0 = 0
            if (r3 != 0) goto L_0x0006
            goto L_0x0026
        L_0x0006:
            java.util.Iterator r3 = r3.iterator()
        L_0x000a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r3.next()
            r2 = r1
            uqd r2 = (defpackage.uqd) r2     // Catch:{ all -> 0x001f }
            boolean r2 = m(r4, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x000a
            r0 = r1
            goto L_0x0026
        L_0x001f:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x0026:
            uqd r0 = (defpackage.uqd) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqd.i(d48):uqd");
    }

    public final uqd j(int i2) {
        List list;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (((uqd) next).f) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return (uqd) list.get(i2);
    }

    public final cbe k(int i2, String str) {
        if (this.k == 2) {
            i2 = 7;
        }
        return new cbe(i2, str);
    }

    public final boolean l(d48 d48) {
        boolean z;
        CopyOnWriteArraySet<uqd> copyOnWriteArraySet = this.a;
        if ((copyOnWriteArraySet instanceof Collection) && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        for (uqd uqd : copyOnWriteArraySet) {
            try {
                if (!uqd.f || !m(d48, uqd)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public final cbe n(uqd uqd) {
        int i2 = this.k;
        d48 d48 = uqd.a;
        if (i2 == 2 || d48.a != 3 || uqd.b == null) {
            return k(d48.a, d48.a());
        }
        return new q6g(d48.a(), uqd.b, cvg.A(uqd.d) ? d48.o : uqd.d);
    }

    public final void o(uqd uqd) {
        for (pqd K : this.f) {
            K.K(uqd);
        }
    }

    public final void p() {
        for (qqd N : this.c) {
            N.N(Collections.unmodifiableSet(this.a));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.size() > 1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ur0 q() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.e()
            int r1 = r3.k
            r2 = 3
            if (r1 != r2) goto L_0x0011
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.CharSequence r3 = r3.j
            ur0 r1 = new ur0
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqd.q():ur0");
    }

    public final void r(d48 d48, File file) {
        b(d48, this.a.size());
        uqd i2 = i(d48);
        if (i2 != null) {
            d48 d482 = i2.a;
            if (d482 instanceof k00) {
                k00 k00 = (k00) d482;
                k00.getClass();
                String path = file.getPath();
                z68.c("k00", "Set downloaded file " + path, new Object[0]);
                k00.v0 = file;
                String str = k00.X.r;
                if (str == null || str.length() == 0) {
                    j10 j2 = k00.X.j();
                    j2.m = file.getPath();
                    k00.X = j2.a();
                }
            }
            o(i2);
        }
    }

    public final void s(int i2) {
        if (c() > 1) {
            fq fqVar = this.h;
            if (i2 == 3) {
                ((hq) fqVar).i("app.send.media.as.collage", true);
            } else if (i2 == 1) {
                ((hq) fqVar).i("app.send.media.as.collage", false);
            }
        }
        this.k = i2;
        for (z0a z0a : this.d) {
            int i3 = this.k;
            d48 d48 = z0a.o;
            if (d48 != null) {
                int i4 = d48.a;
                if (i3 == 2) {
                    if (i4 == 1) {
                        z0a.c0(new es1(7));
                    } else if (d48.b()) {
                        z0a.c0(new es1(8));
                    }
                } else if (i4 == 1) {
                    z0a.c0(new es1(9));
                } else if (d48.b()) {
                    z0a.c0(new es1(10));
                }
            }
        }
    }

    public final void t(d48 d48, p4g p4g) {
        b(d48, this.a.size());
        uqd i2 = i(d48);
        if (i2 != null) {
            i2.b = p4g;
        }
        o(i2);
    }

    public final int u(d48 d48) {
        int i2;
        uqd uqd;
        CopyOnWriteArraySet<hn6> copyOnWriteArraySet = this.l;
        if (copyOnWriteArraySet != null) {
            for (hn6 a2 : copyOnWriteArraySet) {
                try {
                    a2.a(rqd.a);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean l2 = l(d48);
        Set<go6> set = this.e;
        if (l2) {
            Iterator it = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uqd = null;
                    break;
                }
                uqd = (uqd) it.next();
                if (m(d48, uqd)) {
                    copyOnWriteArraySet2.remove(uqd);
                    break;
                }
            }
            if (!(uqd == null || set == null)) {
                for (go6 a3 : set) {
                    try {
                        a3.a(uqd);
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            p();
            if (uqd != null && !d48.c.equals(dfb.a(uqd.c, d48).toString())) {
                o(uqd);
            }
            i2 = 0;
        } else {
            uqd i3 = i(d48);
            if (i3 != null) {
                copyOnWriteArraySet2.remove(i3);
                copyOnWriteArraySet2.add(i3);
                i3.f = true;
                if (set != null) {
                    for (go6 b2 : set) {
                        try {
                            b2.b(i3);
                        } catch (Throwable th3) {
                            throw new RuntimeException(th3);
                        }
                    }
                }
                p();
                i2 = h(d48);
            } else {
                i2 = b(d48, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            for (hn6 a4 : copyOnWriteArraySet) {
                try {
                    a4.a(rqd.b);
                } catch (Throwable th4) {
                    throw new RuntimeException(th4);
                }
            }
        }
        return i2;
    }
}
