package defpackage;

/* renamed from: eib  reason: default package */
public final class eib implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ jib c;

    public /* synthetic */ eib(ds5 ds5, jib jib, int i) {
        this.a = i;
        this.b = ds5;
        this.c = jib;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x013c;
                case 1: goto L_0x005b;
                default: goto L_0x000b;
            }
        L_0x000b:
            boolean r3 = r2 instanceof defpackage.hib
            if (r3 == 0) goto L_0x001e
            r3 = r2
            hib r3 = (defpackage.hib) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x0023
        L_0x001e:
            hib r3 = new hib
            r3.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 1
            if (r5 == 0) goto L_0x003c
            if (r5 != r6) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0058
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            jib r1 = r0.c
            cp3 r1 = r1.o
            r1.d()
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r3.b = r6
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x005a:
            return r4
        L_0x005b:
            boolean r3 = r2 instanceof defpackage.gib
            if (r3 == 0) goto L_0x006e
            r3 = r2
            gib r3 = (defpackage.gib) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x006e
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x0073
        L_0x006e:
            gib r3 = new gib
            r3.<init>(r0, r2)
        L_0x0073:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 1
            if (r5 == 0) goto L_0x008d
            if (r5 != r6) goto L_0x0085
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0139
        L_0x0085:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x008d:
            kotlin.ResultKt.throwOnFailure(r2)
            ds5 r2 = r0.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            jib r0 = r0.c
            java.lang.String r5 = r0.b
            java.lang.String r7 = "all.chat.folder"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 != 0) goto L_0x00a2
            goto L_0x0130
        L_0x00a2:
            kotlin.Lazy r5 = r0.X
            java.lang.Object r5 = r5.getValue()
            bud r5 = (defpackage.bud) r5
            akd r5 = (defpackage.akd) r5
            boolean r5 = r5.y()
            if (r5 != 0) goto L_0x00b4
            goto L_0x0130
        L_0x00b4:
            kotlin.Lazy r0 = r0.Y
            java.lang.Object r0 = r0.getValue()
            edd r0 = (defpackage.edd) r0
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 != 0) goto L_0x00c8
            goto L_0x0130
        L_0x00c8:
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r6
            r7 = 0
            if (r5 == 0) goto L_0x00f4
            java.util.Iterator r5 = r1.iterator()
            r8 = r7
        L_0x00d5:
            boolean r9 = r5.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x00ee
            java.lang.Object r9 = r5.next()
            hhb r9 = (defpackage.hhb) r9
            long r11 = r9.a
            long r13 = r0.a
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            int r8 = r8 + 1
            goto L_0x00d5
        L_0x00ee:
            r8 = r10
        L_0x00ef:
            if (r8 == r10) goto L_0x00f4
            r1.remove(r8)
        L_0x00f4:
            hhb r5 = new hhb
            long r12 = r0.a
            long r14 = r0.g()
            r0.l0()
            java.lang.CharSequence r8 = r0.X
            kl0 r9 = defpackage.kl0.c
            jl0 r10 = defpackage.jl0.a
            java.lang.String r9 = r0.h(r9, r10)
            if (r9 == 0) goto L_0x0112
            android.net.Uri r9 = android.net.Uri.parse(r9)
        L_0x010f:
            r18 = r9
            goto L_0x0114
        L_0x0112:
            r9 = 0
            goto L_0x010f
        L_0x0114:
            dkb r9 = new dkb
            long r10 = r0.a
            ckb r0 = defpackage.ckb.a
            r9.<init>(r10, r0)
            r19 = 0
            r20 = 0
            r17 = 0
            java.lang.String r22 = ""
            r11 = r5
            r16 = r8
            r21 = r9
            r11.<init>(r12, r14, r16, r17, r18, r19, r20, r21, r22)
            r1.add(r7, r5)
        L_0x0130:
            r3.b = r6
            java.lang.Object r0 = r2.a(r1, r3)
            if (r0 != r4) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x013b:
            return r4
        L_0x013c:
            boolean r3 = r2 instanceof defpackage.dib
            if (r3 == 0) goto L_0x014f
            r3 = r2
            dib r3 = (defpackage.dib) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x014f
            int r4 = r4 - r5
            r3.b = r4
            goto L_0x0154
        L_0x014f:
            dib r3 = new dib
            r3.<init>(r0, r2)
        L_0x0154:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            r6 = 1
            if (r5 == 0) goto L_0x016d
            if (r5 != r6) goto L_0x0165
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x01a1
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x016d:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            jib r2 = r0.c
            kotlin.jvm.functions.Function0 r5 = r2.w
            java.lang.Object r5 = r5.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01a1
            etc r2 = r2.x0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01a1
            r3.b = r6
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x01a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eib.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
