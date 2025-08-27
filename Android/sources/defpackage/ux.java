package defpackage;

/* renamed from: ux  reason: default package */
public final class ux implements tu, u0d {
    public final long a;
    public final bl4 b;
    public final ocf c;
    public final yj9 d;
    public final sa2 e;
    public final is9 f;
    public final tu g;
    public final cjd h;
    public final String i = ux.class.getName();
    public dz6 j;

    public ux(long j2, bl4 bl4, ocf ocf, yj9 yj9, sa2 sa2, is9 is9, nx nxVar, cjd cjd) {
        this.a = j2;
        this.b = bl4;
        this.c = ocf;
        this.d = yj9;
        this.e = sa2;
        this.f = is9;
        this.g = nxVar;
        this.h = cjd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: kotlin.jvm.internal.Ref$IntRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: a32} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x021f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r36, int r38, int r39, long r40, long r42, kotlin.coroutines.Continuation r44) {
        /*
            r35 = this;
            r0 = r35
            r1 = r44
            boolean r2 = r1 instanceof defpackage.px
            if (r2 == 0) goto L_0x0017
            r2 = r1
            px r2 = (defpackage.px) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.Y = r3
            goto L_0x001c
        L_0x0017:
            px r2 = new px
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.z
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.Y
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0081
            if (r4 == r7) goto L_0x0064
            if (r4 == r6) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.Object r0 = r2.c
            ma2 r0 = (defpackage.ma2) r0
            java.lang.Object r3 = r2.b
            kotlin.jvm.internal.Ref$IntRef r3 = (kotlin.jvm.internal.Ref.IntRef) r3
            ux r2 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0222
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            long r6 = r2.y
            ma2 r4 = r2.x
            kotlin.jvm.internal.Ref$LongRef r9 = r2.w
            kotlin.jvm.internal.Ref$LongRef r10 = r2.v
            kotlin.jvm.internal.Ref$IntRef r11 = r2.o
            java.lang.Object r0 = r2.c
            r12 = r0
            kotlin.jvm.internal.Ref$IntRef r12 = (kotlin.jvm.internal.Ref.IntRef) r12
            java.lang.Object r0 = r2.b
            r13 = r0
            a32 r13 = (defpackage.a32) r13
            ux r14 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x01e1
        L_0x0061:
            r0 = move-exception
            goto L_0x01f3
        L_0x0064:
            long r9 = r2.y
            kotlin.jvm.internal.Ref$LongRef r0 = r2.w
            kotlin.jvm.internal.Ref$LongRef r4 = r2.v
            kotlin.jvm.internal.Ref$IntRef r7 = r2.o
            java.lang.Object r11 = r2.c
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r12 = r2.b
            a32 r12 = (defpackage.a32) r12
            ux r13 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r5 = r0
            r8 = r9
            r10 = r4
            r4 = r12
            r12 = r11
            r11 = r7
            goto L_0x01a2
        L_0x0081:
            kotlin.ResultKt.throwOnFailure(r1)
            long r9 = r0.a
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            yj9 r4 = r0.d
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            qx2 r4 = (defpackage.qx2) r4
            long r9 = r1.longValue()
            my2 r4 = (defpackage.my2) r4
            etc r1 = r4.o(r9)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            java.lang.String r4 = r0.i
            if (r1 == 0) goto L_0x024e
            m72 r9 = r1.b
            long r10 = r9.a
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00c2
            cjd r10 = r0.h
            long r10 = r10.a()
            boolean r10 = r9.h(r10)
            if (r10 != 0) goto L_0x00c2
            goto L_0x024e
        L_0x00c2:
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            r11 = r39
            r10.element = r11
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef
            r11.<init>()
            r14 = r38
            r11.element = r14
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r5 = r40
            r14.element = r5
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r7 = r42
            r5.element = r7
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r36)
            java.lang.String r7 = defpackage.iq.U(r7)
            int r8 = r11.element
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            int r6 = r10.element
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            long r12 = r5.element
            java.lang.Long r12 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
            r19 = r1
            r13 = r2
            long r1 = r5.element
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r8, r6, r12, r1}
            java.lang.String r2 = "getMessages: %s, backwardCount: %s, forwardCount: %d, backwardLimit: %s, forwardLimit: %s"
            defpackage.z68.c(r4, r2, r1)
            long r1 = r14.element
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x011c
            r14.element = r6
        L_0x011c:
            long r1 = r5.element
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0124
            r5.element = r6
        L_0x0124:
            bl4 r1 = defpackage.bl4.DELAYED
            bl4 r2 = r0.b
            if (r2 != r1) goto L_0x013d
            int r1 = r10.element
            long r6 = r5.element
            int r4 = r11.element
            r10.element = r4
            r39 = r13
            long r12 = r14.element
            r5.element = r12
            r11.element = r1
            r14.element = r6
            goto L_0x013f
        L_0x013d:
            r39 = r13
        L_0x013f:
            yt r1 = new yt
            int r4 = r10.element
            long r6 = r5.element
            int r8 = r11.element
            long r12 = r14.element
            java.lang.String r33 = ""
            r31 = 0
            r17 = r14
            long r14 = r9.a
            r32 = 1
            r20 = r1
            r21 = r14
            r23 = r36
            r25 = r4
            r26 = r6
            r28 = r8
            r29 = r12
            r34 = r2
            r20.<init>(r21, r23, r25, r26, r28, r29, r31, r32, r33, r34)
            qx r2 = new qx
            r4 = 0
            r2.<init>(r0, r1, r4)
            sbd r1 = new sbd
            r1.<init>(r2)
            rx r2 = new rx
            r2.<init>(r0, r4)
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            wb r1 = defpackage.bs0.R(r1, r7, r2)
            r2 = r39
            r2.a = r0
            r4 = r19
            r2.b = r4
            r2.c = r10
            r2.o = r11
            r7 = r17
            r2.v = r7
            r2.w = r5
            r8 = r36
            r2.y = r8
            r12 = 1
            r2.Y = r12
            java.lang.Object r1 = defpackage.bs0.z(r1, r2)
            if (r1 != r3) goto L_0x019f
            return r3
        L_0x019f:
            r13 = r0
            r12 = r10
            r10 = r7
        L_0x01a2:
            ma2 r1 = (defpackage.ma2) r1
            java.lang.String r0 = r13.i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r14 = "response received "
            r7.<init>(r14)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            defpackage.z68.c(r0, r7, new java.lang.Object[0])
            is9 r0 = r13.f     // Catch:{ all -> 0x01ed }
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x01ed }
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.SECONDS     // Catch:{ all -> 0x01ed }
            r14 = 2
            long r6 = kotlin.time.DurationKt.toDuration((int) r14, (kotlin.time.DurationUnit) r7)     // Catch:{ all -> 0x01ed }
            r2.a = r13     // Catch:{ all -> 0x01ed }
            r2.b = r4     // Catch:{ all -> 0x01ed }
            r2.c = r12     // Catch:{ all -> 0x01ed }
            r2.o = r11     // Catch:{ all -> 0x01ed }
            r2.v = r10     // Catch:{ all -> 0x01ed }
            r2.w = r5     // Catch:{ all -> 0x01ed }
            r2.x = r1     // Catch:{ all -> 0x01ed }
            r2.y = r8     // Catch:{ all -> 0x01ed }
            r14 = 2
            r2.Y = r14     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = r0.n(r1, r6, r2)     // Catch:{ all -> 0x01ed }
            if (r0 != r3) goto L_0x01dc
            return r3
        L_0x01dc:
            r6 = r8
            r14 = r13
            r13 = r4
            r9 = r5
            r4 = r1
        L_0x01e1:
            r0 = r4
            r18 = r6
            r21 = r9
            r23 = r10
            r22 = r11
            r17 = r13
            goto L_0x01fb
        L_0x01ed:
            r0 = move-exception
            r6 = r8
            r14 = r13
            r13 = r4
            r9 = r5
            r4 = r1
        L_0x01f3:
            java.lang.String r1 = r14.i
            java.lang.String r5 = "fail to request missed contacts"
            defpackage.z68.f(r1, r5, r0)
            goto L_0x01e1
        L_0x01fb:
            ox r1 = new ox
            r15 = r1
            r16 = r14
            r20 = r12
            r24 = r0
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24)
            r2.a = r14
            r2.b = r12
            r2.c = r0
            r4 = 0
            r2.o = r4
            r2.v = r4
            r2.w = r4
            r2.x = r4
            r4 = 3
            r2.Y = r4
            java.lang.Object r1 = defpackage.ryg.W(r1, r2)
            if (r1 != r3) goto L_0x0220
            return r3
        L_0x0220:
            r3 = r12
            r2 = r14
        L_0x0222:
            dz6 r1 = r2.j
            if (r1 == 0) goto L_0x0243
            bl4 r1 = r2.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0243
            int r1 = r3.element
            if (r1 == 0) goto L_0x0243
            java.util.List r1 = r0.c
            int r1 = r1.size()
            r3 = 40
            if (r1 >= r3) goto L_0x0243
            dz6 r1 = r2.j
            if (r1 == 0) goto L_0x0243
            r1.b()
        L_0x0243:
            java.util.List r0 = r0.c
            int r0 = r0.size()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        L_0x024e:
            java.lang.String r0 = "getMessages: chat is null or chat.getServerId() == 0, return"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            r0 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r19, int r21, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.sx
            if (r1 == 0) goto L_0x0018
            r1 = r0
            sx r1 = (defpackage.sx) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.x = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            sx r1 = new sx
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.v
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.x
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r2) goto L_0x003c
            if (r1 != r13) goto L_0x0034
            ux r1 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0091
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            long r1 = r11.c
            int r3 = r11.o
            long r4 = r11.b
            ux r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r4
            r10 = r6
            goto L_0x0079
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r0)
            r11.a = r10
            r14 = r19
            r11.b = r14
            r9 = r21
            r11.o = r9
            r7 = r22
            r11.c = r7
            r11.x = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0075
            return r12
        L_0x0075:
            r3 = r21
            r1 = r22
        L_0x0079:
            tu r0 = r10.g
            r11.a = r10
            r11.x = r13
            r18 = r0
            r19 = r14
            r21 = r3
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.b(r19, r21, r22, r24)
            if (r0 != r12) goto L_0x0090
            return r12
        L_0x0090:
            r1 = r10
        L_0x0091:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.b(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r17, int r19, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.tx
            if (r1 == 0) goto L_0x0018
            r1 = r0
            tx r1 = (defpackage.tx) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.x = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            tx r1 = new tx
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.v
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.x
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r2) goto L_0x003c
            if (r1 != r13) goto L_0x0034
            ux r1 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008a
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            long r1 = r11.c
            int r3 = r11.o
            long r4 = r11.b
            ux r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r4
            r10 = r6
            goto L_0x0072
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r0)
            r11.a = r10
            r14 = r17
            r11.b = r14
            r9 = r19
            r11.o = r9
            r7 = r20
            r11.c = r7
            r11.x = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r17
            r4 = r19
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006e
            return r12
        L_0x006e:
            r3 = r19
            r1 = r20
        L_0x0072:
            tu r0 = r10.g
            r11.a = r10
            r11.x = r13
            r16 = r0
            r17 = r14
            r19 = r3
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.c(r17, r19, r20, r22)
            if (r0 != r12) goto L_0x0089
            return r12
        L_0x0089:
            r1 = r10
        L_0x008a:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.c(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(dz6 dz6) {
        this.j = dz6;
    }
}
