package defpackage;

/* renamed from: yz2  reason: default package */
public final class yz2 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ fu4 c;

    public /* synthetic */ yz2(ds5 ds5, fu4 fu4, int i) {
        this.a = i;
        this.b = ds5;
        this.c = fu4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x006e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r8 = r9 instanceof defpackage.h03
            if (r8 == 0) goto L_0x0018
            r8 = r9
            h03 r8 = (defpackage.h03) r8
            int r0 = r8.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0018
            int r0 = r0 - r1
            r8.b = r0
            goto L_0x001d
        L_0x0018:
            h03 r8 = new h03
            r8.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r8.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.b
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006b
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r9)
            ds5 r9 = r7.b
            fu4 r1 = r7.c
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0046
            goto L_0x0054
        L_0x0046:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0054
            w78 r4 = defpackage.w78.o
            r5 = 0
            java.lang.String r6 = "big_flow: map"
            r3.d(r4, r1, r6, r5)
        L_0x0054:
            fu4 r7 = r7.c
            java.lang.Object r1 = r7.f
            l15 r1 = (defpackage.l15) r1
            java.lang.String r7 = r7.i()
            k2b r7 = r1.m(r7)
            r8.b = r2
            java.lang.Object r7 = r9.a(r7, r8)
            if (r7 != r0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x006d:
            return r0
        L_0x006e:
            boolean r0 = r9 instanceof defpackage.g03
            if (r0 == 0) goto L_0x0081
            r0 = r9
            g03 r0 = (defpackage.g03) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0081
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0086
        L_0x0081:
            g03 r0 = new g03
            r0.<init>(r7, r9)
        L_0x0086:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x009f
            if (r2 != r3) goto L_0x0097
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00c1
        L_0x0097:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x009f:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.floatValue()
            fu4 r9 = r7.c
            java.lang.Object r9 = r9.g
            l15 r9 = (defpackage.l15) r9
            k9a r9 = r9.o()
            boolean r9 = r9 instanceof defpackage.e9a
            if (r9 == 0) goto L_0x00c1
            r0.b = r3
            ds5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00c3:
            return r1
        L_0x00c4:
            boolean r0 = r9 instanceof defpackage.xz2
            if (r0 == 0) goto L_0x00d7
            r0 = r9
            xz2 r0 = (defpackage.xz2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d7
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00dc
        L_0x00d7:
            xz2 r0 = new xz2
            r0.<init>(r7, r9)
        L_0x00dc:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00f5
            if (r2 != r3) goto L_0x00ed
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x010f
        L_0x00ed:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x00f5:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r8 = (java.lang.String) r8
            fu4 r8 = r7.c
            java.lang.Object r8 = r8.g
            l15 r8 = (defpackage.l15) r8
            k9a r8 = r8.o()
            r0.b = r3
            ds5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0111:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
