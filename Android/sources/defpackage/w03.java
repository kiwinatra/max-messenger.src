package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: w03  reason: default package */
public final class w03 implements lcd, qsd, q28, v28 {
    public u03 A0;
    public long B0;
    public long C0;
    public int D0;
    public uj0 E0;
    public boolean F0;
    public final qr0 X = new Object();
    public final ArrayList Y;
    public final List Z;
    public final int a;
    public final int[] b;
    public final ea6[] c;
    public final boolean[] o;
    public final td4 v;
    public final jcd v0;
    public final osd w;
    public final jcd[] w0;
    public final cs x;
    public final fj x0;
    public final nfd y;
    public m03 y0;
    public final l15 z = new l15("ChunkSampleStream");
    public ea6 z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, qr0] */
    public w03(int i, int[] iArr, ea6[] ea6Arr, td4 td4, osd osd, cb4 cb4, long j, pw4 pw4, gw4 gw4, nfd nfd, cs csVar) {
        this.a = i;
        this.b = iArr;
        this.c = ea6Arr;
        this.v = td4;
        this.w = osd;
        this.x = csVar;
        this.y = nfd;
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        this.Z = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.w0 = new jcd[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        jcd[] jcdArr = new jcd[i2];
        pw4.getClass();
        jcd jcd = new jcd(cb4, pw4, gw4);
        this.v0 = jcd;
        int i3 = 0;
        iArr2[0] = i;
        jcdArr[0] = jcd;
        while (i3 < length) {
            jcd jcd2 = new jcd(cb4, (pw4) null, (gw4) null);
            this.w0[i3] = jcd2;
            int i4 = i3 + 1;
            jcdArr[i4] = jcd2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.x0 = new fj(3, (Object) iArr2, (Object) jcdArr);
        this.B0 = j;
        this.C0 = j;
    }

    public final void A(long j) {
        l15 l15 = this.z;
        if (!l15.s() && !p()) {
            boolean z2 = l15.z();
            ArrayList arrayList = this.Y;
            boolean z3 = false;
            List list = this.Z;
            td4 td4 = this.v;
            if (z2) {
                m03 m03 = this.y0;
                m03.getClass();
                boolean z4 = m03 instanceof uj0;
                if (!z4 || !o(arrayList.size() - 1)) {
                    if (td4.m == null) {
                        z3 = td4.j.t(j, m03, list);
                    }
                    if (z3) {
                        l15.j();
                        if (z4) {
                            this.E0 = (uj0) m03;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (td4.m != null || td4.j.length() < 2) ? list.size() : td4.j.g(j, list);
            if (size < arrayList.size()) {
                n79.n(!l15.z());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!o(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j2 = n().y;
                    uj0 l = l(size);
                    if (arrayList.isEmpty()) {
                        this.B0 = this.C0;
                    }
                    this.F0 = false;
                    cs csVar = this.x;
                    csVar.getClass();
                    csVar.M(new es8(1, this.a, (Object) null, 3, (Object) null, v0g.h0(l.x), v0g.h0(j2)));
                }
            }
        }
    }

    public final void E(t28 t28, long j, long j2, boolean z2) {
        m03 m03 = (m03) t28;
        this.y0 = null;
        this.E0 = null;
        long j3 = m03.a;
        tne tne = m03.z;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.y.getClass();
        this.x.v(l28, m03.c, this.a, m03.o, m03.v, m03.w, m03.x, m03.y);
        if (!z2) {
            if (p()) {
                this.v0.y(false);
                for (jcd y2 : this.w0) {
                    y2.y(false);
                }
            } else if (m03 instanceof uj0) {
                ArrayList arrayList = this.Y;
                l(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.B0 = this.C0;
                }
            }
            this.w.c(this);
        }
    }

    public final void H(t28 t28, long j, long j2) {
        m03 m03 = (m03) t28;
        this.y0 = null;
        td4 td4 = this.v;
        td4.getClass();
        if (m03 instanceof vf7) {
            int s = td4.j.s(((vf7) m03).o);
            pd4[] pd4Arr = td4.i;
            pd4 pd4 = pd4Arr[s];
            if (((q64) pd4.g) == null) {
                n03 n03 = (n03) pd4.d;
                n79.o(n03);
                p03 a2 = ((ov0) n03).a();
                if (a2 != null) {
                    x2d x2d = (x2d) pd4.e;
                    jz2 jz2 = new jz2((Object) a2, x2d.c, 3);
                    long j3 = pd4.c;
                    pd4Arr[s] = new pd4(pd4.b, x2d, (ml0) pd4.f, (n03) pd4.d, j3, jz2, 1);
                }
            }
        }
        gpb gpb = td4.h;
        if (gpb != null) {
            long j4 = gpb.d;
            if (j4 == -9223372036854775807L || m03.y > j4) {
                gpb.d = m03.y;
            }
            gpb.e.o = true;
        }
        long j5 = m03.a;
        tne tne = m03.z;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.y.getClass();
        this.x.x(l28, m03.c, this.a, m03.o, m03.v, m03.w, m03.x, m03.y);
        this.w.c(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.p01 Z(defpackage.t28 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r12 = r32
            r1 = 1
            r2 = r27
            m03 r2 = (defpackage.m03) r2
            tne r3 = r2.z
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.uj0
            java.util.ArrayList r6 = r0.Y
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r3 = r0.o(r7)
            if (r3 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            l28 r10 = new l28
            tne r11 = r2.z
            android.net.Uri r13 = r11.c
            java.util.Map r11 = r11.o
            r13 = r30
            r10.<init>(r13, r11)
            long r13 = r2.x
            defpackage.v0g.h0(r13)
            long r8 = r2.y
            defpackage.v0g.h0(r8)
            j28 r8 = new j28
            r9 = r33
            r8.<init>(r9, r12)
            td4 r9 = r0.v
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            nfd r11 = r0.y
            if (r3 != 0) goto L_0x005d
            r9.getClass()
            r16 = r6
            r17 = r7
            r25 = r10
        L_0x005a:
            r1 = 0
            goto L_0x0236
        L_0x005d:
            gpb r4 = r9.h
            r19 = r2
            if (r4 == 0) goto L_0x00aa
            long r1 = r4.d
            int r17 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x006f
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x006f
            r1 = 1
            goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            hpb r2 = r4.e
            java.lang.Object r4 = r2.X
            y54 r4 = (defpackage.y54) r4
            boolean r4 = r4.d
            if (r4 != 0) goto L_0x007b
            goto L_0x00aa
        L_0x007b:
            boolean r4 = r2.v
            if (r4 == 0) goto L_0x0080
            goto L_0x009f
        L_0x0080:
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0087
            goto L_0x009f
        L_0x0087:
            r1 = 1
            r2.v = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.y
            rt6 r1 = (defpackage.rt6) r1
            java.lang.Object r1 = r1.b
            o64 r1 = (defpackage.o64) r1
            android.os.Handler r2 = r1.D
            i64 r4 = r1.w
            r2.removeCallbacks(r4)
            r1.z()
        L_0x009f:
            r16 = r6
            r17 = r7
            r25 = r10
            r2 = r19
        L_0x00a7:
            r1 = 1
            goto L_0x0236
        L_0x00aa:
            y54 r1 = r9.k
            boolean r1 = r1.d
            r2 = r19
            ea6 r4 = r2.o
            pd4[] r13 = r9.i
            if (r1 != 0) goto L_0x0109
            boolean r1 = r2 instanceof defpackage.ym8
            if (r1 == 0) goto L_0x0109
            boolean r1 = r12 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0109
            r1 = r12
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r1 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.o
            r14 = 404(0x194, float:5.66E-43)
            if (r1 != r14) goto L_0x0109
            md5 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            long r17 = r1.e()
            r19 = -1
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0109
            r19 = 0
            int r14 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r14 == 0) goto L_0x0109
            java.lang.Object r14 = r1.g
            q64 r14 = (defpackage.q64) r14
            defpackage.n79.o(r14)
            long r19 = r14.C()
            long r14 = r1.c
            long r19 = r19 + r14
            long r19 = r19 + r17
            r14 = 1
            long r19 = r19 - r14
            r1 = r2
            ym8 r1 = (defpackage.ym8) r1
            long r14 = r1.b()
            int r1 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r1 <= 0) goto L_0x0109
            r1 = 1
            r9.n = r1
        L_0x0102:
            r16 = r6
            r17 = r7
            r25 = r10
            goto L_0x00a7
        L_0x0109:
            md5 r1 = r9.j
            int r1 = r1.s(r4)
            r1 = r13[r1]
            java.lang.Object r13 = r1.e
            x2d r13 = (defpackage.x2d) r13
            tb7 r13 = r13.b
            qpg r14 = r9.b
            ml0 r13 = r14.w(r13)
            java.lang.Object r15 = r1.f
            ml0 r15 = (defpackage.ml0) r15
            if (r13 == 0) goto L_0x012a
            boolean r13 = r15.equals(r13)
            if (r13 != 0) goto L_0x012a
            goto L_0x0102
        L_0x012a:
            md5 r13 = r9.j
            java.lang.Object r1 = r1.e
            x2d r1 = (defpackage.x2d) r1
            tb7 r1 = r1.b
            r16 = r6
            r17 = r7
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r12 = r13.length()
            r25 = r10
            r10 = 0
            r23 = 0
        L_0x0143:
            if (r10 >= r12) goto L_0x0155
            boolean r18 = r13.q(r10, r6)
            if (r18 == 0) goto L_0x0150
            r18 = 1
            int r23 = r23 + 1
            goto L_0x0152
        L_0x0150:
            r18 = 1
        L_0x0152:
            int r10 = r10 + 1
            goto L_0x0143
        L_0x0155:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = 0
        L_0x015b:
            int r10 = r1.size()
            if (r7 >= r10) goto L_0x0173
            java.lang.Object r10 = r1.get(r7)
            ml0 r10 = (defpackage.ml0) r10
            int r10 = r10.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.add(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x015b
        L_0x0173:
            int r20 = r6.size()
            z35 r6 = new z35
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r1 = r14.a(r1)
            r10 = 0
        L_0x0183:
            int r13 = r1.size()
            if (r10 >= r13) goto L_0x019b
            java.lang.Object r13 = r1.get(r10)
            ml0 r13 = (defpackage.ml0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7.add(r13)
            r13 = 1
            int r10 = r10 + r13
            goto L_0x0183
        L_0x019b:
            int r1 = r7.size()
            int r21 = r20 - r1
            r24 = 2
            r19 = r6
            r22 = r12
            r19.<init>(r20, r21, r22, r23, r24)
            r1 = 2
            boolean r7 = r6.a(r1)
            if (r7 != 0) goto L_0x01ba
            r7 = 1
            boolean r10 = r6.a(r7)
            if (r10 != 0) goto L_0x01ba
            goto L_0x005a
        L_0x01ba:
            r11.getClass()
            p01 r7 = defpackage.nfd.o(r6, r8)
            if (r7 == 0) goto L_0x005a
            int r10 = r7.b
            boolean r6 = r6.a(r10)
            if (r6 != 0) goto L_0x01cd
            goto L_0x005a
        L_0x01cd:
            long r6 = r7.c
            if (r10 != r1) goto L_0x01dc
            md5 r1 = r9.j
            int r4 = r1.s(r4)
            boolean r1 = r1.u(r4, r6)
            goto L_0x0236
        L_0x01dc:
            r1 = 1
            if (r10 != r1) goto L_0x005a
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 + r6
            java.lang.String r1 = r15.b
            java.lang.Object r4 = r14.a
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x0201
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.v0g.a
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r9, r6)
            goto L_0x0202
        L_0x0201:
            r6 = r9
        L_0x0202:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r1, r6)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r15.c
            if (r4 == r1) goto L_0x00a7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r14.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r1)
            if (r6 == 0) goto L_0x022d
            java.lang.Object r6 = r4.get(r1)
            java.lang.Long r6 = (java.lang.Long) r6
            int r7 = defpackage.v0g.a
            long r6 = r6.longValue()
            long r9 = java.lang.Math.max(r9, r6)
        L_0x022d:
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.put(r1, r6)
            goto L_0x00a7
        L_0x0236:
            r12 = 0
            if (r1 == 0) goto L_0x025d
            if (r3 == 0) goto L_0x0258
            if (r5 == 0) goto L_0x0255
            r7 = r17
            uj0 r1 = r0.l(r7)
            if (r1 != r2) goto L_0x0247
            r1 = 1
            goto L_0x0248
        L_0x0247:
            r1 = 0
        L_0x0248:
            defpackage.n79.n(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x0255
            long r3 = r0.C0
            r0.B0 = r3
        L_0x0255:
            p01 r1 = defpackage.l15.v
            goto L_0x025e
        L_0x0258:
            java.lang.String r1 = "Ignoring attempt to cancel non-cancelable load."
            defpackage.i8b.V(r1)
        L_0x025d:
            r1 = r12
        L_0x025e:
            if (r1 != 0) goto L_0x0280
            r11.getClass()
            long r14 = defpackage.nfd.q(r8)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x027e
            p01 r1 = new p01
            r17 = 5
            r18 = 0
            r13 = r1
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x0280
        L_0x027e:
            p01 r1 = defpackage.l15.w
        L_0x0280:
            r14 = r1
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.x
            long r6 = r2.y
            cs r1 = r0.x
            int r3 = r2.c
            int r4 = r0.a
            ea6 r5 = r2.o
            int r10 = r2.v
            java.lang.Object r13 = r2.w
            r2 = r25
            r16 = r6
            r6 = r10
            r7 = r13
            r18 = r11
            r10 = r16
            r13 = r12
            r12 = r32
            r27 = r14
            r14 = r13
            r13 = r15
            r1.z(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02b8
            r0.y0 = r14
            r18.getClass()
            osd r1 = r0.w
            r1.c(r0)
        L_0x02b8:
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.Z(t28, long, long, java.io.IOException, int):p01");
    }

    public final void a() {
        jcd jcd = this.v0;
        jcd.y(true);
        aw4 aw4 = jcd.h;
        if (aw4 != null) {
            aw4.f(jcd.e);
            jcd.h = null;
            jcd.g = null;
        }
        for (jcd jcd2 : this.w0) {
            jcd2.y(true);
            aw4 aw42 = jcd2.h;
            if (aw42 != null) {
                aw42.f(jcd2.e);
                jcd2.h = null;
                jcd2.g = null;
            }
        }
        for (pd4 pd4 : this.v.i) {
            n03 n03 = (n03) pd4.d;
            if (n03 != null) {
                ((ov0) n03).c();
            }
        }
        u03 u03 = this.A0;
        if (u03 != null) {
            g64 g64 = (g64) u03;
            synchronized (g64) {
                gpb gpb = (gpb) g64.w0.remove(this);
                if (gpb != null) {
                    jcd jcd3 = gpb.a;
                    jcd3.y(true);
                    aw4 aw43 = jcd3.h;
                    if (aw43 != null) {
                        aw43.f(jcd3.e);
                        jcd3.h = null;
                        jcd3.g = null;
                    }
                }
            }
        }
    }

    public final void b() {
        l15 l15 = this.z;
        l15.b();
        this.v0.u();
        if (!l15.z()) {
            td4 td4 = this.v;
            BehindLiveWindowException behindLiveWindowException = td4.m;
            if (behindLiveWindowException == null) {
                td4.a.b();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean c() {
        return !p() && this.v0.s(this.F0);
    }

    public final boolean d() {
        return this.z.z();
    }

    public final int e(long j) {
        if (p()) {
            return 0;
        }
        jcd jcd = this.v0;
        int p = jcd.p(j, this.F0);
        uj0 uj0 = this.E0;
        if (uj0 != null) {
            p = Math.min(p, uj0.d(0) - jcd.n());
        }
        jcd.B(p);
        q();
        return p;
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        if (p()) {
            return -3;
        }
        uj0 uj0 = this.E0;
        jcd jcd = this.v0;
        if (uj0 != null && uj0.d(0) <= jcd.n()) {
            return -3;
        }
        q();
        return jcd.x(ox0, ba4, i, this.F0);
    }

    public final long i() {
        if (p()) {
            return this.B0;
        }
        if (this.F0) {
            return Long.MIN_VALUE;
        }
        return n().y;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r41v3, types: [bv3] */
    /* JADX WARNING: type inference failed for: r41v4, types: [pce] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(defpackage.d38 r62) {
        /*
            r61 = this;
            r0 = r61
            boolean r1 = r0.F0
            if (r1 != 0) goto L_0x0014
            l15 r1 = r0.z
            boolean r3 = r1.z()
            if (r3 != 0) goto L_0x0014
            boolean r3 = r1.s()
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x04dd
        L_0x0017:
            boolean r3 = r61.p()
            if (r3 == 0) goto L_0x0024
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.B0
            goto L_0x002c
        L_0x0024:
            uj0 r4 = r61.n()
            long r5 = r4.y
            java.util.List r4 = r0.Z
        L_0x002c:
            td4 r15 = r0.v
            androidx.media3.exoplayer.source.BehindLiveWindowException r7 = r15.m
            qr0 r11 = r0.X
            if (r7 == 0) goto L_0x003b
            r38 = r1
            r16 = r3
            r0 = r11
            goto L_0x0432
        L_0x003b:
            r7 = r62
            long r8 = r7.a
            long r16 = r5 - r8
            y54 r7 = r15.k
            r19 = r11
            long r10 = r7.a
            long r10 = defpackage.v0g.S(r10)
            y54 r7 = r15.k
            int r2 = r15.l
            gcb r2 = r7.b(r2)
            long r12 = r2.b
            long r12 = defpackage.v0g.S(r12)
            long r12 = r12 + r10
            long r12 = r12 + r5
            gpb r2 = r15.h
            if (r2 == 0) goto L_0x00e2
            hpb r2 = r2.e
            java.lang.Object r7 = r2.X
            y54 r7 = (defpackage.y54) r7
            boolean r10 = r7.d
            if (r10 != 0) goto L_0x006d
            r23 = r15
            r14 = 0
            goto L_0x00d5
        L_0x006d:
            boolean r10 = r2.v
            if (r10 == 0) goto L_0x0075
            r23 = r15
            r14 = 1
            goto L_0x00d5
        L_0x0075:
            java.util.TreeMap r10 = r2.c
            r23 = r15
            long r14 = r7.h
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.util.Map$Entry r7 = r10.ceilingEntry(r7)
            java.lang.Object r10 = r2.y
            rt6 r10 = (defpackage.rt6) r10
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r11 = r7.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            long r14 = r11.longValue()
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x00b8
            java.lang.Object r7 = r7.getKey()
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            java.lang.Object r7 = r10.b
            o64 r7 = (defpackage.o64) r7
            long r13 = r7.N
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r15 == 0) goto L_0x00b4
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00b6
        L_0x00b4:
            r7.N = r11
        L_0x00b6:
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            if (r7 == 0) goto L_0x00d4
            boolean r11 = r2.o
            if (r11 != 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            r11 = 1
            r2.v = r11
            r11 = 0
            r2.o = r11
            java.lang.Object r2 = r10.b
            o64 r2 = (defpackage.o64) r2
            android.os.Handler r10 = r2.D
            i64 r11 = r2.w
            r10.removeCallbacks(r11)
            r2.z()
        L_0x00d4:
            r14 = r7
        L_0x00d5:
            if (r14 == 0) goto L_0x00df
            r38 = r1
            r16 = r3
            r0 = r19
            goto L_0x0432
        L_0x00df:
            r2 = r23
            goto L_0x00e3
        L_0x00e2:
            r2 = r15
        L_0x00e3:
            long r10 = r2.f
            long r10 = defpackage.v0g.B(r10)
            long r14 = defpackage.v0g.S(r10)
            y54 r7 = r2.k
            long r10 = r7.a
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r23 != 0) goto L_0x0100
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0110
        L_0x0100:
            int r12 = r2.l
            gcb r7 = r7.b(r12)
            long r12 = r7.b
            long r10 = r10 + r12
            long r10 = defpackage.v0g.S(r10)
            long r10 = r14 - r10
            r12 = r10
        L_0x0110:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x011a
            r10 = 1
            r23 = 0
            goto L_0x0123
        L_0x011a:
            r10 = 1
            java.lang.Object r7 = defpackage.a81.i(r10, r4)
            ym8 r7 = (defpackage.ym8) r7
            r23 = r7
        L_0x0123:
            md5 r7 = r2.j
            int r7 = r7.length()
            an8[] r11 = new defpackage.an8[r7]
            r25 = r12
            r10 = 0
        L_0x012e:
            pd4[] r12 = r2.i
            if (r10 >= r7) goto L_0x018e
            r12 = r12[r10]
            java.lang.Object r13 = r12.g
            q64 r13 = (defpackage.q64) r13
            dbe r27 = defpackage.an8.T
            if (r13 != 0) goto L_0x0141
            r11[r10] = r27
            r38 = r1
            goto L_0x0187
        L_0x0141:
            long r34 = r12.c(r14)
            long r36 = r12.d(r14)
            if (r23 == 0) goto L_0x0154
            long r12 = r23.b()
            r38 = r1
            r30 = r12
            goto L_0x0171
        L_0x0154:
            java.lang.Object r13 = r12.g
            q64 r13 = (defpackage.q64) r13
            defpackage.n79.o(r13)
            r38 = r1
            long r0 = r12.b
            long r0 = r13.u(r5, r0)
            long r12 = r12.c
            long r28 = r0 + r12
            r30 = r34
            r32 = r36
            long r0 = defpackage.v0g.k(r28, r30, r32)
            r30 = r0
        L_0x0171:
            int r0 = (r30 > r34 ? 1 : (r30 == r34 ? 0 : -1))
            if (r0 >= 0) goto L_0x0178
            r11[r10] = r27
            goto L_0x0187
        L_0x0178:
            pd4 r29 = r2.b(r10)
            rd4 r0 = new rd4
            r28 = r0
            r32 = r36
            r28.<init>(r29, r30, r32)
            r11[r10] = r0
        L_0x0187:
            int r10 = r10 + 1
            r0 = r61
            r1 = r38
            goto L_0x012e
        L_0x018e:
            r38 = r1
            y54 r0 = r2.k
            boolean r0 = r0.d
            r27 = r5
            r5 = 0
            if (r0 == 0) goto L_0x01a5
            r0 = 0
            r1 = r12[r0]
            long r29 = r1.e()
            int r1 = (r29 > r5 ? 1 : (r29 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x01ab
        L_0x01a5:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01e3
        L_0x01ab:
            r1 = r12[r0]
            long r5 = r1.d(r14)
            r1 = r12[r0]
            long r0 = r1.f(r5)
            y54 r5 = r2.k
            long r6 = r5.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r10 != 0) goto L_0x01c7
            r5 = r21
            goto L_0x01d6
        L_0x01c7:
            int r10 = r2.l
            gcb r5 = r5.b(r10)
            long r12 = r5.b
            long r6 = r6 + r12
            long r5 = defpackage.v0g.S(r6)
            long r5 = r14 - r5
        L_0x01d6:
            long r0 = java.lang.Math.min(r5, r0)
            long r0 = r0 - r8
            r5 = 0
            long r0 = java.lang.Math.max(r5, r0)
            r12 = r0
            goto L_0x01e5
        L_0x01e3:
            r12 = r21
        L_0x01e5:
            md5 r7 = r2.j
            r6 = r11
            r5 = r19
            r0 = 0
            r1 = 1
            r10 = r16
            r16 = r2
            r1 = r21
            r39 = r25
            r41 = r14
            r15 = 1
            r14 = r4
            r1 = r15
            r0 = r16
            r15 = r6
            r7.r(r8, r10, r12, r14, r15)
            md5 r2 = r0.j
            int r2 = r2.b()
            android.os.SystemClock.elapsedRealtime()
            pd4 r2 = r0.b(r2)
            java.lang.Object r6 = r2.g
            q64 r6 = (defpackage.q64) r6
            java.lang.Object r7 = r2.f
            ml0 r7 = (defpackage.ml0) r7
            java.lang.Object r8 = r2.d
            n03 r8 = (defpackage.n03) r8
            java.lang.Object r9 = r2.e
            x2d r9 = (defpackage.x2d) r9
            if (r8 == 0) goto L_0x0277
            r10 = r8
            ov0 r10 = (defpackage.ov0) r10
            ea6[] r10 = r10.z
            if (r10 != 0) goto L_0x0228
            dpc r10 = r9.x
            goto L_0x0229
        L_0x0228:
            r10 = 0
        L_0x0229:
            if (r6 != 0) goto L_0x0230
            dpc r11 = r9.d()
            goto L_0x0231
        L_0x0230:
            r11 = 0
        L_0x0231:
            if (r10 != 0) goto L_0x0235
            if (r11 == 0) goto L_0x0277
        L_0x0235:
            md5 r4 = r0.j
            ea6 r26 = r4.j()
            md5 r4 = r0.j
            int r27 = r4.k()
            md5 r4 = r0.j
            java.lang.Object r28 = r4.m()
            if (r10 == 0) goto L_0x0254
            java.lang.String r4 = r7.a
            dpc r4 = r10.a(r11, r4)
            if (r4 != 0) goto L_0x0252
            goto L_0x0258
        L_0x0252:
            r10 = r4
            goto L_0x0258
        L_0x0254:
            r11.getClass()
            r10 = r11
        L_0x0258:
            java.lang.String r4 = r7.a
            r6 = 0
            q74 r25 = defpackage.cvg.j(r9, r4, r10, r6)
            vf7 r4 = new vf7
            java.lang.Object r2 = r2.d
            r29 = r2
            n03 r29 = (defpackage.n03) r29
            j74 r0 = r0.e
            r23 = r4
            r24 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r5.b = r4
        L_0x0272:
            r16 = r3
        L_0x0274:
            r0 = r5
            goto L_0x0432
        L_0x0277:
            y54 r10 = r0.k
            boolean r11 = r10.d
            if (r11 == 0) goto L_0x028a
            int r11 = r0.l
            java.util.List r10 = r10.m
            int r10 = r10.size()
            int r10 = r10 - r1
            if (r11 != r10) goto L_0x028a
            r14 = r1
            goto L_0x028b
        L_0x028a:
            r14 = 0
        L_0x028b:
            long r12 = r2.b
            if (r14 == 0) goto L_0x029b
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r10 = 0
            goto L_0x029c
        L_0x029b:
            r10 = r1
        L_0x029c:
            long r15 = r2.e()
            r24 = 0
            int r11 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r11 != 0) goto L_0x02a9
            r5.a = r10
            goto L_0x0272
        L_0x02a9:
            r11 = r7
            r62 = r8
            r7 = r41
            long r15 = r2.c(r7)
            long r7 = r2.d(r7)
            if (r14 == 0) goto L_0x02cc
            long r24 = r2.f(r7)
            long r29 = r2.g(r7)
            long r29 = r24 - r29
            long r29 = r29 + r24
            int r14 = (r29 > r12 ? 1 : (r29 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x02ca
            r14 = r1
            goto L_0x02cb
        L_0x02ca:
            r14 = 0
        L_0x02cb:
            r10 = r10 & r14
        L_0x02cc:
            r14 = r3
            r17 = r4
            long r3 = r2.c
            if (r23 == 0) goto L_0x02dc
            long r23 = r23.b()
            r19 = r2
            r1 = r23
            goto L_0x02f5
        L_0x02dc:
            defpackage.n79.o(r6)
            r19 = r2
            r1 = r27
            long r25 = r6.u(r1, r12)
            long r29 = r25 + r3
            r31 = r15
            r33 = r7
            long r25 = defpackage.v0g.k(r29, r31, r33)
            r27 = r1
            r1 = r25
        L_0x02f5:
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x0305
            androidx.media3.exoplayer.source.BehindLiveWindowException r1 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r1.<init>()
            r0.m = r1
            r0 = r5
            r16 = r14
            goto L_0x0432
        L_0x0305:
            int r15 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r15 > 0) goto L_0x042d
            r16 = r14
            boolean r14 = r0.n
            if (r14 == 0) goto L_0x0314
            if (r15 < 0) goto L_0x0314
            r0 = r5
            goto L_0x0430
        L_0x0314:
            if (r10 == 0) goto L_0x0325
            r10 = r19
            long r14 = r10.g(r1)
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0327
            r14 = 1
            r5.a = r14
            goto L_0x0274
        L_0x0325:
            r10 = r19
        L_0x0327:
            int r14 = r0.g
            long r14 = (long) r14
            long r7 = r7 - r1
            r25 = 1
            long r7 = r7 + r25
            long r7 = java.lang.Math.min(r14, r7)
            int r7 = (int) r7
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x034f
        L_0x033d:
            r14 = 1
            if (r7 <= r14) goto L_0x034f
            long r14 = (long) r7
            long r14 = r14 + r1
            long r14 = r14 - r25
            long r14 = r10.g(r14)
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x034f
            int r7 = r7 + -1
            goto L_0x033d
        L_0x034f:
            boolean r14 = r17.isEmpty()
            if (r14 == 0) goto L_0x0358
            r51 = r27
            goto L_0x035d
        L_0x0358:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x035d:
            md5 r14 = r0.j
            ea6 r14 = r14.j()
            md5 r15 = r0.j
            int r45 = r15.k()
            md5 r15 = r0.j
            java.lang.Object r46 = r15.m()
            long r47 = r10.g(r1)
            defpackage.n79.o(r6)
            r27 = r12
            long r12 = r1 - r3
            dpc r12 = r6.o(r12)
            j74 r13 = r0.e
            if (r62 != 0) goto L_0x03ae
            long r49 = r10.f(r1)
            r3 = r39
            boolean r3 = r10.h(r1, r3)
            if (r3 == 0) goto L_0x0390
            r15 = 0
            goto L_0x0392
        L_0x0390:
            r15 = 8
        L_0x0392:
            java.lang.String r3 = r11.a
            q74 r43 = defpackage.cvg.j(r9, r3, r12, r15)
            pce r3 = new pce
            int r0 = r0.d
            r41 = r3
            r42 = r13
            r44 = r14
            r51 = r1
            r53 = r0
            r54 = r14
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r54)
            r0 = r5
            goto L_0x042a
        L_0x03ae:
            r62 = r12
            r0 = r13
            r12 = r39
            r15 = r62
            r62 = r0
            r19 = r5
            r0 = 1
            r5 = 1
        L_0x03bb:
            r39 = r12
            if (r5 >= r7) goto L_0x03da
            long r12 = (long) r5
            long r12 = r12 + r1
            defpackage.n79.o(r6)
            long r12 = r12 - r3
            dpc r12 = r6.o(r12)
            java.lang.String r13 = r11.a
            dpc r12 = r15.a(r12, r13)
            if (r12 != 0) goto L_0x03d2
            goto L_0x03da
        L_0x03d2:
            int r0 = r0 + 1
            int r5 = r5 + 1
            r15 = r12
            r12 = r39
            goto L_0x03bb
        L_0x03da:
            long r3 = (long) r0
            long r3 = r3 + r1
            long r3 = r3 - r25
            long r49 = r10.f(r3)
            if (r8 == 0) goto L_0x03ed
            int r5 = (r27 > r49 ? 1 : (r27 == r49 ? 0 : -1))
            if (r5 > 0) goto L_0x03ed
            r53 = r27
            r5 = r39
            goto L_0x03f4
        L_0x03ed:
            r5 = r39
            r53 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03f4:
            boolean r3 = r10.h(r3, r5)
            if (r3 == 0) goto L_0x03fc
            r3 = 0
            goto L_0x03fe
        L_0x03fc:
            r3 = 8
        L_0x03fe:
            java.lang.String r4 = r11.a
            q74 r43 = defpackage.cvg.j(r9, r4, r15, r3)
            long r3 = r9.c
            long r3 = -r3
            java.lang.String r5 = r14.n
            boolean r5 = defpackage.vq9.i(r5)
            if (r5 == 0) goto L_0x0411
            long r3 = r3 + r47
        L_0x0411:
            r58 = r3
            bv3 r3 = new bv3
            r41 = r3
            java.lang.Object r4 = r10.d
            r60 = r4
            n03 r60 = (defpackage.n03) r60
            r42 = r62
            r44 = r14
            r55 = r1
            r57 = r0
            r41.<init>(r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r58, r60)
            r0 = r19
        L_0x042a:
            r0.b = r3
            goto L_0x0432
        L_0x042d:
            r0 = r5
            r16 = r14
        L_0x0430:
            r0.a = r10
        L_0x0432:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            m03 r2 = (defpackage.m03) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x044d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r61
            r0.B0 = r4
            r1 = 1
            r0.F0 = r1
            return r1
        L_0x044d:
            r0 = r61
            if (r2 != 0) goto L_0x0452
            return r3
        L_0x0452:
            r0.y0 = r2
            boolean r1 = r2 instanceof defpackage.uj0
            fj r3 = r0.x0
            if (r1 == 0) goto L_0x04a2
            r1 = r2
            uj0 r1 = (defpackage.uj0) r1
            if (r16 == 0) goto L_0x0481
            long r4 = r0.B0
            long r6 = r1.x
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x047a
            jcd r6 = r0.v0
            r6.t = r4
            jcd[] r4 = r0.w0
            int r5 = r4.length
            r11 = 0
        L_0x046f:
            if (r11 >= r5) goto L_0x047a
            r6 = r4[r11]
            long r7 = r0.B0
            r6.t = r7
            int r11 = r11 + 1
            goto L_0x046f
        L_0x047a:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.B0 = r4
        L_0x0481:
            r1.v0 = r3
            java.lang.Object r3 = r3.c
            jcd[] r3 = (defpackage.jcd[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x048b:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x049a
            r6 = r3[r5]
            int r7 = r6.q
            int r6 = r6.p
            int r7 = r7 + r6
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x048b
        L_0x049a:
            r1.w0 = r4
            java.util.ArrayList r3 = r0.Y
            r3.add(r1)
            goto L_0x04ab
        L_0x04a2:
            boolean r1 = r2 instanceof defpackage.vf7
            if (r1 == 0) goto L_0x04ab
            r1 = r2
            vf7 r1 = (defpackage.vf7) r1
            r1.Y = r3
        L_0x04ab:
            nfd r1 = r0.y
            int r3 = r2.c
            int r1 = r1.p(r3)
            r3 = r38
            long r8 = r3.F(r2, r0, r1)
            l28 r11 = new l28
            long r5 = r2.a
            q74 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.v
            java.lang.Object r1 = r2.w
            cs r10 = r0.x
            int r12 = r2.c
            int r13 = r0.a
            ea6 r14 = r2.o
            long r3 = r2.x
            long r5 = r2.y
            r16 = r1
            r17 = r3
            r19 = r5
            r10.C(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x04dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w03.k(d38):boolean");
    }

    public final uj0 l(int i) {
        ArrayList arrayList = this.Y;
        uj0 uj0 = (uj0) arrayList.get(i);
        v0g.X(arrayList, i, arrayList.size());
        this.D0 = Math.max(this.D0, arrayList.size());
        int i2 = 0;
        this.v0.j(uj0.d(0));
        while (true) {
            jcd[] jcdArr = this.w0;
            if (i2 >= jcdArr.length) {
                return uj0;
            }
            jcd jcd = jcdArr[i2];
            i2++;
            jcd.j(uj0.d(i2));
        }
    }

    public final td4 m() {
        return this.v;
    }

    public final uj0 n() {
        return (uj0) a81.h(1, this.Y);
    }

    public final boolean o(int i) {
        int n;
        uj0 uj0 = (uj0) this.Y.get(i);
        if (this.v0.n() > uj0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            jcd[] jcdArr = this.w0;
            if (i2 >= jcdArr.length) {
                return false;
            }
            n = jcdArr[i2].n();
            i2++;
        } while (n <= uj0.d(i2));
        return true;
    }

    public final boolean p() {
        return this.B0 != -9223372036854775807L;
    }

    public final void q() {
        int t = t(this.v0.n(), this.D0 - 1);
        while (true) {
            int i = this.D0;
            if (i <= t) {
                this.D0 = i + 1;
                uj0 uj0 = (uj0) this.Y.get(i);
                ea6 ea6 = uj0.o;
                if (!ea6.equals(this.z0)) {
                    ea6 ea62 = ea6;
                    this.x.l(this.a, ea62, uj0.v, uj0.w, uj0.x);
                }
                this.z0 = ea6;
            } else {
                return;
            }
        }
    }

    public final int t(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.Y;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((uj0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void u(u03 u03) {
        this.A0 = u03;
        jcd jcd = this.v0;
        jcd.h();
        aw4 aw4 = jcd.h;
        if (aw4 != null) {
            aw4.f(jcd.e);
            jcd.h = null;
            jcd.g = null;
        }
        for (jcd jcd2 : this.w0) {
            jcd2.h();
            aw4 aw42 = jcd2.h;
            if (aw42 != null) {
                aw42.f(jcd2.e);
                jcd2.h = null;
                jcd2.g = null;
            }
        }
        this.z.D(this);
    }

    public final s03 v(int i, long j) {
        int i2 = 0;
        while (true) {
            jcd[] jcdArr = this.w0;
            if (i2 >= jcdArr.length) {
                throw new IllegalStateException();
            } else if (this.b[i2] == i) {
                boolean[] zArr = this.o;
                n79.n(!zArr[i2]);
                zArr[i2] = true;
                jcdArr[i2].A(j, true);
                return new s03(this, this, jcdArr[i2], i2);
            } else {
                i2++;
            }
        }
    }

    public final long y() {
        long j;
        if (this.F0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.B0;
        }
        long j2 = this.C0;
        uj0 n = n();
        if (!n.c()) {
            ArrayList arrayList = this.Y;
            n = arrayList.size() > 1 ? (uj0) a81.h(2, arrayList) : null;
        }
        if (n != null) {
            j2 = Math.max(j2, n.y);
        }
        jcd jcd = this.v0;
        synchronized (jcd) {
            j = jcd.v;
        }
        return Math.max(j2, j);
    }
}
