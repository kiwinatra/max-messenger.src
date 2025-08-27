package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: vf4  reason: default package */
public final class vf4 implements p28, q28 {
    public static final ts1 y0 = new Object();
    public static final ts1 z0 = new Object();
    public final Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a = 1;
    public final HashMap b;
    public final CopyOnWriteArrayList c;
    public Handler o;
    public Uri v;
    public Object v0;
    public boolean w;
    public Object w0;
    public long x;
    public Object x0;
    public final Object y;
    public final Object z;

    public vf4(vs6 vs6, gga gga, p17 p17) {
        this.y = vs6;
        this.z = p17;
        this.X = gga;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.x = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p01 C(defpackage.s28 r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r22
            r2 = r17
            p8b r2 = (defpackage.p8b) r2
            k28 r15 = new k28
            long r4 = r2.a
            sne r3 = r2.o
            android.net.Uri r7 = r3.c
            java.util.Map r8 = r3.o
            long r13 = r3.b
            p74 r6 = r2.b
            r3 = r15
            r9 = r18
            r11 = r20
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            java.lang.Object r3 = r0.X
            gga r3 = (defpackage.gga) r3
            r3.getClass()
            boolean r3 = r1 instanceof com.google.android.exoplayer2.ParserException
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x005f
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x005f
            int r3 = com.google.android.exoplayer2.upstream.DataSourceException.b
            r3 = r1
        L_0x003e:
            if (r3 == 0) goto L_0x0053
            boolean r7 = r3 instanceof com.google.android.exoplayer2.upstream.DataSourceException
            if (r7 == 0) goto L_0x004e
            r7 = r3
            com.google.android.exoplayer2.upstream.DataSourceException r7 = (com.google.android.exoplayer2.upstream.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x004e
            goto L_0x005f
        L_0x004e:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x003e
        L_0x0053:
            int r3 = r23 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            goto L_0x0060
        L_0x005f:
            r7 = r5
        L_0x0060:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 0
            if (r3 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r4 = r5
        L_0x0067:
            java.lang.Object r0 = r0.Y
            uz8 r0 = (defpackage.uz8) r0
            int r2 = r2.c
            r0.i(r15, r2, r1, r4)
            if (r4 == 0) goto L_0x0075
            p01 r0 = defpackage.w28.x
            goto L_0x0079
        L_0x0075:
            p01 r0 = defpackage.w28.C(r7, r5)
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf4.C(s28, long, long, java.io.IOException, int):p01");
    }

    public void E(t28 t28, long j, long j2, boolean z2) {
        q8b q8b = (q8b) t28;
        long j3 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        ((nfd) this.X).getClass();
        ((cs) this.Y).v(l28, 4, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void H(t28 t28, long j, long j2) {
        k17 k17;
        q8b q8b = (q8b) t28;
        m17 m17 = (m17) q8b.w;
        boolean z2 = m17 instanceof c17;
        if (z2) {
            String str = m17.a;
            k17 k172 = k17.n;
            Uri parse = Uri.parse(str);
            ba6 ba6 = new ba6();
            ba6.a = "0";
            ba6.l = vq9.l("application/x-mpegURL");
            k17 = new k17("", Collections.emptyList(), Collections.singletonList(new i17(parse, new ea6(ba6), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (ea6) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            k17 = (k17) m17;
        }
        this.w0 = k17;
        this.v = ((i17) k17.e.get(0)).a;
        this.c.add(new sf4(this));
        List list = k17.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new uf4(this, uri));
        }
        tne tne = q8b.o;
        Uri uri2 = tne.c;
        l28 l28 = new l28(j2, tne.o);
        uf4 uf4 = (uf4) this.b.get(this.v);
        if (z2) {
            uf4.f((c17) m17, l28);
        } else {
            uf4.c(false);
        }
        ((nfd) this.X).getClass();
        ((cs) this.Y).x(l28, 4, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p01 Z(defpackage.t28 r11, long r12, long r14, java.io.IOException r16, int r17) {
        /*
            r10 = this;
            r0 = r10
            r1 = r16
            r2 = r11
            q8b r2 = (defpackage.q8b) r2
            l28 r3 = new l28
            long r4 = r2.a
            tne r4 = r2.o
            android.net.Uri r5 = r4.c
            java.util.Map r4 = r4.o
            r5 = r14
            r3.<init>(r14, r4)
            java.lang.Object r4 = r0.X
            nfd r4 = (defpackage.nfd) r4
            r4.getClass()
            boolean r4 = r1 instanceof androidx.media3.common.ParserException
            r5 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x0055
            boolean r4 = r1 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x0055
            boolean r4 = r1 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r4 != 0) goto L_0x0055
            boolean r4 = r1 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r4 != 0) goto L_0x0055
            int r4 = androidx.media3.datasource.DataSourceException.b
            r4 = r1
        L_0x0034:
            if (r4 == 0) goto L_0x0049
            boolean r8 = r4 instanceof androidx.media3.datasource.DataSourceException
            if (r8 == 0) goto L_0x0044
            r8 = r4
            androidx.media3.datasource.DataSourceException r8 = (androidx.media3.datasource.DataSourceException) r8
            int r8 = r8.a
            r9 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r9) goto L_0x0044
            goto L_0x0055
        L_0x0044:
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0034
        L_0x0049:
            int r4 = r17 + -1
            int r4 = r4 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r8)
            long r8 = (long) r4
            goto L_0x0056
        L_0x0055:
            r8 = r6
        L_0x0056:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = 0
            if (r4 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r5 = r6
        L_0x005d:
            java.lang.Object r0 = r0.Y
            cs r0 = (defpackage.cs) r0
            int r2 = r2.c
            r0.A(r3, r2, r1, r5)
            if (r5 == 0) goto L_0x006b
            p01 r0 = defpackage.l15.w
            goto L_0x0077
        L_0x006b:
            p01 r0 = new p01
            r1 = 5
            r2 = 0
            r10 = r0
            r11 = r8
            r13 = r6
            r14 = r1
            r15 = r2
            r10.<init>(r11, r13, r14, r15)
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf4.Z(t28, long, long, java.io.IOException, int):p01");
    }

    public b17 a(Uri uri, boolean z2) {
        HashMap hashMap = this.b;
        b17 b17 = ((tf4) hashMap.get(uri)).o;
        if (b17 != null && z2 && !uri.equals(this.v)) {
            List list = ((j17) this.w0).e;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(((h17) list.get(i)).a)) {
                    b17 b172 = (b17) this.x0;
                    if (b172 == null || !b172.o) {
                        this.v = uri;
                        tf4 tf4 = (tf4) hashMap.get(uri);
                        b17 b173 = tf4.o;
                        if (b173 == null || !b173.o) {
                            tf4.c(c(uri));
                        } else {
                            this.x0 = b173;
                            ((d17) ((t17) this.v0)).q(b173);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return b17;
    }

    public c17 b(Uri uri, boolean z2) {
        HashMap hashMap = this.b;
        c17 c17 = ((uf4) hashMap.get(uri)).o;
        if (c17 != null && z2) {
            if (!uri.equals(this.v)) {
                List list = ((k17) this.w0).e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (uri.equals(((i17) list.get(i)).a)) {
                        c17 c172 = (c17) this.x0;
                        if (c172 == null || !c172.o) {
                            this.v = uri;
                            uf4 uf4 = (uf4) hashMap.get(uri);
                            c17 c173 = uf4.o;
                            if (c173 == null || !c173.o) {
                                uf4.e(c(uri));
                            } else {
                                this.x0 = c173;
                                ((e17) ((u17) this.v0)).v(c173);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            uf4 uf42 = (uf4) hashMap.get(uri);
            c17 c174 = uf42.o;
            if (!uf42.Y) {
                uf42.Y = true;
                if (c174 != null && !c174.o) {
                    uf42.c(true);
                }
            }
        }
        return c17;
    }

    public final Uri c(Uri uri) {
        u07 u07;
        v07 v07;
        switch (this.a) {
            case 0:
                b17 b17 = (b17) this.x0;
                if (b17 == null || !b17.v.e || (u07 = (u07) b17.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(u07.b));
                int i = u07.c;
                if (i != -1) {
                    buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
                }
                return buildUpon.build();
            default:
                c17 c17 = (c17) this.x0;
                if (c17 == null || !c17.v.e || (v07 = (v07) c17.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder buildUpon2 = uri.buildUpon();
                buildUpon2.appendQueryParameter("_HLS_msn", String.valueOf(v07.b));
                int i2 = v07.c;
                if (i2 != -1) {
                    buildUpon2.appendQueryParameter("_HLS_part", String.valueOf(i2));
                }
                return buildUpon2.build();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r8 = r8.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.net.Uri r8) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            uf4 r7 = (defpackage.uf4) r7
            c17 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x0013
            goto L_0x003b
        L_0x0013:
            long r1 = android.os.SystemClock.elapsedRealtime()
            c17 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.v0g.h0(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            c17 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x003a
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x003a
            if (r8 == r6) goto L_0x003a
            long r7 = r7.v
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            return r0
        L_0x003c:
            java.util.HashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            tf4 r7 = (defpackage.tf4) r7
            b17 r8 = r7.o
            r0 = 0
            if (r8 != 0) goto L_0x004a
            goto L_0x0072
        L_0x004a:
            long r1 = android.os.SystemClock.elapsedRealtime()
            b17 r8 = r7.o
            long r3 = r8.u
            long r3 = defpackage.t0g.M(r3)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = java.lang.Math.max(r5, r3)
            b17 r8 = r7.o
            boolean r5 = r8.o
            r6 = 1
            if (r5 != 0) goto L_0x0071
            r5 = 2
            int r8 = r8.d
            if (r8 == r5) goto L_0x0071
            if (r8 == r6) goto L_0x0071
            long r7 = r7.v
            long r7 = r7 + r3
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0072
        L_0x0071:
            r0 = r6
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf4.d(android.net.Uri):boolean");
    }

    public void n(s28 s28, long j, long j2, boolean z2) {
        p8b p8b = (p8b) s28;
        long j3 = p8b.a;
        sne sne = p8b.o;
        k28 k28 = new k28(j3, p8b.b, sne.c, sne.o, j, j2, sne.b);
        ((gga) this.X).getClass();
        ((uz8) this.Y).d(k28, 4, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public void u(s28 s28, long j, long j2) {
        j17 j17;
        p8b p8b = (p8b) s28;
        l17 l17 = (l17) p8b.w;
        boolean z2 = l17 instanceof b17;
        if (z2) {
            String str = l17.a;
            j17 j172 = j17.n;
            Uri parse = Uri.parse(str);
            aa6 aa6 = new aa6();
            aa6.a = "0";
            aa6.j = "application/x-mpegURL";
            j17 = new j17("", Collections.emptyList(), Collections.singletonList(new h17(parse, new ca6(aa6), (String) null, (String) null, (String) null, (String) null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (ca6) null, (List) null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            j17 = (j17) l17;
        }
        this.w0 = j17;
        this.v = ((h17) j17.e.get(0)).a;
        this.c.add(new rf4(this));
        List list = j17.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.b.put(uri, new tf4(this, uri));
        }
        long j3 = p8b.a;
        p74 p74 = p8b.b;
        sne sne = p8b.o;
        k28 k28 = new k28(j3, p74, sne.c, sne.o, j, j2, sne.b);
        tf4 tf4 = (tf4) this.b.get(this.v);
        if (z2) {
            tf4.d((b17) l17);
        } else {
            tf4.c(tf4.a);
        }
        ((gga) this.X).getClass();
        ((uz8) this.Y).f(k28, 4, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public vf4(rt6 rt6, nfd nfd, q17 q17) {
        this.y = rt6;
        this.z = q17;
        this.X = nfd;
        this.c = new CopyOnWriteArrayList();
        this.b = new HashMap();
        this.x = -9223372036854775807L;
    }
}
