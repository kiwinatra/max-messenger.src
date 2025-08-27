package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o50  reason: default package */
public final class o50 extends SuspendLambda implements Function2 {
    public /* synthetic */ float a;
    public final /* synthetic */ q50 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o50(q50 q50, Continuation continuation) {
        super(2, continuation);
        this.b = q50;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        o50 o50 = new o50(this.b, continuation);
        o50.a = ((Number) obj).floatValue();
        return o50;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o50) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) defpackage.mz4.a) != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r6)
            float r6 = r5.a
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            q50 r5 = r5.b
            w50 r0 = r5.N0
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Long r0 = r0.a
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            r2 = 0
            f80 r3 = r5.A0
            if (r0 == 0) goto L_0x0048
            java.lang.Long r4 = r5.L0
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0033
            w50 r4 = r5.N0
            if (r4 == 0) goto L_0x002a
            m30 r1 = r4.c
        L_0x002a:
            mz4 r4 = defpackage.mz4.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x0033
            goto L_0x0048
        L_0x0033:
            boolean r1 = r3.E0
            if (r1 == 0) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            if (r6 == 0) goto L_0x003e
            float r2 = r6.floatValue()
        L_0x003e:
            java.lang.Long r5 = r5.L0
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            r3.c(r2, r5)
            goto L_0x004c
        L_0x0048:
            r5 = 0
            r3.c(r2, r5)
        L_0x004c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
