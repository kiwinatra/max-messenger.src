package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: os5  reason: default package */
public final class os5 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ os5(ds5 ds5, Function2 function2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = function2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x0149;
                case 2: goto L_0x00cd;
                case 3: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r8 instanceof defpackage.mv5
            if (r0 == 0) goto L_0x0018
            r0 = r8
            mv5 r0 = (defpackage.mv5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            mv5 r0 = new mv5
            r0.<init>(r6, r8)
        L_0x001d:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            ds5 r6 = r0.v
            java.lang.Object r7 = r0.o
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005e
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.o = r7
            ds5 r8 = r6.b
            r0.v = r8
            r0.b = r4
            r2 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r2)
            kotlin.jvm.functions.Function2 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            r2 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r2)
            if (r6 != r1) goto L_0x005d
            goto L_0x006e
        L_0x005d:
            r6 = r8
        L_0x005e:
            r8 = 0
            r0.o = r8
            r0.v = r8
            r0.b = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x006e:
            return r1
        L_0x006f:
            boolean r0 = r8 instanceof defpackage.ru5
            if (r0 == 0) goto L_0x0082
            r0 = r8
            ru5 r0 = (defpackage.ru5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0082
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0087
        L_0x0082:
            ru5 r0 = new ru5
            r0.<init>(r6, r8)
        L_0x0087:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00a9
            if (r2 == r4) goto L_0x00a3
            if (r2 != r3) goto L_0x009b
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00ca
        L_0x009b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00a3:
            ds5 r6 = r0.c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00be
        L_0x00a9:
            kotlin.ResultKt.throwOnFailure(r8)
            ds5 r8 = r6.b
            r0.c = r8
            r0.b = r4
            kotlin.jvm.functions.Function2 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x00bb
            goto L_0x00cc
        L_0x00bb:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x00be:
            r7 = 0
            r0.c = r7
            r0.b = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00cc:
            return r1
        L_0x00cd:
            boolean r0 = r8 instanceof defpackage.mu5
            if (r0 == 0) goto L_0x00e0
            r0 = r8
            mu5 r0 = (defpackage.mu5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00e0
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x00e5
        L_0x00e0:
            mu5 r0 = new mu5
            r0.<init>(r6, r8)
        L_0x00e5:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x010b
            if (r2 == r4) goto L_0x0103
            if (r2 != r3) goto L_0x00fb
            os5 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x013e
        L_0x00fb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0103:
            java.lang.Object r7 = r0.v
            os5 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0125
        L_0x010b:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r6
            r0.v = r7
            r0.c = r4
            r8 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r8)
            kotlin.jvm.functions.Function2 r8 = r6.c
            java.lang.Object r8 = r8.invoke(r7, r0)
            r2 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r2)
            if (r8 != r1) goto L_0x0125
            goto L_0x0142
        L_0x0125:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x013d
            ds5 r8 = r6.b
            r0.a = r6
            r2 = 0
            r0.v = r2
            r0.c = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L_0x013e
            goto L_0x0142
        L_0x013d:
            r4 = 0
        L_0x013e:
            if (r4 == 0) goto L_0x0143
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0142:
            return r1
        L_0x0143:
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r7.<init>(r6)
            throw r7
        L_0x0149:
            boolean r0 = r8 instanceof defpackage.ts5
            if (r0 == 0) goto L_0x015c
            r0 = r8
            ts5 r0 = (defpackage.ts5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x015c
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0161
        L_0x015c:
            ts5 r0 = new ts5
            r0.<init>(r6, r8)
        L_0x0161:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0185
            if (r2 == r4) goto L_0x017d
            if (r2 != r3) goto L_0x0175
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x01b2
        L_0x0175:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x017d:
            ds5 r6 = r0.o
            java.lang.Object r7 = r0.c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x019c
        L_0x0185:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.c = r7
            ds5 r8 = r6.b
            r0.o = r8
            r0.b = r4
            kotlin.jvm.functions.Function2 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x0199
            goto L_0x01b4
        L_0x0199:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x019c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01b2
            r8 = 0
            r0.c = r8
            r0.o = r8
            r0.b = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x01b4:
            return r1
        L_0x01b5:
            boolean r0 = r8 instanceof defpackage.ns5
            if (r0 == 0) goto L_0x01c8
            r0 = r8
            ns5 r0 = (defpackage.ns5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x01c8
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x01cd
        L_0x01c8:
            ns5 r0 = new ns5
            r0.<init>(r6, r8)
        L_0x01cd:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x01e6
            if (r2 != r3) goto L_0x01de
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0217
        L_0x01de:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x01e6:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x021a
            java.lang.Object r8 = r7.next()
        L_0x01fb:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x020c
            kotlin.jvm.functions.Function2 r2 = r6.c
            java.lang.Object r4 = r7.next()
            java.lang.Object r8 = r2.invoke(r8, r4)
            goto L_0x01fb
        L_0x020c:
            r0.b = r3
            ds5 r6 = r6.b
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0219:
            return r1
        L_0x021a:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Empty collection can't be reduced."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public os5(Function2 function2, ds5 ds5) {
        this.a = 2;
        this.c = function2;
        this.b = ds5;
    }
}
