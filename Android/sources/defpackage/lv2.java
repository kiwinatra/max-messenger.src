package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lv2  reason: default package */
public final class lv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ov2 b;
    public final /* synthetic */ ss6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lv2(ov2 ov2, ss6 ss6, Continuation continuation) {
        super(2, continuation);
        this.b = ov2;
        this.c = ss6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lv2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 2
            r3 = 1
            ss6 r4 = r10.c
            ov2 r5 = r10.b
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x008f
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0067
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.reflect.KProperty[] r11 = defpackage.ov2.O0
            kotlin.Lazy r11 = r5.z
            java.lang.Object r11 = r11.getValue()
            x23 r11 = (defpackage.x23) r11
            qjd r11 = (defpackage.qjd) r11
            long r6 = r11.s()
            long r8 = r4.c
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0050
            int r10 = defpackage.qad.E8
            igf r11 = new igf
            r11.<init>(r10)
            q8e r10 = new q8e
            r10.<init>(r11)
            s85 r11 = r5.G0
            defpackage.xag.h(r11, r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x0050:
            gaf r11 = r5.x
            osa r11 = (defpackage.osa) r11
            q04 r11 = r11.b()
            kv2 r1 = new kv2
            r6 = 0
            r1.<init>(r5, r4, r6)
            r10.a = r3
            java.lang.Object r11 = defpackage.ev0.I(r11, r1, r10)
            if (r11 != r0) goto L_0x0067
            return r0
        L_0x0067:
            fo3 r11 = r4.Y
            boolean r11 = r11.c()
            long r6 = r4.c
            if (r11 != 0) goto L_0x007e
            kotlin.reflect.KProperty[] r10 = defpackage.ov2.O0
            qx2 r10 = r5.k()
            my2 r10 = (defpackage.my2) r10
            a32 r10 = r10.q(r6)
            goto L_0x0092
        L_0x007e:
            kotlin.reflect.KProperty[] r11 = defpackage.ov2.O0
            qx2 r11 = r5.k()
            r10.a = r2
            my2 r11 = (defpackage.my2) r11
            java.lang.Object r11 = r11.u(r6, r10)
            if (r11 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r10 = r11
            a32 r10 = (defpackage.a32) r10
        L_0x0092:
            if (r10 == 0) goto L_0x009d
            ox2 r11 = defpackage.ox2.b
            long r0 = r10.a
            pa4 r10 = r11.o1(r0)
            goto L_0x00bd
        L_0x009d:
            ox2 r10 = defpackage.ox2.b
            long r0 = r4.c
            r10.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = ":profile?id="
            r10.<init>(r11)
            r10.append(r0)
            java.lang.String r11 = "&type=contact"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            pa4 r11 = new pa4
            r11.<init>(r10)
            r10 = r11
        L_0x00bd:
            s85 r11 = r5.F0
            defpackage.xag.h(r11, r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
