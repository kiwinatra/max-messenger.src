package defpackage;

/* renamed from: sx7  reason: default package */
public final class sx7 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sx7(ds5 ds5, String str, int i) {
        this.a = i;
        this.b = ds5;
        this.c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r7 instanceof defpackage.e9f
            if (r0 == 0) goto L_0x0018
            r0 = r7
            e9f r0 = (defpackage.e9f) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            e9f r0 = new e9f
            r0.<init>(r5, r7)
        L_0x001d:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r2 = r5.c
            boolean r7 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r2, false, 2, (java.lang.Object) null)
            if (r7 == 0) goto L_0x004f
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0051:
            return r1
        L_0x0052:
            boolean r0 = r7 instanceof defpackage.eua
            if (r0 == 0) goto L_0x0065
            r0 = r7
            eua r0 = (defpackage.eua) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0065
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x006a
        L_0x0065:
            eua r0 = new eua
            r0.<init>(r5, r7)
        L_0x006a:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0083
            if (r2 != r3) goto L_0x007b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x009a
        L_0x007b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0083:
            kotlin.ResultKt.throwOnFailure(r7)
            r14 r6 = (defpackage.r14) r6
            cua r7 = new cua
            java.lang.String r2 = r5.c
            r7.<init>(r2, r6)
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x009c:
            return r1
        L_0x009d:
            boolean r0 = r7 instanceof defpackage.rx7
            if (r0 == 0) goto L_0x00b0
            r0 = r7
            rx7 r0 = (defpackage.rx7) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00b0
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00b5
        L_0x00b0:
            rx7 r0 = new rx7
            r0.<init>(r5, r7)
        L_0x00b5:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00ce
            if (r2 != r3) goto L_0x00c6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00ff
        L_0x00c6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00ce:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00d9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r7 = r6.next()
            r2 = r7
            zx5 r2 = (defpackage.zx5) r2
            java.lang.String r2 = r2.a
            java.lang.String r4 = r5.c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x00d9
            goto L_0x00f2
        L_0x00f1:
            r7 = 0
        L_0x00f2:
            if (r7 == 0) goto L_0x00ff
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0101:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx7.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
