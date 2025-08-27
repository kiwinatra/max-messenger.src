package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g4c  reason: default package */
public final class g4c extends SuspendLambda implements Function2 {
    public c4c a;
    public int b;
    public final /* synthetic */ q4c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g4c(q4c q4c, Continuation continuation) {
        super(2, continuation);
        this.c = q4c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g4c(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((g4c) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            q4c r6 = r9.c
            if (r1 == 0) goto L_0x002a
            if (r1 == r5) goto L_0x0024
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0081
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0063
        L_0x0024:
            c4c r1 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0058
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Lazy r10 = r6.c
            java.lang.Object r10 = r10.getValue()
            qx2 r10 = (defpackage.qx2) r10
            long r7 = r6.b
            my2 r10 = (defpackage.my2) r10
            etc r10 = r10.o(r7)
            ome r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            a32 r10 = (defpackage.a32) r10
            if (r10 == 0) goto L_0x0084
            c4c r1 = defpackage.q4c.k(r6, r10)
            r9.a = r1
            r9.b = r5
            r7 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = defpackage.xk4.b(r7, r9)
            if (r10 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r9.a = r2
            r9.b = r4
            java.lang.Object r10 = defpackage.q4c.j(r6, r1, r9)
            if (r10 != r0) goto L_0x0063
            return r0
        L_0x0063:
            kotlin.reflect.KProperty[] r10 = defpackage.q4c.A0
            kotlin.Lazy r10 = r6.o
            java.lang.Object r10 = r10.getValue()
            gaf r10 = (defpackage.gaf) r10
            osa r10 = (defpackage.osa) r10
            gc8 r10 = r10.c()
            f4c r1 = new f4c
            r1.<init>(r6, r2)
            r9.b = r3
            java.lang.Object r9 = defpackage.ev0.I(r10, r1, r9)
            if (r9 != r0) goto L_0x0081
            return r0
        L_0x0081:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0084:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
