package defpackage;

/* renamed from: m88  reason: default package */
public final class m88 implements c43 {
    public static final m88 a = new Object();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0369, code lost:
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x037b, code lost:
        r33 = r2;
        r29 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03c0, code lost:
        r33 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x069a, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        r34.A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x06a1, code lost:
        r2 = r0;
        defpackage.z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", r2);
        r0 = defpackage.ytd.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x06af, code lost:
        if (r0.hasNext() != false) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x06b1, code lost:
        ((defpackage.xm) r0.next()).a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x06bb, code lost:
        defpackage.xtd.a.getClass();
        r0 = defpackage.xtd.b.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x06c6, code lost:
        if (r0 != 0) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x06c9, code lost:
        if (r0 != 1) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x06d0, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x06d1, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x06d2, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r30 = r6;
        r29 = r11;
        r28 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0719, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        r30 = r6;
        r29 = r11;
        r28 = r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibf p(defpackage.pf9 r34) {
        /*
            r33 = this;
            r1 = r34
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            long r22 = java.lang.System.nanoTime()
            boolean r0 = r34.m()
            if (r0 != 0) goto L_0x0018
            l88 r0 = new l88
            r0.<init>()
            goto L_0x0755
        L_0x0018:
            int r0 = defpackage.ryg.e0(r34)     // Catch:{ all -> 0x001e }
            r6 = r0
            goto L_0x0050
        L_0x001e:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0029:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0039
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r6)
            goto L_0x0029
        L_0x0039:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x004f
            if (r0 == r2) goto L_0x004e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x004e:
            throw r6
        L_0x004f:
            r6 = 0
        L_0x0050:
            if (r6 != 0) goto L_0x0059
            l88 r0 = new l88
            r0.<init>()
            goto L_0x0755
        L_0x0059:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r8.element = r0
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r9.element = r0
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r12 = new kotlin.jvm.internal.Ref$BooleanRef
            r12.<init>()
            r33 = r14
            r5 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 0
            r26 = 0
        L_0x009a:
            if (r5 >= r6) goto L_0x0723
            java.lang.String r0 = defpackage.ryg.g0(r34)     // Catch:{ all -> 0x00a1 }
            goto L_0x00d3
        L_0x00a1:
            r0 = move-exception
            r13 = r0
            defpackage.z68.o(r4, r3, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ac:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00bc
            java.lang.Object r14 = r0.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r13)
            goto L_0x00ac
        L_0x00bc:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00d2
            if (r0 == r2) goto L_0x00d1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00d1:
            throw r13
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r0 != 0) goto L_0x00df
            r30 = r6
            r29 = r11
            r28 = r15
            r13 = 0
            goto L_0x071a
        L_0x00df:
            int r13 = r0.hashCode()
            java.lang.String r14 = "chats"
            switch(r13) {
                case -1900708191: goto L_0x068a;
                case -1849019982: goto L_0x063c;
                case -1354792126: goto L_0x0624;
                case -1323779342: goto L_0x049d;
                case -1276666629: goto L_0x03c3;
                case -567451565: goto L_0x036d;
                case -462094004: goto L_0x0282;
                case -309425751: goto L_0x023a;
                case 3560141: goto L_0x01f1;
                case 94425557: goto L_0x01d2;
                case 94623771: goto L_0x0186;
                case 110541305: goto L_0x0141;
                case 1097076194: goto L_0x00f2;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r30 = r6
            r29 = r11
            r28 = r15
        L_0x00ee:
            r13 = 0
            goto L_0x069a
        L_0x00f2:
            java.lang.String r13 = "resetAt"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00fb
            goto L_0x00e8
        L_0x00fb:
            r13 = 0
            long r26 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x0102 }
            goto L_0x0135
        L_0x0102:
            r0 = move-exception
            r13 = r0
            defpackage.z68.o(r4, r3, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x010d:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x011d
            java.lang.Object r14 = r0.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r13)
            goto L_0x010d
        L_0x011d:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0133
            if (r0 == r2) goto L_0x0132
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0132:
            throw r13
        L_0x0133:
            r26 = 0
        L_0x0135:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0137:
            r30 = r6
            r29 = r11
            r28 = r15
        L_0x013d:
            r13 = 0
            goto L_0x0719
        L_0x0141:
            java.lang.String r13 = "token"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x014a
            goto L_0x00e8
        L_0x014a:
            java.lang.String r0 = defpackage.ryg.g0(r34)     // Catch:{ all -> 0x014f }
            goto L_0x0181
        L_0x014f:
            r0 = move-exception
            r13 = r0
            defpackage.z68.o(r4, r3, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x015a:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x016a
            java.lang.Object r14 = r0.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r13)
            goto L_0x015a
        L_0x016a:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0180
            if (r0 == r2) goto L_0x017f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x017f:
            throw r13
        L_0x0180:
            r0 = 0
        L_0x0181:
            r10.element = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x0186:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x018e
            goto L_0x00e8
        L_0x018e:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            a00 r13 = defpackage.a00.d(r34)     // Catch:{ all -> 0x0197 }
            goto L_0x01cc
        L_0x0197:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r4, r3, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01a2:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x01b5
            java.lang.Object r28 = r0.next()
            r2 = r28
            xm r2 = (defpackage.xm) r2
            r2.a(r14)
            r2 = 1
            goto L_0x01a2
        L_0x01b5:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01cc
            r2 = 1
            if (r0 == r2) goto L_0x01cb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01cb:
            throw r14
        L_0x01cc:
            r8.element = r13
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x01d2:
            java.lang.String r2 = "calls"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            goto L_0x00e8
        L_0x01dc:
            int r0 = defpackage.ryg.X(r34)
            r2 = 0
        L_0x01e1:
            if (r2 >= r0) goto L_0x01ed
            i3g r13 = defpackage.i3g.a(r34)
            r15.add(r13)
            r13 = 1
            int r2 = r2 + r13
            goto L_0x01e1
        L_0x01ed:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x01f1:
            java.lang.String r2 = "time"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01fb
            goto L_0x00e8
        L_0x01fb:
            r13 = 0
            long r19 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x0202 }
            goto L_0x0236
        L_0x0202:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020d:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x021d
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r2)
            goto L_0x020d
        L_0x021d:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0234
            r13 = 1
            if (r0 == r13) goto L_0x0233
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0233:
            throw r2
        L_0x0234:
            r19 = 0
        L_0x0236:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x023a:
            java.lang.String r2 = "profile"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0244
            goto L_0x00e8
        L_0x0244:
            fo3 r0 = defpackage.fo3.e(r34)     // Catch:{ all -> 0x0249 }
            goto L_0x027c
        L_0x0249:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0254:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0264
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r2)
            goto L_0x0254
        L_0x0264:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x027b
            r13 = 1
            if (r0 == r13) goto L_0x027a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x027a:
            throw r2
        L_0x027b:
            r0 = 0
        L_0x027c:
            r7.element = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0137
        L_0x0282:
            java.lang.String r2 = "messages"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x028c
            goto L_0x00e8
        L_0x028c:
            int r0 = defpackage.ryg.e0(r34)     // Catch:{ all -> 0x0292 }
            r2 = r0
            goto L_0x02c5
        L_0x0292:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x029d:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x02ad
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r2)
            goto L_0x029d
        L_0x02ad:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02c4
            r13 = 1
            if (r0 == r13) goto L_0x02c3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c3:
            throw r2
        L_0x02c4:
            r2 = 0
        L_0x02c5:
            r13 = 0
        L_0x02c6:
            if (r13 >= r2) goto L_0x0361
            r28 = r15
            r14 = 0
            long r29 = defpackage.ryg.d0(r1, r14)     // Catch:{ all -> 0x02d1 }
            goto L_0x0305
        L_0x02d1:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r4, r3, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02dc:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x02ec
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x02dc
        L_0x02ec:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0303
            r15 = 1
            if (r0 == r15) goto L_0x0302
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0302:
            throw r14
        L_0x0303:
            r29 = 0
        L_0x0305:
            java.lang.Long r14 = java.lang.Long.valueOf(r29)
            java.util.List r15 = kotlin.collections.CollectionsKt.emptyList()
            a00 r15 = defpackage.a00.g(r34)     // Catch:{ all -> 0x0319 }
            r29 = r2
        L_0x0313:
            r30 = r6
            r6 = 1
            r2 = r33
            goto L_0x0353
        L_0x0319:
            r0 = move-exception
            r29 = r2
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0326:
            boolean r30 = r0.hasNext()
            if (r30 == 0) goto L_0x033c
            java.lang.Object r30 = r0.next()
            r31 = r0
            r0 = r30
            xm r0 = (defpackage.xm) r0
            r0.a(r2)
            r0 = r31
            goto L_0x0326
        L_0x033c:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0313
            r6 = 1
            if (r0 == r6) goto L_0x0352
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0352:
            throw r2
        L_0x0353:
            r2.put(r14, r15)
            int r13 = r13 + r6
            r33 = r2
            r15 = r28
            r2 = r29
            r6 = r30
            goto L_0x02c6
        L_0x0361:
            r2 = r33
            r30 = r6
            r28 = r15
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0369:
            r29 = r11
            goto L_0x013d
        L_0x036d:
            r2 = r33
            r30 = r6
            r28 = r15
            java.lang.String r6 = "contacts"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0381
        L_0x037b:
            r33 = r2
            r29 = r11
            goto L_0x00ee
        L_0x0381:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            a00 r6 = defpackage.a00.e(r34)     // Catch:{ all -> 0x038a }
            goto L_0x03bc
        L_0x038a:
            r0 = move-exception
            r13 = r0
            defpackage.z68.o(r4, r3, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0395:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x03a5
            java.lang.Object r14 = r0.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r13)
            goto L_0x0395
        L_0x03a5:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x03bc
            r14 = 1
            if (r0 == r14) goto L_0x03bb
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03bb:
            throw r13
        L_0x03bc:
            r9.element = r6
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x03c0:
            r33 = r2
            goto L_0x0369
        L_0x03c3:
            r2 = r33
            r30 = r6
            r28 = r15
            java.lang.String r6 = "presence"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x03d2
        L_0x03d1:
            goto L_0x037b
        L_0x03d2:
            int r0 = defpackage.ryg.e0(r34)     // Catch:{ all -> 0x03d8 }
            r6 = r0
            goto L_0x040b
        L_0x03d8:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03e3:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x03f3
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r6)
            goto L_0x03e3
        L_0x03f3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x040a
            r13 = 1
            if (r0 == r13) goto L_0x0409
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0409:
            throw r6
        L_0x040a:
            r6 = 0
        L_0x040b:
            r13 = 0
        L_0x040c:
            if (r13 >= r6) goto L_0x0499
            r14 = 0
            long r31 = defpackage.ryg.d0(r1, r14)     // Catch:{ all -> 0x0415 }
            goto L_0x0449
        L_0x0415:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r4, r3, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0420:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0430
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0420
        L_0x0430:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0447
            r15 = 1
            if (r0 == r15) goto L_0x0446
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0446:
            throw r14
        L_0x0447:
            r31 = 0
        L_0x0449:
            java.lang.Long r14 = java.lang.Long.valueOf(r31)
            ntb r0 = defpackage.ntb.a(r34)     // Catch:{ all -> 0x0455 }
            r29 = r6
            r6 = 1
            goto L_0x0491
        L_0x0455:
            r0 = move-exception
            r15 = r0
            defpackage.z68.o(r4, r3, r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0460:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x0476
            java.lang.Object r29 = r0.next()
            r33 = r0
            r0 = r29
            xm r0 = (defpackage.xm) r0
            r0.a(r15)
            r0 = r33
            goto L_0x0460
        L_0x0476:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x048d
            r6 = 1
            if (r0 == r6) goto L_0x048c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x048c:
            throw r15
        L_0x048d:
            r29 = r6
            r6 = 1
            r0 = 0
        L_0x0491:
            r11.put(r14, r0)
            int r13 = r13 + r6
            r6 = r29
            goto L_0x040c
        L_0x0499:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x03c0
        L_0x049d:
            r2 = r33
            r30 = r6
            r28 = r15
            java.lang.String r6 = "drafts"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x04ad
            goto L_0x03d1
        L_0x04ad:
            int r0 = defpackage.ryg.e0(r34)     // Catch:{ all -> 0x04b3 }
            r6 = r0
            goto L_0x04e6
        L_0x04b3:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04be:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x04ce
            java.lang.Object r13 = r0.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r6)
            goto L_0x04be
        L_0x04ce:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x04e5
            r13 = 1
            if (r0 == r13) goto L_0x04e4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04e4:
            throw r6
        L_0x04e5:
            r6 = 0
        L_0x04e6:
            if (r6 != 0) goto L_0x04f0
            r33 = r2
            r29 = r11
            r21 = 0
            goto L_0x0620
        L_0x04f0:
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            r33 = r2
            r2 = 0
        L_0x04fd:
            if (r2 >= r6) goto L_0x060f
            java.lang.String r0 = defpackage.ryg.g0(r34)     // Catch:{ all -> 0x0508 }
            r21 = r6
            r29 = r11
            goto L_0x0545
        L_0x0508:
            r0 = move-exception
            r21 = r6
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0515:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x052b
            java.lang.Object r29 = r0.next()
            r31 = r0
            r0 = r29
            xm r0 = (defpackage.xm) r0
            r0.a(r6)
            r0 = r31
            goto L_0x0515
        L_0x052b:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0542
            r11 = 1
            if (r0 == r11) goto L_0x0541
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0541:
            throw r6
        L_0x0542:
            r29 = r11
            r0 = 0
        L_0x0545:
            if (r0 != 0) goto L_0x054a
        L_0x0547:
            r11 = 1
            goto L_0x0608
        L_0x054a:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            if (r6 == 0) goto L_0x058b
            zt4 r0 = defpackage.yt4.a(r34)     // Catch:{ all -> 0x0555 }
            goto L_0x0588
        L_0x0555:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0560:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0570
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r6)
            goto L_0x0560
        L_0x0570:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0587
            r11 = 1
            if (r0 == r11) goto L_0x0586
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0586:
            throw r6
        L_0x0587:
            r0 = 0
        L_0x0588:
            r13.element = r0
            goto L_0x0547
        L_0x058b:
            java.lang.String r6 = "users"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x05cf
            zt4 r0 = defpackage.yt4.a(r34)     // Catch:{ all -> 0x0598 }
            goto L_0x05cb
        L_0x0598:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05a3:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05b3
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r6)
            goto L_0x05a3
        L_0x05b3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x05ca
            r11 = 1
            if (r0 == r11) goto L_0x05c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c9:
            throw r6
        L_0x05ca:
            r0 = 0
        L_0x05cb:
            r15.element = r0
            goto L_0x0547
        L_0x05cf:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r34.A()     // Catch:{ all -> 0x05d6 }
            goto L_0x0547
        L_0x05d6:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05e1:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05f1
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r6)
            goto L_0x05e1
        L_0x05f1:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0547
            r11 = 1
            if (r0 == r11) goto L_0x0607
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0607:
            throw r6
        L_0x0608:
            int r2 = r2 + r11
            r6 = r21
            r11 = r29
            goto L_0x04fd
        L_0x060f:
            r29 = r11
            ku4 r0 = new ku4
            T r2 = r13.element
            zt4 r2 = (defpackage.zt4) r2
            T r6 = r15.element
            zt4 r6 = (defpackage.zt4) r6
            r0.<init>(r2, r6)
            r21 = r0
        L_0x0620:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x013d
        L_0x0624:
            r30 = r6
            r29 = r11
            r28 = r15
            java.lang.String r2 = "config"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0634
        L_0x0632:
            goto L_0x00ee
        L_0x0634:
            ue3 r17 = defpackage.se3.a(r34)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x013d
        L_0x063c:
            r30 = r6
            r29 = r11
            r28 = r15
            java.lang.String r2 = "chatMarker"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x064b
            goto L_0x0632
        L_0x064b:
            r13 = 0
            long r24 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x0652 }
            goto L_0x0686
        L_0x0652:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x065d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x066d
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r2)
            goto L_0x065d
        L_0x066d:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0684
            r6 = 1
            if (r0 == r6) goto L_0x0683
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0683:
            throw r2
        L_0x0684:
            r24 = r13
        L_0x0686:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0719
        L_0x068a:
            r30 = r6
            r29 = r11
            r28 = r15
            r13 = 0
            java.lang.String r2 = "videoChatHistory"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x06d5
        L_0x069a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r34.A()     // Catch:{ all -> 0x06a0 }
            goto L_0x06d2
        L_0x06a0:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06ab:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x06bb
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r2)
            goto L_0x06ab
        L_0x06bb:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x06d2
            r6 = 1
            if (r0 == r6) goto L_0x06d1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06d1:
            throw r2
        L_0x06d2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0719
        L_0x06d5:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = defpackage.ryg.Y(r34)     // Catch:{ all -> 0x06e0 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06e0 }
            goto L_0x0711
        L_0x06e0:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.ytd.a
            java.util.Iterator r6 = r6.iterator()
        L_0x06ea:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x06fa
            java.lang.Object r11 = r6.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r0)
            goto L_0x06ea
        L_0x06fa:
            gga r6 = defpackage.xtd.a
            r6.getClass()
            xtd r6 = defpackage.xtd.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x0711
            r11 = 1
            if (r6 == r11) goto L_0x0710
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0710:
            throw r0
        L_0x0711:
            boolean r0 = r2.booleanValue()
            r12.element = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0719:
            r2 = 1
        L_0x071a:
            int r5 = r5 + r2
            r15 = r28
            r11 = r29
            r6 = r30
            goto L_0x009a
        L_0x0723:
            r29 = r11
            r28 = r15
            l88 r0 = new l88
            r5 = r0
            T r1 = r7.element
            r6 = r1
            fo3 r6 = (defpackage.fo3) r6
            T r1 = r8.element
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            T r1 = r9.element
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            T r1 = r10.element
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            boolean r1 = r12.element
            r18 = r1
            r9 = r29
            r11 = r19
            r13 = r17
            r14 = r33
            r1 = r28
            r15 = r24
            r17 = r1
            r19 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r21, r22)
        L_0x0755:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m88.p(pf9):ibf");
    }
}
