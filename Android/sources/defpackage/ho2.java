package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ho2  reason: default package */
public final class ho2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lp2 b;
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho2(lp2 lp2, int i, Continuation continuation) {
        super(2, continuation);
        this.b = lp2;
        this.c = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ho2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ho2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.a
            r2 = 2
            r3 = 1
            lp2 r4 = r12.b
            if (r1 == 0) goto L_0x0021
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x009e
        L_0x0015:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x002d
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r13)
            r12.a = r3
            java.lang.Object r13 = r4.q(r12)
            if (r13 != r0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.Number r13 = (java.lang.Number) r13
            long r7 = r13.longValue()
            int r13 = defpackage.dad.l0
            int r1 = r12.c
            if (r1 != r13) goto L_0x004d
            kotlin.Lazy r13 = r4.Y
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            long r5 = r13.m()
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x004a:
            long r5 = r5 + r9
        L_0x004b:
            r9 = r5
            goto L_0x0080
        L_0x004d:
            int r13 = defpackage.dad.m0
            if (r1 != r13) goto L_0x0063
            kotlin.Lazy r13 = r4.Y
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            long r5 = r13.m()
            r9 = 18000000(0x112a880, double:8.8931816E-317)
            goto L_0x004a
        L_0x0063:
            int r13 = defpackage.dad.k0
            if (r1 != r13) goto L_0x0079
            kotlin.Lazy r13 = r4.Y
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            long r5 = r13.m()
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x004a
        L_0x0079:
            int r13 = defpackage.dad.n0
            if (r1 != r13) goto L_0x00b4
            r5 = -1
            goto L_0x004b
        L_0x0080:
            kotlin.reflect.KProperty[] r13 = defpackage.lp2.X0
            gaf r13 = r4.l()
            osa r13 = (defpackage.osa) r13
            q04 r13 = r13.b()
            go2 r1 = new go2
            lp2 r6 = r12.b
            r11 = 0
            r5 = r1
            r5.<init>(r6, r7, r9, r11)
            r12.a = r2
            java.lang.Object r12 = defpackage.ev0.I(r13, r1, r12)
            if (r12 != r0) goto L_0x009e
            return r0
        L_0x009e:
            s85 r12 = r4.T0
            co2 r13 = new co2
            int r0 = defpackage.ead.I
            int r1 = defpackage.cad.n
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            r3 = 0
            r13.<init>(r0, r3, r1, r2)
            defpackage.xag.h(r12, r13)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x00b4:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
