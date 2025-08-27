package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* renamed from: cu5  reason: default package */
public final class cu5 extends SuspendLambda implements Function4 {
    public int a;
    public /* synthetic */ Throwable b;
    public /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu5(long j, Function2 function2, Continuation continuation) {
        super(4, continuation);
        this.o = j;
        this.v = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ds5 ds5 = (ds5) obj;
        long longValue = ((Number) obj3).longValue();
        cu5 cu5 = new cu5(this.o, this.v, (Continuation) obj4);
        cu5.b = (Throwable) obj2;
        cu5.c = longValue;
        return cu5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.a
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x002f
        L_0x000f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Throwable r8 = r7.b
            long r3 = r7.c
            long r5 = r7.o
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0038
            r7.a = r2
            kotlin.jvm.functions.Function2 r1 = r7.v
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L_0x002f
            return r0
        L_0x002f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
