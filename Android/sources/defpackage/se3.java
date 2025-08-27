package defpackage;

/* renamed from: se3  reason: default package */
public abstract class se3 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.util.Map} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x025e, code lost:
        r6 = r19;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03a2, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        r19.A();
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a9, code lost:
        r1 = r0;
        defpackage.z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", r1);
        r0 = defpackage.ytd.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x03b7, code lost:
        if (r0.hasNext() != false) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03b9, code lost:
        ((defpackage.xm) r0.next()).a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03c3, code lost:
        defpackage.xtd.a.getClass();
        r0 = defpackage.xtd.b.ordinal();
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03ce, code lost:
        if (r0 != 0) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03d1, code lost:
        if (r0 != 1) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03d8, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03d9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03de, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03df, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        r6 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ue3 a(defpackage.pf9 r19) {
        /*
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 0
            int r0 = defpackage.ryg.e0(r19)     // Catch:{ all -> 0x000c }
            r5 = r0
            goto L_0x003e
        L_0x000c:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0027
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x0017
        L_0x0027:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003d
            if (r0 == r1) goto L_0x003c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003c:
            throw r5
        L_0x003d:
            r5 = r4
        L_0x003e:
            r6 = 0
            if (r5 != 0) goto L_0x0042
            return r6
        L_0x0042:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r8 = r0
            r9 = r4
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x0050:
            if (r9 >= r5) goto L_0x03e4
            java.lang.String r0 = defpackage.ryg.g0(r19)     // Catch:{ all -> 0x0057 }
            goto L_0x0089
        L_0x0057:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0072
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r10)
            goto L_0x0062
        L_0x0072:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0088
            if (r0 == r1) goto L_0x0087
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0087:
            throw r10
        L_0x0088:
            r0 = r6
        L_0x0089:
            if (r0 != 0) goto L_0x008f
            r6 = r19
            goto L_0x03df
        L_0x008f:
            int r10 = r0.hashCode()
            switch(r10) {
                case -905826493: goto L_0x0398;
                case 3195150: goto L_0x0353;
                case 3599307: goto L_0x0342;
                case 94623771: goto L_0x0262;
                case 1287422797: goto L_0x009a;
                default: goto L_0x0096;
            }
        L_0x0096:
            r6 = r19
            goto L_0x03a2
        L_0x009a:
            java.lang.String r10 = "chatFolders"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0096
        L_0x00a3:
            t82 r0 = defpackage.t82.c
            int r0 = defpackage.ryg.e0(r19)     // Catch:{ all -> 0x00ab }
            r10 = r0
            goto L_0x00dd
        L_0x00ab:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00b6:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00c6
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r10)
            goto L_0x00b6
        L_0x00c6:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00dc
            if (r0 == r1) goto L_0x00db
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00db:
            throw r10
        L_0x00dc:
            r10 = r4
        L_0x00dd:
            if (r10 != 0) goto L_0x00e4
            t82 r0 = defpackage.t82.c
        L_0x00e1:
            r15 = r0
            goto L_0x025e
        L_0x00e4:
            ws r11 = new ws
            r11.<init>((int) r4)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r15 = r4
        L_0x00ef:
            if (r15 >= r10) goto L_0x024f
            java.lang.String r0 = defpackage.ryg.g0(r19)     // Catch:{ all -> 0x00f6 }
            goto L_0x012b
        L_0x00f6:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0101:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x0114
            java.lang.Object r16 = r0.next()
            r6 = r16
            xm r6 = (defpackage.xm) r6
            r6.a(r4)
            r6 = 0
            goto L_0x0101
        L_0x0114:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x012a
            if (r0 == r1) goto L_0x0129
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0129:
            throw r4
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 != 0) goto L_0x0130
        L_0x012d:
            r4 = r1
            goto L_0x0249
        L_0x0130:
            java.lang.String r4 = "ALL_FILTER_EXCLUDE"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x01c1
            int r0 = defpackage.ryg.X(r19)     // Catch:{ all -> 0x013e }
            r4 = r0
            goto L_0x0170
        L_0x013e:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0149:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r4)
            goto L_0x0149
        L_0x0159:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x016f
            if (r0 == r1) goto L_0x016e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x016e:
            throw r4
        L_0x016f:
            r4 = 0
        L_0x0170:
            r6 = 0
        L_0x0171:
            if (r6 >= r4) goto L_0x012d
            java.lang.String r0 = defpackage.ryg.g0(r19)     // Catch:{ all -> 0x017b }
            r17 = r4
            r4 = r1
            goto L_0x01b7
        L_0x017b:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0186:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x019c
            java.lang.Object r17 = r0.next()
            r18 = r0
            r0 = r17
            xm r0 = (defpackage.xm) r0
            r0.a(r1)
            r0 = r18
            goto L_0x0186
        L_0x019c:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01b3
            r4 = 1
            if (r0 == r4) goto L_0x01b2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b2:
            throw r1
        L_0x01b3:
            r17 = r4
            r4 = 1
            r0 = 0
        L_0x01b7:
            if (r0 == 0) goto L_0x01bc
            r11.add(r0)
        L_0x01bc:
            int r6 = r6 + r4
            r1 = r4
            r4 = r17
            goto L_0x0171
        L_0x01c1:
            java.lang.String r1 = "FOLDERS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0210
            int r0 = defpackage.ryg.X(r19)     // Catch:{ all -> 0x01ce }
            goto L_0x0201
        L_0x01ce:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01e9
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x01d9
        L_0x01e9:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0200
            r4 = 1
            if (r0 == r4) goto L_0x01ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01ff:
            throw r1
        L_0x0200:
            r0 = 0
        L_0x0201:
            r1 = 0
        L_0x0202:
            if (r1 >= r0) goto L_0x0215
            r82 r4 = defpackage.p82.a(r19)
            if (r4 == 0) goto L_0x020d
            r12.add(r4)
        L_0x020d:
            r4 = 1
            int r1 = r1 + r4
            goto L_0x0202
        L_0x0210:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r19.A()     // Catch:{ all -> 0x0217 }
        L_0x0215:
            r4 = 1
            goto L_0x0249
        L_0x0217:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0222:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0232
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x0222
        L_0x0232:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0215
            r4 = 1
            if (r0 == r4) goto L_0x0248
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0248:
            throw r1
        L_0x0249:
            int r15 = r15 + r4
            r1 = r4
            r4 = 0
            r6 = 0
            goto L_0x00ef
        L_0x024f:
            t82 r0 = new t82
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r11)
            java.util.List r4 = java.util.Collections.unmodifiableList(r12)
            r0.<init>(r4, r1)
            goto L_0x00e1
        L_0x025e:
            r6 = r19
            goto L_0x03de
        L_0x0262:
            java.lang.String r1 = "chats"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026c
            goto L_0x0096
        L_0x026c:
            int r0 = defpackage.ryg.e0(r19)     // Catch:{ all -> 0x0272 }
            r1 = r0
            goto L_0x02a5
        L_0x0272:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x027d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x028d
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x027d
        L_0x028d:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02a4
            r4 = 1
            if (r0 == r4) goto L_0x02a3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02a3:
            throw r1
        L_0x02a4:
            r1 = 0
        L_0x02a5:
            ts r13 = new ts
            r13.<init>(r1)
            r4 = 0
        L_0x02ab:
            if (r4 >= r1) goto L_0x025e
            r10 = 0
            r6 = r19
            long r10 = defpackage.ryg.d0(r6, r10)     // Catch:{ all -> 0x02b6 }
            goto L_0x02ee
        L_0x02b6:
            r0 = move-exception
            r12 = r0
            defpackage.z68.o(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02c1:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x02d5
            java.lang.Object r17 = r0.next()
            r10 = r17
            xm r10 = (defpackage.xm) r10
            r10.a(r12)
            r10 = 0
            goto L_0x02c1
        L_0x02d5:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02ec
            r10 = 1
            if (r0 == r10) goto L_0x02eb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02eb:
            throw r12
        L_0x02ec:
            r10 = 0
        L_0x02ee:
            rp2 r0 = defpackage.rp2.a(r19)     // Catch:{ all -> 0x02f5 }
            r17 = r1
            goto L_0x0330
        L_0x02f5:
            r0 = move-exception
            r12 = r0
            defpackage.z68.o(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0300:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0316
            java.lang.Object r17 = r0.next()
            r18 = r0
            r0 = r17
            xm r0 = (defpackage.xm) r0
            r0.a(r12)
            r0 = r18
            goto L_0x0300
        L_0x0316:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x032d
            r1 = 1
            if (r0 == r1) goto L_0x032c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x032c:
            throw r12
        L_0x032d:
            r17 = r1
            r0 = 0
        L_0x0330:
            if (r0 == 0) goto L_0x033c
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Object r0 = r13.put(r1, r0)
            rp2 r0 = (defpackage.rp2) r0
        L_0x033c:
            r1 = 1
            int r4 = r4 + r1
            r1 = r17
            goto L_0x02ab
        L_0x0342:
            r6 = r19
            java.lang.String r1 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034d
            goto L_0x03a2
        L_0x034d:
            n0g r14 = defpackage.af3.a(r19)
            goto L_0x03de
        L_0x0353:
            r6 = r19
            java.lang.String r1 = "hash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03a2
            java.lang.String r0 = defpackage.ryg.g0(r19)     // Catch:{ all -> 0x0362 }
            goto L_0x0395
        L_0x0362:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x036d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x037d
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x036d
        L_0x037d:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0394
            r4 = 1
            if (r0 == r4) goto L_0x0393
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0393:
            throw r1
        L_0x0394:
            r0 = 0
        L_0x0395:
            r7.element = r0
            goto L_0x03de
        L_0x0398:
            r6 = r19
            java.lang.String r1 = "server"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03da
        L_0x03a2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r19.A()     // Catch:{ all -> 0x03a8 }
            goto L_0x03de
        L_0x03a8:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03b3:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x03c3
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x03b3
        L_0x03c3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x03de
            r4 = 1
            if (r0 == r4) goto L_0x03d9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03d9:
            throw r1
        L_0x03da:
            java.util.Map r8 = defpackage.af3.b(r19)
        L_0x03de:
            r1 = 1
        L_0x03df:
            int r9 = r9 + r1
            r4 = 0
            r6 = 0
            goto L_0x0050
        L_0x03e4:
            ue3 r0 = new ue3
            T r1 = r7.element
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            p7d r12 = new p7d
            r12.<init>((java.util.Map) r8)
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se3.a(pf9):ue3");
    }
}
