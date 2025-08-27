package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ey7  reason: default package */
public final class ey7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kx7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey7(kx7 kx7, Continuation continuation) {
        super(2, continuation);
        this.c = kx7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ey7 ey7 = new ey7(this.c, continuation);
        ey7.b = obj;
        return ey7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ey7) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0045
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001a:
            java.lang.Object r1 = r5.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0037
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            ds5 r1 = (defpackage.ds5) r1
            r5.b = r1
            r5.a = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = defpackage.xk4.b(r3, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            r6 = 0
            r5.b = r6
            r5.a = r2
            kx7 r6 = r5.c
            java.lang.Object r5 = r1.a(r6, r5)
            if (r5 != r0) goto L_0x0045
            return r0
        L_0x0045:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
