package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: ys8  reason: default package */
public final class ys8 implements ud {
    public ea6 A0;
    public ea6 B0;
    public ea6 C0;
    public boolean D0;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0;
    public int I0;
    public boolean J0;
    public PlaybackMetrics.Builder X;
    public int Y;
    public int Z = 0;
    public final Context a;
    public final rh4 b;
    public final PlaybackSession c;
    public final long o = SystemClock.elapsedRealtime();
    public final hkf v = new hkf();
    public int v0 = 0;
    public final ekf w = new ekf();
    public PlaybackException w0;
    public final HashMap x = new HashMap();
    public cs x0;
    public final HashMap y = new HashMap();
    public cs y0;
    public String z;
    public cs z0;

    public ys8(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        rh4 rh4 = new rh4();
        this.b = rh4;
        rh4.d = this;
    }

    public final void B(td tdVar, uob uob, uob uob2, int i) {
        if (i == 1) {
            this.D0 = true;
        }
        this.Y = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:442:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0(defpackage.vob r25, defpackage.dm4 r26) {
        /*
            r24 = this;
            r0 = r24
            r7 = r26
            r8 = 1
            r9 = 3
            java.lang.Object r1 = r7.b
            xq5 r1 = (defpackage.xq5) r1
            android.util.SparseBooleanArray r1 = r1.a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            r10 = 0
            r1 = r10
        L_0x0015:
            java.lang.Object r2 = r7.b
            xq5 r2 = (defpackage.xq5) r2
            android.util.SparseBooleanArray r2 = r2.a
            int r2 = r2.size()
            r11 = 11
            if (r1 >= r2) goto L_0x00f3
            java.lang.Object r2 = r7.b
            xq5 r2 = (defpackage.xq5) r2
            int r2 = r2.b(r1)
            java.lang.Object r3 = r7.c
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            java.lang.Object r3 = r3.get(r2)
            td r3 = (defpackage.td) r3
            r3.getClass()
            if (r2 != 0) goto L_0x0092
            rh4 r4 = r0.b
            monitor-enter(r4)
            ys8 r2 = r4.d     // Catch:{ all -> 0x006d }
            r2.getClass()     // Catch:{ all -> 0x006d }
            jkf r2 = r4.e     // Catch:{ all -> 0x006d }
            jkf r5 = r3.b     // Catch:{ all -> 0x006d }
            r4.e = r5     // Catch:{ all -> 0x006d }
            java.util.HashMap r5 = r4.c     // Catch:{ all -> 0x006d }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x006d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006d }
        L_0x0052:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x006d }
            qh4 r6 = (defpackage.qh4) r6     // Catch:{ all -> 0x006d }
            jkf r11 = r4.e     // Catch:{ all -> 0x006d }
            boolean r11 = r6.b(r2, r11)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x006f
            boolean r11 = r6.a(r3)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0052
            goto L_0x006f
        L_0x006d:
            r0 = move-exception
            goto L_0x0090
        L_0x006f:
            r5.remove()     // Catch:{ all -> 0x006d }
            boolean r11 = r6.e     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0052
            java.lang.String r11 = r6.a     // Catch:{ all -> 0x006d }
            java.lang.String r12 = r4.f     // Catch:{ all -> 0x006d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0083
            r4.a(r6)     // Catch:{ all -> 0x006d }
        L_0x0083:
            ys8 r11 = r4.d     // Catch:{ all -> 0x006d }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x006d }
            r11.d(r3, r6)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x008b:
            r4.d(r3)     // Catch:{ all -> 0x006d }
            monitor-exit(r4)
            goto L_0x00f0
        L_0x0090:
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0092:
            if (r2 != r11) goto L_0x00eb
            rh4 r2 = r0.b
            int r4 = r0.Y
            monitor-enter(r2)
            ys8 r5 = r2.d     // Catch:{ all -> 0x00da }
            r5.getClass()     // Catch:{ all -> 0x00da }
            if (r4 != 0) goto L_0x00a2
            r4 = r8
            goto L_0x00a3
        L_0x00a2:
            r4 = r10
        L_0x00a3:
            java.util.HashMap r5 = r2.c     // Catch:{ all -> 0x00da }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x00da }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00da }
        L_0x00ad:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00da }
            if (r6 == 0) goto L_0x00e4
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00da }
            qh4 r6 = (defpackage.qh4) r6     // Catch:{ all -> 0x00da }
            boolean r11 = r6.a(r3)     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x00ad
            r5.remove()     // Catch:{ all -> 0x00da }
            boolean r11 = r6.e     // Catch:{ all -> 0x00da }
            if (r11 == 0) goto L_0x00ad
            java.lang.String r11 = r6.a     // Catch:{ all -> 0x00da }
            java.lang.String r12 = r2.f     // Catch:{ all -> 0x00da }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x00da }
            if (r4 == 0) goto L_0x00d4
            if (r11 == 0) goto L_0x00d4
            boolean r12 = r6.f     // Catch:{ all -> 0x00da }
        L_0x00d4:
            if (r11 == 0) goto L_0x00dc
            r2.a(r6)     // Catch:{ all -> 0x00da }
            goto L_0x00dc
        L_0x00da:
            r0 = move-exception
            goto L_0x00e9
        L_0x00dc:
            ys8 r11 = r2.d     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x00da }
            r11.d(r3, r6)     // Catch:{ all -> 0x00da }
            goto L_0x00ad
        L_0x00e4:
            r2.d(r3)     // Catch:{ all -> 0x00da }
            monitor-exit(r2)
            goto L_0x00f0
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            throw r0
        L_0x00eb:
            rh4 r2 = r0.b
            r2.e(r3)
        L_0x00f0:
            int r1 = r1 + r8
            goto L_0x0015
        L_0x00f3:
            long r12 = android.os.SystemClock.elapsedRealtime()
            boolean r1 = r7.k(r10)
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r7.c
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            java.lang.Object r1 = r1.get(r10)
            td r1 = (defpackage.td) r1
            r1.getClass()
            android.media.metrics.PlaybackMetrics$Builder r2 = r0.X
            if (r2 == 0) goto L_0x0115
            jkf r2 = r1.b
            nz8 r1 = r1.d
            r0.c(r2, r1)
        L_0x0115:
            r14 = 2
            boolean r1 = r7.k(r14)
            if (r1 == 0) goto L_0x0186
            android.media.metrics.PlaybackMetrics$Builder r1 = r0.X
            if (r1 == 0) goto L_0x0186
            qqf r1 = r25.W()
            tb7 r1 = r1.a
            lx5 r1 = r1.listIterator(r10)
        L_0x012a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x014c
            java.lang.Object r2 = r1.next()
            pqf r2 = (defpackage.pqf) r2
            r3 = r10
        L_0x0137:
            int r4 = r2.a
            if (r3 >= r4) goto L_0x012a
            boolean[] r4 = r2.e
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x014a
            ea6 r4 = r2.c(r3)
            yv4 r4 = r4.r
            if (r4 == 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            int r3 = r3 + r8
            goto L_0x0137
        L_0x014c:
            r4 = 0
        L_0x014d:
            if (r4 == 0) goto L_0x0186
            android.media.metrics.PlaybackMetrics$Builder r1 = r0.X
            int r2 = defpackage.v0g.a
            android.media.metrics.PlaybackMetrics$Builder r1 = defpackage.ws8.j(r1)
            r2 = r10
        L_0x0158:
            int r3 = r4.o
            if (r2 >= r3) goto L_0x0182
            wv4[] r3 = r4.a
            r3 = r3[r2]
            java.util.UUID r3 = r3.b
            java.util.UUID r5 = defpackage.zw0.d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x016c
            r2 = r9
            goto L_0x0183
        L_0x016c:
            java.util.UUID r5 = defpackage.zw0.e
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0176
            r2 = r14
            goto L_0x0183
        L_0x0176:
            java.util.UUID r5 = defpackage.zw0.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0180
            r2 = 6
            goto L_0x0183
        L_0x0180:
            int r2 = r2 + r8
            goto L_0x0158
        L_0x0182:
            r2 = r8
        L_0x0183:
            r1.setDrmType(r2)
        L_0x0186:
            r1 = 1011(0x3f3, float:1.417E-42)
            boolean r1 = r7.k(r1)
            if (r1 == 0) goto L_0x0193
            int r1 = r0.I0
            int r1 = r1 + r8
            r0.I0 = r1
        L_0x0193:
            androidx.media3.common.PlaybackException r1 = r0.w0
            r15 = 5
            r5 = 4
            if (r1 != 0) goto L_0x01a5
            r21 = r5
            r1 = r8
            r2 = r14
            r18 = 6
            r19 = 7
            r20 = 9
            goto L_0x0444
        L_0x01a5:
            int r3 = r0.E0
            if (r3 != r5) goto L_0x01ab
            r3 = r8
            goto L_0x01ac
        L_0x01ab:
            r3 = r10
        L_0x01ac:
            int r14 = r1.a
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r14 != r4) goto L_0x01c5
            ft r3 = new ft
            r4 = 20
            r3.<init>(r4, r10, r9)
            r21 = r5
            r5 = 13
            r18 = 6
            r19 = 7
            r20 = 9
            goto L_0x0418
        L_0x01c5:
            boolean r4 = r1 instanceof androidx.media3.exoplayer.ExoPlaybackException
            if (r4 == 0) goto L_0x01d6
            r4 = r1
            androidx.media3.exoplayer.ExoPlaybackException r4 = (androidx.media3.exoplayer.ExoPlaybackException) r4
            int r5 = r4.X
            if (r5 != r8) goto L_0x01d2
            r5 = r8
            goto L_0x01d3
        L_0x01d2:
            r5 = r10
        L_0x01d3:
            int r4 = r4.w0
            goto L_0x01d8
        L_0x01d6:
            r4 = r10
            r5 = r4
        L_0x01d8:
            java.lang.Throwable r2 = r1.getCause()
            r2.getClass()
            boolean r6 = r2 instanceof java.io.IOException
            r22 = 25
            r23 = 26
            r11 = 27
            r8 = 23
            if (r6 == 0) goto L_0x036c
            boolean r4 = r2 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r4 == 0) goto L_0x0204
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r2 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r2
            ft r3 = new ft
            int r2 = r2.o
            r3.<init>(r15, r2, r9)
        L_0x01f8:
            r5 = 13
            r18 = 6
            r19 = 7
            r20 = 9
        L_0x0200:
            r21 = 4
            goto L_0x0418
        L_0x0204:
            boolean r4 = r2 instanceof androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
            if (r4 != 0) goto L_0x020c
            boolean r4 = r2 instanceof androidx.media3.common.ParserException
            if (r4 == 0) goto L_0x0215
        L_0x020c:
            r2 = 4
            r4 = 9
            r5 = 7
            r6 = 6
            r8 = 8
            goto L_0x0356
        L_0x0215:
            boolean r3 = r2 instanceof androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            if (r3 != 0) goto L_0x021d
            boolean r4 = r2 instanceof androidx.media3.datasource.UdpDataSource$UdpDataSourceException
            if (r4 == 0) goto L_0x0221
        L_0x021d:
            r4 = 9
            goto L_0x02f4
        L_0x0221:
            r3 = 1002(0x3ea, float:1.404E-42)
            r4 = 21
            if (r14 != r3) goto L_0x022d
            ft r3 = new ft
            r3.<init>(r4, r10, r9)
            goto L_0x01f8
        L_0x022d:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            if (r3 == 0) goto L_0x02aa
            java.lang.Throwable r2 = r2.getCause()
            r2.getClass()
            int r3 = defpackage.v0g.a
            if (r3 < r4) goto L_0x0263
            boolean r4 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r4 == 0) goto L_0x0263
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = defpackage.v0g.y(r2)
            int r3 = defpackage.v0g.x(r2)
            switch(r3) {
                case 6002: goto L_0x025b;
                case 6003: goto L_0x0258;
                case 6004: goto L_0x0255;
                case 6005: goto L_0x0252;
                default: goto L_0x0251;
            }
        L_0x0251:
            goto L_0x025d
        L_0x0252:
            r11 = r23
            goto L_0x025d
        L_0x0255:
            r11 = r22
            goto L_0x025d
        L_0x0258:
            r11 = 28
            goto L_0x025d
        L_0x025b:
            r11 = 24
        L_0x025d:
            ft r3 = new ft
            r3.<init>(r11, r2, r9)
            goto L_0x01f8
        L_0x0263:
            if (r3 < r8) goto L_0x026f
            boolean r3 = r2 instanceof android.media.MediaDrmResetException
            if (r3 == 0) goto L_0x026f
            ft r3 = new ft
            r3.<init>(r11, r10, r9)
            goto L_0x01f8
        L_0x026f:
            boolean r3 = r2 instanceof android.media.NotProvisionedException
            if (r3 == 0) goto L_0x027c
            ft r3 = new ft
            r6 = 24
            r3.<init>(r6, r10, r9)
            goto L_0x01f8
        L_0x027c:
            boolean r3 = r2 instanceof android.media.DeniedByServerException
            if (r3 == 0) goto L_0x0289
            ft r3 = new ft
            r2 = 29
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x0289:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r3 == 0) goto L_0x0294
            ft r3 = new ft
            r3.<init>(r8, r10, r9)
            goto L_0x01f8
        L_0x0294:
            boolean r2 = r2 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r2 == 0) goto L_0x02a1
            ft r3 = new ft
            r14 = 28
            r3.<init>(r14, r10, r9)
            goto L_0x01f8
        L_0x02a1:
            ft r3 = new ft
            r2 = 30
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02aa:
            boolean r3 = r2 instanceof androidx.media3.datasource.FileDataSource$FileDataSourceException
            if (r3 == 0) goto L_0x02e3
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof java.io.FileNotFoundException
            if (r3 == 0) goto L_0x02e3
            java.lang.Throwable r2 = r2.getCause()
            r2.getClass()
            java.lang.Throwable r2 = r2.getCause()
            int r3 = defpackage.v0g.a
            if (r3 < r4) goto L_0x02da
            boolean r3 = r2 instanceof android.system.ErrnoException
            if (r3 == 0) goto L_0x02da
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r3 = android.system.OsConstants.EACCES
            if (r2 != r3) goto L_0x02da
            ft r3 = new ft
            r2 = 32
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02da:
            ft r3 = new ft
            r2 = 31
            r3.<init>(r2, r10, r9)
            goto L_0x01f8
        L_0x02e3:
            ft r3 = new ft
            r4 = 9
            r3.<init>(r4, r10, r9)
        L_0x02ea:
            r20 = r4
            r5 = 13
            r18 = 6
        L_0x02f0:
            r19 = 7
            goto L_0x0200
        L_0x02f4:
            android.content.Context r5 = r0.a
            g7a r5 = defpackage.g7a.c(r5)
            int r5 = r5.d()
            r6 = 1
            if (r5 != r6) goto L_0x0307
            ft r3 = new ft
            r3.<init>(r9, r10, r9)
            goto L_0x02ea
        L_0x0307:
            java.lang.Throwable r5 = r2.getCause()
            boolean r6 = r5 instanceof java.net.UnknownHostException
            if (r6 == 0) goto L_0x031c
            ft r3 = new ft
            r6 = 6
            r3.<init>(r6, r10, r9)
            r20 = r4
            r18 = r6
            r5 = 13
            goto L_0x02f0
        L_0x031c:
            r6 = 6
            boolean r5 = r5 instanceof java.net.SocketTimeoutException
            if (r5 == 0) goto L_0x0331
            ft r3 = new ft
            r5 = 7
            r3.<init>(r5, r10, r9)
            r20 = r4
            r19 = r5
            r18 = r6
            r5 = 13
            goto L_0x0200
        L_0x0331:
            r5 = 7
            if (r3 == 0) goto L_0x034d
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r2 = (androidx.media3.datasource.HttpDataSource$HttpDataSourceException) r2
            int r2 = r2.c
            r3 = 1
            if (r2 != r3) goto L_0x034d
            ft r3 = new ft
            r2 = 4
            r3.<init>(r2, r10, r9)
        L_0x0341:
            r21 = r2
            r20 = r4
            r19 = r5
            r18 = r6
        L_0x0349:
            r5 = 13
            goto L_0x0418
        L_0x034d:
            r2 = 4
            ft r3 = new ft
            r8 = 8
            r3.<init>(r8, r10, r9)
            goto L_0x0341
        L_0x0356:
            ft r11 = new ft
            if (r3 == 0) goto L_0x035d
            r3 = 10
            goto L_0x035f
        L_0x035d:
            r3 = 11
        L_0x035f:
            r11.<init>(r3, r10, r9)
            r21 = r2
            r20 = r4
            r19 = r5
            r18 = r6
            r3 = r11
            goto L_0x0349
        L_0x036c:
            r3 = 8
            r6 = 24
            r14 = 28
            r18 = 6
            r19 = 7
            r20 = 9
            r21 = 4
            if (r5 == 0) goto L_0x0389
            if (r4 == 0) goto L_0x0381
            r3 = 1
            if (r4 != r3) goto L_0x0389
        L_0x0381:
            ft r3 = new ft
            r2 = 35
            r3.<init>(r2, r10, r9)
            goto L_0x0349
        L_0x0389:
            if (r5 == 0) goto L_0x0395
            if (r4 != r9) goto L_0x0395
            ft r3 = new ft
            r2 = 15
            r3.<init>(r2, r10, r9)
            goto L_0x0349
        L_0x0395:
            if (r5 == 0) goto L_0x03a0
            r3 = 2
            if (r4 != r3) goto L_0x03a0
            ft r3 = new ft
            r3.<init>(r8, r10, r9)
            goto L_0x0349
        L_0x03a0:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException
            if (r3 == 0) goto L_0x03b5
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException) r2
            java.lang.String r2 = r2.o
            int r2 = defpackage.v0g.y(r2)
            ft r3 = new ft
            r5 = 13
            r3.<init>(r5, r2, r9)
            goto L_0x0418
        L_0x03b5:
            r5 = 13
            boolean r3 = r2 instanceof androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException
            r4 = 14
            if (r3 == 0) goto L_0x03c7
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r2 = (androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException) r2
            ft r3 = new ft
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03c7:
            boolean r3 = r2 instanceof java.lang.OutOfMemoryError
            if (r3 == 0) goto L_0x03d1
            ft r3 = new ft
            r3.<init>(r4, r10, r9)
            goto L_0x0418
        L_0x03d1:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.audio.AudioSink$InitializationException
            if (r3 == 0) goto L_0x03e1
            androidx.media3.exoplayer.audio.AudioSink$InitializationException r2 = (androidx.media3.exoplayer.audio.AudioSink$InitializationException) r2
            ft r3 = new ft
            r4 = 17
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03e1:
            boolean r3 = r2 instanceof androidx.media3.exoplayer.audio.AudioSink$WriteException
            if (r3 == 0) goto L_0x03f1
            androidx.media3.exoplayer.audio.AudioSink$WriteException r2 = (androidx.media3.exoplayer.audio.AudioSink$WriteException) r2
            ft r3 = new ft
            r4 = 18
            int r2 = r2.a
            r3.<init>(r4, r2, r9)
            goto L_0x0418
        L_0x03f1:
            boolean r3 = r2 instanceof android.media.MediaCodec.CryptoException
            if (r3 == 0) goto L_0x0411
            android.media.MediaCodec$CryptoException r2 = (android.media.MediaCodec.CryptoException) r2
            int r2 = r2.getErrorCode()
            int r3 = defpackage.v0g.x(r2)
            switch(r3) {
                case 6002: goto L_0x040a;
                case 6003: goto L_0x040b;
                case 6004: goto L_0x0407;
                case 6005: goto L_0x0404;
                default: goto L_0x0402;
            }
        L_0x0402:
            r14 = r11
            goto L_0x040b
        L_0x0404:
            r14 = r23
            goto L_0x040b
        L_0x0407:
            r14 = r22
            goto L_0x040b
        L_0x040a:
            r14 = r6
        L_0x040b:
            ft r3 = new ft
            r3.<init>(r14, r2, r9)
            goto L_0x0418
        L_0x0411:
            ft r3 = new ft
            r2 = 22
            r3.<init>(r2, r10, r9)
        L_0x0418:
            android.media.metrics.PlaybackSession r2 = r0.c
            android.media.metrics.PlaybackErrorEvent$Builder r4 = defpackage.xs8.f()
            long r5 = r0.o
            long r5 = r12 - r5
            android.media.metrics.PlaybackErrorEvent$Builder r4 = r4.setTimeSinceCreatedMillis(r5)
            int r5 = r3.b
            android.media.metrics.PlaybackErrorEvent$Builder r4 = r4.setErrorCode(r5)
            int r3 = r3.c
            android.media.metrics.PlaybackErrorEvent$Builder r3 = r4.setSubErrorCode(r3)
            android.media.metrics.PlaybackErrorEvent$Builder r1 = r3.setException(r1)
            android.media.metrics.PlaybackErrorEvent r1 = r1.build()
            r2.reportPlaybackErrorEvent(r1)
            r1 = 1
            r0.J0 = r1
            r2 = 0
            r0.w0 = r2
            r2 = 2
        L_0x0444:
            boolean r3 = r7.k(r2)
            if (r3 == 0) goto L_0x0461
            qqf r3 = r25.W()
            boolean r4 = r3.b(r2)
            boolean r8 = r3.b(r1)
            boolean r11 = r3.b(r9)
            if (r4 != 0) goto L_0x046b
            if (r8 != 0) goto L_0x046b
            if (r11 == 0) goto L_0x0461
            goto L_0x046b
        L_0x0461:
            r9 = r21
            r15 = 10
            r16 = 13
            r17 = 8
            goto L_0x04d5
        L_0x046b:
            if (r4 != 0) goto L_0x0494
            ea6 r1 = r0.A0
            r14 = 0
            boolean r1 = defpackage.v0g.a(r1, r14)
            if (r1 == 0) goto L_0x0479
            r9 = r21
            goto L_0x0497
        L_0x0479:
            ea6 r1 = r0.A0
            if (r1 != 0) goto L_0x047f
            r6 = 1
            goto L_0x0480
        L_0x047f:
            r6 = r10
        L_0x0480:
            r0.A0 = r14
            r2 = 1
            r1 = r24
            r5 = 10
            r17 = 8
            r3 = r12
            r15 = r5
            r9 = r21
            r16 = 13
            r5 = r14
            r1.e(r2, r3, r5, r6)
            goto L_0x049d
        L_0x0494:
            r9 = r21
            r14 = 0
        L_0x0497:
            r15 = 10
            r16 = 13
            r17 = 8
        L_0x049d:
            if (r8 != 0) goto L_0x04b9
            ea6 r1 = r0.B0
            boolean r1 = defpackage.v0g.a(r1, r14)
            if (r1 == 0) goto L_0x04a8
            goto L_0x04b9
        L_0x04a8:
            ea6 r1 = r0.B0
            if (r1 != 0) goto L_0x04ae
            r6 = 1
            goto L_0x04af
        L_0x04ae:
            r6 = r10
        L_0x04af:
            r0.B0 = r14
            r2 = 0
            r1 = r24
            r3 = r12
            r5 = r14
            r1.e(r2, r3, r5, r6)
        L_0x04b9:
            if (r11 != 0) goto L_0x04d5
            ea6 r1 = r0.C0
            boolean r1 = defpackage.v0g.a(r1, r14)
            if (r1 == 0) goto L_0x04c4
            goto L_0x04d5
        L_0x04c4:
            ea6 r1 = r0.C0
            if (r1 != 0) goto L_0x04ca
            r6 = 1
            goto L_0x04cb
        L_0x04ca:
            r6 = r10
        L_0x04cb:
            r0.C0 = r14
            r2 = 2
            r1 = r24
            r3 = r12
            r5 = r14
            r1.e(r2, r3, r5, r6)
        L_0x04d5:
            cs r1 = r0.x0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x050a
            cs r1 = r0.x0
            java.lang.Object r2 = r1.c
            r5 = r2
            ea6 r5 = (defpackage.ea6) r5
            int r2 = r5.u
            r3 = -1
            if (r2 == r3) goto L_0x050a
            int r1 = r1.b
            ea6 r2 = r0.A0
            boolean r2 = defpackage.v0g.a(r2, r5)
            if (r2 == 0) goto L_0x04f5
        L_0x04f3:
            r1 = 0
            goto L_0x0508
        L_0x04f5:
            ea6 r2 = r0.A0
            if (r2 != 0) goto L_0x04fd
            if (r1 != 0) goto L_0x04fd
            r6 = 1
            goto L_0x04fe
        L_0x04fd:
            r6 = r1
        L_0x04fe:
            r0.A0 = r5
            r2 = 1
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x04f3
        L_0x0508:
            r0.x0 = r1
        L_0x050a:
            cs r1 = r0.y0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x053a
            cs r1 = r0.y0
            java.lang.Object r2 = r1.c
            r5 = r2
            ea6 r5 = (defpackage.ea6) r5
            int r1 = r1.b
            ea6 r2 = r0.B0
            boolean r2 = defpackage.v0g.a(r2, r5)
            if (r2 == 0) goto L_0x0525
        L_0x0523:
            r1 = 0
            goto L_0x0538
        L_0x0525:
            ea6 r2 = r0.B0
            if (r2 != 0) goto L_0x052d
            if (r1 != 0) goto L_0x052d
            r6 = 1
            goto L_0x052e
        L_0x052d:
            r6 = r1
        L_0x052e:
            r0.B0 = r5
            r2 = 0
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x0523
        L_0x0538:
            r0.y0 = r1
        L_0x053a:
            cs r1 = r0.z0
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L_0x056a
            cs r1 = r0.z0
            java.lang.Object r2 = r1.c
            r5 = r2
            ea6 r5 = (defpackage.ea6) r5
            int r1 = r1.b
            ea6 r2 = r0.C0
            boolean r2 = defpackage.v0g.a(r2, r5)
            if (r2 == 0) goto L_0x0555
        L_0x0553:
            r1 = 0
            goto L_0x0568
        L_0x0555:
            ea6 r2 = r0.C0
            if (r2 != 0) goto L_0x055d
            if (r1 != 0) goto L_0x055d
            r6 = 1
            goto L_0x055e
        L_0x055d:
            r6 = r1
        L_0x055e:
            r0.C0 = r5
            r2 = 2
            r1 = r24
            r3 = r12
            r1.e(r2, r3, r5, r6)
            goto L_0x0553
        L_0x0568:
            r0.z0 = r1
        L_0x056a:
            android.content.Context r1 = r0.a
            g7a r1 = defpackage.g7a.c(r1)
            int r1 = r1.d()
            switch(r1) {
                case 0: goto L_0x058d;
                case 1: goto L_0x058a;
                case 2: goto L_0x0588;
                case 3: goto L_0x0586;
                case 4: goto L_0x0584;
                case 5: goto L_0x0581;
                case 6: goto L_0x0577;
                case 7: goto L_0x057f;
                case 8: goto L_0x0577;
                case 9: goto L_0x057c;
                case 10: goto L_0x0579;
                default: goto L_0x0577;
            }
        L_0x0577:
            r6 = 1
            goto L_0x058e
        L_0x0579:
            r6 = r19
            goto L_0x058e
        L_0x057c:
            r6 = r17
            goto L_0x058e
        L_0x057f:
            r6 = 3
            goto L_0x058e
        L_0x0581:
            r6 = r18
            goto L_0x058e
        L_0x0584:
            r6 = 5
            goto L_0x058e
        L_0x0586:
            r6 = r9
            goto L_0x058e
        L_0x0588:
            r6 = 2
            goto L_0x058e
        L_0x058a:
            r6 = r20
            goto L_0x058e
        L_0x058d:
            r6 = r10
        L_0x058e:
            int r1 = r0.v0
            if (r6 == r1) goto L_0x05ad
            r0.v0 = r6
            android.media.metrics.PlaybackSession r1 = r0.c
            android.media.metrics.NetworkEvent$Builder r2 = defpackage.xs8.e()
            android.media.metrics.NetworkEvent$Builder r2 = r2.setNetworkType(r6)
            long r3 = r0.o
            long r3 = r12 - r3
            android.media.metrics.NetworkEvent$Builder r2 = r2.setTimeSinceCreatedMillis(r3)
            android.media.metrics.NetworkEvent r2 = r2.build()
            r1.reportNetworkEvent(r2)
        L_0x05ad:
            int r1 = r25.getPlaybackState()
            r2 = 2
            if (r1 == r2) goto L_0x05b6
            r0.D0 = r10
        L_0x05b6:
            androidx.media3.common.PlaybackException r1 = r25.N()
            if (r1 != 0) goto L_0x05bf
            r0.F0 = r10
            goto L_0x05c8
        L_0x05bf:
            boolean r1 = r7.k(r15)
            if (r1 == 0) goto L_0x05c8
            r1 = 1
            r0.F0 = r1
        L_0x05c8:
            int r1 = r25.getPlaybackState()
            boolean r2 = r0.D0
            if (r2 == 0) goto L_0x05d4
            r2 = 1
            r11 = 5
            goto L_0x0626
        L_0x05d4:
            boolean r2 = r0.F0
            if (r2 == 0) goto L_0x05dc
            r11 = r16
        L_0x05da:
            r2 = 1
            goto L_0x0626
        L_0x05dc:
            if (r1 != r9) goto L_0x05e2
            r2 = 1
            r11 = 11
            goto L_0x0626
        L_0x05e2:
            r11 = 12
            r2 = 2
            if (r1 != r2) goto L_0x0606
            int r1 = r0.Z
            if (r1 == 0) goto L_0x0604
            if (r1 == r2) goto L_0x0604
            if (r1 != r11) goto L_0x05f0
            goto L_0x0604
        L_0x05f0:
            boolean r1 = r25.q()
            if (r1 != 0) goto L_0x05f9
            r11 = r19
            goto L_0x05da
        L_0x05f9:
            int r1 = r25.j0()
            if (r1 == 0) goto L_0x0601
            r11 = r15
            goto L_0x05da
        L_0x0601:
            r11 = r18
            goto L_0x05da
        L_0x0604:
            r11 = r2
            goto L_0x05da
        L_0x0606:
            r2 = 3
            if (r1 != r2) goto L_0x061c
            boolean r1 = r25.q()
            if (r1 != 0) goto L_0x0611
        L_0x060f:
            r11 = r9
            goto L_0x05da
        L_0x0611:
            int r1 = r25.j0()
            if (r1 == 0) goto L_0x061a
            r9 = r20
            goto L_0x060f
        L_0x061a:
            r9 = r2
            goto L_0x060f
        L_0x061c:
            r2 = 1
            if (r1 != r2) goto L_0x0624
            int r1 = r0.Z
            if (r1 == 0) goto L_0x0624
            goto L_0x0626
        L_0x0624:
            int r11 = r0.Z
        L_0x0626:
            int r1 = r0.Z
            if (r1 == r11) goto L_0x0648
            r0.Z = r11
            r0.J0 = r2
            android.media.metrics.PlaybackSession r1 = r0.c
            android.media.metrics.PlaybackStateEvent$Builder r2 = defpackage.xs8.h()
            int r3 = r0.Z
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setState(r3)
            long r3 = r0.o
            long r12 = r12 - r3
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackStateEvent r2 = r2.build()
            r1.reportPlaybackStateEvent(r2)
        L_0x0648:
            r1 = 1028(0x404, float:1.44E-42)
            boolean r2 = r7.k(r1)
            if (r2 == 0) goto L_0x06a0
            rh4 r2 = r0.b
            java.lang.Object r0 = r7.c
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r1)
            td r0 = (defpackage.td) r0
            r0.getClass()
            monitor-enter(r2)
            java.lang.String r1 = r2.f     // Catch:{ all -> 0x0673 }
            if (r1 == 0) goto L_0x0675
            java.util.HashMap r3 = r2.c     // Catch:{ all -> 0x0673 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0673 }
            qh4 r1 = (defpackage.qh4) r1     // Catch:{ all -> 0x0673 }
            r1.getClass()     // Catch:{ all -> 0x0673 }
            r2.a(r1)     // Catch:{ all -> 0x0673 }
            goto L_0x0675
        L_0x0673:
            r0 = move-exception
            goto L_0x069e
        L_0x0675:
            java.util.HashMap r1 = r2.c     // Catch:{ all -> 0x0673 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0673 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0673 }
        L_0x067f:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0673 }
            if (r3 == 0) goto L_0x069c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0673 }
            qh4 r3 = (defpackage.qh4) r3     // Catch:{ all -> 0x0673 }
            r1.remove()     // Catch:{ all -> 0x0673 }
            boolean r4 = r3.e     // Catch:{ all -> 0x0673 }
            if (r4 == 0) goto L_0x067f
            ys8 r4 = r2.d     // Catch:{ all -> 0x0673 }
            if (r4 == 0) goto L_0x067f
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0673 }
            r4.d(r0, r3)     // Catch:{ all -> 0x0673 }
            goto L_0x067f
        L_0x069c:
            monitor-exit(r2)
            goto L_0x06a0
        L_0x069e:
            monitor-exit(r2)     // Catch:{ all -> 0x0673 }
            throw r0
        L_0x06a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys8.E0(vob, dm4):void");
    }

    public final void K(td tdVar, z94 z94) {
        this.G0 += z94.h;
        this.H0 += z94.f;
    }

    public final void M(td tdVar, int i, long j) {
        nz8 nz8 = tdVar.d;
        if (nz8 != null) {
            String c2 = this.b.c(tdVar.b, nz8);
            HashMap hashMap = this.y;
            Long l = (Long) hashMap.get(c2);
            HashMap hashMap2 = this.x;
            Long l2 = (Long) hashMap2.get(c2);
            long j2 = 0;
            hashMap.put(c2, Long.valueOf((l == null ? 0 : l.longValue()) + j));
            if (l2 != null) {
                j2 = l2.longValue();
            }
            hashMap2.put(c2, Long.valueOf(j2 + ((long) i)));
        }
    }

    public final void R(td tdVar, es8 es8, IOException iOException, boolean z2) {
        this.E0 = es8.a;
    }

    public final void T(td tdVar, v8g v8g) {
        cs csVar = this.x0;
        if (csVar != null) {
            ea6 ea6 = (ea6) csVar.c;
            if (ea6.u == -1) {
                ba6 a2 = ea6.a();
                a2.s = v8g.a;
                a2.t = v8g.b;
                ea6 a3 = a2.a();
                this.x0 = new cs((String) csVar.o, csVar.b, 13, a3);
            }
        }
    }

    public final void W(td tdVar, es8 es8) {
        nz8 nz8 = tdVar.d;
        if (nz8 != null) {
            ea6 ea6 = (ea6) es8.g;
            ea6.getClass();
            nz8.getClass();
            cs csVar = new cs(this.b.c(tdVar.b, nz8), es8.c, 13, ea6);
            int i = es8.b;
            if (i != 0) {
                if (i == 1) {
                    this.y0 = csVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.z0 = csVar;
                        return;
                    }
                    return;
                }
            }
            this.x0 = csVar;
        }
    }

    public final boolean a(cs csVar) {
        String str;
        if (csVar != null) {
            String str2 = (String) csVar.o;
            rh4 rh4 = this.b;
            synchronized (rh4) {
                str = rh4.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.X;
        if (builder != null && this.J0) {
            builder.setAudioUnderrunCount(this.I0);
            this.X.setVideoFramesDropped(this.G0);
            this.X.setVideoFramesPlayed(this.H0);
            Long l = (Long) this.x.get(this.z);
            this.X.setNetworkTransferDurationMillis(l == null ? 0 : l.longValue());
            Long l2 = (Long) this.y.get(this.z);
            this.X.setNetworkBytesRead(l2 == null ? 0 : l2.longValue());
            this.X.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.X.build());
        }
        this.X = null;
        this.z = null;
        this.I0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.J0 = false;
    }

    public final void c(jkf jkf, nz8 nz8) {
        int b2;
        PlaybackMetrics.Builder builder = this.X;
        if (nz8 != null && (b2 = jkf.b(nz8.a)) != -1) {
            ekf ekf = this.w;
            int i = 0;
            jkf.g(b2, ekf, false);
            int i2 = ekf.c;
            hkf hkf = this.v;
            jkf.o(i2, hkf);
            xq8 xq8 = hkf.c.b;
            int i3 = 2;
            if (xq8 != null) {
                int J = v0g.J(xq8.a, xq8.b);
                i = J != 0 ? J != 1 ? J != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            if (hkf.m != -9223372036854775807L && !hkf.k && !hkf.i && !hkf.a()) {
                builder.setMediaDurationMillis(v0g.h0(hkf.m));
            }
            if (!hkf.a()) {
                i3 = 1;
            }
            builder.setPlaybackType(i3);
            this.J0 = true;
        }
    }

    public final void d(td tdVar, String str) {
        nz8 nz8 = tdVar.d;
        if ((nz8 == null || !nz8.b()) && str.equals(this.z)) {
            b();
        }
        this.x.remove(str);
        this.y.remove(str);
    }

    public final void e(int i, long j, ea6 ea6, int i2) {
        int i3;
        TrackChangeEvent.Builder p = xs8.i(i).setTimeSinceCreatedMillis(j - this.o);
        if (ea6 != null) {
            p.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            p.setTrackChangeReason(i3);
            String str = ea6.m;
            if (str != null) {
                p.setContainerMimeType(str);
            }
            String str2 = ea6.n;
            if (str2 != null) {
                p.setSampleMimeType(str2);
            }
            String str3 = ea6.j;
            if (str3 != null) {
                p.setCodecName(str3);
            }
            int i4 = ea6.i;
            if (i4 != -1) {
                p.setBitrate(i4);
            }
            int i5 = ea6.t;
            if (i5 != -1) {
                p.setWidth(i5);
            }
            int i6 = ea6.u;
            if (i6 != -1) {
                p.setHeight(i6);
            }
            int i7 = ea6.B;
            if (i7 != -1) {
                p.setChannelCount(i7);
            }
            int i8 = ea6.C;
            if (i8 != -1) {
                p.setAudioSampleRate(i8);
            }
            String str4 = ea6.d;
            if (str4 != null) {
                int i9 = v0g.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                p.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    p.setLanguageRegion((String) obj);
                }
            }
            float f = ea6.v;
            if (f != -1.0f) {
                p.setVideoFrameRate(f);
            }
        } else {
            p.setTrackState(0);
        }
        this.J0 = true;
        this.c.reportTrackChangeEvent(p.build());
    }

    public final void l0(td tdVar, PlaybackException playbackException) {
        this.w0 = playbackException;
    }
}
