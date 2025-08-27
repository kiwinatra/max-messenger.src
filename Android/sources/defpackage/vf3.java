package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vf3  reason: default package */
public final class vf3 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ wf3 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf3(wf3 wf3, Continuation continuation) {
        super(2, continuation);
        this.c = wf3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vf3(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vf3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.b
            r2 = -1
            wf3 r4 = r10.c
            r5 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r5) goto L_0x0015
            long r6 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0046
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r11)
            xme r11 = r4.x0
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
        L_0x002c:
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L_0x0048
            xme r11 = r4.x0
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r11.setValue(r1)
            r10.a = r6
            r10.b = r5
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = defpackage.xk4.b(r8, r10)
            if (r11 != r0) goto L_0x0046
            return r0
        L_0x0046:
            long r6 = r6 + r2
            goto L_0x002c
        L_0x0048:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
