package defpackage;

/* renamed from: p82  reason: default package */
public abstract class p82 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0202, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0759 A[Catch:{ all -> 0x0763 }, LOOP:31: B:512:0x0753->B:514:0x0759, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0798 A[Catch:{ all -> 0x07a2 }, LOOP:32: B:528:0x0792->B:530:0x0798, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x07ec A[LOOP:33: B:546:0x07e6->B:548:0x07ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0805  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0811 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0774 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x07b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:627:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.r82 a(defpackage.pf9 r27) {
        /*
            r1 = r27
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            ws r5 = new ws
            r6 = 0
            r5.<init>((java.lang.Object) r6)
            ws r7 = new ws
            r7.<init>((java.lang.Object) r6)
            java.lang.Class<q82> r0 = defpackage.q82.class
            java.util.EnumSet r14 = java.util.EnumSet.noneOf(r0)
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            java.util.EnumMap r15 = new java.util.EnumMap
            r15.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Class<a26> r0 = defpackage.a26.class
            java.util.EnumSet r12 = java.util.EnumSet.noneOf(r0)
            int r0 = defpackage.ryg.e0(r27)     // Catch:{ all -> 0x0032 }
            r10 = r0
            goto L_0x0068
        L_0x0032:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r3, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x004f
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r10)
            goto L_0x003f
        L_0x004f:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.gga.m()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0067
            if (r0 == r2) goto L_0x0066
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0066:
            throw r10
        L_0x0067:
            r10 = 0
        L_0x0068:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r16 = r7
            r9 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0077:
            if (r9 >= r10) goto L_0x07cc
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x007e }
            goto L_0x00bb
        L_0x007e:
            r0 = move-exception
            r11 = r0
            defpackage.z68.o(r4, r3, r11)     // Catch:{ all -> 0x009d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x009d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x009d }
        L_0x008b:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x009d }
            if (r24 == 0) goto L_0x00a2
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x009d }
            r6 = r24
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x009d }
            r6.a(r11)     // Catch:{ all -> 0x009d }
            goto L_0x008b
        L_0x009d:
            r0 = move-exception
            r6 = r16
            goto L_0x07db
        L_0x00a2:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x009d }
            r0.getClass()     // Catch:{ all -> 0x009d }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x009d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x00ba
            if (r0 == r2) goto L_0x00b9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x009d }
            r0.<init>()     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x00b9:
            throw r11     // Catch:{ all -> 0x009d }
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 == 0) goto L_0x07c1
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x009d }
            int r6 = r0.hashCode()     // Catch:{ all -> 0x00f5 }
            switch(r6) {
                case -1785238953: goto L_0x06ac;
                case -1249474914: goto L_0x05b4;
                case -854547461: goto L_0x04fd;
                case -8339209: goto L_0x04bd;
                case 3355: goto L_0x046e;
                case 96632902: goto L_0x041f;
                case 110371416: goto L_0x03d0;
                case 598683239: goto L_0x037e;
                case 829468971: goto L_0x0331;
                case 1340337839: goto L_0x029a;
                case 1942574248: goto L_0x0206;
                case 2023524447: goto L_0x00c8;
                default: goto L_0x00c6;
            }     // Catch:{ all -> 0x00f5 }
        L_0x00c6:
            goto L_0x06b4
        L_0x00c8:
            java.lang.String r6 = "filterSubjects"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00d2
            goto L_0x06b4
        L_0x00d2:
            int r0 = defpackage.ryg.e0(r27)     // Catch:{ all -> 0x00d8 }
            r6 = r0
            goto L_0x0113
        L_0x00d8:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x00e5:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x00fa
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r7 = (defpackage.xm) r7     // Catch:{ all -> 0x00f5 }
            r7.a(r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x00e5
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            r6 = r16
            goto L_0x0787
        L_0x00fa:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0112
            if (r0 == r2) goto L_0x0111
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0111:
            throw r6     // Catch:{ all -> 0x00f5 }
        L_0x0112:
            r6 = 0
        L_0x0113:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            r7 = 0
        L_0x0116:
            if (r7 >= r6) goto L_0x01c9
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x011d }
            goto L_0x015a
        L_0x011d:
            r0 = move-exception
            r11 = r0
            defpackage.z68.o(r4, r3, r11)     // Catch:{ all -> 0x013d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x013d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x013d }
        L_0x012a:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x013d }
            if (r24 == 0) goto L_0x0140
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x013d }
            r2 = r24
            xm r2 = (defpackage.xm) r2     // Catch:{ all -> 0x013d }
            r2.a(r11)     // Catch:{ all -> 0x013d }
            r2 = 1
            goto L_0x012a
        L_0x013d:
            r0 = move-exception
            goto L_0x01cc
        L_0x0140:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x013d }
            r0.getClass()     // Catch:{ all -> 0x013d }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x013d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x0159
            r2 = 1
            if (r0 == r2) goto L_0x0158
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x013d }
            r0.<init>()     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x0158:
            throw r11     // Catch:{ all -> 0x013d }
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r0 != 0) goto L_0x015e
        L_0x015c:
            r2 = 1
            goto L_0x01c6
        L_0x015e:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0169 }
            q82 r0 = defpackage.q82.valueOf(r0)     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0169 }
            goto L_0x0174
        L_0x0169:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x013d }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x013d }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x013d }
        L_0x0174:
            boolean r2 = kotlin.Result.m30isSuccessimpl(r0)     // Catch:{ all -> 0x013d }
            if (r2 == 0) goto L_0x0184
            r2 = r0
            q82 r2 = (defpackage.q82) r2     // Catch:{ all -> 0x013d }
            java.lang.Object r11 = defpackage.gsg.t(r2, r1)     // Catch:{ all -> 0x013d }
            r15.put(r2, r11)     // Catch:{ all -> 0x013d }
        L_0x0184:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x015c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x013d }
            r27.A()     // Catch:{ all -> 0x0190 }
            goto L_0x015c
        L_0x0190:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x013d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x013d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x013d }
        L_0x019d:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x013d }
            if (r11 == 0) goto L_0x01ad
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x013d }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x013d }
            r11.a(r2)     // Catch:{ all -> 0x013d }
            goto L_0x019d
        L_0x01ad:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x013d }
            r0.getClass()     // Catch:{ all -> 0x013d }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x013d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x013d }
            if (r0 == 0) goto L_0x015c
            r11 = 1
            if (r0 == r11) goto L_0x01c5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x013d }
            r0.<init>()     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x01c5:
            throw r2     // Catch:{ all -> 0x013d }
        L_0x01c6:
            int r7 = r7 + r2
            goto L_0x0116
        L_0x01c9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x013d }
            goto L_0x0200
        L_0x01cc:
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x01d7:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x01d7
        L_0x01e7:
            gga r2 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r2.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r2 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0200
            r6 = 1
            if (r2 == r6) goto L_0x01ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x01ff:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0200:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
        L_0x0202:
            r6 = r16
            goto L_0x07bd
        L_0x0206:
            java.lang.String r2 = "include"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x0210
            goto L_0x06b4
        L_0x0210:
            int r0 = defpackage.ryg.X(r27)     // Catch:{ all -> 0x0216 }
            r2 = r0
            goto L_0x024d
        L_0x0216:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x0223:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x0223
        L_0x0233:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x024c
            r6 = 1
            if (r0 == r6) goto L_0x024b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x024b:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x024c:
            r2 = 0
        L_0x024d:
            r6 = 0
        L_0x024e:
            if (r6 >= r2) goto L_0x0296
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            long r25 = defpackage.ryg.n0(r27)     // Catch:{ all -> 0x025f }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x025f }
            r5.add(r0)     // Catch:{ all -> 0x025f }
        L_0x025d:
            r7 = 1
            goto L_0x0294
        L_0x025f:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x026b:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x027b
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x026b
        L_0x027b:
            gga r7 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r7.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r7 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x025d
            r11 = 1
            if (r7 == r11) goto L_0x0293
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0293:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0294:
            int r6 = r6 + r7
            goto L_0x024e
        L_0x0296:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x029a:
            java.lang.String r2 = "widgets"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x02a4
            goto L_0x06b4
        L_0x02a4:
            int r0 = defpackage.ryg.X(r27)     // Catch:{ all -> 0x02a9 }
            goto L_0x02e0
        L_0x02a9:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x02b6:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x02c6
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x02b6
        L_0x02c6:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x02df
            r6 = 1
            if (r0 == r6) goto L_0x02de
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x02de:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x02df:
            r0 = 0
        L_0x02e0:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x02e3:
            if (r2 >= r0) goto L_0x02f6
            r56 r6 = defpackage.q56.a(r27)     // Catch:{ all -> 0x02f2 }
            if (r6 == 0) goto L_0x02f0
            r13.add(r6)     // Catch:{ all -> 0x02f2 }
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x02f2 }
        L_0x02f0:
            r6 = 1
            goto L_0x02f4
        L_0x02f2:
            r0 = move-exception
            goto L_0x02f9
        L_0x02f4:
            int r2 = r2 + r6
            goto L_0x02e3
        L_0x02f6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x02f2 }
            goto L_0x032d
        L_0x02f9:
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x0304:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x0314
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0304
        L_0x0314:
            gga r2 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r2.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r2 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x032d
            r6 = 1
            if (r2 == r6) goto L_0x032c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x032c:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x032d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x0331:
            java.lang.String r2 = "hideEmpty"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x033b
            goto L_0x06b4
        L_0x033b:
            boolean r0 = defpackage.ryg.Y(r27)     // Catch:{ all -> 0x0342 }
            r23 = r0
            goto L_0x037a
        L_0x0342:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x034f:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x035f
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x034f
        L_0x035f:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0378
            r6 = 1
            if (r0 == r6) goto L_0x0377
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0377:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0378:
            r23 = 0
        L_0x037a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x037e:
            java.lang.String r2 = "creatorId"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x03cb }
            if (r0 != 0) goto L_0x0388
            goto L_0x06b4
        L_0x0388:
            r6 = 0
            long r18 = defpackage.ryg.d0(r1, r6)     // Catch:{ all -> 0x038f }
            goto L_0x03c7
        L_0x038f:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x039c:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x03ac
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x039c
        L_0x03ac:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x03c5
            r11 = 1
            if (r0 == r11) goto L_0x03c4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x03c4:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x03c5:
            r18 = r6
        L_0x03c7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x03cb:
            r0 = move-exception
            r6 = 0
            goto L_0x00f6
        L_0x03d0:
            r6 = 0
            java.lang.String r2 = "title"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x03dc
            goto L_0x06b4
        L_0x03dc:
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x03e3 }
            r21 = r0
            goto L_0x041b
        L_0x03e3:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x03f0:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0400
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x03f0
        L_0x0400:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0419
            r11 = 1
            if (r0 == r11) goto L_0x0418
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0418:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0419:
            r21 = 0
        L_0x041b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x041f:
            r6 = 0
            java.lang.String r2 = "emoji"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x042b
            goto L_0x06b4
        L_0x042b:
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x0432 }
            r22 = r0
            goto L_0x046a
        L_0x0432:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x043f:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x044f
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x043f
        L_0x044f:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0468
            r11 = 1
            if (r0 == r11) goto L_0x0467
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0467:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0468:
            r22 = 0
        L_0x046a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x046e:
            r6 = 0
            java.lang.String r2 = "id"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x047a
            goto L_0x06b4
        L_0x047a:
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x0481 }
            r20 = r0
            goto L_0x04b9
        L_0x0481:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x048e:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x049e
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x048e
        L_0x049e:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x04b7
            r11 = 1
            if (r0 == r11) goto L_0x04b6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x04b6:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x04b7:
            r20 = 0
        L_0x04b9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x04bd:
            r6 = 0
            java.lang.String r2 = "elements"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x04c9
            goto L_0x06b4
        L_0x04c9:
            hb9 r0 = r27.n()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.a()     // Catch:{ all -> 0x00f5 }
            r2 = 7
            if (r0 != r2) goto L_0x04ee
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            int r2 = r27.t0()     // Catch:{ all -> 0x00f5 }
            r11 = 0
        L_0x04de:
            if (r11 >= r2) goto L_0x04f5
            ra9 r6 = defpackage.qa9.a(r27)     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x04e9
            r0.add(r6)     // Catch:{ all -> 0x00f5 }
        L_0x04e9:
            r6 = 1
            int r11 = r11 + r6
            r6 = 0
            goto L_0x04de
        L_0x04ee:
            r27.A()     // Catch:{ all -> 0x00f5 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00f5 }
        L_0x04f5:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00f5 }
            java.util.List r8 = kotlin.collections.CollectionsKt.filterNotNull(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x04fd:
            java.lang.String r2 = "filters"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x0507
            goto L_0x06b4
        L_0x0507:
            int r0 = defpackage.ryg.X(r27)     // Catch:{ all -> 0x050d }
            r2 = r0
            goto L_0x0544
        L_0x050d:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x051a:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x052a
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x051a
        L_0x052a:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0543
            r6 = 1
            if (r0 == r6) goto L_0x0542
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0542:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x0543:
            r2 = 0
        L_0x0544:
            r6 = 0
        L_0x0545:
            if (r6 >= r2) goto L_0x05b0
            java.lang.String r0 = defpackage.ryg.g0(r27)     // Catch:{ all -> 0x054c }
            goto L_0x0583
        L_0x054c:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r3, r7)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x0559:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0569
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x00f5 }
            r11.a(r7)     // Catch:{ all -> 0x00f5 }
            goto L_0x0559
        L_0x0569:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0582
            r11 = 1
            if (r0 == r11) goto L_0x0581
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x0581:
            throw r7     // Catch:{ all -> 0x00f5 }
        L_0x0582:
            r0 = 0
        L_0x0583:
            if (r0 == 0) goto L_0x05ad
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x0590 }
            q82 r0 = defpackage.q82.valueOf(r0)     // Catch:{ all -> 0x0590 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0590 }
            goto L_0x059b
        L_0x0590:
            r0 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x00f5 }
        L_0x059b:
            boolean r7 = kotlin.Result.m29isFailureimpl(r0)     // Catch:{ all -> 0x00f5 }
            if (r7 == 0) goto L_0x05a2
            r0 = 0
        L_0x05a2:
            q82 r0 = (defpackage.q82) r0     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x05ab
            r14.add(r0)     // Catch:{ all -> 0x00f5 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
        L_0x05ab:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
        L_0x05ad:
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0545
        L_0x05b0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x05b4:
            java.lang.String r2 = "options"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x05be
            goto L_0x06b4
        L_0x05be:
            int r0 = defpackage.ryg.X(r27)     // Catch:{ all -> 0x05c4 }
            r2 = r0
            goto L_0x05fb
        L_0x05c4:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x05d1:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r6 == 0) goto L_0x05e1
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x00f5 }
            r6.a(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x05d1
        L_0x05e1:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x05fa
            r6 = 1
            if (r0 == r6) goto L_0x05f9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x05f9:
            throw r2     // Catch:{ all -> 0x00f5 }
        L_0x05fa:
            r2 = 0
        L_0x05fb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            r6 = 0
        L_0x05fe:
            if (r6 >= r2) goto L_0x0671
            int r0 = defpackage.ryg.c0(r27)     // Catch:{ all -> 0x0606 }
        L_0x0604:
            r7 = -1
            goto L_0x0642
        L_0x0606:
            r0 = move-exception
            r11 = r0
            defpackage.z68.o(r4, r3, r11)     // Catch:{ all -> 0x0625 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x0625 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0625 }
        L_0x0613:
            boolean r24 = r0.hasNext()     // Catch:{ all -> 0x0625 }
            if (r24 == 0) goto L_0x0627
            java.lang.Object r24 = r0.next()     // Catch:{ all -> 0x0625 }
            r7 = r24
            xm r7 = (defpackage.xm) r7     // Catch:{ all -> 0x0625 }
            r7.a(r11)     // Catch:{ all -> 0x0625 }
            goto L_0x0613
        L_0x0625:
            r0 = move-exception
            goto L_0x0674
        L_0x0627:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x0625 }
            r0.getClass()     // Catch:{ all -> 0x0625 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x0625 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0625 }
            if (r0 == 0) goto L_0x0640
            r7 = 1
            if (r0 == r7) goto L_0x063f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0625 }
            r0.<init>()     // Catch:{ all -> 0x0625 }
            throw r0     // Catch:{ all -> 0x0625 }
        L_0x063f:
            throw r11     // Catch:{ all -> 0x0625 }
        L_0x0640:
            r0 = -1
            goto L_0x0604
        L_0x0642:
            if (r0 == r7) goto L_0x066c
            wc8 r7 = defpackage.a26.b     // Catch:{ all -> 0x0625 }
            r7.getClass()     // Catch:{ all -> 0x0625 }
            kotlin.enums.EnumEntries r7 = defpackage.a26.w     // Catch:{ all -> 0x0625 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0625 }
        L_0x064f:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x0625 }
            if (r11 == 0) goto L_0x0664
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x0625 }
            r1 = r11
            a26 r1 = (defpackage.a26) r1     // Catch:{ all -> 0x0625 }
            int r1 = r1.a     // Catch:{ all -> 0x0625 }
            if (r1 != r0) goto L_0x0661
            goto L_0x0665
        L_0x0661:
            r1 = r27
            goto L_0x064f
        L_0x0664:
            r11 = 0
        L_0x0665:
            a26 r11 = (defpackage.a26) r11     // Catch:{ all -> 0x0625 }
            if (r11 == 0) goto L_0x066c
            r12.add(r11)     // Catch:{ all -> 0x0625 }
        L_0x066c:
            r1 = 1
            int r6 = r6 + r1
            r1 = r27
            goto L_0x05fe
        L_0x0671:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0625 }
            goto L_0x06a8
        L_0x0674:
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x067f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x068f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00f5 }
            xm r2 = (defpackage.xm) r2     // Catch:{ all -> 0x00f5 }
            r2.a(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x067f
        L_0x068f:
            gga r1 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r1.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r1 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x06a8
            r2 = 1
            if (r1 == r2) goto L_0x06a7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x06a7:
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x06a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x06ac:
            java.lang.String r1 = "favorites"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x06f2
        L_0x06b4:
            r27.A()     // Catch:{ all -> 0x06b8 }
            goto L_0x06ee
        L_0x06b8:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r4, r3, r1)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x06c5:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x06d5
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r2 = (defpackage.xm) r2     // Catch:{ all -> 0x00f5 }
            r2.a(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x06c5
        L_0x06d5:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x06ee
            r2 = 1
            if (r0 == r2) goto L_0x06ed
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x06ed:
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x06ee:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            goto L_0x0202
        L_0x06f2:
            int r0 = defpackage.ryg.X(r27)     // Catch:{ all -> 0x06f8 }
            r1 = r0
            goto L_0x072f
        L_0x06f8:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r4, r3, r1)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x00f5 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
        L_0x0705:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0715
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00f5 }
            xm r2 = (defpackage.xm) r2     // Catch:{ all -> 0x00f5 }
            r2.a(r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x0705
        L_0x0715:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x00f5 }
            r0.getClass()     // Catch:{ all -> 0x00f5 }
            xtd r0 = defpackage.gga.m()     // Catch:{ all -> 0x00f5 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x072e
            r2 = 1
            if (r0 == r2) goto L_0x072d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x072d:
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x072e:
            r1 = 0
        L_0x072f:
            r2 = 0
        L_0x0730:
            if (r2 >= r1) goto L_0x0782
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f5 }
            long r6 = defpackage.ryg.n0(r27)     // Catch:{ all -> 0x0745 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0745 }
            r6 = r16
            r6.add(r0)     // Catch:{ all -> 0x0743 }
        L_0x0741:
            r7 = 1
            goto L_0x077e
        L_0x0743:
            r0 = move-exception
            goto L_0x0748
        L_0x0745:
            r0 = move-exception
            r6 = r16
        L_0x0748:
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x0763 }
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.ytd.a     // Catch:{ all -> 0x0763 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0763 }
        L_0x0753:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x0763 }
            if (r11 == 0) goto L_0x0765
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x0763 }
            xm r11 = (defpackage.xm) r11     // Catch:{ all -> 0x0763 }
            r11.a(r0)     // Catch:{ all -> 0x0763 }
            goto L_0x0753
        L_0x0763:
            r0 = move-exception
            goto L_0x0787
        L_0x0765:
            gga r7 = defpackage.xtd.a     // Catch:{ all -> 0x0763 }
            r7.getClass()     // Catch:{ all -> 0x0763 }
            xtd r7 = defpackage.gga.m()     // Catch:{ all -> 0x0763 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x0763 }
            if (r7 == 0) goto L_0x0741
            r11 = 1
            if (r7 == r11) goto L_0x077d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0763 }
            r0.<init>()     // Catch:{ all -> 0x0763 }
            throw r0     // Catch:{ all -> 0x0763 }
        L_0x077d:
            throw r0     // Catch:{ all -> 0x0763 }
        L_0x077e:
            int r2 = r2 + r7
            r16 = r6
            goto L_0x0730
        L_0x0782:
            r6 = r16
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0763 }
            goto L_0x07bd
        L_0x0787:
            defpackage.z68.o(r4, r3, r0)     // Catch:{ all -> 0x07a2 }
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.ytd.a     // Catch:{ all -> 0x07a2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x07a2 }
        L_0x0792:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x07a2 }
            if (r2 == 0) goto L_0x07a4
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x07a2 }
            xm r2 = (defpackage.xm) r2     // Catch:{ all -> 0x07a2 }
            r2.a(r0)     // Catch:{ all -> 0x07a2 }
            goto L_0x0792
        L_0x07a2:
            r0 = move-exception
            goto L_0x07db
        L_0x07a4:
            gga r1 = defpackage.xtd.a     // Catch:{ all -> 0x07a2 }
            r1.getClass()     // Catch:{ all -> 0x07a2 }
            xtd r1 = defpackage.gga.m()     // Catch:{ all -> 0x07a2 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x07a2 }
            if (r1 == 0) goto L_0x07bd
            r2 = 1
            if (r1 == r2) goto L_0x07bc
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x07a2 }
            r0.<init>()     // Catch:{ all -> 0x07a2 }
            throw r0     // Catch:{ all -> 0x07a2 }
        L_0x07bc:
            throw r0     // Catch:{ all -> 0x07a2 }
        L_0x07bd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x07a2 }
            r1 = 1
            goto L_0x07c4
        L_0x07c1:
            r6 = r16
            r1 = r2
        L_0x07c4:
            int r9 = r9 + r1
            r2 = r1
            r16 = r6
            r1 = r27
            goto L_0x0077
        L_0x07cc:
            r6 = r16
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x07a2 }
        L_0x07d0:
            r16 = r8
            r17 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            goto L_0x080f
        L_0x07db:
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.ytd.a
            java.util.Iterator r1 = r1.iterator()
        L_0x07e6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x07f6
            java.lang.Object r2 = r1.next()
            xm r2 = (defpackage.xm) r2
            r2.a(r0)
            goto L_0x07e6
        L_0x07f6:
            gga r1 = defpackage.xtd.a
            r1.getClass()
            xtd r1 = defpackage.gga.m()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x07d0
            r2 = 1
            if (r1 == r2) goto L_0x080e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x080e:
            throw r0
        L_0x080f:
            if (r9 == 0) goto L_0x0813
            if (r10 != 0) goto L_0x0815
        L_0x0813:
            r1 = 0
            goto L_0x0831
        L_0x0815:
            r82 r0 = new r82
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r5)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r6)
            r8 = r0
            r3 = r12
            r12 = r1
            r1 = r13
            r13 = r2
            r2 = r15
            r15 = r23
            r19 = r2
            r20 = r1
            r21 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            return r0
        L_0x0831:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.a(pf9):r82");
    }
}
