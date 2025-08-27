package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: y72  reason: default package */
public final class y72 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ m82 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y72(m82 m82, Continuation continuation) {
        super(2, continuation);
        this.b = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        y72 y72 = new y72(this.b, continuation);
        y72.a = obj;
        return y72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y72) create((nz4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r11.a((defpackage.a05) r10.k.getValue()) == true) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.a
            nz4 r11 = (defpackage.nz4) r11
            m82 r10 = r10.b
            kotlin.reflect.KProperty[] r0 = defpackage.m82.F
            r10.getClass()
            azb r0 = new azb
            java.lang.String r2 = r11.a
            long r3 = r11.b
            java.lang.String r5 = r11.d
            java.lang.CharSequence r6 = r11.c
            xme r11 = r10.j
            java.lang.Object r11 = r11.getValue()
            nz4 r11 = (defpackage.nz4) r11
            r1 = 0
            if (r11 == 0) goto L_0x0036
            xme r7 = r10.k
            java.lang.Object r7 = r7.getValue()
            a05 r7 = (defpackage.a05) r7
            boolean r11 = r11.a(r7)
            r7 = 1
            if (r11 != r7) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r7 = r1
        L_0x0037:
            boolean r8 = r10.q
            zyb r9 = defpackage.zyb.a
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            qz4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            xme r1 = r10.c
        L_0x0049:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            azb r3 = (defpackage.azb) r3
            boolean r2 = r1.b(r2, r0)
            if (r2 == 0) goto L_0x0049
            xme r2 = r10.d
        L_0x0058:
            java.lang.Object r10 = r2.getValue()
            r0 = r10
            java.util.List r0 = (java.util.List) r0
            boolean r10 = r2.b(r10, r11)
            if (r10 == 0) goto L_0x0058
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
