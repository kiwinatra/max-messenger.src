package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: nf3  reason: default package */
public final class nf3 extends SuspendLambda implements Function2 {
    public ConfirmPhoneScreen a;
    public TextView b;
    public int c;
    public final /* synthetic */ ConfirmPhoneScreen o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.o = confirmPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nf3(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nf3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007e, code lost:
        r15 = (android.view.ViewGroup) r8.getView();
        r15.removeView(r8.y0);
        r1 = new androidx.appcompat.widget.AppCompatTextView(r8.getContext(), (android.util.AttributeSet) null);
        r1.setId(defpackage.xgc.oneme_login_confirm_timer);
        defpackage.puf.o.b(r1, defpackage.uy4.b);
        r9 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        r10 = (float) 12;
        r9.setMargins(kotlin.math.MathKt.roundToInt(defpackage.vo4.c().getDisplayMetrics().density * r10), 0, kotlin.math.MathKt.roundToInt(r10 * defpackage.vo4.c().getDisplayMetrics().density), kotlin.math.MathKt.roundToInt(((float) 16) * defpackage.vo4.c().getDisplayMetrics().density));
        r1.setLayoutParams(r9);
        r1.setGravity(17);
        r1.setTextColor(defpackage.fu4.k.e(r15.getContext()).f().getText().f);
        r1.setAlpha(defpackage.c44.DEFAULT_ASPECT_RATIO);
        r8.y0 = r1;
        r15.addView(r1);
        r15 = r8.y0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0102, code lost:
        if (r15 == null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0104, code lost:
        r1 = defpackage.nlc.oneme_login_confirm_info_loading_1;
        r14.a = r8;
        r14.b = r15;
        r14.c = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0111, code lost:
        if (r8.d0(r15, r1, false, r14) != r0) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0113, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0114, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0115, code lost:
        r14.a = r8;
        r14.b = r1;
        r14.c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0120, code lost:
        if (defpackage.xk4.b(1000, r14) != r0) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0122, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0123, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0124, code lost:
        r15 = defpackage.nlc.oneme_login_confirm_info_loading_2;
        r14.a = r7;
        r14.b = r1;
        r14.c = 4;
        r8 = one.me.login.confirm.ConfirmPhoneScreen.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0133, code lost:
        if (r7.d0(r1, r15, false, r14) != r0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0135, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0136, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0137, code lost:
        r14.a = r2;
        r14.b = r1;
        r14.c = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0142, code lost:
        if (defpackage.xk4.b(1000, r14) != r0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0144, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0145, code lost:
        r15 = defpackage.nlc.oneme_login_confirm_info_loading_3;
        r14.a = null;
        r14.b = null;
        r14.c = 6;
        r3 = one.me.login.confirm.ConfirmPhoneScreen.A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0154, code lost:
        if (r2.d0(r1, r15, true, r14) != r0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0156, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0159, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.c
            r2 = 0
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 1
            r6 = 0
            r7 = 0
            one.me.login.confirm.ConfirmPhoneScreen r8 = r14.o
            switch(r1) {
                case 0: goto L_0x0046;
                case 1: goto L_0x0042;
                case 2: goto L_0x0039;
                case 3: goto L_0x0030;
                case 4: goto L_0x0027;
                case 5: goto L_0x001e;
                case 6: goto L_0x0019;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0157
        L_0x001e:
            android.widget.TextView r1 = r14.b
            one.me.login.confirm.ConfirmPhoneScreen r2 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0145
        L_0x0027:
            android.widget.TextView r1 = r14.b
            one.me.login.confirm.ConfirmPhoneScreen r2 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0137
        L_0x0030:
            android.widget.TextView r1 = r14.b
            one.me.login.confirm.ConfirmPhoneScreen r7 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0124
        L_0x0039:
            android.widget.TextView r1 = r14.b
            one.me.login.confirm.ConfirmPhoneScreen r8 = r14.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0115
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x007e
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.reflect.KProperty[] r15 = one.me.login.confirm.ConfirmPhoneScreen.A0
            one.me.sdk.uikit.common.button.OneMeButton r15 = r8.e0()
            android.view.ViewPropertyAnimator r15 = r15.animate()
            r9 = 800(0x320, double:3.953E-321)
            android.view.ViewPropertyAnimator r15 = r15.setDuration(r9)
            android.view.ViewPropertyAnimator r15 = r15.alpha(r7)
            r15.start()
            android.widget.TextView r15 = r8.g0()
            android.view.ViewPropertyAnimator r15 = r15.animate()
            android.view.ViewPropertyAnimator r15 = r15.setDuration(r9)
            android.view.ViewPropertyAnimator r15 = r15.alpha(r7)
            r15.start()
            r14.c = r5
            r9 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r15 = defpackage.xk4.b(r9, r14)
            if (r15 != r0) goto L_0x007e
            return r0
        L_0x007e:
            android.view.View r15 = r8.getView()
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            android.widget.TextView r1 = r8.y0
            r15.removeView(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r9 = r8.getContext()
            r1.<init>(r9, r6)
            int r9 = defpackage.xgc.oneme_login_confirm_timer
            r1.setId(r9)
            ogf r9 = defpackage.puf.o
            r9.b(r1, defpackage.uy4.b)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r9.<init>(r10, r11)
            r10 = 12
            float r10 = (float) r10
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = kotlin.math.MathKt.roundToInt((float) r11)
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r10 = r10 * r12
            int r10 = kotlin.math.MathKt.roundToInt((float) r10)
            r12 = 16
            float r12 = (float) r12
            android.content.res.Resources r13 = defpackage.vo4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r12 = r12 * r13
            int r12 = kotlin.math.MathKt.roundToInt((float) r12)
            r9.setMargins(r11, r2, r10, r12)
            r1.setLayoutParams(r9)
            r9 = 17
            r1.setGravity(r9)
            js9 r9 = defpackage.fu4.k
            android.content.Context r10 = r15.getContext()
            fu4 r9 = r9.e(r10)
            k2b r9 = r9.f()
            xef r9 = r9.getText()
            int r9 = r9.f
            r1.setTextColor(r9)
            r1.setAlpha(r7)
            r8.y0 = r1
            r15.addView(r1)
            android.widget.TextView r15 = r8.y0
            if (r15 == 0) goto L_0x0157
            int r1 = defpackage.nlc.oneme_login_confirm_info_loading_1
            r14.a = r8
            r14.b = r15
            r7 = 2
            r14.c = r7
            java.lang.Object r1 = r8.d0(r15, r1, r2, r14)
            if (r1 != r0) goto L_0x0114
            return r0
        L_0x0114:
            r1 = r15
        L_0x0115:
            r14.a = r8
            r14.b = r1
            r15 = 3
            r14.c = r15
            java.lang.Object r15 = defpackage.xk4.b(r3, r14)
            if (r15 != r0) goto L_0x0123
            return r0
        L_0x0123:
            r7 = r8
        L_0x0124:
            int r15 = defpackage.nlc.oneme_login_confirm_info_loading_2
            r14.a = r7
            r14.b = r1
            r8 = 4
            r14.c = r8
            kotlin.reflect.KProperty[] r8 = one.me.login.confirm.ConfirmPhoneScreen.A0
            java.lang.Object r15 = r7.d0(r1, r15, r2, r14)
            if (r15 != r0) goto L_0x0136
            return r0
        L_0x0136:
            r2 = r7
        L_0x0137:
            r14.a = r2
            r14.b = r1
            r15 = 5
            r14.c = r15
            java.lang.Object r15 = defpackage.xk4.b(r3, r14)
            if (r15 != r0) goto L_0x0145
            return r0
        L_0x0145:
            int r15 = defpackage.nlc.oneme_login_confirm_info_loading_3
            r14.a = r6
            r14.b = r6
            r3 = 6
            r14.c = r3
            kotlin.reflect.KProperty[] r3 = one.me.login.confirm.ConfirmPhoneScreen.A0
            java.lang.Object r14 = r2.d0(r1, r15, r5, r14)
            if (r14 != r0) goto L_0x0157
            return r0
        L_0x0157:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
