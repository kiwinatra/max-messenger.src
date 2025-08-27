package defpackage;

/* renamed from: qa9  reason: default package */
public final class qa9 {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02f0, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r25.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02f8, code lost:
        r4 = r0;
        defpackage.z68.o("ServerPayload/PayloadCatching", r2, r4);
        r0 = defpackage.ytd.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0306, code lost:
        if (r0.hasNext() != false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0308, code lost:
        ((defpackage.xm) r0.next()).a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0312, code lost:
        defpackage.xtd.a.getClass();
        r0 = defpackage.xtd.b.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x031d, code lost:
        if (r0 != 0) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0320, code lost:
        if (r0 != 1) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0327, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0328, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        r6 = r25;
        r14 = r2;
        r15 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ra9 a(defpackage.pf9 r25) {
        /*
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.ryg.e0(r25)     // Catch:{ all -> 0x000b }
            r5 = r0
            goto L_0x003d
        L_0x000b:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0026
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x0016
        L_0x0026:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003c
            if (r0 == r1) goto L_0x003b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003b:
            throw r5
        L_0x003c:
            r5 = 0
        L_0x003d:
            r6 = 0
            if (r5 != 0) goto L_0x0041
            return r6
        L_0x0041:
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            va9 r0 = defpackage.va9.a
            r9.element = r0
            kotlin.jvm.internal.Ref$ShortRef r10 = new kotlin.jvm.internal.Ref$ShortRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ShortRef r11 = new kotlin.jvm.internal.Ref$ShortRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r13 = 0
        L_0x0064:
            if (r13 >= r5) goto L_0x037a
            java.lang.String r0 = defpackage.ryg.g0(r25)     // Catch:{ all -> 0x006b }
            goto L_0x009d
        L_0x006b:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r3, r2, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0076:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0086
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0076
        L_0x0086:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x009c
            if (r0 == r1) goto L_0x009b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009b:
            throw r14
        L_0x009c:
            r0 = r6
        L_0x009d:
            if (r0 != 0) goto L_0x00a5
            r6 = r25
            r15 = r1
            r14 = r2
            goto L_0x0374
        L_0x00a5:
            int r14 = r0.hashCode()
            switch(r14) {
                case -2102099874: goto L_0x02e7;
                case -1483200242: goto L_0x02a1;
                case -1106363674: goto L_0x0250;
                case 3151786: goto L_0x01ff;
                case 3575610: goto L_0x0154;
                case 405645655: goto L_0x00af;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r1 = 0
            goto L_0x02f0
        L_0x00af:
            java.lang.String r14 = "attributes"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00ac
        L_0x00b8:
            hb9 r0 = r25.n()     // Catch:{ all -> 0x011a }
            int r0 = r0.a()     // Catch:{ all -> 0x011a }
            r14 = 8
            if (r0 != r14) goto L_0x0116
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x011a }
            r0.<init>()     // Catch:{ all -> 0x011a }
            int r14 = r25.y0()     // Catch:{ all -> 0x011a }
            r15 = 0
        L_0x00ce:
            if (r15 >= r14) goto L_0x014c
            java.lang.String r6 = r25.A0()     // Catch:{ all -> 0x011a }
            q1 r16 = r25.B0()     // Catch:{ all -> 0x011a }
            int r4 = r16.g()     // Catch:{ all -> 0x011a }
            r1 = 5
            if (r4 != r1) goto L_0x00e1
            r1 = 1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            if (r1 == 0) goto L_0x00f5
            jc7 r1 = r16.v()     // Catch:{ all -> 0x011a }
            p1 r1 = (defpackage.p1) r1     // Catch:{ all -> 0x011a }
            java.lang.String r1 = r1.E()     // Catch:{ all -> 0x011a }
            r0.put(r6, r1)     // Catch:{ all -> 0x011a }
            r1 = 1
            int r15 = r15 + r1
            r6 = 0
            goto L_0x00ce
        L_0x00f5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x011a }
            int r1 = r16.g()     // Catch:{ all -> 0x011a }
            java.lang.String r1 = defpackage.wzf.p(r1)     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            java.lang.String r6 = "type = "
            r4.<init>(r6)     // Catch:{ all -> 0x011a }
            r4.append(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = " not supported"
            r4.append(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x011a }
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x0116:
            r25.A()     // Catch:{ all -> 0x011a }
            goto L_0x014b
        L_0x011a:
            r0 = move-exception
            defpackage.z68.o(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.ytd.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0124:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0134
            java.lang.Object r4 = r1.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r0)
            goto L_0x0124
        L_0x0134:
            gga r1 = defpackage.xtd.a
            r1.getClass()
            xtd r1 = defpackage.xtd.b
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x014b
            r4 = 1
            if (r1 == r4) goto L_0x014a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x014a:
            throw r0
        L_0x014b:
            r0 = 0
        L_0x014c:
            r12.element = r0
        L_0x014e:
            r6 = r25
            r14 = r2
            r15 = 1
            goto L_0x0374
        L_0x0154:
            java.lang.String r1 = "type"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015e
            goto L_0x00ac
        L_0x015e:
            va9 r1 = defpackage.va9.a
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = defpackage.ryg.g0(r25)     // Catch:{ all -> 0x0167 }
            goto L_0x019c
        L_0x0167:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r3, r2, r4)     // Catch:{ all -> 0x0182 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x0182 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0182 }
        L_0x0172:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0182 }
            if (r6 == 0) goto L_0x0184
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0182 }
            xm r6 = (defpackage.xm) r6     // Catch:{ all -> 0x0182 }
            r6.a(r4)     // Catch:{ all -> 0x0182 }
            goto L_0x0172
        L_0x0182:
            r0 = move-exception
            goto L_0x01b3
        L_0x0184:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x0182 }
            r0.getClass()     // Catch:{ all -> 0x0182 }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x0182 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0182 }
            if (r0 == 0) goto L_0x019b
            r6 = 1
            if (r0 == r6) goto L_0x019a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0182 }
            r0.<init>()     // Catch:{ all -> 0x0182 }
            throw r0     // Catch:{ all -> 0x0182 }
        L_0x019a:
            throw r4     // Catch:{ all -> 0x0182 }
        L_0x019b:
            r0 = 0
        L_0x019c:
            if (r0 == 0) goto L_0x01a7
            va9 r0 = defpackage.va9.valueOf(r0)     // Catch:{ all -> 0x0182 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0182 }
            goto L_0x01bd
        L_0x01a7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0182 }
            r4.<init>(r0)     // Catch:{ all -> 0x0182 }
            throw r4     // Catch:{ all -> 0x0182 }
        L_0x01b3:
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x01ca }
        L_0x01bd:
            va9 r4 = defpackage.va9.a     // Catch:{ all -> 0x01ca }
            boolean r6 = kotlin.Result.m29isFailureimpl(r0)     // Catch:{ all -> 0x01ca }
            if (r6 == 0) goto L_0x01c6
            r0 = r4
        L_0x01c6:
            va9 r0 = (defpackage.va9) r0     // Catch:{ all -> 0x01ca }
            r1 = r0
            goto L_0x01fb
        L_0x01ca:
            r0 = move-exception
            defpackage.z68.o(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.ytd.a
            java.util.Iterator r4 = r4.iterator()
        L_0x01d4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01e4
            java.lang.Object r6 = r4.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r0)
            goto L_0x01d4
        L_0x01e4:
            gga r4 = defpackage.xtd.a
            r4.getClass()
            xtd r4 = defpackage.xtd.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x01fb
            r6 = 1
            if (r4 == r6) goto L_0x01fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fa:
            throw r0
        L_0x01fb:
            r9.element = r1
            goto L_0x014e
        L_0x01ff:
            java.lang.String r1 = "from"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0209
            goto L_0x00ac
        L_0x0209:
            r1 = 0
            java.lang.Short r4 = java.lang.Short.valueOf(r1)
            short r0 = defpackage.ryg.f0(r25)     // Catch:{ all -> 0x0217 }
            java.lang.Short r4 = java.lang.Short.valueOf(r0)     // Catch:{ all -> 0x0217 }
            goto L_0x0248
        L_0x0217:
            r0 = move-exception
            defpackage.z68.o(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.ytd.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0221:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0231
            java.lang.Object r6 = r1.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r0)
            goto L_0x0221
        L_0x0231:
            gga r1 = defpackage.xtd.a
            r1.getClass()
            xtd r1 = defpackage.xtd.b
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0248
            r6 = 1
            if (r1 == r6) goto L_0x0247
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0247:
            throw r0
        L_0x0248:
            short r0 = r4.shortValue()
            r10.element = r0
            goto L_0x014e
        L_0x0250:
            java.lang.String r1 = "length"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025a
            goto L_0x00ac
        L_0x025a:
            r1 = 0
            java.lang.Short r4 = java.lang.Short.valueOf(r1)
            short r0 = defpackage.ryg.f0(r25)     // Catch:{ all -> 0x0268 }
            java.lang.Short r4 = java.lang.Short.valueOf(r0)     // Catch:{ all -> 0x0268 }
            goto L_0x0299
        L_0x0268:
            r0 = move-exception
            defpackage.z68.o(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.ytd.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0272:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x0282
            java.lang.Object r14 = r6.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r0)
            goto L_0x0272
        L_0x0282:
            gga r6 = defpackage.xtd.a
            r6.getClass()
            xtd r6 = defpackage.xtd.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x0299
            r14 = 1
            if (r6 == r14) goto L_0x0298
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0298:
            throw r0
        L_0x0299:
            short r0 = r4.shortValue()
            r11.element = r0
            goto L_0x014e
        L_0x02a1:
            r1 = 0
            java.lang.String r4 = "entityName"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02ab
            goto L_0x02f0
        L_0x02ab:
            java.lang.String r0 = defpackage.ryg.g0(r25)     // Catch:{ all -> 0x02b0 }
            goto L_0x02e3
        L_0x02b0:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02bb:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02cb
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r4)
            goto L_0x02bb
        L_0x02cb:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02e2
            r6 = 1
            if (r0 == r6) goto L_0x02e1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02e1:
            throw r4
        L_0x02e2:
            r0 = 0
        L_0x02e3:
            r8.element = r0
            goto L_0x014e
        L_0x02e7:
            r1 = 0
            java.lang.String r4 = "entityId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0329
        L_0x02f0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r25.A()     // Catch:{ all -> 0x02f7 }
            goto L_0x014e
        L_0x02f7:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0302:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0312
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r4)
            goto L_0x0302
        L_0x0312:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x014e
            r6 = 1
            if (r0 == r6) goto L_0x0328
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0328:
            throw r4
        L_0x0329:
            r14 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r6 = r25
            long r14 = defpackage.ryg.d0(r6, r14)     // Catch:{ all -> 0x033c }
            java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x033c }
            r14 = r2
            r15 = 1
            goto L_0x036e
        L_0x033c:
            r0 = move-exception
            defpackage.z68.o(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r14 = defpackage.ytd.a
            java.util.Iterator r14 = r14.iterator()
        L_0x0346:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0356
            java.lang.Object r15 = r14.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r0)
            goto L_0x0346
        L_0x0356:
            gga r14 = defpackage.xtd.a
            r14.getClass()
            xtd r14 = defpackage.xtd.b
            int r14 = r14.ordinal()
            r15 = 1
            if (r14 == 0) goto L_0x036d
            if (r14 == r15) goto L_0x036c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x036c:
            throw r0
        L_0x036d:
            r14 = r2
        L_0x036e:
            long r1 = r4.longValue()
            r7.element = r1
        L_0x0374:
            int r13 = r13 + r15
            r2 = r14
            r1 = r15
            r6 = 0
            goto L_0x0064
        L_0x037a:
            ra9 r0 = new ra9
            long r1 = r7.element
            T r3 = r8.element
            r20 = r3
            java.lang.String r20 = (java.lang.String) r20
            T r3 = r9.element
            r21 = r3
            va9 r21 = (defpackage.va9) r21
            short r3 = r10.element
            short r4 = r11.element
            T r5 = r12.element
            r24 = r5
            java.util.Map r24 = (java.util.Map) r24
            r17 = r0
            r18 = r1
            r22 = r3
            r23 = r4
            r17.<init>(r18, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa9.a(pf9):ra9");
    }
}
