package defpackage;

import java.util.concurrent.Executor;

/* renamed from: w54  reason: default package */
public final class w54 extends yod {
    public final qpg k = new qpg(2);

    public w54(ir8 ir8, hx0 hx0, Executor executor) {
        super(ir8, new c64(), hx0, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        r16 = r3;
        r6 = r6 + 1;
        r1 = r27;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList e(defpackage.jx0 r28, defpackage.to5 r29, boolean r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r30
            r3 = r29
            y54 r3 = (defpackage.y54) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
        L_0x000e:
            java.util.List r0 = r3.m
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0130
            gcb r7 = r3.b(r6)
            long r8 = r7.b
            long r8 = defpackage.v0g.S(r8)
            long r10 = r3.d(r6)
            r12 = 0
        L_0x0025:
            java.util.List r0 = r7.c
            int r13 = r0.size()
            if (r12 >= r13) goto L_0x0126
            java.lang.Object r0 = r0.get(r12)
            r13 = r0
            s9 r13 = (defpackage.s9) r13
            r14 = 0
        L_0x0035:
            java.util.List r0 = r13.c
            int r0 = r0.size()
            if (r14 >= r0) goto L_0x0118
            java.util.List r0 = r13.c
            java.lang.Object r0 = r0.get(r14)
            x2d r0 = (defpackage.x2d) r0
            int r15 = r13.b     // Catch:{ IOException -> 0x00fe }
            q64 r16 = r0.c()     // Catch:{ IOException -> 0x00fe }
            if (r16 == 0) goto L_0x0056
            r17 = r6
            r18 = r7
            r15 = r16
            r16 = r3
            goto L_0x007a
        L_0x0056:
            v54 r5 = new v54     // Catch:{ IOException -> 0x00fe }
            r16 = r3
            r3 = r28
            r5.<init>(r3, r15, r0)     // Catch:{ IOException -> 0x00fc }
            java.lang.Object r5 = r1.c(r5, r2)     // Catch:{ IOException -> 0x00fc }
            p03 r5 = (defpackage.p03) r5     // Catch:{ IOException -> 0x00fc }
            if (r5 != 0) goto L_0x006e
            r5 = 0
            r15 = r5
            r17 = r6
            r18 = r7
            goto L_0x007a
        L_0x006e:
            jz2 r15 = new jz2     // Catch:{ IOException -> 0x00fc }
            r17 = r6
            r18 = r7
            long r6 = r0.c     // Catch:{ IOException -> 0x00fa }
            r3 = 3
            r15.<init>((java.lang.Object) r5, (long) r6, (int) r3)     // Catch:{ IOException -> 0x00fa }
        L_0x007a:
            if (r15 == 0) goto L_0x00ee
            long r5 = r15.D(r10)
            r19 = -1
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x00e6
            qpg r3 = r1.k
            tb7 r7 = r0.b
            ml0 r3 = r3.w(r7)
            int r7 = defpackage.v0g.a
            java.lang.String r3 = r3.a
            dpc r7 = r0.x
            if (r7 == 0) goto L_0x00a3
            r1 = 0
            q74 r7 = defpackage.cvg.j(r0, r3, r7, r1)
            wod r1 = new wod
            r1.<init>(r8, r7)
            r4.add(r1)
        L_0x00a3:
            dpc r1 = r0.d()
            if (r1 == 0) goto L_0x00b6
            r7 = 0
            q74 r1 = defpackage.cvg.j(r0, r3, r1, r7)
            wod r7 = new wod
            r7.<init>(r8, r1)
            r4.add(r7)
        L_0x00b6:
            long r19 = r15.C()
            long r5 = r19 + r5
            r21 = 1
            long r5 = r5 - r21
            r23 = r10
            r10 = r19
        L_0x00c4:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0109
            long r19 = r15.b(r10)
            r25 = r5
            long r5 = r19 + r8
            dpc r1 = r15.o(r10)
            r7 = 0
            q74 r1 = defpackage.cvg.j(r0, r3, r1, r7)
            wod r7 = new wod
            r7.<init>(r5, r1)
            r4.add(r7)
            long r10 = r10 + r21
            r5 = r25
            goto L_0x00c4
        L_0x00e6:
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            r23 = r10
            androidx.media3.exoplayer.offline.DownloadException r0 = new androidx.media3.exoplayer.offline.DownloadException     // Catch:{ IOException -> 0x00f8 }
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f8 }
            throw r0     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            goto L_0x0107
        L_0x00fa:
            r0 = move-exception
            goto L_0x0105
        L_0x00fc:
            r0 = move-exception
            goto L_0x0101
        L_0x00fe:
            r0 = move-exception
            r16 = r3
        L_0x0101:
            r17 = r6
            r18 = r7
        L_0x0105:
            r23 = r10
        L_0x0107:
            if (r2 == 0) goto L_0x0117
        L_0x0109:
            int r14 = r14 + 1
            r1 = r27
            r3 = r16
            r6 = r17
            r7 = r18
            r10 = r23
            goto L_0x0035
        L_0x0117:
            throw r0
        L_0x0118:
            r16 = r3
            r17 = r6
            r18 = r7
            r23 = r10
            int r12 = r12 + 1
            r1 = r27
            goto L_0x0025
        L_0x0126:
            r16 = r3
            r17 = r6
            int r6 = r17 + 1
            r1 = r27
            goto L_0x000e
        L_0x0130:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w54.e(jx0, to5, boolean):java.util.ArrayList");
    }
}
