package defpackage;

/* renamed from: m9b  reason: default package */
public final class m9b implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ v9b c;

    public /* synthetic */ m9b(ds5 ds5, v9b v9b, int i) {
        this.a = i;
        this.b = ds5;
        this.c = v9b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: jm1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: j0g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: cf1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: i9b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: j0g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: j0g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: ts} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x0367;
                case 1: goto L_0x02bc;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r3 = r2 instanceof defpackage.u9b
            if (r3 == 0) goto L_0x001e
            r3 = r2
            u9b r3 = (defpackage.u9b) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x0023
        L_0x001e:
            u9b r3 = new u9b
            r3.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x0084
            if (r5 == r10) goto L_0x0065
            if (r5 == r9) goto L_0x0045
            if (r5 != r6) goto L_0x003d
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02b9
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            long r0 = r3.v0
            ts r5 = r3.Z
            java.util.Iterator r8 = r3.Y
            java.lang.Object r11 = r3.X
            ws r11 = (defpackage.ws) r11
            java.lang.Object r12 = r3.z
            java.util.Map r12 = (java.util.Map) r12
            i9b r13 = r3.y
            java.util.List r14 = r3.x
            java.util.List r14 = (java.util.List) r14
            cf1 r15 = r3.w
            ds5 r6 = r3.v
            m9b r9 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            r7 = 2
            goto L_0x019b
        L_0x0065:
            java.lang.Object r0 = r3.X
            ts r0 = (defpackage.ts) r0
            java.lang.Object r1 = r3.z
            ws r1 = (defpackage.ws) r1
            i9b r5 = r3.y
            java.util.List r6 = r3.x
            java.util.List r6 = (java.util.List) r6
            cf1 r9 = r3.w
            ds5 r11 = r3.v
            m9b r12 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            r31 = r11
            r11 = r0
            r0 = r12
        L_0x0080:
            r12 = r31
            goto L_0x0143
        L_0x0084:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            r9 = r2
            cf1 r9 = (defpackage.cf1) r9
            java.lang.Object r1 = r1.component2()
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            v9b r1 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = r1.x
            java.lang.Object r2 = r2.get()
            r5 = r2
            i9b r5 = (defpackage.i9b) r5
            java.util.Map r2 = r5.b
            ts r11 = new ts
            r11.<init>(r8)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b1:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x00d5
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            jm1 r13 = (defpackage.jm1) r13
            boolean r13 = r13.d()
            if (r13 != 0) goto L_0x00b1
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            r11.put(r13, r12)
            goto L_0x00b1
        L_0x00d5:
            r2 = r6
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            ws r12 = new ws
            r12.<init>((int) r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x00e1:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0109
            java.lang.Object r13 = r2.next()
            cf1 r13 = (defpackage.cf1) r13
            ze1 r13 = r13.getId()
            long r13 = r13.a
            java.lang.Long r15 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            boolean r15 = r11.containsKey(r15)
            if (r15 != 0) goto L_0x0102
            java.lang.Long r13 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            goto L_0x0103
        L_0x0102:
            r13 = r7
        L_0x0103:
            if (r13 == 0) goto L_0x00e1
            r12.add(r13)
            goto L_0x00e1
        L_0x0109:
            r3.c = r0
            ds5 r2 = r0.b
            r3.v = r2
            r3.w = r9
            r13 = r6
            java.util.List r13 = (java.util.List) r13
            r3.x = r13
            r3.y = r5
            r3.z = r12
            r3.X = r11
            r3.b = r10
            um1 r1 = r1.b
            ym1 r1 = (defpackage.ym1) r1
            kotlin.Lazy r13 = r1.c
            java.lang.Object r13 = r13.getValue()
            gaf r13 = (defpackage.gaf) r13
            osa r13 = (defpackage.osa) r13
            q04 r13 = r13.b()
            vm1 r14 = new vm1
            r14.<init>(r12, r1, r7)
            java.lang.Object r1 = defpackage.ev0.I(r13, r14, r3)
            if (r1 != r4) goto L_0x013d
            goto L_0x02bb
        L_0x013d:
            r31 = r2
            r2 = r1
            r1 = r12
            goto L_0x0080
        L_0x0143:
            java.util.Map r2 = (java.util.Map) r2
            ws r13 = new ws
            r13.<init>((int) r8)
            if (r1 == 0) goto L_0x014f
            r13.b(r1)
        L_0x014f:
            java.util.Set r1 = r2.keySet()
            java.util.Iterator r1 = r1.iterator()
            r8 = r1
            r14 = r6
            r15 = r9
            r6 = r12
            r9 = r0
            r12 = r2
            r31 = r13
            r13 = r5
            r5 = r11
            r11 = r31
        L_0x0163:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            v9b r2 = r9.c
            um1 r2 = r2.b
            r3.c = r9
            r3.v = r6
            r3.w = r15
            r7 = r14
            java.util.List r7 = (java.util.List) r7
            r3.x = r7
            r3.y = r13
            r3.z = r12
            r3.X = r11
            r3.Y = r8
            r3.Z = r5
            r3.v0 = r0
            r7 = 2
            r3.b = r7
            ym1 r2 = (defpackage.ym1) r2
            java.lang.Object r2 = r2.a(r0, r3)
            if (r2 != r4) goto L_0x019b
            goto L_0x02bb
        L_0x019b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01aa
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r11.remove(r0)
        L_0x01aa:
            r7 = 0
            goto L_0x0163
        L_0x01ac:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x01c1
            v9b r0 = r9.c
            cp1 r1 = r0.a
            j9b r2 = new j9b
            r7 = 0
            r2.<init>(r0, r11, r7)
            r0 = 3
            defpackage.ev0.v(r1, r7, r7, r2, r0)
        L_0x01c1:
            java.util.Map r0 = kotlin.collections.MapsKt.plus(r5, r12)
            y8b r1 = r13.a
            jm1 r1 = r1.b
            y8b r2 = new y8b
            r2.<init>(r15, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            boolean r5 = r15.k()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r14, 10)
            int r7 = kotlin.collections.MapsKt.mapCapacity(r7)
            r8 = 16
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast((int) r7, (int) r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r7)
            java.util.Iterator r7 = r14.iterator()
            r23 = r5
            r20 = 0
        L_0x01f4:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L_0x027c
            java.lang.Object r5 = r7.next()
            cf1 r5 = (defpackage.cf1) r5
            ze1 r11 = r5.getId()
            long r12 = r11.a
            boolean r14 = r5.g()
            if (r14 == 0) goto L_0x0212
            ze1 r14 = r5.getId()
            r20 = r14
        L_0x0212:
            boolean r14 = r5.k()
            if (r14 == 0) goto L_0x021c
            if (r23 != 0) goto L_0x021c
            r23 = r10
        L_0x021c:
            y8b r14 = new y8b
            java.lang.Long r15 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
            java.lang.Object r15 = r0.get(r15)
            jm1 r15 = (defpackage.jm1) r15
            if (r15 != 0) goto L_0x025f
            v9b r15 = r9.c
            um1 r15 = r15.b
            ym1 r15 = (defpackage.ym1) r15
            kotlin.Lazy r15 = r15.b
            java.lang.Object r15 = r15.getValue()
            eu3 r15 = (defpackage.eu3) r15
            vk3 r12 = r15.a(r12)
            java.lang.String r13 = r12.f()
            if (r13 != 0) goto L_0x0244
            java.lang.String r13 = ""
        L_0x0244:
            r27 = r13
            long r25 = r12.r()
            java.lang.CharSequence r28 = r12.q()
            kl0 r13 = defpackage.kl0.o
            java.lang.String r30 = r12.t(r13)
            boolean r29 = r12.B()
            j0g r15 = new j0g
            r24 = r15
            r24.<init>(r25, r27, r28, r29, r30)
        L_0x025f:
            r14.<init>(r5, r15)
            boolean r5 = r5.isScreenCaptureEnabled()
            if (r5 == 0) goto L_0x026b
            r1.put(r11, r14)
        L_0x026b:
            kotlin.Pair r5 = kotlin.TuplesKt.to(r11, r14)
            java.lang.Object r11 = r5.getFirst()
            java.lang.Object r5 = r5.getSecond()
            r8.put(r11, r5)
            goto L_0x01f4
        L_0x027c:
            java.util.Set r5 = r8.keySet()
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r5)
            r21 = r5
            ze1 r21 = (defpackage.ze1) r21
            i9b r5 = new i9b
            r16 = r5
            r17 = r2
            r18 = r0
            r19 = r8
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            v9b r0 = r9.c
            r0.e(r5)
            r0 = 0
            r3.c = r0
            r3.v = r0
            r3.w = r0
            r3.x = r0
            r3.y = r0
            r3.z = r0
            r3.X = r0
            r3.Y = r0
            r3.Z = r0
            r0 = 3
            r3.b = r0
            java.lang.Object r0 = r6.a(r5, r3)
            if (r0 != r4) goto L_0x02b9
            goto L_0x02bb
        L_0x02b9:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x02bb:
            return r4
        L_0x02bc:
            boolean r3 = r2 instanceof defpackage.t9b
            if (r3 == 0) goto L_0x02cf
            r3 = r2
            t9b r3 = (defpackage.t9b) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x02cf
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x02d4
        L_0x02cf:
            t9b r3 = new t9b
            r3.<init>(r0, r2)
        L_0x02d4:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 1
            if (r5 == 0) goto L_0x02ee
            if (r5 != r6) goto L_0x02e6
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0364
        L_0x02e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x02ee:
            kotlin.ResultKt.throwOnFailure(r2)
            ru.ok.android.externcalls.sdk.Conversation r1 = (ru.ok.android.externcalls.sdk.Conversation) r1
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r1.getMe()
            v9b r5 = r0.c
            nc1 r7 = r5.c
            af1 r7 = r7.a(r1, r2, r6)
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r8 = r1.getParticipants()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x030c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0331
            java.lang.Object r10 = r8.next()
            r11 = r10
            ru.ok.android.externcalls.sdk.ConversationParticipant r11 = (ru.ok.android.externcalls.sdk.ConversationParticipant) r11
            boolean r12 = r11.isUseable()
            if (r12 == 0) goto L_0x030c
            ru.ok.android.externcalls.sdk.id.ParticipantId r11 = r11.getExternalId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r12 = r2.getExternalId()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 != 0) goto L_0x030c
            r9.add(r10)
            goto L_0x030c
        L_0x0331:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r2.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x033e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0355
            java.lang.Object r9 = r8.next()
            ru.ok.android.externcalls.sdk.ConversationParticipant r9 = (ru.ok.android.externcalls.sdk.ConversationParticipant) r9
            r10 = 0
            nc1 r11 = r5.c
            af1 r9 = r11.a(r1, r9, r10)
            r2.add(r9)
            goto L_0x033e
        L_0x0355:
            kotlin.Pair r1 = kotlin.TuplesKt.to(r7, r2)
            r3.b = r6
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0366:
            return r4
        L_0x0367:
            boolean r3 = r2 instanceof defpackage.l9b
            if (r3 == 0) goto L_0x037a
            r3 = r2
            l9b r3 = (defpackage.l9b) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x037a
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x037f
        L_0x037a:
            l9b r3 = new l9b
            r3.<init>(r0, r2)
        L_0x037f:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 1
            if (r5 == 0) goto L_0x0398
            if (r5 != r6) goto L_0x0390
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x03d3
        L_0x0390:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0398:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            sn3 r2 = (defpackage.sn3) r2
            va8 r2 = r2.a
            v9b r5 = r0.c
            java.util.concurrent.atomic.AtomicReference r5 = r5.x
            java.lang.Object r5 = r5.get()
            i9b r5 = (defpackage.i9b) r5
            java.util.Map r5 = r5.c
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x03b4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x03d3
            java.lang.Object r7 = r5.next()
            ze1 r7 = (defpackage.ze1) r7
            long r7 = r7.a
            boolean r7 = r2.a(r7)
            if (r7 == 0) goto L_0x03b4
            r3.b = r6
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x03d3
            goto L_0x03d5
        L_0x03d3:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x03d5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9b.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
