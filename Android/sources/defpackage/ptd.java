package defpackage;

/* renamed from: ptd  reason: default package */
public abstract class ptd {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0300, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r25.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0307, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0308, code lost:
        r5 = r0;
        defpackage.z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", r5);
        r0 = defpackage.ytd.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0316, code lost:
        if (r0.hasNext() != false) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0318, code lost:
        ((defpackage.xm) r0.next()).a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0322, code lost:
        defpackage.xtd.a.getClass();
        r0 = defpackage.xtd.b.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x032d, code lost:
        if (r0 != 0) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0330, code lost:
        if (r0 != 1) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0337, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0338, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010a, code lost:
        r7 = r9;
        r2 = r17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0285 A[LOOP:9: B:151:0x027f->B:153:0x0285, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x029c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.qtd a(defpackage.pf9 r25) {
        /*
            r1 = r25
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.ryg.e0(r25)     // Catch:{ all -> 0x000d }
            r6 = r0
            goto L_0x003f
        L_0x000d:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0028
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r6)
            goto L_0x0018
        L_0x0028:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003e
            if (r0 == r2) goto L_0x003d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003d:
            throw r6
        L_0x003e:
            r6 = 0
        L_0x003f:
            r7 = 0
            if (r6 != 0) goto L_0x0043
            return r7
        L_0x0043:
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r9.element = r0
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r10.element = r0
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            kotlin.jvm.internal.Ref$LongRef r13 = new kotlin.jvm.internal.Ref$LongRef
            r13.<init>()
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r15 = 0
        L_0x0073:
            if (r15 >= r6) goto L_0x0386
            java.lang.String r0 = defpackage.ryg.g0(r25)     // Catch:{ all -> 0x007a }
            goto L_0x00af
        L_0x007a:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0098
            java.lang.Object r17 = r0.next()
            r7 = r17
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            r7 = 0
            goto L_0x0085
        L_0x0098:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00ae
            if (r0 == r2) goto L_0x00ad
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ad:
            throw r5
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 != 0) goto L_0x00b6
            r5 = r2
            r2 = r8
            r7 = r9
            goto L_0x037f
        L_0x00b6:
            int r5 = r0.hashCode()
            r17 = r8
            r7 = 0
            switch(r5) {
                case -2072608278: goto L_0x02f6;
                case -1307828855: goto L_0x02ac;
                case -8339209: goto L_0x0222;
                case 98494: goto L_0x01d1;
                case 3556653: goto L_0x0186;
                case 538738099: goto L_0x010f;
                case 1094519557: goto L_0x00c5;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            r2 = r17
            goto L_0x0300
        L_0x00c5:
            java.lang.String r5 = "replyTo"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ce
            goto L_0x00c1
        L_0x00ce:
            long r7 = defpackage.ryg.d0(r1, r7)     // Catch:{ all -> 0x00d7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00d7 }
            goto L_0x0108
        L_0x00d7:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x00e1:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r5.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r0)
            goto L_0x00e1
        L_0x00f1:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0107
            if (r5 == r2) goto L_0x0106
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = 0
        L_0x0108:
            r11.element = r0
        L_0x010a:
            r7 = r9
            r2 = r17
            goto L_0x037e
        L_0x010f:
            java.lang.String r5 = "attaches"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0118
            goto L_0x00c1
        L_0x0118:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            hb9 r0 = r25.n()     // Catch:{ all -> 0x014c }
            int r0 = r0.a()     // Catch:{ all -> 0x014c }
            r7 = 7
            if (r0 != r7) goto L_0x013d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x014c }
            r0.<init>()     // Catch:{ all -> 0x014c }
            int r7 = r25.t0()     // Catch:{ all -> 0x014c }
            r8 = 0
        L_0x0131:
            if (r8 >= r7) goto L_0x0141
            gz r2 = defpackage.gz.b(r25)     // Catch:{ all -> 0x014c }
            r0.add(r2)     // Catch:{ all -> 0x014c }
            r2 = 1
            int r8 = r8 + r2
            goto L_0x0131
        L_0x013d:
            r25.A()     // Catch:{ all -> 0x014c }
            r0 = 0
        L_0x0141:
            if (r0 == 0) goto L_0x014e
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)     // Catch:{ all -> 0x014c }
            if (r0 != 0) goto L_0x014a
            goto L_0x014e
        L_0x014a:
            r5 = r0
            goto L_0x0183
        L_0x014c:
            r0 = move-exception
            goto L_0x0153
        L_0x014e:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x014c }
            goto L_0x014a
        L_0x0153:
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.ytd.a
            java.util.Iterator r2 = r2.iterator()
        L_0x015c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x016c
            java.lang.Object r7 = r2.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r0)
            goto L_0x015c
        L_0x016c:
            gga r2 = defpackage.xtd.a
            r2.getClass()
            xtd r2 = defpackage.xtd.b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0183
            r7 = 1
            if (r2 == r7) goto L_0x0182
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0182:
            throw r0
        L_0x0183:
            r9.element = r5
            goto L_0x010a
        L_0x0186:
            java.lang.String r2 = "text"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0190
            goto L_0x00c1
        L_0x0190:
            java.lang.String r0 = defpackage.ryg.g0(r25)     // Catch:{ all -> 0x0197 }
            r2 = r17
            goto L_0x01cc
        L_0x0197:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01a2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01b2
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r2)
            goto L_0x01a2
        L_0x01b2:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01c9
            r5 = 1
            if (r0 == r5) goto L_0x01c8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01c8:
            throw r2
        L_0x01c9:
            r2 = r17
            r0 = 0
        L_0x01cc:
            r2.element = r0
        L_0x01ce:
            r7 = r9
            goto L_0x037e
        L_0x01d1:
            r2 = r17
            java.lang.String r5 = "cid"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0300
        L_0x01dd:
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            long r7 = defpackage.ryg.d0(r1, r7)     // Catch:{ all -> 0x01ea }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01ea }
            goto L_0x021b
        L_0x01ea:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.ytd.a
            java.util.Iterator r7 = r7.iterator()
        L_0x01f4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0204
            java.lang.Object r8 = r7.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r0)
            goto L_0x01f4
        L_0x0204:
            gga r7 = defpackage.xtd.a
            r7.getClass()
            xtd r7 = defpackage.xtd.b
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x021b
            r8 = 1
            if (r7 == r8) goto L_0x021a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x021a:
            throw r0
        L_0x021b:
            long r7 = r5.longValue()
            r14.element = r7
            goto L_0x01ce
        L_0x0222:
            r2 = r17
            java.lang.String r5 = "elements"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x022e
            goto L_0x0300
        L_0x022e:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            hb9 r0 = r25.n()     // Catch:{ all -> 0x025a }
            int r0 = r0.a()     // Catch:{ all -> 0x025a }
            r7 = 7
            if (r0 != r7) goto L_0x025e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x025a }
            r0.<init>()     // Catch:{ all -> 0x025a }
            int r7 = r25.t0()     // Catch:{ all -> 0x025a }
            r8 = 0
        L_0x0247:
            if (r8 >= r7) goto L_0x0257
            r17 = r5
            ra9 r5 = defpackage.qa9.a(r25)     // Catch:{ all -> 0x026f }
            r0.add(r5)     // Catch:{ all -> 0x026f }
            r5 = 1
            int r8 = r8 + r5
            r5 = r17
            goto L_0x0247
        L_0x0257:
            r17 = r5
            goto L_0x0264
        L_0x025a:
            r0 = move-exception
            r17 = r5
            goto L_0x0276
        L_0x025e:
            r17 = r5
            r25.A()     // Catch:{ all -> 0x026f }
            r0 = 0
        L_0x0264:
            if (r0 == 0) goto L_0x0271
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)     // Catch:{ all -> 0x026f }
            if (r0 != 0) goto L_0x026d
            goto L_0x0271
        L_0x026d:
            r5 = r0
            goto L_0x02a8
        L_0x026f:
            r0 = move-exception
            goto L_0x0276
        L_0x0271:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x026f }
            goto L_0x026d
        L_0x0276:
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x027f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x028f
            java.lang.Object r7 = r5.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r0)
            goto L_0x027f
        L_0x028f:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x02a6
            r7 = 1
            if (r5 == r7) goto L_0x02a5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02a5:
            throw r0
        L_0x02a6:
            r5 = r17
        L_0x02a8:
            r10.element = r5
            goto L_0x01ce
        L_0x02ac:
            r2 = r17
            java.lang.String r5 = "editOn"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02b7
            goto L_0x0300
        L_0x02b7:
            long r7 = defpackage.ryg.d0(r1, r7)     // Catch:{ all -> 0x02c0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02c0 }
            goto L_0x02f2
        L_0x02c0:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x02ca:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02da
            java.lang.Object r7 = r5.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r0)
            goto L_0x02ca
        L_0x02da:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x02f1
            r7 = 1
            if (r5 == r7) goto L_0x02f0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02f0:
            throw r0
        L_0x02f1:
            r0 = 0
        L_0x02f2:
            r12.element = r0
            goto L_0x01ce
        L_0x02f6:
            r2 = r17
            java.lang.String r5 = "saveTime"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0339
        L_0x0300:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r25.A()     // Catch:{ all -> 0x0307 }
            goto L_0x01ce
        L_0x0307:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0312:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0322
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            goto L_0x0312
        L_0x0322:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01ce
            r7 = 1
            if (r0 == r7) goto L_0x0338
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0338:
            throw r5
        L_0x0339:
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            long r7 = defpackage.ryg.d0(r1, r7)     // Catch:{ all -> 0x0347 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0347 }
        L_0x0345:
            r7 = r9
            goto L_0x0378
        L_0x0347:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.ytd.a
            java.util.Iterator r7 = r7.iterator()
        L_0x0351:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0361
            java.lang.Object r8 = r7.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r0)
            goto L_0x0351
        L_0x0361:
            gga r7 = defpackage.xtd.a
            r7.getClass()
            xtd r7 = defpackage.xtd.b
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x0345
            r8 = 1
            if (r7 == r8) goto L_0x0377
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0377:
            throw r0
        L_0x0378:
            long r8 = r5.longValue()
            r13.element = r8
        L_0x037e:
            r5 = 1
        L_0x037f:
            int r15 = r15 + r5
            r8 = r2
            r2 = r5
            r9 = r7
            r7 = 0
            goto L_0x0073
        L_0x0386:
            r2 = r8
            r7 = r9
            T r0 = r7.element
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0390:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03ab
            java.lang.Object r1 = r0.next()
            gz r1 = (defpackage.gz) r1
            boolean r3 = r1 instanceof defpackage.web
            if (r3 == 0) goto L_0x0390
            web r1 = (defpackage.web) r1
            boolean r3 = r1.y
            if (r3 == 0) goto L_0x0390
            java.lang.String r3 = r1.Y
            r1.v = r3
            goto L_0x0390
        L_0x03ab:
            qtd r0 = new qtd
            long r3 = r14.element
            T r1 = r2.element
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
            T r1 = r7.element
            r19 = r1
            java.util.List r19 = (java.util.List) r19
            T r1 = r10.element
            r20 = r1
            java.util.List r20 = (java.util.List) r20
            T r1 = r11.element
            r21 = r1
            java.lang.Long r21 = (java.lang.Long) r21
            T r1 = r12.element
            r22 = r1
            java.lang.Long r22 = (java.lang.Long) r22
            long r1 = r13.element
            r15 = r0
            r16 = r3
            r23 = r1
            r15.<init>(r16, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptd.a(pf9):qtd");
    }
}
