package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lt0  reason: default package */
public final class lt0 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lt0(long j, Continuation continuation) {
        super(2, continuation);
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lt0 lt0 = new lt0(this.c, continuation);
        lt0.b = obj;
        return lt0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lt0) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)
        L_0x0015:
            r7 = r1
            goto L_0x002e
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            java.lang.Object r1 = r6.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0046
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.b
            ds5 r7 = (defpackage.ds5) r7
        L_0x002e:
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r1 = defpackage.kv0.I(r1)
            if (r1 == 0) goto L_0x0053
            r6.b = r7
            r6.a = r3
            long r4 = r6.c
            java.lang.Object r1 = defpackage.xk4.c(r4, r6)
            if (r1 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r1 = r7
        L_0x0046:
            ox5 r7 = defpackage.ox5.a
            r6.b = r1
            r6.a = r2
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x0015
            return r0
        L_0x0053:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
