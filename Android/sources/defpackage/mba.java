package defpackage;

/* renamed from: mba  reason: default package */
public final class mba {
    public final hs7 a;
    public final hs7 b;
    public final jtb c;
    public final sv0 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;
    public final hs7 h;
    public final hs7 i;
    public final hs7 j;
    public final hs7 k;
    public final hs7 l;
    public final hs7 m;
    public final hs7 n;
    public final hs7 o;

    public mba(hs7 hs7, hs7 hs72, jtb jtb, sv0 sv0, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78, hs7 hs79, hs7 hs710, hs7 hs711, hs7 hs712, hs7 hs713) {
        this.a = hs7;
        this.b = hs72;
        this.c = jtb;
        this.d = sv0;
        this.e = hs73;
        this.f = hs74;
        this.g = hs75;
        this.h = hs76;
        this.i = hs77;
        this.j = hs78;
        this.k = hs79;
        this.l = hs710;
        this.m = hs711;
        this.n = hs712;
        this.o = hs713;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.kba r53, defpackage.bl4 r54) {
        /*
            r52 = this;
            r0 = r52
            r1 = r53
            r12 = r54
            java.lang.String r2 = r54.name()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "onNotifMessage: %s, %s"
            java.lang.String r4 = "mba"
            defpackage.z68.c(r4, r3, r2)
            hs7 r2 = r0.m     // Catch:{ TamErrorException -> 0x0020 }
            java.lang.Object r2 = r2.get()     // Catch:{ TamErrorException -> 0x0020 }
            is9 r2 = (defpackage.is9) r2     // Catch:{ TamErrorException -> 0x0020 }
            r2.s(r1)     // Catch:{ TamErrorException -> 0x0020 }
        L_0x0020:
            long r2 = r1.c
            hs7 r5 = r0.e
            java.lang.Object r6 = r5.get()
            r62 r6 = (defpackage.r62) r6
            a32 r2 = r6.D(r2)
            r3 = 0
            b32 r7 = r1.o
            if (r2 != 0) goto L_0x0065
            if (r7 == 0) goto L_0x0065
            r8 = 2
            int r9 = r7.V0
            if (r9 != r8) goto L_0x0065
            java.util.concurrent.ConcurrentHashMap r2 = r6.c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0044:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0064
            java.lang.Object r8 = r2.next()
            a32 r8 = (defpackage.a32) r8
            m72 r9 = r8.b
            boolean r9 = r9.g()
            if (r9 == 0) goto L_0x0044
            m72 r9 = r8.b
            long r9 = r9.l
            long r13 = r7.X
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0044
            r2 = r8
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            r14 = 1
            r13 = 0
            if (r7 == 0) goto L_0x007f
            java.lang.String r8 = r7.b
            java.lang.String r9 = "ACTIVE"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x007f
            if (r2 == 0) goto L_0x007f
            m72 r8 = r2.b
            k72 r8 = r8.c
            k72 r9 = defpackage.k72.x
            if (r8 != r9) goto L_0x007f
            r8 = r14
            goto L_0x0080
        L_0x007f:
            r8 = r13
        L_0x0080:
            if (r2 != 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            java.util.List r2 = java.util.Collections.singletonList(r7)
            java.util.List r2 = r6.n0(r2)
            java.lang.Object r2 = r2.get(r13)
            java.lang.Long r2 = (java.lang.Long) r2
            long r9 = r2.longValue()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r14)
            java.lang.String r11 = "onNotifMessage: chat null, but is in notif; stored it with id = %d"
            defpackage.z68.n(r4, r3, r11, r2)
            a32 r2 = r6.G(r9)
        L_0x00a7:
            hs7 r9 = r0.b
            long r10 = r1.c
            if (r2 != 0) goto L_0x00c6
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "onNotifMessage: %d chat not found, requesting chatInfo"
            defpackage.z68.c(r4, r1, r0)
            java.lang.Object r0 = r9.get()
            rl r0 = (defpackage.rl) r0
            jna r0 = (defpackage.jna) r0
            r0.l(r10)
            return
        L_0x00c6:
            hs7 r15 = r0.f
            java.lang.Object r16 = r15.get()
            r3 = r16
            fa9 r3 = (defpackage.fa9) r3
            b89 r14 = r1.v
            r18 = r10
            long r10 = r14.a
            r21 = r14
            long r13 = r2.a
            boolean r3 = r3.f(r13, r10)
            jtb r10 = r0.c
            r14 = r10
            ltb r14 = (defpackage.ltb) r14
            a33 r10 = r14.a
            long r10 = r10.s()
            r22 = r9
            r13 = r21
            r21 = r8
            long r8 = r13.o
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r23 = 0
            if (r10 == 0) goto L_0x0105
            int r10 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x0102
            boolean r10 = r2.H()
            if (r10 == 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            r25 = 0
            goto L_0x0107
        L_0x0105:
            r25 = 1
        L_0x0107:
            if (r7 == 0) goto L_0x0123
            java.util.List r2 = java.util.Collections.singletonList(r7)
            java.util.List r2 = r6.n0(r2)
            r10 = 0
            java.lang.Object r2 = r2.get(r10)
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            a32 r2 = r6.G(r10)
            if (r2 != 0) goto L_0x0123
            return
        L_0x0123:
            re9 r10 = defpackage.re9.o
            re9 r11 = r13.v
            r26 = r8
            long r8 = r13.a
            r28 = r7
            hs7 r7 = r0.j
            r29 = r3
            hs7 r3 = r0.g
            r30 = r13
            sv0 r13 = r0.d
            r31 = r6
            m72 r6 = r2.b
            if (r11 != r10) goto L_0x02cb
            long r1 = r6.a
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            java.lang.Object r8 = r5.get()
            r62 r8 = (defpackage.r62) r8
            a32 r1 = r8.D(r1)
            if (r1 != 0) goto L_0x016a
            hs7 r0 = r0.o
            java.lang.Object r0 = r0.get()
            m95 r0 = (defpackage.m95) r0
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            java.lang.String r2 = "chat is null"
            r1.<init>(r2)
            uta r0 = (defpackage.uta) r0
            r2 = 1
            r0.c(r1, r2)
            goto L_0x02ca
        L_0x016a:
            long r8 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r10 = r1.r()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r10}
            java.lang.String r10 = "onDelete: chat.id = %d, title = %s"
            defpackage.z68.c(r4, r10, r2)
            wk r2 = new wk
            r10 = 25
            r2.<init>(r10, r0, r1)
            java.util.List r6 = (java.util.List) r6
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.mapNotNull(r6, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r0.size()
            r2.<init>(r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x0197:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x01b4
            java.lang.Object r10 = r6.next()
            ha9 r10 = (defpackage.ha9) r10     // Catch:{ all -> 0x01ad }
            long r10 = r10.b     // Catch:{ all -> 0x01ad }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01ad }
            r2.add(r10)     // Catch:{ all -> 0x01ad }
            goto L_0x0197
        L_0x01ad:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x01b4:
            java.lang.Object r6 = r15.get()
            fa9 r6 = (defpackage.fa9) r6
            qe9 r10 = defpackage.qe9.DELETED
            s74 r6 = r6.a
            a74 r6 = (defpackage.a74) r6
            z6d r6 = r6.c
            aj9 r6 = r6.d()
            r6.o(r8, r2, r10)
            boolean r6 = r54.a()
            if (r6 == 0) goto L_0x01d3
            r53 = r2
            goto L_0x02c0
        L_0x01d3:
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            int r10 = r0.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r10}
            java.lang.String r10 = "onDelete: chatId = %d, messageDbs.size() = %d"
            defpackage.z68.c(r4, r10, r6)
            m72 r6 = r1.b
            int r10 = r6.m
            long r14 = r6.a
            if (r10 <= 0) goto L_0x0263
            long r24 = r1.o()
            java.util.Iterator r1 = r0.iterator()
            r11 = r10
        L_0x01f9:
            boolean r17 = r1.hasNext()
            if (r17 == 0) goto L_0x0218
            java.lang.Object r17 = r1.next()
            r52 = r1
            r1 = r17
            ha9 r1 = (defpackage.ha9) r1
            r53 = r2
            long r1 = r1.o
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 <= 0) goto L_0x0213
            int r11 = r11 + -1
        L_0x0213:
            r1 = r52
            r2 = r53
            goto L_0x01f9
        L_0x0218:
            r53 = r2
            if (r10 == r11) goto L_0x0257
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "onDelete: check new messages count, newCount = %d, afterDeleteCount = %d"
            defpackage.z68.c(r4, r2, r1)
            java.lang.Object r1 = r5.get()
            r62 r1 = (defpackage.r62) r1
            r2 = 0
            int r2 = java.lang.Math.max(r2, r11)
            r1.x0(r2, r8)
            java.lang.Object r1 = r7.get()
            r21 = r1
            ysc r21 = (defpackage.ysc) r21
            r21.getClass()
            r28 = 0
            r31 = 120(0x78, float:1.68E-43)
            long r1 = r6.a
            r26 = -1
            r29 = 0
            r30 = 0
            r22 = r1
            defpackage.ysc.e(r21, r22, r24, r26, r28, r29, r30, r31)
        L_0x0257:
            if (r11 != 0) goto L_0x0265
            java.lang.Object r1 = r3.get()
            qwa r1 = (defpackage.qwa) r1
            r1.a(r14)
            goto L_0x0265
        L_0x0263:
            r53 = r2
        L_0x0265:
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0273
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0273
            goto L_0x029c
        L_0x0273:
            java.util.Iterator r0 = r0.iterator()
        L_0x0277:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x029c
            java.lang.Object r1 = r0.next()
            ha9 r1 = (defpackage.ha9) r1     // Catch:{ all -> 0x0295 }
            long r1 = r1.b     // Catch:{ all -> 0x0295 }
            long r10 = r6.j
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0277
            java.lang.Object r0 = r5.get()
            r62 r0 = (defpackage.r62) r0
            r0.A(r8)
            goto L_0x029c
        L_0x0295:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x029c:
            xy2 r0 = new xy2
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            r0.<init>(r1, r2)
            r13.c(r0)
            java.lang.Object r0 = r3.get()
            qwa r0 = (defpackage.qwa) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.d(r1)
        L_0x02c0:
            kv9 r0 = new kv9
            r1 = r53
            r0.<init>(r8, r1, r12)
            r13.c(r0)
        L_0x02ca:
            return
        L_0x02cb:
            java.lang.Object r5 = r15.get()
            fa9 r5 = (defpackage.fa9) r5
            r38 = r13
            long r12 = r2.a
            ha9 r5 = r5.k(r12, r8)
            if (r5 != 0) goto L_0x0307
            java.lang.String r5 = "onNotifMessage: insert new message"
            defpackage.z68.c(r4, r5, new java.lang.Object[0])
            java.lang.Object r5 = r15.get()
            r32 = r5
            fa9 r32 = (defpackage.fa9) r32
            a33 r5 = r14.a
            long r35 = r5.s()
            r39 = r8
            long r8 = r2.a
            b89 r5 = r1.v
            r33 = r8
            r37 = r5
            long r8 = r32.g(r33, r35, r37)
            java.lang.Object r5 = r15.get()
            fa9 r5 = (defpackage.fa9) r5
            ha9 r5 = r5.r(r8)
            goto L_0x0309
        L_0x0307:
            r39 = r8
        L_0x0309:
            boolean r8 = r2.N()
            if (r8 == 0) goto L_0x0315
            boolean r8 = r2.E()
            if (r8 == 0) goto L_0x0317
        L_0x0315:
            if (r21 == 0) goto L_0x032f
        L_0x0317:
            k72 r8 = defpackage.k72.a
            r10 = r31
            r10.k(r12, r8)
            java.lang.Object r8 = r22.get()
            rl r8 = (defpackage.rl) r8
            jna r8 = (defpackage.jna) r8
            r9 = r5
            r21 = r6
            r5 = r18
            r8.l(r5)
            goto L_0x0334
        L_0x032f:
            r9 = r5
            r21 = r6
            r10 = r31
        L_0x0334:
            r6 = r9
            if (r25 == 0) goto L_0x036b
            r5 = r30
            long r8 = r5.w
            int r18 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r18 == 0) goto L_0x0368
            java.lang.Object r6 = r15.get()
            fa9 r6 = (defpackage.fa9) r6
            s74 r6 = r6.a
            a74 r6 = (defpackage.a74) r6
            z6d r6 = r6.c
            r18 = r11
            aj9 r11 = r6.d()
            ya9 r8 = r11.h(r12, r8)
            if (r8 == 0) goto L_0x035c
            ha9 r6 = r6.b(r8)
            goto L_0x035d
        L_0x035c:
            r6 = 0
        L_0x035d:
            if (r6 == 0) goto L_0x0366
            long r8 = r6.c
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0366
            return
        L_0x0366:
            r11 = r6
            goto L_0x0370
        L_0x0368:
            r18 = r11
            goto L_0x0366
        L_0x036b:
            r18 = r11
            r5 = r30
            goto L_0x0366
        L_0x0370:
            if (r11 != 0) goto L_0x0373
            return
        L_0x0373:
            hs7 r6 = r0.h
            a89 r8 = r2.c
            if (r29 == 0) goto L_0x055b
            java.lang.String r7 = "onNotifMessage: messageExistedBefore == true"
            defpackage.z68.c(r4, r7, new java.lang.Object[0])
            a00 r9 = r5.y
            if (r9 == 0) goto L_0x03c0
            int r7 = r9.size()
            if (r7 <= 0) goto L_0x03c0
            r7 = 0
            java.lang.Object r19 = r9.get(r7)
            r7 = r19
            gz r7 = (defpackage.gz) r7
            r19 = r9
            b10 r9 = r7.a
            r22 = r3
            b10 r3 = defpackage.b10.CONTROL
            if (r9 != r3) goto L_0x03bd
            ox3 r7 = (defpackage.ox3) r7
            b89 r3 = r7.y0
            if (r3 == 0) goto L_0x03bd
            java.lang.Object r7 = r15.get()
            fa9 r7 = (defpackage.fa9) r7
            r29 = r8
            long r8 = r3.a
            ha9 r3 = r7.k(r12, r8)
            r26 = r8
            if (r3 == 0) goto L_0x03ba
            long r7 = r3.b
            r32 = r7
        L_0x03b7:
            r34 = r26
            goto L_0x03ca
        L_0x03ba:
            r32 = r23
            goto L_0x03b7
        L_0x03bd:
            r29 = r8
            goto L_0x03c6
        L_0x03c0:
            r22 = r3
            r29 = r8
            r19 = r9
        L_0x03c6:
            r32 = r23
            r34 = r32
        L_0x03ca:
            hs7 r3 = r0.a
            java.lang.Object r3 = r3.get()
            s74 r3 = (defpackage.s74) r3
            a74 r3 = (defpackage.a74) r3
            z6d r3 = r3.c
            long r7 = r2.a
            r44 = 0
            b89 r9 = r1.v
            r47 = 0
            r41 = r3
            r42 = r7
            r46 = r9
            r41.p(r42, r44, r46, r47)
            java.lang.Object r3 = r15.get()
            fa9 r3 = (defpackage.fa9) r3
            hs7 r0 = r0.i
            java.lang.Object r0 = r0.get()
            r31 = r0
            bjd r31 = (defpackage.bjd) r31
            r36 = 0
            a00 r0 = r5.y
            r30 = r0
            w28 r0 = defpackage.qe8.h(r30, r31, r32, r34, r36)
            r3.y(r11, r0)
            java.lang.Object r0 = r15.get()
            fa9 r0 = (defpackage.fa9) r0
            long r7 = r11.b
            ha9 r0 = r0.r(r7)
            if (r0 != 0) goto L_0x0420
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "message after update is null"
            r2 = 0
            defpackage.z68.n(r4, r2, r1, r0)
            return
        L_0x0420:
            java.lang.Object r3 = r6.get()
            esb r3 = (defpackage.esb) r3
            long r4 = r0.z
            a32 r4 = r10.G(r4)
            r3.b(r4, r0)
            int r3 = r54.ordinal()
            long r4 = r0.b
            if (r3 == 0) goto L_0x0450
            r6 = 1
            if (r3 == r6) goto L_0x043c
            goto L_0x055a
        L_0x043c:
            twf r0 = new twf
            r33 = 0
            r32 = r0
            r34 = r12
            r36 = r4
            r32.<init>(r33, r34, r36)
            r3 = r38
            r3.c(r0)
            goto L_0x055a
        L_0x0450:
            r3 = r38
            if (r29 == 0) goto L_0x0474
            r8 = r29
            ha9 r6 = r8.a
            long r6 = r6.b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0474
            r6 = 0
            r10.u0(r12, r0, r6)
            xy2 r7 = new xy2
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            java.util.List r8 = (java.util.List) r8
            r7.<init>(r8, r6)
            r3.c(r7)
        L_0x0474:
            if (r25 != 0) goto L_0x04b5
            a33 r6 = r14.a
            long r6 = r6.s()
            boolean r6 = r0.s(r6)
            if (r6 == 0) goto L_0x04b5
            u52 r6 = new u52
            r15 = 0
            r7 = r6
            r23 = r39
            r8 = r10
            r11 = r19
            r9 = r0
            r17 = r14
            r1 = r18
            r14 = r10
            r10 = r12
            r38 = r3
            r26 = r4
            r3 = r12
            r12 = r15
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (long) r10, (int) r12)
            r5 = 1
            r14.i(r3, r5, r6)
            xy2 r5 = new xy2
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.util.List r6 = java.util.Collections.singletonList(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            r5.<init>(r6, r7)
            sv0 r6 = r14.m
            r6.c(r5)
            goto L_0x04c1
        L_0x04b5:
            r38 = r3
            r26 = r4
            r3 = r12
            r17 = r14
            r1 = r18
            r23 = r39
            r14 = r10
        L_0x04c1:
            if (r25 == 0) goto L_0x04cf
            long r11 = r0.i()
            long r8 = r2.a
            m72 r10 = r2.b
            r7 = r14
            r7.t0(r8, r10, r11)
        L_0x04cf:
            twf r5 = new twf
            r33 = 0
            r32 = r5
            r34 = r3
            r36 = r26
            r32.<init>(r33, r34, r36)
            r9 = r38
            r9.c(r5)
            re9 r5 = defpackage.re9.c
            if (r1 == r5) goto L_0x04fe
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto L_0x04ec
            goto L_0x0520
        L_0x04ec:
            r5 = r19
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            gz r1 = (defpackage.gz) r1
            if (r1 != 0) goto L_0x04f8
            goto L_0x0520
        L_0x04f8:
            b10 r5 = defpackage.b10.CONTROL
            b10 r1 = r1.a
            if (r1 != r5) goto L_0x0520
        L_0x04fe:
            ke7 r1 = new ke7
            bl4 r32 = defpackage.bl4.REGULAR
            boolean r33 = r0.z()
            long r5 = r0.b
            r12 = r53
            boolean r7 = r12.w
            long r10 = r2.a
            long r12 = r0.w
            r26 = r1
            r27 = r10
            r29 = r5
            r31 = r7
            r34 = r12
            r26.<init>(r27, r29, r31, r32, r33, r34)
            r9.c(r1)
        L_0x0520:
            if (r25 != 0) goto L_0x054d
            boolean r1 = r2.H()
            if (r1 != 0) goto L_0x054d
            r10 = r17
            a33 r1 = r10.a
            boolean r1 = r2.X(r1)
            if (r1 == 0) goto L_0x0538
            boolean r1 = r2.C()
            if (r1 == 0) goto L_0x054d
        L_0x0538:
            java.lang.Object r1 = r22.get()
            qwa r1 = (defpackage.qwa) r1
            r13 = r21
            long r5 = r13.a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.util.Set r5 = java.util.Collections.singleton(r5)
            r1.d(r5)
        L_0x054d:
            a89 r1 = r2.v
            if (r1 == 0) goto L_0x055a
            long r0 = r0.c
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x055a
            r14.y0(r3)
        L_0x055a:
            return
        L_0x055b:
            r12 = r1
            r22 = r3
            r13 = r21
            r9 = r38
            r1 = 0
            r5 = 1
            r51 = r14
            r14 = r10
            r10 = r51
            java.lang.String r3 = "onNotifMessage: messageExistedBefore == false"
            defpackage.z68.c(r4, r3, new java.lang.Object[0])
            java.lang.Object r3 = r6.get()
            esb r3 = (defpackage.esb) r3
            long r5 = r11.z
            a32 r5 = r14.G(r5)
            r3.b(r5, r11)
            g72 r3 = r13.n
            r5 = r54
            java.util.ArrayList r3 = r3.d(r5)
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = "onNotifMessage: chunks count = %d"
            defpackage.z68.c(r4, r6, r3)
            a33 r3 = r10.a
            r15 = r2
            long r1 = r3.s()
            boolean r1 = r11.H(r1)
            if (r28 != 0) goto L_0x05a8
            if (r1 != 0) goto L_0x05a8
            r18 = 1
            goto L_0x05aa
        L_0x05a8:
            r18 = 0
        L_0x05aa:
            if (r8 == 0) goto L_0x05e6
            long r2 = r15.o()
            r38 = r9
            ha9 r9 = r8.a
            r17 = r10
            long r9 = r9.o
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x05e3
            if (r1 == 0) goto L_0x05e3
            java.lang.Object r2 = r7.get()
            r39 = r2
            ysc r39 = (defpackage.ysc) r39
            r39.getClass()
            r46 = 0
            r49 = 120(0x78, float:1.68E-43)
            long r2 = r13.a
            long r9 = r11.o
            r21 = r4
            long r4 = r11.c
            r47 = 0
            r48 = 0
            r40 = r2
            r42 = r9
            r44 = r4
            defpackage.ysc.e(r39, r40, r42, r44, r46, r47, r48, r49)
            goto L_0x05ec
        L_0x05e3:
            r21 = r4
            goto L_0x05ec
        L_0x05e6:
            r21 = r4
            r38 = r9
            r17 = r10
        L_0x05ec:
            boolean r2 = r54.b()
            if (r2 == 0) goto L_0x0624
            if (r8 == 0) goto L_0x0624
            long r2 = r15.o()
            ha9 r4 = r8.a
            long r4 = r4.o
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0624
            if (r1 == 0) goto L_0x0624
            java.lang.Object r1 = r7.get()
            r39 = r1
            ysc r39 = (defpackage.ysc) r39
            r39.getClass()
            r46 = 0
            r49 = 120(0x78, float:1.68E-43)
            long r1 = r13.a
            long r3 = r11.o
            long r7 = r11.c
            r47 = 0
            r48 = 0
            r40 = r1
            r42 = r3
            r44 = r7
            defpackage.ysc.e(r39, r40, r42, r44, r46, r47, r48, r49)
        L_0x0624:
            int r1 = r54.ordinal()
            if (r1 == 0) goto L_0x0631
            r5 = r14
            r9 = r17
            r10 = r38
            r7 = 1
            goto L_0x0649
        L_0x0631:
            r2 = r15
            long r1 = r2.a
            long r3 = r12.x
            r10 = r38
            r13 = r14
            r5 = r14
            r9 = r17
            r7 = 1
            r14 = r1
            r16 = r25
            r17 = r11
            r19 = r3
            a32 r2 = r13.b0(r14, r16, r17, r18, r19)
            r15 = r2
        L_0x0649:
            if (r15 == 0) goto L_0x0745
            m72 r1 = r15.b
            g72 r2 = r1.n
            r8 = r54
            java.util.ArrayList r2 = r2.d(r8)
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = r21
            defpackage.z68.c(r3, r6, r2)
            xy2 r2 = new xy2
            long r13 = r15.a
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.List r3 = (java.util.List) r3
            r2.<init>(r3, r7)
            r10.c(r2)
            ke7 r7 = new ke7
            boolean r16 = r11.z()
            long r3 = r11.b
            boolean r6 = r12.w
            r17 = r3
            long r3 = r15.a
            r19 = r13
            long r12 = r11.w
            r2 = r7
            r14 = r22
            r8 = r5
            r21 = r6
            r5 = r17
            r17 = r1
            r1 = r7
            r7 = r21
            r31 = r8
            r18 = r15
            r14 = r26
            r8 = r54
            r50 = r9
            r9 = r16
            r14 = r10
            r15 = r11
            r10 = r12
            r2.<init>(r3, r5, r7, r8, r9, r10)
            r14.c(r1)
            boolean r1 = r54.b()
            if (r1 == 0) goto L_0x06e1
            hs7 r1 = r0.k
            java.lang.Object r1 = r1.get()
            ne7 r1 = (defpackage.ne7) r1
            boolean r2 = r15.z()
            r1.getClass()
            if (r2 == 0) goto L_0x06c6
            goto L_0x06e1
        L_0x06c6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onIncomingMessage: chatId = "
            r2.<init>(r3)
            r3 = r19
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "ne7"
            defpackage.z68.c(r5, r2, new java.lang.Object[0])
            r5 = r26
            r1.c(r3, r5)
            goto L_0x06e3
        L_0x06e1:
            r3 = r19
        L_0x06e3:
            boolean r1 = r54.b()
            if (r1 == 0) goto L_0x0734
            r10 = r50
            a33 r1 = r10.a
            r2 = r18
            boolean r1 = r2.X(r1)
            if (r1 != 0) goto L_0x0734
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6 = r31
            java.util.Set r3 = r6.k
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x0734
            if (r25 != 0) goto L_0x0734
            r1 = r53
            boolean r1 = r1.w
            if (r1 == 0) goto L_0x071f
            boolean r1 = r2.K()
            if (r1 != 0) goto L_0x0734
            hs7 r1 = r0.l
            java.lang.Object r1 = r1.get()
            fn4 r1 = (defpackage.fn4) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0734
        L_0x071f:
            java.lang.Object r1 = r22.get()
            qwa r1 = (defpackage.qwa) r1
            r2 = r17
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.Set r2 = java.util.Collections.singleton(r2)
            r1.d(r2)
        L_0x0734:
            boolean r1 = r15.o()
            if (r1 == 0) goto L_0x0745
            hs7 r0 = r0.n
            java.lang.Object r0 = r0.get()
            hz r0 = (defpackage.hz) r0
            r0.a(r15)
        L_0x0745:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mba.a(kba, bl4):void");
    }
}
