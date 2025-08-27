package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bn3  reason: default package */
public final class bn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bn3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            pn3 r6 = r10.b
            if (r1 == 0) goto L_0x002f
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a6
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0099
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0075
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0045
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Lazy r11 = r6.x
            java.lang.Object r11 = r11.getValue()
            yr3 r11 = (defpackage.yr3) r11
            r10.a = r5
            long r7 = r6.o
            kotlin.Unit r11 = r11.a(r7)
            if (r11 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r11 = 48
            float r11 = (float) r11
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r11 = r11 * r1
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            n6e r1 = r6.f
            x0c r5 = new x0c
            int r7 = defpackage.ixa.E0
            igf r8 = new igf
            r8.<init>(r7)
            ms1 r7 = new ms1
            r9 = 26
            r7.<init>(r9, r6)
            r5.<init>(r8, r11, r7)
            r10.a = r4
            java.lang.Object r11 = r1.a(r5, r10)
            if (r11 != r0) goto L_0x0075
            return r0
        L_0x0075:
            kotlin.Lazy r11 = r6.q
            java.lang.Object r11 = r11.getValue()
            qx2 r11 = (defpackage.qx2) r11
            my2 r11 = (defpackage.my2) r11
            long r4 = r6.o
            a32 r11 = r11.q(r4)
            if (r11 == 0) goto L_0x0099
            n6e r1 = r6.e
            b0c r4 = new b0c
            long r7 = r11.a
            r4.<init>(r7)
            r10.a = r3
            java.lang.Object r11 = r1.a(r4, r10)
            if (r11 != r0) goto L_0x0099
            return r0
        L_0x0099:
            n6e r11 = r6.e
            p33 r1 = defpackage.p33.b
            r10.a = r2
            java.lang.Object r10 = r11.a(r1, r10)
            if (r10 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
