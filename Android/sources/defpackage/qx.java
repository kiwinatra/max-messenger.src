package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qx  reason: default package */
public final class qx extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ux c;
    public final /* synthetic */ yt o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qx(ux uxVar, yt ytVar, Continuation continuation) {
        super(2, continuation);
        this.c = uxVar;
        this.o = ytVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qx qxVar = new qx(this.c, this.o, continuation);
        qxVar.b = obj;
        return qxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qx) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            goto L_0x0047
        L_0x0012:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x001a:
            java.lang.Object r1 = r4.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x003b
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.b
            r1 = r5
            ds5 r1 = (defpackage.ds5) r1
            ux r5 = r4.c
            ocf r5 = r5.c
            r4.b = r1
            r4.a = r3
            yt r3 = r4.o
            java.lang.Object r5 = r5.e(r3, r4)
            if (r5 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r3 = 0
            r4.b = r3
            r4.a = r2
            java.lang.Object r4 = r1.a(r5, r4)
            if (r4 != r0) goto L_0x0047
            return r0
        L_0x0047:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
