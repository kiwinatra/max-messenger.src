package defpackage;

import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: orf  reason: default package */
public final class orf implements ut {
    public final int a;
    public final e05 b;
    public final gd3 c;
    public final hrf d;
    public final wc8 e;
    public final v5g f;
    public final ni3 g;
    public final rx0 h;
    public long i;
    public final /* synthetic */ prf j;

    public orf(prf prf, int i2, gd3 gd3, hrf hrf, wc8 wc8, v5g v5g, ni3 ni3, rx0 rx0) {
        this.j = prf;
        this.a = i2;
        this.b = (e05) ((f05) gd3.a.get(i2)).a.get(0);
        this.c = gd3;
        this.d = hrf;
        this.e = wc8;
        this.f = v5g;
        this.g = ni3;
        this.h = rx0;
    }

    public final void a(ea6 ea6) {
        ea6 ea62;
        boolean z;
        ea6 ea63 = ea6;
        int y = y7e.y(ea63.n);
        prf prf = this.j;
        boolean z2 = true;
        n79.n(((dcd) ((SparseArray) prf.m.b).get(y)) == null);
        tgg tgg = prf.m;
        SparseArray sparseArray = ((mrf) ((ArrayList) tgg.a).get(this.a)).a;
        n79.n(v0g.l(sparseArray, y));
        ea6 ea64 = (ea6) sparseArray.get(y);
        String str = ea63.n;
        boolean h2 = vq9.h(str);
        gd3 gd3 = this.c;
        if (h2) {
            tgg.x(1, new h70(ea64, ea6, this.d, this.b, gd3.c.a, this.e, prf.d, prf.o, this.g));
            return;
        }
        if (vq9.k(str)) {
            boolean z3 = this.d.d == 1;
            m53 m53 = ea64.A;
            if (m53 == null || !m53.e()) {
                m53 = m53.h;
            }
            if (z3 && m53.g(m53)) {
                m53 = m53.h;
            }
            ba6 a2 = ea64.a();
            a2.z = m53;
            ea62 = new ea6(a2);
        } else if (vq9.i(str)) {
            ba6 a3 = ea6.a();
            m53 m532 = ea63.A;
            if (m532 == null || !m532.e()) {
                m532 = m53.h;
            }
            a3.z = m532;
            ea62 = new ea6(a3);
        } else {
            throw ExportException.e(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
        }
        ea6 ea65 = ea62;
        t9a t9a = gd3.b;
        tb7 tb7 = gd3.c.b;
        jrf jrf = new jrf(1, (Object) this);
        ArrayList arrayList = (ArrayList) tgg.a;
        if (arrayList.size() < 2) {
            z = false;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (v0g.l(((mrf) arrayList.get(i3)).a, 2)) {
                    i2++;
                }
            }
            if (i2 <= 1) {
                z2 = false;
            }
            z = z2;
        }
        tgg.x(2, new r8g(prf.a, ea65, this.d, t9a, tb7, this.f, prf.d, prf.o, jrf, this.g, this.h, prf.h, z));
    }

    public final void b(int i2) {
        if (i2 <= 0) {
            d(ExportException.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
            return;
        }
        synchronized (this.j.l) {
            tgg tgg = this.j.m;
            ((mrf) ((ArrayList) tgg.a).get(this.a)).b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A[EDGE_INSN: B:56:0x0103->B:47:0x0103 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bcd c(defpackage.ea6 r10) {
        /*
            r9 = this;
            prf r0 = r9.j
            java.lang.Object r0 = r0.l
            monitor-enter(r0)
            prf r1 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r1 = r1.m     // Catch:{ all -> 0x0012 }
            boolean r1 = r1.w()     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x0012:
            r9 = move-exception
            goto L_0x0125
        L_0x0015:
            java.lang.String r1 = r10.n     // Catch:{ all -> 0x0012 }
            int r1 = defpackage.y7e.y(r1)     // Catch:{ all -> 0x0012 }
            prf r3 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            boolean r4 = defpackage.v0g.l(r3, r1)     // Catch:{ all -> 0x0012 }
            defpackage.n79.n(r4)     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0012 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0012 }
            r4 = 0
            if (r3 == 0) goto L_0x006a
            prf r3 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r3 = r3.m     // Catch:{ all -> 0x0012 }
            boolean r5 = r3.w()     // Catch:{ all -> 0x0012 }
            java.lang.String r6 = "Primary track can only be queried after all tracks are added."
            defpackage.n79.m(r6, r5)     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x0045:
            java.lang.Object r6 = r3.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r7 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r5 >= r7) goto L_0x0061
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0012 }
            mrf r6 = (defpackage.mrf) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.v0g.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            r5 = -1
        L_0x0062:
            int r3 = r9.a     // Catch:{ all -> 0x0012 }
            if (r5 != r3) goto L_0x006d
            r9.a(r10)     // Catch:{ all -> 0x0012 }
            goto L_0x006d
        L_0x006a:
            r9.e(r1)     // Catch:{ all -> 0x0012 }
        L_0x006d:
            prf r3 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            dcd r3 = (defpackage.dcd) r3     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x007f
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x007f:
            e05 r2 = r9.b     // Catch:{ all -> 0x0012 }
            int r5 = r9.a     // Catch:{ all -> 0x0012 }
            gu6 r10 = r3.j(r2, r10, r5)     // Catch:{ all -> 0x0012 }
            nrf r2 = new nrf     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r1, r10)     // Catch:{ all -> 0x0012 }
            prf r5 = r9.j     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r5 = r5.k     // Catch:{ all -> 0x0012 }
            int r6 = r9.a     // Catch:{ all -> 0x0012 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0012 }
            msd r5 = (defpackage.msd) r5     // Catch:{ all -> 0x0012 }
            r5.getClass()     // Catch:{ all -> 0x0012 }
            r6 = 1
            r7 = 2
            if (r1 == r6) goto L_0x00a4
            if (r1 != r7) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r8 = r4
            goto L_0x00a5
        L_0x00a4:
            r8 = r6
        L_0x00a5:
            defpackage.n79.g(r8)     // Catch:{ all -> 0x0012 }
            java.util.HashMap r5 = r5.i     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00b6
            r8 = r6
            goto L_0x00b7
        L_0x00b6:
            r8 = r4
        L_0x00b7:
            defpackage.n79.g(r8)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            r5.put(r8, r2)     // Catch:{ all -> 0x0012 }
            prf r2 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r2 = r2.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            boolean r5 = defpackage.v0g.l(r2, r1)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x00da
            java.lang.Object r5 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0012 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0012 }
            int r6 = r6 + r5
        L_0x00da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0012 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0012 }
            prf r2 = r9.j     // Catch:{ all -> 0x0012 }
            tgg r2 = r2.m     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x00e6:
            java.lang.Object r6 = r2.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r8 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r4 >= r8) goto L_0x0103
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0012 }
            mrf r6 = (defpackage.mrf) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.v0g.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x0100
            int r5 = r5 + 1
        L_0x0100:
            int r4 = r4 + 1
            goto L_0x00e6
        L_0x0103:
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0012 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0012 }
            if (r1 != r5) goto L_0x0123
            prf r1 = r9.j     // Catch:{ all -> 0x0012 }
            r1.g()     // Catch:{ all -> 0x0012 }
            prf r9 = r9.j     // Catch:{ all -> 0x0012 }
            k7f r9 = r9.j     // Catch:{ all -> 0x0012 }
            i7f r9 = r9.a(r7, r3)     // Catch:{ all -> 0x0012 }
            r9.b()     // Catch:{ all -> 0x0012 }
        L_0x0123:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r10
        L_0x0125:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orf.c(ea6):bcd");
    }

    public final void d(ExportException exportException) {
        prf prf = this.j;
        prf.g();
        prf.j.b(exportException, 4, 2, 0).b();
    }

    public final void e(int i2) {
        prf prf = this.j;
        n79.n(((dcd) ((SparseArray) prf.m.b).get(i2)) == null);
        tgg tgg = prf.m;
        SparseArray sparseArray = ((mrf) ((ArrayList) tgg.a).get(this.a)).a;
        n79.n(v0g.l(sparseArray, i2));
        tgg.x(i2, new m55((ea6) sparseArray.get(i2), this.d, prf.o, this.g, prf.h));
    }

    public final void f(long j2) {
    }

    public final boolean g(int i2, ea6 ea6) {
        boolean h2;
        int y = y7e.y(ea6.n);
        synchronized (this.j.l) {
            try {
                tgg tgg = this.j.m;
                int i3 = this.a;
                tgg.getClass();
                int y2 = y7e.y(ea6.n);
                SparseArray sparseArray = ((mrf) ((ArrayList) tgg.a).get(i3)).a;
                boolean z = true;
                n79.n(!v0g.l(sparseArray, y2));
                sparseArray.put(y2, ea6);
                if (this.j.m.w()) {
                    tgg tgg2 = this.j.m;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) tgg2.a;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        SparseArray sparseArray2 = ((mrf) arrayList.get(i4)).a;
                        if (v0g.l(sparseArray2, 1)) {
                            i5 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i6 = 1;
                        }
                        i4++;
                    }
                    int i7 = i5 + i6;
                    g0a g0a = this.j.o;
                    if (g0a.r != 2) {
                        n79.m("The track count cannot be changed after adding track formats.", g0a.e.size() == 0);
                        g0a.w = i7;
                    }
                    ((AtomicInteger) this.g.e).set(i7);
                }
                h2 = h(i2, ea6);
                if (!h2 && y7e.y(ea6.n) == 2) {
                    y7e.O(this.j.o, this.b.g.b, ea6);
                }
                SparseArray sparseArray3 = (SparseArray) this.j.m.c;
                if (v0g.l(sparseArray3, y)) {
                    if (h2 != ((Boolean) sparseArray3.get(y)).booleanValue()) {
                        z = false;
                    }
                    n79.n(z);
                } else {
                    sparseArray3.put(y, Boolean.valueOf(h2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2;
    }

    public final boolean h(int i2, ea6 ea6) {
        boolean z = (i2 & 1) != 0;
        int y = y7e.y(ea6.n);
        if (!z) {
            return true;
        }
        prf prf = this.j;
        if (y == 1) {
            return y7e.W(ea6, this.c, this.a, this.d, prf.d, prf.o);
        }
        if (y == 2) {
            if (y7e.X(ea6, this.c, this.a, this.d, prf.d, prf.o)) {
                return true;
            }
            sq8 sq8 = this.b.a.e;
            if (sq8.a > 0 && !sq8.g) {
                return true;
            }
        }
        return false;
    }
}
