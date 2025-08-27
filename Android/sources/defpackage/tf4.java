package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tf4  reason: default package */
public final class tf4 implements p28 {
    public IOException X;
    public final /* synthetic */ vf4 Y;
    public final Uri a;
    public final w28 b = new w28("DefaultHlsPlaylistTracker:MediaPlaylist", 0);
    public final h74 c;
    public b17 o;
    public long v;
    public long w;
    public long x;
    public long y;
    public boolean z;

    public tf4(vf4 vf4, Uri uri) {
        this.Y = vf4;
        this.a = uri;
        this.c = ((f74) ((vs6) vf4.y).b).a();
    }

    public static boolean a(tf4 tf4, long j) {
        tf4.y = SystemClock.elapsedRealtime() + j;
        vf4 vf4 = tf4.Y;
        if (!tf4.a.equals(vf4.v)) {
            return false;
        }
        List list = ((j17) vf4.w0).e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            tf4 tf42 = (tf4) vf4.b.get(((h17) list.get(i)).a);
            tf42.getClass();
            if (elapsedRealtime > tf42.y) {
                Uri uri = tf42.a;
                vf4.v = uri;
                tf42.c(vf4.c(uri));
                return false;
            }
        }
        return true;
    }

    public final p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        IOException iOException2 = iOException;
        p8b p8b = (p8b) s28;
        long j3 = p8b.a;
        sne sne = p8b.o;
        Uri uri = sne.c;
        k28 k28 = r3;
        Uri uri2 = uri;
        k28 k282 = new k28(j3, p8b.b, uri, sne.o, j, j2, sne.b);
        boolean z2 = uri2.getQueryParameter("_HLS_msn") != null;
        boolean z3 = iOException2 instanceof HlsPlaylistParser$DeltaUpdateException;
        p01 p01 = w28.w;
        Uri uri3 = this.a;
        vf4 vf4 = this.Y;
        int i2 = p8b.c;
        if (z2 || z3) {
            int i3 = iOException2 instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException2).c : IntCompanionObject.MAX_VALUE;
            if (z3 || i3 == 400 || i3 == 503) {
                k28 k283 = k28;
                this.x = SystemClock.elapsedRealtime();
                c(uri3);
                int i4 = t0g.a;
                ((uz8) vf4.Y).i(k283, i2, iOException2, true);
                return p01;
            }
        }
        j28 j28 = new j28(i, iOException2);
        Iterator it = vf4.c.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= !((r17) it.next()).e(uri3, j28, false);
        }
        gga gga = (gga) vf4.X;
        if (z4) {
            gga.getClass();
            long p = gga.p(j28);
            p01 = p != -9223372036854775807L ? new p01(p, 0, 4, false) : w28.x;
        }
        boolean z5 = !p01.a();
        ((uz8) vf4.Y).i(k28, i2, iOException2, z5);
        if (z5) {
            gga.getClass();
        }
        return p01;
    }

    public final void b(Uri uri) {
        vf4 vf4 = this.Y;
        p8b p8b = new p8b(this.c, uri, 4, ((p17) vf4.z).w((j17) vf4.w0, this.o));
        int i = p8b.c;
        ((uz8) vf4.Y).k(new k28(p8b.a, p8b.b, this.b.P(p8b, this, ((gga) vf4.X).o(i))), i, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.y = 0;
        if (!this.z) {
            w28 w28 = this.b;
            if (!w28.M() && !w28.L()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.x;
                if (elapsedRealtime < j) {
                    this.z = true;
                    this.Y.o.postDelayed(new ir1(24, this, uri), j - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.b17 r65) {
        /*
            r64 = this;
            r0 = r64
            r1 = r65
            b17 r2 = r0.o
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.v = r3
            vf4 r5 = r0.Y
            r5.getClass()
            if (r2 == 0) goto L_0x00a2
            long r10 = r1.k
            long r12 = r2.k
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x001d
            goto L_0x00a5
        L_0x001d:
            boolean r11 = r2.o
            tb7 r15 = r2.s
            tb7 r14 = r2.r
            boolean r12 = r1.o
            if (r10 >= 0) goto L_0x0028
            goto L_0x004c
        L_0x0028:
            tb7 r10 = r1.r
            int r10 = r10.size()
            int r13 = r14.size()
            int r10 = r10 - r13
            if (r10 == 0) goto L_0x0039
            if (r10 <= 0) goto L_0x004c
            goto L_0x00a5
        L_0x0039:
            tb7 r10 = r1.s
            int r10 = r10.size()
            int r13 = r15.size()
            if (r10 > r13) goto L_0x00a5
            if (r10 != r13) goto L_0x004c
            if (r12 == 0) goto L_0x004c
            if (r11 != 0) goto L_0x004c
            goto L_0x00a5
        L_0x004c:
            if (r12 == 0) goto L_0x00a0
            if (r11 == 0) goto L_0x0051
            goto L_0x00a0
        L_0x0051:
            b17 r10 = new b17
            r12 = r10
            r31 = 1
            boolean r11 = r2.p
            r32 = r11
            int r13 = r2.d
            java.lang.String r11 = r2.a
            r34 = r14
            r14 = r11
            java.util.List r11 = r2.b
            r35 = r15
            r15 = r11
            long r8 = r2.e
            r16 = r8
            boolean r8 = r2.g
            r18 = r8
            long r8 = r2.h
            r19 = r8
            boolean r8 = r2.i
            r21 = r8
            int r8 = r2.j
            r22 = r8
            long r8 = r2.k
            r23 = r8
            int r8 = r2.l
            r25 = r8
            long r8 = r2.m
            r26 = r8
            long r8 = r2.n
            r28 = r8
            boolean r8 = r2.c
            r30 = r8
            xv4 r8 = r2.q
            r33 = r8
            a17 r8 = r2.v
            r36 = r8
            wb7 r8 = r2.t
            r37 = r8
            r12.<init>(r13, r14, r15, r16, r18, r19, r21, r22, r23, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x009d:
            r8 = 0
            goto L_0x017b
        L_0x00a0:
            r10 = r2
            goto L_0x009d
        L_0x00a2:
            r65.getClass()
        L_0x00a5:
            boolean r8 = r1.p
            long r9 = r1.k
            if (r8 == 0) goto L_0x00b0
            long r11 = r1.h
        L_0x00ad:
            r45 = r11
            goto L_0x00ed
        L_0x00b0:
            java.lang.Object r8 = r5.x0
            b17 r8 = (defpackage.b17) r8
            if (r8 == 0) goto L_0x00b9
            long r11 = r8.h
            goto L_0x00bb
        L_0x00b9:
            r11 = 0
        L_0x00bb:
            if (r2 != 0) goto L_0x00be
            goto L_0x00ad
        L_0x00be:
            tb7 r8 = r2.r
            int r13 = r8.size()
            long r14 = r2.k
            long r6 = r9 - r14
            int r6 = (int) r6
            int r7 = r8.size()
            if (r6 >= r7) goto L_0x00d6
            java.lang.Object r6 = r8.get(r6)
            w07 r6 = (defpackage.w07) r6
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            long r7 = r2.h
            if (r6 == 0) goto L_0x00df
            long r11 = r6.v
        L_0x00dd:
            long r11 = r11 + r7
            goto L_0x00ad
        L_0x00df:
            r18 = r11
            long r11 = (long) r13
            long r13 = r9 - r14
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            long r11 = r2.u
            goto L_0x00dd
        L_0x00eb:
            r45 = r18
        L_0x00ed:
            boolean r6 = r1.i
            tb7 r7 = r1.r
            if (r6 == 0) goto L_0x00f9
            int r6 = r1.j
        L_0x00f5:
            r48 = r6
            r8 = 0
            goto L_0x0130
        L_0x00f9:
            java.lang.Object r6 = r5.x0
            b17 r6 = (defpackage.b17) r6
            if (r6 == 0) goto L_0x0102
            int r6 = r6.j
            goto L_0x0103
        L_0x0102:
            r6 = 0
        L_0x0103:
            if (r2 != 0) goto L_0x0106
            goto L_0x00f5
        L_0x0106:
            long r11 = r2.k
            long r9 = r9 - r11
            int r8 = (int) r9
            tb7 r9 = r2.r
            int r10 = r9.size()
            if (r8 >= r10) goto L_0x0119
            java.lang.Object r8 = r9.get(r8)
            w07 r8 = (defpackage.w07) r8
            goto L_0x011a
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r8 == 0) goto L_0x012e
            int r6 = r2.j
            int r8 = r8.o
            int r6 = r6 + r8
            r8 = 0
            java.lang.Object r9 = r7.get(r8)
            w07 r9 = (defpackage.w07) r9
            int r9 = r9.o
            int r6 = r6 - r9
        L_0x012b:
            r48 = r6
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x012b
        L_0x0130:
            b17 r10 = new b17
            r38 = r10
            boolean r6 = r1.o
            r57 = r6
            boolean r6 = r1.p
            r58 = r6
            int r6 = r1.d
            r39 = r6
            java.lang.String r6 = r1.a
            r40 = r6
            java.util.List r6 = r1.b
            r41 = r6
            long r11 = r1.e
            r42 = r11
            boolean r6 = r1.g
            r44 = r6
            r47 = 1
            long r11 = r1.k
            r49 = r11
            int r6 = r1.l
            r51 = r6
            long r11 = r1.m
            r52 = r11
            long r11 = r1.n
            r54 = r11
            boolean r6 = r1.c
            r56 = r6
            xv4 r6 = r1.q
            r59 = r6
            tb7 r6 = r1.s
            r61 = r6
            a17 r6 = r1.v
            r62 = r6
            wb7 r6 = r1.t
            r63 = r6
            r60 = r7
            r38.<init>(r39, r40, r41, r42, r44, r45, r47, r48, r49, r51, r52, r54, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x017b:
            r0.o = r10
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.c
            r7 = 1
            android.net.Uri r9 = r0.a
            boolean r11 = r10.o
            if (r10 == r2) goto L_0x01c0
            r12 = 0
            r0.X = r12
            r0.w = r3
            android.net.Uri r1 = r5.v
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x01ac
            java.lang.Object r1 = r5.x0
            b17 r1 = (defpackage.b17) r1
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.w = r1
            long r7 = r10.h
            r5.x = r7
        L_0x01a1:
            r5.x0 = r10
            java.lang.Object r1 = r5.v0
            t17 r1 = (defpackage.t17) r1
            d17 r1 = (defpackage.d17) r1
            r1.q(r10)
        L_0x01ac:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            r17 r6 = (defpackage.r17) r6
            r6.a()
            goto L_0x01b0
        L_0x01c0:
            r12 = 0
            if (r11 != 0) goto L_0x0213
            tb7 r10 = r1.r
            int r10 = r10.size()
            long r10 = (long) r10
            long r13 = r1.k
            long r13 = r13 + r10
            b17 r1 = r0.o
            long r10 = r1.k
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dc
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistResetException
            r1.<init>()
            r8 = r7
            goto L_0x01f6
        L_0x01dc:
            long r10 = r0.w
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.m
            long r13 = defpackage.t0g.M(r13)
            double r13 = (double) r13
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
            r1.<init>()
            goto L_0x01f6
        L_0x01f5:
            r1 = r12
        L_0x01f6:
            if (r1 == 0) goto L_0x0213
            r0.X = r1
            j28 r10 = new j28
            r10.<init>(r7, r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x0203:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            r17 r6 = (defpackage.r17) r6
            r6.e(r9, r10, r8)
            goto L_0x0203
        L_0x0213:
            b17 r1 = r0.o
            a17 r6 = r1.v
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x0224
            long r6 = r1.m
            if (r1 == r2) goto L_0x0220
            goto L_0x0226
        L_0x0220:
            r1 = 2
            long r6 = r6 / r1
            goto L_0x0226
        L_0x0224:
            r6 = 0
        L_0x0226:
            long r1 = defpackage.t0g.M(r6)
            long r1 = r1 + r3
            r0.x = r1
            b17 r1 = r0.o
            long r1 = r1.n
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0242
            android.net.Uri r1 = r5.v
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02bc
        L_0x0242:
            b17 r1 = r0.o
            boolean r2 = r1.o
            if (r2 != 0) goto L_0x02bc
            a17 r1 = r1.v
            long r5 = r1.a
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0255
            boolean r1 = r1.e
            if (r1 != 0) goto L_0x0255
            goto L_0x02b9
        L_0x0255:
            android.net.Uri$Builder r1 = r9.buildUpon()
            b17 r2 = r0.o
            a17 r5 = r2.v
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x029d
            tb7 r5 = r2.r
            int r5 = r5.size()
            long r5 = (long) r5
            long r7 = r2.k
            long r7 = r7 + r5
            java.lang.String r2 = "_HLS_msn"
            java.lang.String r5 = java.lang.String.valueOf(r7)
            r1.appendQueryParameter(r2, r5)
            b17 r2 = r0.o
            long r5 = r2.n
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x029d
            tb7 r2 = r2.s
            int r5 = r2.size()
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0294
            java.lang.Object r2 = defpackage.b0h.w(r2)
            s07 r2 = (defpackage.s07) r2
            boolean r2 = r2.v0
            if (r2 == 0) goto L_0x0294
            int r5 = r5 + -1
        L_0x0294:
            java.lang.String r2 = "_HLS_part"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.appendQueryParameter(r2, r5)
        L_0x029d:
            b17 r2 = r0.o
            a17 r2 = r2.v
            long r5 = r2.a
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02b5
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x02ae
            java.lang.String r2 = "v2"
            goto L_0x02b0
        L_0x02ae:
            java.lang.String r2 = "YES"
        L_0x02b0:
            java.lang.String r3 = "_HLS_skip"
            r1.appendQueryParameter(r3, r2)
        L_0x02b5:
            android.net.Uri r9 = r1.build()
        L_0x02b9:
            r0.c(r9)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf4.d(b17):void");
    }

    public final void n(s28 s28, long j, long j2, boolean z2) {
        p8b p8b = (p8b) s28;
        long j3 = p8b.a;
        sne sne = p8b.o;
        k28 k28 = new k28(j3, p8b.b, sne.c, sne.o, j, j2, sne.b);
        vf4 vf4 = this.Y;
        ((gga) vf4.X).getClass();
        ((uz8) vf4.Y).d(k28, 4, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void u(s28 s28, long j, long j2) {
        p8b p8b = (p8b) s28;
        l17 l17 = (l17) p8b.w;
        long j3 = p8b.a;
        p74 p74 = p8b.b;
        sne sne = p8b.o;
        k28 k28 = new k28(j3, p74, sne.c, sne.o, j, j2, sne.b);
        if (l17 instanceof b17) {
            d((b17) l17);
            ((uz8) this.Y.Y).f(k28, 4, -1, (ca6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException b2 = ParserException.b((Exception) null, "Loaded playlist has unexpected type.");
            this.X = b2;
            ((uz8) this.Y.Y).i(k28, 4, b2, true);
        }
        ((gga) this.Y.X).getClass();
    }
}
