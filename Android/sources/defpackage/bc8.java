package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bc8  reason: default package */
public final class bc8 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ec8 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bc8(ec8 ec8, Continuation continuation) {
        super(2, continuation);
        this.c = ec8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bc8 bc8 = new bc8(this.c, continuation);
        bc8.b = obj;
        return bc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bc8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: d14} */
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
            goto L_0x005b
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001a:
            java.lang.Object r1 = r5.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0037
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.b
            r1 = r6
            d14 r1 = (defpackage.d14) r1
            r5.b = r1
            r5.a = r3
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = defpackage.xk4.b(r3, r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            boolean r6 = defpackage.e14.f(r1)
            if (r6 != 0) goto L_0x0040
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x0040:
            ec8 r6 = r5.c
            gaf r1 = r6.a
            osa r1 = (defpackage.osa) r1
            gc8 r1 = r1.c()
            ac8 r3 = new ac8
            r4 = 0
            r3.<init>(r6, r4)
            r5.b = r4
            r5.a = r2
            java.lang.Object r5 = defpackage.ev0.I(r1, r3, r5)
            if (r5 != r0) goto L_0x005b
            return r0
        L_0x005b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
