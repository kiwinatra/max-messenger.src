package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h7c  reason: default package */
public final class h7c extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7c(k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h7c(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.a
            r2 = 2
            r3 = 1
            k7c r4 = r5.b
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0039
        L_0x0014:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x002e
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r6)
            gwb r6 = r4.I0
            r5.a = r3
            java.lang.Object r6 = r6.B(r5)
            if (r6 != r0) goto L_0x002e
            return r0
        L_0x002e:
            gwb r6 = r4.I0
            r5.a = r2
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            a32 r6 = (defpackage.a32) r6
            if (r6 == 0) goto L_0x004b
            s85 r5 = r4.x0
            b5c r0 = new b5c
            txb r1 = defpackage.txb.LOCAL_CHAT
            long r2 = r6.a
            r0.<init>(r2, r1)
            defpackage.xag.h(r5, r0)
        L_0x004b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
