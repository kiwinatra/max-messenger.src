package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fr0  reason: default package */
public final class fr0 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hr0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fr0(hr0 hr0, Continuation continuation) {
        super(2, continuation);
        this.c = hr0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fr0 fr0 = new fr0(this.c, continuation);
        fr0.b = obj;
        return fr0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fr0) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0043
        L_0x0012:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x001a:
            java.lang.Object r1 = r4.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0037
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.b
            r1 = r5
            ds5 r1 = (defpackage.ds5) r1
            r4.b = r1
            r4.a = r3
            hr0 r5 = r4.c
            java.lang.Object r5 = defpackage.hr0.a(r5, r4)
            if (r5 != r0) goto L_0x0037
            return r0
        L_0x0037:
            r3 = 0
            r4.b = r3
            r4.a = r2
            java.lang.Object r4 = r1.a(r5, r4)
            if (r4 != r0) goto L_0x0043
            return r0
        L_0x0043:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
