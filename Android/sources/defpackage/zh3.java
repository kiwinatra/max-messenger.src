package defpackage;

/* renamed from: zh3  reason: default package */
public final class zh3 implements mne {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: g8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: g8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: g8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: g8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: ru.ok.android.externcalls.analytics.events.EventItemsMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: g8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: g8} */
    /* JADX WARNING: type inference failed for: r3v43, types: [java.lang.Object, q40] */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x082f, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r6 != null ? (java.lang.String) r6.c : r1) != false) goto L_0x083f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0316 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xoc r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.a
            switch(r2) {
                case 0: goto L_0x084b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r0.b
            hz0 r2 = (defpackage.hz0) r2
            gm1 r2 = r2.r1
            java.util.Map r2 = r2.A()
            java.lang.Object r3 = r0.b
            hz0 r3 = (defpackage.hz0) r3
            bl1 r4 = r3.Q1
            mz9 r3 = r3.w1
            boolean r5 = r3.e
            boolean r3 = r3.f
            boolean r6 = r4.k
            java.lang.String r7 = "network_type"
            java.lang.String r8 = "vcid"
            if (r6 != 0) goto L_0x002e
            r16 = r7
            r20 = r8
            r1 = 0
            goto L_0x06b6
        L_0x002e:
            xk1 r6 = r4.h
            fx r4 = r4.i
            java.lang.Object r4 = r4.o
            z14 r4 = (defpackage.z14) r4
            nob r10 = r6.h
            java.lang.Long r10 = r10.t()
            if (r10 == 0) goto L_0x06af
            long r10 = r10.longValue()
            kotlin.ranges.LongRange r12 = defpackage.zk1.a
            long r13 = r12.getFirst()
            long r15 = r12.getLast()
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 > 0) goto L_0x0682
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0682
            ru.ok.android.externcalls.analytics.events.EventItemsMap r12 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r12.<init>()
            rt6 r13 = r6.e
            java.lang.Object r13 = r13.b
            kz3 r13 = (defpackage.kz3) r13
            lz3 r13 = (defpackage.lz3) r13
            java.lang.String r13 = r13.a
            r12.set((java.lang.String) r8, (java.lang.String) r13)
            zqd r13 = r6.f
            java.lang.Object r14 = r13.b
            android.net.ConnectivityManager r14 = (android.net.ConnectivityManager) r14
            java.lang.Object r13 = r13.c
            android.telephony.TelephonyManager r13 = (android.telephony.TelephonyManager) r13
            java.lang.String r13 = defpackage.ur9.b(r14, r13)
            r12.set((java.lang.String) r7, (java.lang.String) r13)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "stat_time_delta"
            r12.set((java.lang.String) r11, (java.lang.String) r10)
            uw1 r10 = r24.c()
            if (r10 == 0) goto L_0x053e
            nfd r11 = r6.d
            r11.getClass()
            defpackage.nfd.m(r12, r10)
            java.util.List r11 = r1.c
            java.util.ArrayList r10 = defpackage.f6e.H(r11, r10)
            eud r10 = defpackage.f6e.G(r10)
            kq9 r11 = r6.k
            r15 = -1
            if (r3 != 0) goto L_0x00a6
            r11.h()
        L_0x00a1:
            r9 = r7
            r20 = r8
            goto L_0x0190
        L_0x00a6:
            r11.getClass()
            java.lang.Object r3 = r10.v
            java.util.List r3 = (java.util.List) r3
            boolean r17 = r3.isEmpty()
            if (r17 == 0) goto L_0x00b7
            r11.h()
            goto L_0x00a1
        L_0x00b7:
            java.lang.Object r9 = r11.w
            xga r9 = (defpackage.xga) r9
            boolean r9 = r9.l(r3)
            if (r9 == 0) goto L_0x00c4
            r11.h()
        L_0x00c4:
            java.util.Iterator r3 = r3.iterator()
        L_0x00c8:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x00e0
            java.lang.Object r9 = r3.next()
            r13 = r9
            mie r13 = (defpackage.mie) r13
            java.lang.Boolean r13 = r13.k
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x00c8
            goto L_0x00e1
        L_0x00e0:
            r9 = 0
        L_0x00e1:
            mie r9 = (defpackage.mie) r9
            if (r9 != 0) goto L_0x00eb
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            r11.h()
            goto L_0x00a1
        L_0x00eb:
            yk1[] r3 = defpackage.yk1.b
            java.math.BigInteger r3 = r9.i
            java.lang.Object r13 = r11.a
            xe8 r13 = (defpackage.xe8) r13
            java.math.BigInteger r14 = r9.h
            java.lang.Integer r3 = r13.o(r14, r3)
            java.lang.String r13 = "video_loss"
            r12.set((java.lang.String) r13, (java.lang.Integer) r3)
            long r13 = r9.l
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0115
            java.lang.Object r3 = r11.b
            yl4 r3 = (defpackage.yl4) r3
            long r13 = r3.a(r13)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "nack_received"
            r12.set((java.lang.String) r13, (java.lang.Long) r3)
        L_0x0115:
            long r13 = r9.m
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x012c
            java.lang.Object r3 = r11.c
            yl4 r3 = (defpackage.yl4) r3
            long r13 = r3.a(r13)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "pli_received"
            r12.set((java.lang.String) r13, (java.lang.Long) r3)
        L_0x012c:
            long r13 = r9.n
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0143
            java.lang.Object r3 = r11.o
            yl4 r3 = (defpackage.yl4) r3
            long r13 = r3.a(r13)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r11 = "fir_received"
            r12.set((java.lang.String) r11, (java.lang.Long) r3)
        L_0x0143:
            long r13 = r9.p
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0152
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.lang.String r9 = "adaptation_changes"
            r12.set((java.lang.String) r9, (java.lang.Long) r3)
        L_0x0152:
            lc2 r3 = r1.a
            if (r3 == 0) goto L_0x00a1
            long r13 = r3.a
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x0165
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.String r11 = "br_encode"
            r12.set((java.lang.String) r11, (java.lang.Long) r9)
        L_0x0165:
            long r13 = r3.c
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            r11 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x017c
            r9 = r7
            r20 = r8
            long r7 = (long) r11
            long r13 = r13 / r7
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.String r8 = "br_transmit"
            r12.set((java.lang.String) r8, (java.lang.Long) r7)
            goto L_0x017f
        L_0x017c:
            r9 = r7
            r20 = r8
        L_0x017f:
            long r7 = r3.b
            int r3 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0190
            long r13 = (long) r11
            long r7 = r7 / r13
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "br_retransmit"
            r12.set((java.lang.String) r7, (java.lang.Long) r3)
        L_0x0190:
            fu4 r3 = r6.j
            r3.getClass()
            java.lang.Object r7 = r10.c
            java.util.List r7 = (java.util.List) r7
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x01a6
            r3.h()
            r11 = r9
            r7 = r10
            goto L_0x03ab
        L_0x01a6:
            java.lang.Object r8 = r3.j
            xga r8 = (defpackage.xga) r8
            boolean r8 = r8.l(r7)
            if (r8 == 0) goto L_0x01b3
            r3.h()
        L_0x01b3:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r11 = r7.iterator()
        L_0x01bc:
            boolean r13 = r11.hasNext()
            java.lang.Object r14 = r3.g
            java.util.HashMap r14 = (java.util.HashMap) r14
            if (r13 == 0) goto L_0x020e
            java.lang.Object r13 = r11.next()
            r15 = r13
            lie r15 = (defpackage.lie) r15
            long r0 = r15.p
            r18 = 0
            int r16 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x01db
            r21 = -1
            int r16 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r16 != 0) goto L_0x01e2
        L_0x01db:
            r0 = r23
            r1 = r24
            r15 = -1
            goto L_0x01bc
        L_0x01e2:
            java.lang.String r15 = r15.e
            java.lang.Object r14 = r14.get(r15)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 != 0) goto L_0x01ed
            goto L_0x01f5
        L_0x01ed:
            long r15 = r14.longValue()
            int r15 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r15 <= 0) goto L_0x01f9
        L_0x01f5:
            r8.add(r13)
            goto L_0x01db
        L_0x01f9:
            long r13 = r14.longValue()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0202
            goto L_0x01db
        L_0x0202:
            java.lang.Object r0 = r3.c
            voc r0 = (defpackage.voc) r0
            java.lang.String r1 = "IncomingVideoStatistics"
            java.lang.String r13 = "newFramesReceived < oldFramesReceived"
            r0.log(r1, r13)
            goto L_0x01db
        L_0x020e:
            java.util.Iterator r0 = r7.iterator()
        L_0x0212:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0238
            java.lang.Object r1 = r0.next()
            lie r1 = (defpackage.lie) r1
            r11 = r9
            r7 = r10
            long r9 = r1.p
            r15 = -1
            int r13 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            java.lang.String r1 = r1.e
            if (r13 != 0) goto L_0x0230
            r14.remove(r1)
        L_0x022d:
            r10 = r7
            r9 = r11
            goto L_0x0212
        L_0x0230:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r14.put(r1, r9)
            goto L_0x022d
        L_0x0238:
            r11 = r9
            r7 = r10
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0242
            goto L_0x03ab
        L_0x0242:
            fug r0 = defpackage.fug.a
            long r0 = defpackage.fu4.a(r8, r0)
            yk1[] r9 = defpackage.yk1.b
            java.lang.Object r9 = r3.d
            yl4 r9 = (defpackage.yl4) r9
            long r0 = r9.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "nack_sent"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
            iug r0 = defpackage.iug.a
            long r0 = defpackage.fu4.a(r8, r0)
            java.lang.Object r9 = r3.b
            yl4 r9 = (defpackage.yl4) r9
            long r0 = r9.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "pli_sent"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
            itg r0 = defpackage.itg.a
            long r0 = defpackage.fu4.a(r8, r0)
            java.lang.Object r9 = r3.a
            yl4 r9 = (defpackage.yl4) r9
            long r0 = r9.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "fir_sent"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
            otg r0 = defpackage.otg.a
            long r0 = defpackage.fu4.a(r8, r0)
            java.lang.Object r9 = r3.f
            yl4 r9 = (defpackage.yl4) r9
            long r0 = r9.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "frames_dropped"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
            cug r0 = defpackage.cug.a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, 10)
            r1.<init>(r9)
            java.util.Iterator r9 = r8.iterator()
        L_0x02af:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02cd
            java.lang.Object r10 = r9.next()
            lie r10 = (defpackage.lie) r10
            java.lang.Object r10 = r0.invoke(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r13 = r10.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r1.add(r10)
            goto L_0x02af
        L_0x02cd:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02d6:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x02f1
            java.lang.Object r9 = r1.next()
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10
            long r13 = r10.longValue()
            r15 = -1
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto L_0x02d6
            r0.add(r9)
            goto L_0x02d6
        L_0x02f1:
            double r0 = kotlin.collections.CollectionsKt___CollectionsKt.averageOfLong(r0)
            boolean r9 = java.lang.Double.isInfinite(r0)
            if (r9 != 0) goto L_0x030d
            boolean r9 = java.lang.Double.isNaN(r0)
            if (r9 != 0) goto L_0x030d
            yk1[] r9 = defpackage.yk1.b
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "jitter_video"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x030d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L_0x0316:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0354
            java.lang.Object r9 = r1.next()
            lie r9 = (defpackage.lie) r9
            long r13 = r9.o
            r15 = -1
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 == 0) goto L_0x034d
            r15 = 0
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x0331
            goto L_0x034d
        L_0x0331:
            double r13 = (double) r13
            java.lang.Double r10 = r9.t
            if (r10 != 0) goto L_0x0337
            goto L_0x034d
        L_0x0337:
            double r15 = r10.doubleValue()
            java.lang.Double r9 = r9.u
            if (r9 != 0) goto L_0x0340
            goto L_0x034d
        L_0x0340:
            double r9 = r9.doubleValue()
            double r9 = r9 * r9
            double r9 = r9 / r13
            double r15 = r15 - r9
            double r15 = r15 / r13
            java.lang.Double r9 = java.lang.Double.valueOf(r15)
            goto L_0x034e
        L_0x034d:
            r9 = 0
        L_0x034e:
            if (r9 == 0) goto L_0x0316
            r0.add(r9)
            goto L_0x0316
        L_0x0354:
            double r0 = kotlin.collections.CollectionsKt___CollectionsKt.averageOfDouble(r0)
            boolean r9 = java.lang.Double.isInfinite(r0)
            if (r9 != 0) goto L_0x0375
            boolean r9 = java.lang.Double.isNaN(r0)
            if (r9 != 0) goto L_0x0375
            yk1[] r9 = defpackage.yk1.b
            r9 = 1000000(0xf4240, float:1.401298E-39)
            double r9 = (double) r9
            double r0 = r0 * r9
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "interframe_delay_variance"
            r12.set((java.lang.String) r1, (java.lang.Float) r0)
        L_0x0375:
            lug r0 = defpackage.lug.a
            long r0 = defpackage.fu4.a(r8, r0)
            yk1[] r9 = defpackage.yk1.b
            java.lang.Object r9 = r3.h
            yl4 r9 = (defpackage.yl4) r9
            long r0 = r9.a(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "freeze_count"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
            pug r0 = defpackage.pug.a
            long r0 = defpackage.fu4.a(r8, r0)
            java.lang.Object r3 = r3.i
            yl4 r3 = (defpackage.yl4) r3
            long r0 = r3.a(r0)
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x03ab
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "total_freezes_duration"
            r12.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x03ab:
            d19 r0 = r6.l
            if (r5 != 0) goto L_0x03b9
            java.lang.Object r0 = r0.a
            xe8 r0 = (defpackage.xe8) r0
            r1 = 0
            r0.b = r1
            r0.c = r1
            goto L_0x03ff
        L_0x03b9:
            r1 = 0
            r0.getClass()
            java.lang.Object r3 = r7.o
            java.util.List r3 = (java.util.List) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x03d0
            java.lang.Object r0 = r0.a
            xe8 r0 = (defpackage.xe8) r0
            r0.b = r1
            r0.c = r1
            goto L_0x03ff
        L_0x03d0:
            java.lang.Object r5 = r0.c
            xga r5 = (defpackage.xga) r5
            boolean r5 = r5.l(r3)
            if (r5 == 0) goto L_0x03e2
            java.lang.Object r5 = r0.a
            xe8 r5 = (defpackage.xe8) r5
            r5.b = r1
            r5.c = r1
        L_0x03e2:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            iie r1 = (defpackage.iie) r1
            if (r1 != 0) goto L_0x03ec
            r1 = 0
            goto L_0x03ff
        L_0x03ec:
            java.math.BigInteger r3 = r1.h
            java.lang.Object r0 = r0.b
            xe8 r0 = (defpackage.xe8) r0
            java.math.BigInteger r1 = r1.i
            java.lang.Integer r0 = r0.o(r3, r1)
            xga r1 = new xga
            r3 = 13
            r1.<init>(r3, r0)
        L_0x03ff:
            yk1[] r0 = defpackage.yk1.b
            if (r1 == 0) goto L_0x0408
            java.lang.Object r0 = r1.b
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0409
        L_0x0408:
            r0 = 0
        L_0x0409:
            java.lang.String r1 = "audio_loss"
            r12.set((java.lang.String) r1, (java.lang.Integer) r0)
            ay2 r0 = r6.i
            r0.getClass()
            java.lang.Object r1 = r7.b
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0426
            r0.reset()
        L_0x0420:
            r16 = r11
            r15 = r12
            r3 = 0
            goto L_0x0502
        L_0x0426:
            java.lang.Object r3 = r0.y
            xga r3 = (defpackage.xga) r3
            boolean r3 = r3.l(r1)
            if (r3 == 0) goto L_0x0433
            r0.reset()
        L_0x0433:
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            hie r1 = (defpackage.hie) r1
            long r7 = r1.m
            java.lang.Object r3 = r0.b
            yl4 r3 = (defpackage.yl4) r3
            long r7 = r3.a(r7)
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0420
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0450
            goto L_0x0420
        L_0x0450:
            q40 r3 = new q40
            r3.<init>()
            r5 = 0
            r3.a = r5
            r3.b = r5
            r3.c = r5
            r3.o = r5
            r3.v = r5
            r3.w = r5
            java.lang.Object r5 = r0.c
            yl4 r5 = (defpackage.yl4) r5
            long r9 = r1.n
            long r9 = r5.a(r9)
            r13 = -1
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x047f
            float r5 = (float) r9
            float r9 = (float) r7
            float r5 = r5 / r9
            float r9 = (float) r13
            float r5 = r5 * r9
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3.a = r5
        L_0x047f:
            java.lang.Object r5 = r0.o
            yl4 r5 = (defpackage.yl4) r5
            long r9 = r1.o
            long r9 = r5.a(r9)
            r14 = -1
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x049a
            float r5 = (float) r9
            float r9 = (float) r7
            float r5 = r5 / r9
            float r9 = (float) r13
            float r5 = r5 * r9
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3.b = r5
        L_0x049a:
            java.lang.Object r5 = r0.v
            yl4 r5 = (defpackage.yl4) r5
            long r9 = r1.p
            long r9 = r5.a(r9)
            r14 = -1
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x04b5
            float r14 = (float) r9
            float r15 = (float) r7
            float r14 = r14 / r15
            float r15 = (float) r13
            float r14 = r14 * r15
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r3.c = r14
        L_0x04b5:
            java.lang.Object r14 = r0.w
            yl4 r14 = (defpackage.yl4) r14
            r16 = r11
            r15 = r12
            long r11 = r1.q
            long r11 = r14.a(r11)
            r21 = -1
            int r14 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r14 == 0) goto L_0x04d3
            float r11 = (float) r11
            float r7 = (float) r7
            float r11 = r11 / r7
            float r7 = (float) r13
            float r11 = r11 * r7
            java.lang.Float r7 = java.lang.Float.valueOf(r11)
            r3.v = r7
        L_0x04d3:
            java.lang.Object r0 = r0.x
            yl4 r0 = (defpackage.yl4) r0
            long r7 = r1.r
            long r7 = r0.a(r7)
            r11 = -1
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x04f4
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x04f4
            if (r5 == 0) goto L_0x04f4
            float r0 = (float) r9
            float r5 = (float) r7
            float r0 = r0 / r5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.w = r0
        L_0x04f4:
            long r0 = r1.k
            r7 = -1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0502
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.o = r0
        L_0x0502:
            if (r3 != 0) goto L_0x0506
            r5 = r15
            goto L_0x0543
        L_0x0506:
            java.lang.Object r0 = r3.a
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "inserted_audio_samples_for_deceleration"
            r5 = r15
            r5.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.b
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "removed_audio_samples_for_acceleration"
            r5.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.c
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealed_audio_samples"
            r5.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.o
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r1 = "jitter_audio"
            r5.set((java.lang.String) r1, (java.lang.Long) r0)
            java.lang.Object r0 = r3.v
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealed_silent_audio_samples"
            r5.set((java.lang.String) r1, (java.lang.Float) r0)
            java.lang.Object r0 = r3.w
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.String r1 = "concealment_audio_avg_size"
            r5.set((java.lang.String) r1, (java.lang.Float) r0)
            goto L_0x0543
        L_0x053e:
            r16 = r7
            r20 = r8
            r5 = r12
        L_0x0543:
            d6a r0 = r6.c
            r0.d(r5)
            g6d r0 = r6.m
            if (r2 == 0) goto L_0x05cc
            r0.getClass()
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0557
            goto L_0x05cc
        L_0x0557:
            java.util.Set r1 = r2.keySet()
            java.lang.Object r3 = r0.o
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r3 != 0) goto L_0x0574
            java.lang.Object r3 = r0.b
            vs6 r3 = (defpackage.vs6) r3
            r7 = 0
            r3.b = r7
            java.lang.Object r3 = r0.c
            vs6 r3 = (defpackage.vs6) r3
            r3.b = r7
            r0.o = r1
        L_0x0574:
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x057d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x058f
            java.lang.Object r7 = r1.next()
            jhd r7 = (defpackage.jhd) r7
            hf6 r7 = r7.p
            int r7 = r7.a
            int r3 = r3 + r7
            goto L_0x057d
        L_0x058f:
            long r7 = (long) r3
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x059a:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x05ac
            java.lang.Object r9 = r1.next()
            jhd r9 = (defpackage.jhd) r9
            hf6 r9 = r9.p
            long r9 = r9.b
            long r2 = r2 + r9
            goto L_0x059a
        L_0x05ac:
            p7d r1 = new p7d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object r8 = r0.b
            vs6 r8 = (defpackage.vs6) r8
            java.lang.Long r7 = r8.y(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.c
            vs6 r0 = (defpackage.vs6) r0
            java.lang.Long r0 = r0.y(r2)
            r2 = 27
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r0)
            goto L_0x05da
        L_0x05cc:
            java.lang.Object r1 = r0.b
            vs6 r1 = (defpackage.vs6) r1
            r2 = 0
            r1.b = r2
            java.lang.Object r0 = r0.c
            vs6 r0 = (defpackage.vs6) r0
            r0.b = r2
            r1 = 0
        L_0x05da:
            if (r1 != 0) goto L_0x05dd
            goto L_0x05fe
        L_0x05dd:
            yk1[] r0 = defpackage.yk1.b
            java.lang.Object r0 = r1.b
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.String r2 = "ss_freeze_count"
            r5.set((java.lang.String) r2, (java.lang.Long) r0)
            java.lang.Object r0 = r1.c
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L_0x05ef
            goto L_0x05f9
        L_0x05ef:
            long r1 = r0.longValue()
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x05fe
        L_0x05f9:
            java.lang.String r1 = "ss_total_freezes_duration"
            r5.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x05fe:
            pf6 r0 = r6.n
            r0.getClass()
            if (r4 != 0) goto L_0x0606
            goto L_0x0618
        L_0x0606:
            yk1[] r0 = defpackage.yk1.b
            r0 = 100
            float r0 = (float) r0
            float r1 = r4.a
            float r1 = r1 * r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "cpu_usage_percent_total"
            r5.set((java.lang.String) r1, (java.lang.Long) r0)
        L_0x0618:
            rjf r0 = r6.g
            sjf r0 = (defpackage.sjf) r0
            java.lang.Long r0 = r0.a()
            if (r0 == 0) goto L_0x0680
            java.lang.String r1 = "timestamp"
            r5.set((java.lang.String) r1, (java.lang.Long) r0)
            java.util.Map r0 = r5.getItems()
            java.util.Set r0 = r0.keySet()
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x063a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x063a
            goto L_0x0680
        L_0x063a:
            java.util.Iterator r0 = r0.iterator()
        L_0x063e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0680
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Set r2 = defpackage.xk1.o
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x063e
            ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent$Builder r0 = new ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent$Builder
            r0.<init>()
            r0.addAll((ru.ok.android.externcalls.analytics.events.EventItemsMap) r5)
            ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent r0 = r0.build()
            java.util.Map r1 = r0.getItems()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "callStat: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "CallStatLog"
            voc r3 = r6.b
            r3.log(r2, r1)
            p7d r1 = r6.a
            java.lang.Object r1 = r1.c
            ru.ok.android.externcalls.analytics.CallAnalyticsSender r1 = (ru.ok.android.externcalls.analytics.CallAnalyticsSender) r1
            r1.send(r0)
        L_0x0680:
            r1 = 0
            goto L_0x06b4
        L_0x0682:
            r16 = r7
            r20 = r8
            ay2 r0 = r6.i
            r0.reset()
            fu4 r0 = r6.j
            r0.h()
            d19 r0 = r6.l
            java.lang.Object r0 = r0.a
            xe8 r0 = (defpackage.xe8) r0
            r1 = 0
            r0.b = r1
            r0.c = r1
            kq9 r0 = r6.k
            r0.h()
            g6d r0 = r6.m
            java.lang.Object r2 = r0.b
            vs6 r2 = (defpackage.vs6) r2
            r2.b = r1
            java.lang.Object r0 = r0.c
            vs6 r0 = (defpackage.vs6) r0
            r0.b = r1
            goto L_0x06b4
        L_0x06af:
            r16 = r7
            r20 = r8
            goto L_0x0680
        L_0x06b4:
            r0 = r23
        L_0x06b6:
            java.lang.Object r2 = r0.b
            hz0 r2 = (defpackage.hz0) r2
            bl1 r2 = r2.Q1
            r2.getClass()
            uw1 r3 = r24.c()
            if (r3 != 0) goto L_0x06c7
            r4 = r1
            goto L_0x06fb
        L_0x06c7:
            ru.ok.android.externcalls.analytics.events.EventItemsMap r4 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r4.<init>()
            nfd r5 = r2.c
            r5.getClass()
            defpackage.nfd.m(r4, r3)
            d6a r3 = r2.b
            r3.d(r4)
            rt6 r3 = r2.d
            java.lang.Object r3 = r3.b
            kz3 r3 = (defpackage.kz3) r3
            lz3 r3 = (defpackage.lz3) r3
            java.lang.String r3 = r3.a
            r5 = r20
            r4.set((java.lang.String) r5, (java.lang.String) r3)
            zqd r3 = r2.e
            java.lang.Object r5 = r3.b
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            java.lang.Object r3 = r3.c
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = defpackage.ur9.b(r5, r3)
            r5 = r16
            r4.set((java.lang.String) r5, (java.lang.String) r3)
        L_0x06fb:
            if (r4 != 0) goto L_0x0701
            r3 = r24
            goto L_0x083f
        L_0x0701:
            q01 r3 = r2.l
            r3.i = r4
            d51 r3 = r2.j
            r3.getClass()
            java.util.Map r4 = r4.getItems()
            java.util.Map r4 = kotlin.collections.MapsKt.toMutableMap(r4)
            java.util.List r5 = defpackage.d51.e
            java.util.Iterator r5 = r5.iterator()
        L_0x0718:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0728
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r4.remove(r6)
            goto L_0x0718
        L_0x0728:
            ru.ok.android.externcalls.analytics.events.EventItemsMap r5 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            r5.<init>(r4)
            r3.c = r5
            java.util.ArrayList r4 = r3.d
            java.util.Iterator r6 = r4.iterator()
        L_0x0735:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0745
            java.lang.Object r7 = r6.next()
            rsg r7 = (defpackage.rsg) r7
            r3.b(r7, r5)
            goto L_0x0735
        L_0x0745:
            r4.clear()
            h8 r2 = r2.m
            r2.getClass()
            r3 = r24
            java.util.List r4 = r3.c
            java.util.Iterator r5 = r4.iterator()
        L_0x0755:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0773
            java.lang.Object r6 = r5.next()
            r7 = r6
            nie r7 = (defpackage.nie) r7
            boolean r8 = r7 instanceof defpackage.mie
            if (r8 == 0) goto L_0x0755
            mie r7 = (defpackage.mie) r7
            java.lang.Boolean r7 = r7.k
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0755
            goto L_0x0774
        L_0x0773:
            r6 = r1
        L_0x0774:
            nie r6 = (defpackage.nie) r6
            if (r6 == 0) goto L_0x0780
            g8 r5 = new g8
            aqg r6 = r6.f
            r5.<init>(r6)
            goto L_0x0781
        L_0x0780:
            r5 = r1
        L_0x0781:
            java.util.Iterator r4 = r4.iterator()
        L_0x0785:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x07a3
            java.lang.Object r6 = r4.next()
            r7 = r6
            nie r7 = (defpackage.nie) r7
            boolean r8 = r7 instanceof defpackage.iie
            if (r8 == 0) goto L_0x0785
            iie r7 = (defpackage.iie) r7
            java.lang.Boolean r7 = r7.k
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0785
            goto L_0x07a4
        L_0x07a3:
            r6 = r1
        L_0x07a4:
            nie r6 = (defpackage.nie) r6
            if (r6 == 0) goto L_0x07b0
            g8 r4 = new g8
            aqg r6 = r6.f
            r4.<init>(r6)
            goto L_0x07b1
        L_0x07b0:
            r4 = r1
        L_0x07b1:
            j8 r6 = r2.b
            boolean r7 = r6.b
            if (r7 != 0) goto L_0x07b8
            goto L_0x07fe
        L_0x07b8:
            java.lang.Object r7 = r6.e
            g8 r7 = (defpackage.g8) r7
            if (r7 == 0) goto L_0x07c1
            java.lang.String r7 = r7.b
            goto L_0x07c2
        L_0x07c1:
            r7 = r1
        L_0x07c2:
            if (r5 == 0) goto L_0x07c7
            java.lang.String r8 = r5.b
            goto L_0x07c8
        L_0x07c7:
            r8 = r1
        L_0x07c8:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x07cf
            goto L_0x07fe
        L_0x07cf:
            if (r5 != 0) goto L_0x07d5
            r6.a()
            goto L_0x07fe
        L_0x07d5:
            java.lang.Object r7 = r6.c
            rjf r7 = (defpackage.rjf) r7
            sjf r7 = (defpackage.sjf) r7
            r7.getClass()
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r9 = r6.e
            g8 r9 = (defpackage.g8) r9
            if (r9 == 0) goto L_0x07f7
            long r10 = r6.a
            long r10 = r7 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r11 = r6.d
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            r11.invoke(r9, r10)
        L_0x07f7:
            r6.a = r7
            r6.e = r5
            r5 = 1
            r6.b = r5
        L_0x07fe:
            zqd r2 = r2.c
            if (r4 == 0) goto L_0x083c
            java.lang.Object r5 = r2.c
            g8 r5 = (defpackage.g8) r5
            if (r5 == 0) goto L_0x080b
            java.lang.String r6 = r5.b
            goto L_0x080c
        L_0x080b:
            r6 = r1
        L_0x080c:
            java.lang.String r7 = r4.b
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0832
            if (r5 == 0) goto L_0x081f
            aqg r5 = r5.a
            if (r5 == 0) goto L_0x081f
            java.lang.Object r5 = r5.c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0820
        L_0x081f:
            r5 = r1
        L_0x0820:
            aqg r6 = r4.a
            if (r6 == 0) goto L_0x082a
            java.lang.Object r1 = r6.c
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x082b
        L_0x082a:
            r9 = r1
        L_0x082b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r9)
            if (r1 == 0) goto L_0x0832
            goto L_0x083f
        L_0x0832:
            java.lang.Object r1 = r2.b
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r1.invoke(r4)
            r2.c = r4
            goto L_0x083f
        L_0x083c:
            r2.getClass()
        L_0x083f:
            java.lang.Object r0 = r0.b
            hz0 r0 = (defpackage.hz0) r0
            jc1 r0 = r0.U1
            x9d r0 = r0.u
            r0.onRtcStats(r3)
            return
        L_0x084b:
            r3 = r1
            java.util.List r1 = r3.d
            java.util.Iterator r1 = r1.iterator()
        L_0x0852:
            boolean r2 = r1.hasNext()
            java.lang.String r4 = "ConnectionLogger"
            java.lang.Object r5 = r0.b
            voc r5 = (defpackage.voc) r5
            if (r2 == 0) goto L_0x089d
            java.lang.Object r2 = r1.next()
            uw1 r2 = (defpackage.uw1) r2
            boolean r6 = r2.k
            if (r6 == 0) goto L_0x0852
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Active connection: "
            r6.<init>(r7)
            java.lang.String r7 = r2.c
            r6.append(r7)
            java.lang.String r7 = "("
            r6.append(r7)
            java.lang.String r8 = r2.b
            r6.append(r8)
            java.lang.String r8 = ") -> "
            r6.append(r8)
            java.lang.String r8 = r2.f
            r6.append(r8)
            r6.append(r7)
            java.lang.String r2 = r2.e
            r6.append(r2)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.log(r4, r2)
            goto L_0x0852
        L_0x089d:
            java.util.List r0 = r3.c
            java.util.Iterator r0 = r0.iterator()
        L_0x08a3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x08b7
            java.lang.Object r1 = r0.next()
            nie r1 = (defpackage.nie) r1
            java.lang.String r1 = r1.toString()
            r5.log(r4, r1)
            goto L_0x08a3
        L_0x08b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh3.a(xoc):void");
    }
}
