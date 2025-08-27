package defpackage;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: yu5  reason: default package */
public final class yu5 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Ref.ObjectRef c;

    public /* synthetic */ yu5(SuspendLambda suspendLambda, Ref.ObjectRef objectRef, int i) {
        this.a = i;
        this.b = (Function2) suspendLambda;
        this.c = objectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(T r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r6 instanceof defpackage.bv5
            if (r0 == 0) goto L_0x0018
            r0 = r6
            bv5 r0 = (defpackage.bv5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x001d
        L_0x0018:
            bv5 r0 = new bv5
            r0.<init>(r4, r6)
        L_0x001d:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r5 = r0.v
            yu5 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0054
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r4
            r0.v = r5
            r0.c = r3
            r6 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r6)
            kotlin.jvm.functions.Function2 r6 = r4.b
            java.lang.Object r6 = r6.invoke(r5, r0)
            r0 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r0)
            if (r6 != r1) goto L_0x0054
            goto L_0x005e
        L_0x0054:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x005f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x005e:
            return r1
        L_0x005f:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r4.c
            r6.element = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        L_0x0069:
            boolean r0 = r6 instanceof defpackage.xu5
            if (r0 == 0) goto L_0x007c
            r0 = r6
            xu5 r0 = (defpackage.xu5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x007c
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0081
        L_0x007c:
            xu5 r0 = new xu5
            r0.<init>(r4, r6)
        L_0x0081:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x009e
            if (r2 != r3) goto L_0x0096
            java.lang.Object r5 = r0.v
            yu5 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x00b8
        L_0x0096:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x009e:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r4
            r0.v = r5
            r0.c = r3
            r6 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r6)
            kotlin.jvm.functions.Function2 r6 = r4.b
            java.lang.Object r6 = r6.invoke(r5, r0)
            r0 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r0)
            if (r6 != r1) goto L_0x00b8
            goto L_0x00c2
        L_0x00b8:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00c3
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00c2:
            return r1
        L_0x00c3:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r4.c
            r6.element = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
