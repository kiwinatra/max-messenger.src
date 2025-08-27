package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qo2  reason: default package */
public final class qo2 extends SuspendLambda implements Function2 {
    public o21 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lp2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qo2(lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.o = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qo2 qo2 = new qo2(this.o, continuation);
        qo2.c = obj;
        return qo2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            lp2 r2 = r9.o
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r9 = r9.c
            d14 r9 = (defpackage.d14) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006d
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0020:
            o21 r1 = r9.a
            java.lang.Object r4 = r9.c
            d14 r4 = (defpackage.d14) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r4
            r4 = r10
            r10 = r8
            goto L_0x0043
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.c
            d14 r10 = (defpackage.d14) r10
            o21 r1 = r2.w
            r9.c = r10
            r9.a = r1
            r9.b = r4
            java.lang.Object r4 = r2.q(r9)
            if (r4 != r0) goto L_0x0043
            return r0
        L_0x0043:
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r9.c = r10
            r6 = 0
            r9.a = r6
            r9.b = r3
            kotlin.Lazy r3 = r1.c
            java.lang.Object r3 = r3.getValue()
            gaf r3 = (defpackage.gaf) r3
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.b()
            m4d r7 = new m4d
            r7.<init>(r1, r4, r6)
            java.lang.Object r9 = defpackage.ev0.I(r3, r7, r9)
            if (r9 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x006d:
            l4d r10 = (defpackage.l4d) r10
            if (r10 == 0) goto L_0x009a
            java.lang.CharSequence r0 = r10.a
            if (r0 == 0) goto L_0x009a
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            if (r1 == 0) goto L_0x007c
            goto L_0x009a
        L_0x007c:
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r1 = "send restored draft on UI"
            defpackage.z68.c(r9, r1, new java.lang.Object[0])
            s85 r9 = r2.T0
            ao2 r1 = new ao2
            java.lang.Long r2 = r10.c
            java.lang.Long r10 = r10.b
            r1.<init>(r0, r2, r10)
            defpackage.xag.h(r9, r1)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x009a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
