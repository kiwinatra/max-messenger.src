package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uf4  reason: default package */
public final class uf4 implements q28 {
    public IOException X;
    public boolean Y;
    public final /* synthetic */ vf4 Z;
    public final Uri a;
    public final l15 b = new l15("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j74 c;
    public c17 o;
    public long v;
    public long w;
    public long x;
    public long y;
    public boolean z;

    public uf4(vf4 vf4, Uri uri) {
        this.Z = vf4;
        this.a = uri;
        this.c = ((g74) ((rt6) vf4.y).b).a();
    }

    public static boolean a(uf4 uf4, long j) {
        uf4.y = SystemClock.elapsedRealtime() + j;
        vf4 vf4 = uf4.Z;
        if (!uf4.a.equals(vf4.v)) {
            return false;
        }
        List list = ((k17) vf4.w0).e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            uf4 uf42 = (uf4) vf4.b.get(((i17) list.get(i)).a);
            uf42.getClass();
            if (elapsedRealtime > uf42.y) {
                Uri uri = uf42.a;
                vf4.v = uri;
                uf42.e(vf4.c(uri));
                return false;
            }
        }
        return true;
    }

    public final void E(t28 t28, long j, long j2, boolean z2) {
        q8b q8b = (q8b) t28;
        long j3 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        vf4 vf4 = this.Z;
        ((nfd) vf4.X).getClass();
        ((cs) vf4.Y).v(l28, 4, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void H(t28 t28, long j, long j2) {
        q8b q8b = (q8b) t28;
        m17 m17 = (m17) q8b.w;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        if (m17 instanceof c17) {
            f((c17) m17, l28);
            ((cs) this.Z.Y).x(l28, 4, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException b2 = ParserException.b((Exception) null, "Loaded playlist has unexpected type.");
            this.X = b2;
            ((cs) this.Z.Y).A(l28, 4, b2, true);
        }
        ((nfd) this.Z.X).getClass();
    }

    public final p01 Z(t28 t28, long j, long j2, IOException iOException, int i) {
        q8b q8b = (q8b) t28;
        long j3 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        boolean z2 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z3 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        p01 p01 = l15.v;
        vf4 vf4 = this.Z;
        int i2 = q8b.c;
        if (z2 || z3) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).o : IntCompanionObject.MAX_VALUE;
            if (z3 || i3 == 400 || i3 == 503) {
                this.x = SystemClock.elapsedRealtime();
                c(false);
                int i4 = v0g.a;
                ((cs) vf4.Y).A(l28, i2, iOException, true);
                return p01;
            }
        }
        j28 j28 = new j28(i, iOException);
        Iterator it = vf4.c.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= !((s17) it.next()).b(this.a, j28, false);
        }
        nfd nfd = (nfd) vf4.X;
        if (z4) {
            nfd.getClass();
            long q = nfd.q(j28);
            p01 = q != -9223372036854775807L ? new p01(q, 0, 5, false) : l15.w;
        }
        boolean z5 = !p01.a();
        ((cs) vf4.Y).A(l28, i2, iOException, z5);
        if (z5) {
            nfd.getClass();
        }
        return p01;
    }

    public final Uri b() {
        c17 c17 = this.o;
        Uri uri = this.a;
        if (c17 != null) {
            a17 a17 = c17.v;
            if (a17.a != -9223372036854775807L || a17.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                c17 c172 = this.o;
                if (c172.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c172.k + ((long) c172.r.size())));
                    c17 c173 = this.o;
                    if (c173.n != -9223372036854775807L) {
                        tb7 tb7 = c173.s;
                        int size = tb7.size();
                        if (!tb7.isEmpty() && ((t07) b0h.w(tb7)).v0) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                a17 a172 = this.o.v;
                if (a172.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", a172.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z2) {
        e(z2 ? b() : this.a);
    }

    public final void d(Uri uri) {
        vf4 vf4 = this.Z;
        q8b q8b = new q8b(this.c, uri, 4, ((q17) vf4.z).j((k17) vf4.w0, this.o));
        int i = q8b.c;
        ((cs) vf4.Y).C(new l28(q8b.a, q8b.b, this.b.F(q8b, this, ((nfd) vf4.X).p(i))), i, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.y = 0;
        if (!this.z) {
            l15 l15 = this.b;
            if (!l15.z() && !l15.s()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.x;
                if (elapsedRealtime < j) {
                    this.z = true;
                    this.Z.o.postDelayed(new ir1(25, this, uri), j - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.c17 r65, defpackage.l28 r66) {
        /*
            r64 = this;
            r0 = r64
            r1 = r65
            c17 r2 = r0.o
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.v = r3
            vf4 r5 = r0.Z
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
            c17 r10 = new c17
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
            yv4 r8 = r2.q
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
            c17 r8 = (defpackage.c17) r8
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
            x07 r6 = (defpackage.x07) r6
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
            c17 r6 = (defpackage.c17) r6
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
            x07 r8 = (defpackage.x07) r8
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
            x07 r9 = (defpackage.x07) r9
            int r9 = r9.o
            int r6 = r6 - r9
        L_0x012b:
            r48 = r6
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x012b
        L_0x0130:
            c17 r10 = new c17
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
            yv4 r6 = r1.q
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
            c17 r1 = (defpackage.c17) r1
            if (r1 != 0) goto L_0x01a1
            r1 = r11 ^ 1
            r5.w = r1
            long r7 = r10.h
            r5.x = r7
        L_0x01a1:
            r5.x0 = r10
            java.lang.Object r1 = r5.v0
            u17 r1 = (defpackage.u17) r1
            e17 r1 = (defpackage.e17) r1
            r1.v(r10)
        L_0x01ac:
            java.util.Iterator r1 = r6.iterator()
        L_0x01b0:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r1.next()
            s17 r6 = (defpackage.s17) r6
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
            c17 r1 = r0.o
            long r10 = r1.k
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dc
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException
            r1.<init>()
            r8 = r7
            goto L_0x01f6
        L_0x01dc:
            long r10 = r0.w
            long r10 = r3 - r10
            double r10 = (double) r10
            long r13 = r1.m
            long r13 = defpackage.v0g.h0(r13)
            double r13 = (double) r13
            r15 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r13 = r13 * r15
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x01f5
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException r1 = new androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
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
            s17 r6 = (defpackage.s17) r6
            r6.b(r9, r10, r8)
            goto L_0x0203
        L_0x0213:
            c17 r1 = r0.o
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
            long r1 = defpackage.v0g.h0(r6)
            long r1 = r1 + r3
            r3 = r66
            long r3 = r3.b
            long r1 = r1 - r3
            r0.x = r1
            c17 r1 = r0.o
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x024b
            android.net.Uri r1 = r5.v
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0244
            boolean r1 = r0.Y
            if (r1 == 0) goto L_0x024b
        L_0x0244:
            android.net.Uri r1 = r64.b()
            r0.e(r1)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf4.f(c17, l28):void");
    }
}
