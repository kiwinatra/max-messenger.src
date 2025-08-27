package defpackage;

/* renamed from: fk2  reason: default package */
public final class fk2 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ lk2 c;

    public /* synthetic */ fk2(ds5 ds5, lk2 lk2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = lk2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            ds5 r0 = r12.b
            lk2 r1 = r12.c
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r12.a
            switch(r5) {
                case 0: goto L_0x00c4;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r5 = r14 instanceof defpackage.jk2
            if (r5 == 0) goto L_0x001f
            r5 = r14
            jk2 r5 = (defpackage.jk2) r5
            int r6 = r5.b
            r7 = r6 & r4
            if (r7 == 0) goto L_0x001f
            int r6 = r6 - r4
            r5.b = r6
            goto L_0x0024
        L_0x001f:
            jk2 r5 = new jk2
            r5.<init>(r12, r14)
        L_0x0024:
            java.lang.Object r12 = r5.a
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r5.b
            if (r4 == 0) goto L_0x003b
            if (r4 != r3) goto L_0x0035
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00c1
        L_0x0035:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r2)
            throw r12
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r12)
            a32 r13 = (defpackage.a32) r13
            pr2 r12 = r1.Z
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x0053
            if (r12 != r3) goto L_0x004d
            int r12 = defpackage.lxa.w0
            goto L_0x0055
        L_0x004d:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0053:
            int r12 = defpackage.lxa.o0
        L_0x0055:
            pr2 r1 = r1.Z
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0085
            if (r1 != r3) goto L_0x007f
            int r1 = defpackage.kxa.b
            m72 r2 = r13.b
            int r2 = r2.c()
            m72 r4 = r13.b
            int r4 = r4.c()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            ggf r6 = new ggf
            java.util.List r4 = kotlin.collections.ArraysKt.toList((T[]) r4)
            r6.<init>(r4, r1, r2)
            goto L_0x00a4
        L_0x007f:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0085:
            int r1 = defpackage.kxa.a
            m72 r2 = r13.b
            int r2 = r2.c()
            m72 r4 = r13.b
            int r4 = r4.c()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            ggf r6 = new ggf
            java.util.List r4 = kotlin.collections.ArraysKt.toList((T[]) r4)
            r6.<init>(r4, r1, r2)
        L_0x00a4:
            rj2 r1 = new rj2
            boolean r2 = r13.c0()
            if (r2 == 0) goto L_0x00b4
            boolean r13 = r13.u()
            if (r13 == 0) goto L_0x00b4
            r13 = r3
            goto L_0x00b5
        L_0x00b4:
            r13 = 0
        L_0x00b5:
            r1.<init>(r12, r6, r13)
            r5.b = r3
            java.lang.Object r12 = r0.a(r1, r5)
            if (r12 != r14) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x00c3:
            return r14
        L_0x00c4:
            boolean r5 = r14 instanceof defpackage.ek2
            if (r5 == 0) goto L_0x00d5
            r5 = r14
            ek2 r5 = (defpackage.ek2) r5
            int r6 = r5.b
            r7 = r6 & r4
            if (r7 == 0) goto L_0x00d5
            int r6 = r6 - r4
            r5.b = r6
            goto L_0x00da
        L_0x00d5:
            ek2 r5 = new ek2
            r5.<init>(r12, r14)
        L_0x00da:
            java.lang.Object r12 = r5.a
            java.lang.Object r14 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r5.b
            if (r4 == 0) goto L_0x00f1
            if (r4 != r3) goto L_0x00eb
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x01e7
        L_0x00eb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r2)
            throw r12
        L_0x00f1:
            kotlin.ResultKt.throwOnFailure(r12)
            a32 r13 = (defpackage.a32) r13
            w29 r12 = new w29
            pr2 r2 = r1.Z
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x014f
            if (r2 != r3) goto L_0x0149
            boolean r2 = r13.u()
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder()
            if (r2 == 0) goto L_0x0125
            int r2 = defpackage.jxa.u0
            int r6 = defpackage.cad.b
            int r7 = defpackage.lxa.W1
            igf r8 = new igf
            r8.<init>(r7)
            h1e r7 = defpackage.h1e.a
            s29 r7 = new s29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r2, r8, r6)
            r4.add(r7)
        L_0x0125:
            boolean r2 = defpackage.lk2.m(r13)
            if (r2 == 0) goto L_0x0144
            int r2 = defpackage.jxa.D0
            int r6 = defpackage.cad.h1
            int r7 = defpackage.lxa.h2
            igf r8 = new igf
            r8.<init>(r7)
            h1e r7 = defpackage.h1e.a
            s29 r7 = new s29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r2, r8, r6)
            r4.add(r7)
        L_0x0144:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r4)
            goto L_0x0195
        L_0x0149:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x014f:
            boolean r2 = r13.u()
            java.util.List r4 = kotlin.collections.CollectionsKt.createListBuilder()
            if (r2 == 0) goto L_0x0172
            int r2 = defpackage.jxa.u0
            int r6 = defpackage.cad.b
            int r7 = defpackage.lxa.V1
            igf r8 = new igf
            r8.<init>(r7)
            h1e r7 = defpackage.h1e.a
            s29 r7 = new s29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r2, r8, r6)
            r4.add(r7)
        L_0x0172:
            boolean r2 = defpackage.lk2.m(r13)
            if (r2 == 0) goto L_0x0191
            int r2 = defpackage.jxa.D0
            int r6 = defpackage.cad.h1
            int r7 = defpackage.lxa.h2
            igf r8 = new igf
            r8.<init>(r7)
            h1e r7 = defpackage.h1e.a
            s29 r7 = new s29
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r2, r8, r6)
            r4.add(r7)
        L_0x0191:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r4)
        L_0x0195:
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x01d7
            m72 r13 = r13.b
            int r1 = r13.c()
            r4 = 10
            if (r1 <= r4) goto L_0x01d2
            int r7 = defpackage.jxa.X0
            int r1 = defpackage.cad.g2
            int r4 = defpackage.lxa.B2
            igf r8 = new igf
            r8.<init>(r4)
            h1e r9 = defpackage.h1e.b
            b1e r11 = new b1e
            int r13 = r13.c()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            mgf r4 = new mgf
            r4.<init>(r13)
            r13 = 0
            r11.<init>(r4, r13)
            s29 r13 = new s29
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r13)
            goto L_0x01db
        L_0x01d2:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x01db
        L_0x01d7:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01db:
            r12.<init>(r2, r13)
            r5.b = r3
            java.lang.Object r12 = r0.a(r12, r5)
            if (r12 != r14) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x01e9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
