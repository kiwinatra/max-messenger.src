package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: al7  reason: default package */
public final class al7 extends SuspendLambda implements Function2 {
    public vk3 a;
    public int b;
    public final /* synthetic */ cl7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al7(cl7 cl7, Continuation continuation) {
        super(2, continuation);
        this.c = cl7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new al7(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((al7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            cl7 r6 = r14.c
            if (r1 == 0) goto L_0x002b
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00c2
        L_0x0019:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0021:
            vk3 r1 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0064
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x003f
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Lazy r15 = r6.c
            java.lang.Object r15 = r15.getValue()
            eu3 r15 = (defpackage.eu3) r15
            r14.b = r5
            vk3 r15 = r15.d()
            if (r15 != r0) goto L_0x003f
            return r0
        L_0x003f:
            r1 = r15
            vk3 r1 = (defpackage.vk3) r1
            kl0 r15 = defpackage.kl0.c
            java.lang.String r15 = r1.t(r15)
            if (r15 == 0) goto L_0x0067
            ba7 r7 = defpackage.ld9.B()
            r5 = 6
            qa7 r8 = defpackage.foa.b(r15, r2, r5)
            r14.a = r1
            r14.b = r4
            r11 = 0
            r13 = 14
            r9 = 0
            r12 = r14
            java.lang.Object r15 = defpackage.ld9.u(r7, r8, r9, r11, r12, r13)
            if (r15 != r0) goto L_0x0064
            return r0
        L_0x0064:
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
            goto L_0x0068
        L_0x0067:
            r15 = r2
        L_0x0068:
            mac r4 = new mac
            java.lang.String r5 = r1.f()
            if (r5 != 0) goto L_0x0072
            java.lang.String r5 = ""
        L_0x0072:
            java.lang.String r1 = r1.m()
            ekd r7 = one.me.sdk.uikit.qr.QrCodeGenerator.a
            kotlin.Lazy r7 = r6.v
            java.lang.Object r7 = r7.getValue()
            bud r7 = (defpackage.bud) r7
            akd r7 = (defpackage.akd) r7
            java.lang.String r7 = r7.p()
            r8 = 244(0xf4, float:3.42E-43)
            float r8 = (float) r8
            android.content.res.Resources r9 = defpackage.vo4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            r9 = 24
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            android.graphics.Bitmap r15 = one.me.sdk.uikit.qr.QrCodeGenerator.a(r7, r8, r9, r15)
            r4.<init>(r5, r1, r15)
            r14.a = r2
            r14.b = r3
            xme r14 = r6.x
            r14.getClass()
            r14.m(r2, r4)
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            if (r14 != r0) goto L_0x00c2
            return r0
        L_0x00c2:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
