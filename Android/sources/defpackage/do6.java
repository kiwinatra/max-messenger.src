package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: do6  reason: default package */
public final class do6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gp6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do6(gp6 gp6, Continuation continuation) {
        super(2, continuation);
        this.c = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        do6 do6 = new do6(this.c, continuation);
        do6.b = obj;
        return do6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((do6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.a
            r2 = 2
            java.lang.String r3 = "gp6"
            r4 = 1
            gp6 r5 = r8.c
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r8 = r8.b
            d14 r8 = (defpackage.d14) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00a6
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0023:
            java.lang.Object r1 = r8.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r7 = r1
            r1 = r9
            r9 = r7
            goto L_0x0063
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.b
            d14 r9 = (defpackage.d14) r9
            java.lang.String r1 = "loadMoreItems(): loadingItemsJob start"
            defpackage.z68.c(r3, r1, new java.lang.Object[0])
            xme r1 = r5.x0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            r1.setValue(r6)
            xme r1 = r5.z0
            java.lang.Object r1 = r1.getValue()
            wk6 r1 = (defpackage.wk6) r1
            if (r1 != 0) goto L_0x0050
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0050:
            xm6 r6 = r5.w0
            int r6 = r6.b
            r8.b = r9
            r8.a = r4
            s48 r4 = r5.v
            yd7 r4 = (defpackage.yd7) r4
            java.lang.Object r1 = r4.e(r1, r6, r8)
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r48 r1 = (defpackage.r48) r1
            xme r4 = r5.x0
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            r4.setValue(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "loadMoreItems(): get result "
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            boolean r4 = defpackage.e14.f(r9)
            if (r4 != 0) goto L_0x0089
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0089:
            boolean r4 = r1 instanceof defpackage.p48
            if (r4 == 0) goto L_0x0090
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0090:
            boolean r4 = r1 instanceof defpackage.q48
            if (r4 == 0) goto L_0x00ca
            q48 r1 = (defpackage.q48) r1
            java.util.List r1 = r1.a
            r8.b = r9
            r8.a = r2
            java.lang.Object r8 = defpackage.gp6.j(r5, r1, r8)
            if (r8 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00a6:
            java.util.List r9 = (java.util.List) r9
            boolean r8 = defpackage.e14.f(r8)
            if (r8 != 0) goto L_0x00b1
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00b1:
            xme r8 = r5.Z
            java.lang.Object r0 = r8.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.plus(r0, r9)
            r8.setValue(r9)
            java.lang.String r8 = "loadMoreItems(): loadingItemsJob finish"
            defpackage.z68.c(r3, r8, new java.lang.Object[0])
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00ca:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
