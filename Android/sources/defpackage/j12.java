package defpackage;

/* renamed from: j12  reason: default package */
public final class j12 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ j12(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r28, kotlin.coroutines.Continuation r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.Object r6 = r0.b
            java.lang.Object r7 = r0.c
            java.lang.Object r8 = r0.o
            java.lang.Object r9 = r0.v
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x0387;
                case 1: goto L_0x02b3;
                case 2: goto L_0x01c1;
                case 3: goto L_0x00e9;
                default: goto L_0x0019;
            }
        L_0x0019:
            boolean r2 = r1 instanceof defpackage.iib
            if (r2 == 0) goto L_0x002a
            r2 = r1
            iib r2 = (defpackage.iib) r2
            int r3 = r2.b
            r4 = r3 & r11
            if (r4 == 0) goto L_0x002a
            int r3 = r3 - r11
            r2.b = r3
            goto L_0x002f
        L_0x002a:
            iib r2 = new iib
            r2.<init>(r0, r1)
        L_0x002f:
            java.lang.Object r0 = r2.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.b
            if (r3 == 0) goto L_0x0046
            if (r3 != r12) goto L_0x0040
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00e6
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r28
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0053
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0053:
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.sequences.Sequence r3 = kotlin.collections.CollectionsKt.asSequence(r3)
            ak2 r4 = new ak2
            java.lang.Long r9 = (java.lang.Long) r9
            jib r8 = (defpackage.jib) r8
            r10 = 4
            r4.<init>(r10, r8, r9)
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.filterNot(r3, r4)
            java.util.Comparator r7 = (java.util.Comparator) r7
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.sortedWith(r3, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r0.size()
            r4.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x007b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r3 = r0.next()
            zo3 r3 = (defpackage.zo3) r3
            long r14 = r3.a
            x23 r7 = r8.v
            qjd r7 = (defpackage.qjd) r7
            long r9 = r7.s()
            long r16 = r14 ^ r9
            java.lang.CharSequence r7 = r3.v
            if (r7 == 0) goto L_0x009f
            mgf r9 = new mgf
            r9.<init>(r7)
            r19 = r9
            goto L_0x00a1
        L_0x009f:
            r19 = 0
        L_0x00a1:
            dkb r7 = new dkb
            x23 r9 = r8.v
            qjd r9 = (defpackage.qjd) r9
            long r9 = r9.s()
            r25 = r6
            long r5 = r3.a
            long r5 = r5 ^ r9
            ckb r9 = defpackage.ckb.b
            r7.<init>(r5, r9)
            hhb r5 = new hhb
            java.lang.CharSequence r6 = r3.b
            android.net.Uri r9 = r3.x
            boolean r10 = r3.y
            boolean r11 = r3.z
            java.lang.CharSequence r3 = r3.X
            r13 = r5
            r18 = r6
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r7
            r24 = r3
            r13.<init>(r14, r16, r18, r19, r20, r21, r22, r23, r24)
            r4.add(r5)
            r6 = r25
            goto L_0x007b
        L_0x00d7:
            r25 = r6
            r2.b = r12
            r6 = r25
            ds5 r6 = (defpackage.ds5) r6
            java.lang.Object r0 = r6.a(r4, r2)
            if (r0 != r1) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00e8:
            return r1
        L_0x00e9:
            r25 = r6
            boolean r2 = r1 instanceof defpackage.wk7
            if (r2 == 0) goto L_0x00fc
            r2 = r1
            wk7 r2 = (defpackage.wk7) r2
            int r5 = r2.b
            r6 = r5 & r11
            if (r6 == 0) goto L_0x00fc
            int r5 = r5 - r11
            r2.b = r5
            goto L_0x0101
        L_0x00fc:
            wk7 r2 = new wk7
            r2.<init>(r0, r1)
        L_0x0101:
            java.lang.Object r0 = r2.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.b
            if (r5 == 0) goto L_0x0136
            if (r5 == r12) goto L_0x012a
            if (r5 == r4) goto L_0x011c
            if (r5 != r3) goto L_0x0116
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x01be
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x011c:
            int r4 = r2.x
            java.lang.Object r5 = r2.v
            ysa r5 = (defpackage.ysa) r5
            ds5 r6 = r2.c
            kotlin.ResultKt.throwOnFailure(r0)
            r8 = 0
            goto L_0x01aa
        L_0x012a:
            ysa r5 = r2.w
            java.lang.Object r6 = r2.v
            mk4 r6 = (defpackage.mk4) r6
            ds5 r7 = r2.c
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x018c
        L_0x0136:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r28
            ysa r0 = (defpackage.ysa) r0
            p9a r5 = defpackage.xk7.y0
            xk7 r7 = (defpackage.xk7) r7
            jx3 r5 = r7.a
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r6 = r8.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.a()
            sk7 r10 = new sk7
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            r11 = 0
            r10.<init>(r9, r0, r11)
            nk4 r6 = defpackage.ev0.d(r5, r6, r10, r4)
            java.lang.Object r5 = r8.getValue()
            gaf r5 = (defpackage.gaf) r5
            osa r5 = (defpackage.osa) r5
            q04 r5 = r5.a()
            tk7 r8 = new tk7
            r8.<init>(r9, r0, r11)
            jx3 r7 = r7.a
            nk4 r5 = defpackage.ev0.d(r7, r5, r8, r4)
            r7 = r25
            ds5 r7 = (defpackage.ds5) r7
            r2.c = r7
            r2.v = r6
            r2.w = r0
            r2.b = r12
            java.lang.Object r5 = r5.a(r2)
            if (r5 != r1) goto L_0x0187
            goto L_0x01c0
        L_0x0187:
            r26 = r5
            r5 = r0
            r0 = r26
        L_0x018c:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.c = r7
            r2.v = r5
            r8 = 0
            r2.w = r8
            r2.x = r0
            r2.b = r4
            java.lang.Object r4 = r6.a(r2)
            if (r4 != r1) goto L_0x01a4
            goto L_0x01c0
        L_0x01a4:
            r6 = r7
            r26 = r4
            r4 = r0
            r0 = r26
        L_0x01aa:
            ngf r0 = (defpackage.ngf) r0
            w14 r7 = new w14
            r7.<init>(r5, r4, r0)
            r2.c = r8
            r2.v = r8
            r2.b = r3
            java.lang.Object r0 = r6.a(r7, r2)
            if (r0 != r1) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x01c0:
            return r1
        L_0x01c1:
            r25 = r6
            boolean r2 = r1 instanceof defpackage.oh7
            if (r2 == 0) goto L_0x01d4
            r2 = r1
            oh7 r2 = (defpackage.oh7) r2
            int r5 = r2.b
            r6 = r5 & r11
            if (r6 == 0) goto L_0x01d4
            int r5 = r5 - r11
            r2.b = r5
            goto L_0x01d9
        L_0x01d4:
            oh7 r2 = new oh7
            r2.<init>(r0, r1)
        L_0x01d9:
            java.lang.Object r0 = r2.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.b
            if (r5 == 0) goto L_0x020e
            if (r5 == r12) goto L_0x0202
            if (r5 == r4) goto L_0x01f4
            if (r5 != r3) goto L_0x01ee
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x02b0
        L_0x01ee:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x01f4:
            int r4 = r2.x
            java.lang.Object r5 = r2.v
            ysa r5 = (defpackage.ysa) r5
            ds5 r6 = r2.c
            kotlin.ResultKt.throwOnFailure(r0)
            r8 = 0
            goto L_0x029b
        L_0x0202:
            ysa r5 = r2.w
            java.lang.Object r6 = r2.v
            mk4 r6 = (defpackage.mk4) r6
            ds5 r7 = r2.c
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x027d
        L_0x020e:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r28
            ysa r0 = (defpackage.ysa) r0
            java.lang.String r5 = r0.a
            java.lang.String r6 = ""
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            r6 = r25
            ds5 r6 = (defpackage.ds5) r6
            if (r5 == 0) goto L_0x0230
            w14 r4 = new w14
            mgf r5 = defpackage.ngf.a
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4.<init>(r0, r7, r5)
            r8 = 0
            goto L_0x02a3
        L_0x0230:
            kotlin.reflect.KProperty[] r5 = defpackage.rh7.B0
            rh7 r7 = (defpackage.rh7) r7
            jx3 r5 = r7.a
            kotlin.Lazy r8 = (kotlin.Lazy) r8
            java.lang.Object r10 = r8.getValue()
            gaf r10 = (defpackage.gaf) r10
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.a()
            lh7 r11 = new lh7
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            r13 = 0
            r11.<init>(r9, r0, r13)
            nk4 r5 = defpackage.ev0.d(r5, r10, r11, r4)
            java.lang.Object r8 = r8.getValue()
            gaf r8 = (defpackage.gaf) r8
            osa r8 = (defpackage.osa) r8
            q04 r8 = r8.a()
            mh7 r10 = new mh7
            r10.<init>(r9, r0, r13)
            jx3 r7 = r7.a
            nk4 r7 = defpackage.ev0.d(r7, r8, r10, r4)
            r2.c = r6
            r2.v = r5
            r2.w = r0
            r2.b = r12
            java.lang.Object r7 = r7.a(r2)
            if (r7 != r1) goto L_0x0276
            goto L_0x02b2
        L_0x0276:
            r26 = r5
            r5 = r0
            r0 = r7
            r7 = r6
            r6 = r26
        L_0x027d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.c = r7
            r2.v = r5
            r8 = 0
            r2.w = r8
            r2.x = r0
            r2.b = r4
            java.lang.Object r4 = r6.a(r2)
            if (r4 != r1) goto L_0x0295
            goto L_0x02b2
        L_0x0295:
            r6 = r7
            r26 = r4
            r4 = r0
            r0 = r26
        L_0x029b:
            ngf r0 = (defpackage.ngf) r0
            w14 r7 = new w14
            r7.<init>(r5, r4, r0)
            r4 = r7
        L_0x02a3:
            r2.c = r8
            r2.v = r8
            r2.b = r3
            java.lang.Object r0 = r6.a(r4, r2)
            if (r0 != r1) goto L_0x02b0
            goto L_0x02b2
        L_0x02b0:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x02b2:
            return r1
        L_0x02b3:
            r25 = r6
            boolean r3 = r1 instanceof defpackage.dw2
            if (r3 == 0) goto L_0x02c6
            r3 = r1
            dw2 r3 = (defpackage.dw2) r3
            int r4 = r3.b
            r5 = r4 & r11
            if (r5 == 0) goto L_0x02c6
            int r4 = r4 - r11
            r3.b = r4
            goto L_0x02cb
        L_0x02c6:
            dw2 r3 = new dw2
            r3.<init>(r0, r1)
        L_0x02cb:
            java.lang.Object r0 = r3.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r3.b
            if (r4 == 0) goto L_0x02e2
            if (r4 != r12) goto L_0x02dc
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0384
        L_0x02dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x02e2:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r28
            po3 r0 = (defpackage.po3) r0
            java.util.List r4 = r0.a
            if (r4 != 0) goto L_0x02f1
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x02f1:
            java.util.List r0 = r0.c
            if (r0 != 0) goto L_0x02f9
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x02f9:
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            kotlin.sequences.Sequence r6 = kotlin.collections.CollectionsKt.asSequence(r6)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.plus(r5, r6)
            ak2 r6 = new ak2
            java.lang.Long r9 = (java.lang.Long) r9
            tw2 r8 = (defpackage.tw2) r8
            r6.<init>(r12, r8, r9)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.filterNot(r5, r6)
            java.util.Comparator r7 = (java.util.Comparator) r7
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.sortedWith(r5, r7)
            hw2 r6 = new hw2
            r6.<init>(r2, r8)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.onEach(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r4 = r4.size()
            int r0 = r0.size()
            int r0 = r0 + r4
            r6.<init>(r0)
            java.util.Iterator r0 = r5.iterator()
        L_0x0339:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0377
            java.lang.Object r4 = r0.next()
            zo3 r4 = (defpackage.zo3) r4
            rg5 r5 = new rg5
            long r14 = r4.a
            java.lang.CharSequence r7 = r4.w
            if (r7 != 0) goto L_0x0352
            java.lang.CharSequence r8 = r4.v
            r20 = r8
            goto L_0x0354
        L_0x0352:
            r20 = r7
        L_0x0354:
            if (r7 != 0) goto L_0x0359
            r21 = r12
            goto L_0x035b
        L_0x0359:
            r21 = r2
        L_0x035b:
            android.net.Uri r7 = r4.x
            boolean r8 = r4.y
            boolean r9 = r4.z
            java.lang.CharSequence r10 = r4.b
            java.lang.CharSequence r4 = r4.X
            r13 = r5
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r10
            r22 = r4
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22)
            r6.add(r5)
            goto L_0x0339
        L_0x0377:
            r3.b = r12
            r0 = r25
            ds5 r0 = (defpackage.ds5) r0
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r1) goto L_0x0384
            goto L_0x0386
        L_0x0384:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0386:
            return r1
        L_0x0387:
            r2 = r28
            bs5 r2 = (defpackage.bs5) r2
            java.lang.Object r0 = r0.e(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j12.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(defpackage.bs5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.i12
            if (r0 == 0) goto L_0x0013
            r0 = r6
            i12 r0 = (defpackage.i12) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            i12 r0 = new i12
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bs5 r5 = r0.b
            j12 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005d
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r4.b
            pm7 r6 = (defpackage.pm7) r6
            if (r6 == 0) goto L_0x004a
            boolean r2 = r6.isActive()
            if (r2 == 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            java.util.concurrent.CancellationException r4 = r6.n()
            throw r4
        L_0x004a:
            r0.a = r4
            r0.b = r5
            r0.v = r3
            java.lang.Object r6 = r4.c
            jrd r6 = (defpackage.jrd) r6
            mrd r6 = (defpackage.mrd) r6
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.Object r6 = r4.o
            cwb r6 = (defpackage.cwb) r6
            h12 r0 = new h12
            java.lang.Object r1 = r4.v
            fsd r1 = (defpackage.fsd) r1
            java.lang.Object r4 = r4.c
            jrd r4 = (defpackage.jrd) r4
            mrd r4 = (defpackage.mrd) r4
            r2 = 0
            r0.<init>(r5, r1, r4, r2)
            r4 = 3
            defpackage.ev0.v(r6, r2, r2, r0, r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j12.e(bs5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
