package one.me.login.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lhg3;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "(Ljava/lang/String;Ljava/lang/String;I)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nConfirmPhoneScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmPhoneScreen.kt\none/me/login/confirm/ConfirmPhoneScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,438:1\n420#2:439\n420#2:440\n420#2:441\n235#2,10:442\n5#3:452\n5#3:453\n1#4:454\n24#5:455\n24#5:456\n24#5:457\n24#5:461\n24#5:462\n24#5:467\n199#6,2:458\n81#7:460\n256#7,2:463\n256#7,2:465\n17#8:468\n*S KotlinDebug\n*F\n+ 1 ConfirmPhoneScreen.kt\none/me/login/confirm/ConfirmPhoneScreen\n*L\n71#1:439\n72#1:440\n73#1:441\n79#1:442,10\n91#1:452\n99#1:453\n132#1:455\n144#1:456\n156#1:457\n176#1:461\n191#1:462\n402#1:467\n156#1:458,2\n158#1:460\n300#1:463,2\n301#1:465,2\n100#1:468\n*E\n"})
@SuppressLint({"ValidController"})
public final class ConfirmPhoneScreen extends Widget implements hg3, qg3 {
    public static final /* synthetic */ KProperty[] A0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final /* synthetic */ bk3 a;
    public final yh7 b;
    public final is c;
    public final is o;
    public final is v;
    public final ReadOnlyProperty v0;
    public final w28 w;
    public TextView w0;
    public final Lazy x;
    public final Lazy x0;
    public final Lazy y;
    public TextView y0;
    public final Lazy z;
    public final wie z0;

    static {
        Class<ConfirmPhoneScreen> cls = ConfirmPhoneScreen.class;
        A0 = new KProperty[]{wj6.p(cls, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), wj6.p(cls, "phone", "getPhone()Ljava/lang/String;", 0), wj6.p(cls, "codeLength", "getCodeLength()I", 0), wj6.p(cls, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), wj6.p(cls, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), wj6.p(cls, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), rae.s(cls, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, bk3] */
    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new Object();
        this.b = yh7.d;
        Class<String> cls = String.class;
        this.c = new is(cls, "screen:confirm_phone:verify_token");
        this.o = new is(cls, "screen:confirm_phone:phone");
        this.v = new is(Integer.class, "screen:confirm_phone:code_length");
        this.w = new w28(new oq2(23), (Function0) null, 6);
        this.x = createViewModelLazy(wf3.class, new rn2(17, new gf3(this, 0)));
        gf3 gf3 = new gf3(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = LazyKt.lazy(lazyThreadSafetyMode, gf3);
        this.z = n88.a.getAccessor().h(r80.class);
        this.X = viewBinding(xgc.oneme_login_confirm_description);
        this.Y = viewBinding(xgc.oneme_login_confirm_timer);
        this.Z = viewBinding(xgc.oneme_login_confirm_resend_code);
        this.v0 = viewBinding(xgc.oneme_login_confirm_sms_input);
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new gf3(this, 2));
        this.z0 = o5a.U();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c0(one.me.login.confirm.ConfirmPhoneScreen r7, defpackage.see r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.mf3
            if (r0 == 0) goto L_0x0016
            r0 = r9
            mf3 r0 = (defpackage.mf3) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            mf3 r0 = new mf3
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x003b
            if (r2 != r5) goto L_0x0033
            one.me.login.confirm.ConfirmPhoneScreen r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00fb
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0073
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r8 instanceof defpackage.ree
            if (r9 == 0) goto L_0x0077
            lg3 r8 = r7.f0()
            ig3 r9 = defpackage.ig3.SUCCESS
            r8.setState(r9)
            r7.k0(r3)
            r0.o = r4
            tu7 r8 = r7.getViewLifecycleScope()
            f14 r9 = defpackage.f14.b
            nf3 r0 = new nf3
            r0.<init>(r7, r3)
            aje r8 = defpackage.ev0.v(r8, r3, r9, r0, r4)
            kotlin.reflect.KProperty[] r9 = A0
            r0 = 7
            r9 = r9[r0]
            wie r0 = r7.z0
            r0.setValue(r7, r9, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            if (r7 != r1) goto L_0x0073
            goto L_0x0112
        L_0x0073:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x0112
        L_0x0077:
            boolean r9 = r8 instanceof defpackage.qee
            if (r9 == 0) goto L_0x0119
            lg3 r9 = r7.f0()
            ig3 r2 = defpackage.ig3.ERROR
            r9.setState(r2)
            r7.j0()
            qee r8 = (defpackage.qee) r8
            v88 r9 = r8.a
            boolean r2 = r9 instanceof defpackage.u88
            if (r2 == 0) goto L_0x00d7
            kotlin.Lazy r9 = r7.z
            java.lang.Object r9 = r9.getValue()
            r80 r9 = (defpackage.r80) r9
            p80 r2 = new p80
            v88 r8 = r8.a
            u88 r8 = (defpackage.u88) r8
            q80 r6 = r8.e
            r2.<init>(r6)
            r9.a(r2)
            ngf r9 = r8.c
            bk3 r2 = r7.a
            r2.getClass()
            android.content.Context r2 = r7.getContext()
            java.lang.CharSequence r9 = r9.a(r2)
            if (r9 != 0) goto L_0x00b7
            goto L_0x00ee
        L_0x00b7:
            ngf r8 = r8.d
            if (r8 == 0) goto L_0x00c4
            android.content.Context r2 = r7.getContext()
            java.lang.CharSequence r8 = r8.a(r2)
            goto L_0x00c5
        L_0x00c4:
            r8 = r3
        L_0x00c5:
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r7)
            r2.i(r9)
            r2.b(r8)
            r2.e(r4)
            r2.j()
            goto L_0x00ee
        L_0x00d7:
            boolean r8 = r9 instanceof defpackage.q88
            if (r8 == 0) goto L_0x00e3
            q88 r9 = (defpackage.q88) r9
            ngf r8 = r9.c
            r7.k0(r8)
            goto L_0x00ee
        L_0x00e3:
            boolean r8 = r9 instanceof defpackage.r88
            if (r8 == 0) goto L_0x0109
            r88 r9 = (defpackage.r88) r9
            ngf r8 = r9.c
            r7.k0(r8)
        L_0x00ee:
            r0.a = r7
            r0.o = r5
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = defpackage.xk4.b(r8, r0)
            if (r8 != r1) goto L_0x00fb
            goto L_0x0112
        L_0x00fb:
            r7.k0(r3)
            lg3 r7 = r7.f0()
            ig3 r8 = defpackage.ig3.NORMAL
            r7.setState(r8)
            goto L_0x0073
        L_0x0109:
            boolean r8 = r9 instanceof defpackage.s88
            if (r8 == 0) goto L_0x0113
            defpackage.ld9.R(r7)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0112:
            return r1
        L_0x0113:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0119:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.c0(one.me.login.confirm.ConfirmPhoneScreen, see, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(String str) {
        wf3 h0 = h0();
        h0.getClass();
        String str2 = wf3.F0;
        z68.c(str2, "onCodeEntered", new Object[0]);
        if (str.length() == 0) {
            z68.p(str2, "empty sms");
        } else if (!Intrinsics.areEqual((Object) str, (Object) h0.B0)) {
            h0.B0 = str;
            jx3 jx3 = h0.a;
            q04 b2 = ((osa) ((gaf) h0.z.getValue())).b();
            f14 f14 = f14.b;
            rf3 rf3 = new rf3(h0, str, (Continuation) null);
            KProperty kProperty = wf3.E0[0];
            h0.D0.setValue(h0, kProperty, (aje) h0.b.a(jx3, b2, f14, rf3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d0(android.widget.TextView r10, int r11, boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.hf3
            if (r0 == 0) goto L_0x0013
            r0 = r13
            hf3 r0 = (defpackage.hf3) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            hf3 r0 = new hf3
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r9 = r0.c
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.v
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 800(0x320, double:3.953E-321)
            if (r1 == 0) goto L_0x003f
            if (r1 == r4) goto L_0x0037
            if (r1 != r3) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0085
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            boolean r12 = r0.b
            android.widget.TextView r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0068
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r9)
            r10.setText(r11)
            r10.setAlpha(r2)
            android.view.ViewPropertyAnimator r9 = r10.animate()
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r9 = r9.alpha(r11)
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r5)
            r9.start()
            r0.a = r10
            r0.b = r12
            r0.v = r4
            r7 = 2800(0xaf0, double:1.3834E-320)
            java.lang.Object r9 = defpackage.xk4.b(r7, r0)
            if (r9 != r13) goto L_0x0068
            return r13
        L_0x0068:
            if (r12 != 0) goto L_0x0088
            android.view.ViewPropertyAnimator r9 = r10.animate()
            android.view.ViewPropertyAnimator r9 = r9.alpha(r2)
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r5)
            r9.start()
            r9 = 0
            r0.a = r9
            r0.v = r3
            java.lang.Object r9 = defpackage.xk4.b(r5, r0)
            if (r9 != r13) goto L_0x0085
            return r13
        L_0x0085:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0088:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.d0(android.widget.TextView, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final OneMeButton e0() {
        return (OneMeButton) this.Z.getValue(this, A0[5]);
    }

    public final lg3 f0() {
        return (lg3) this.v0.getValue(this, A0[6]);
    }

    public final void g(int i, Bundle bundle) {
        if (i == xgc.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().C();
        }
    }

    public final TextView g0() {
        return (TextView) this.Y.getValue(this, A0[4]);
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.w;
    }

    public final wf3 h0() {
        return (wf3) this.x.getValue();
    }

    public final void i0(String str) {
        int i = 0;
        boolean z2 = str != null;
        e0().setVisibility(z2 ^ true ? 0 : 8);
        TextView g0 = g0();
        if (!z2) {
            i = 8;
        }
        g0.setVisibility(i);
        float f = 1.0f;
        e0().setAlpha(z2 ? 0.0f : 1.0f);
        TextView g02 = g0();
        if (!z2) {
            f = 0.0f;
        }
        g02.setAlpha(f);
        if (str != null) {
            g0().setText(((String) this.x0.getValue()) + " " + str);
        }
    }

    public final void j0() {
        KProperty[] kPropertyArr = A0;
        KProperty kProperty = kPropertyArr[7];
        wie wie = this.z0;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[7], (Object) null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.y0);
        }
        this.y0 = null;
        i0((String) h0().y0.a.getValue());
    }

    public final void k0(ngf ngf) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator alpha;
        TextView textView = this.w0;
        CharSequence charSequence = null;
        float f = c44.DEFAULT_ASPECT_RATIO;
        if (textView == null && ngf != null) {
            int indexOfChild = ((ViewGroup) getView()).indexOfChild(f0());
            TextView textView2 = new TextView(getContext());
            puf.o.b(textView2, uy4.b);
            textView2.setTextColor(fu4.k.e(textView2.getContext()).f().getText().b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f2 = (float) 12;
            layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 0);
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView2, indexOfChild + 1);
            }
            this.w0 = textView2;
        }
        if (ngf != null) {
            f = 1.0f;
        }
        TextView textView3 = this.w0;
        if (textView3 != null) {
            if (ngf != null) {
                charSequence = ngf.a(getContext());
            }
            textView3.setText(charSequence);
        }
        TextView textView4 = this.w0;
        if (textView4 != null && (animate = textView4.animate()) != null && (duration = animate.setDuration(200)) != null && (alpha = duration.alpha(f)) != null) {
            alpha.start();
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        f0().requestFocus();
        wf3 h0 = h0();
        aje aje = h0.C0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        h0.C0 = xag.g(h0, (CoroutineContext) null, (f14) null, new vf3(h0, (Continuation) null), 3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new ff3(this, 0)));
        linearLayout.setGravity(17);
        linearLayout.addView(d);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(xgc.oneme_login_confirm_title);
        textView.setText(nlc.oneme_login_confirm_title);
        puf.c.b(textView, uy4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(layoutParams);
        b0h.H(textView, new ra(3, (Continuation) null, 8));
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(xgc.oneme_login_confirm_description);
        puf.l.b(textView2, uy4.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        textView2.setLayoutParams(layoutParams2);
        b0h.H(textView2, new ra(3, (Continuation) null, 9));
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        lg3 lg3 = new lg3(linearLayout.getContext(), (AttributeSet) null);
        lg3.setId(xgc.oneme_login_confirm_sms_input);
        lg3.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        lg3.setLayoutParams(layoutParams3);
        u3b.a(lg3, new if3(lg3, lg3, 0));
        lg3.setKeyboardOpen(new oq2(22));
        KProperty kProperty = A0[2];
        lg3.setCountCells(((Number) this.v.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(lg3);
        Space space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(xgc.oneme_login_confirm_timer);
        puf.o.b(textView3, uy4.b);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = (float) 16;
        layoutParams5.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        textView3.setLayoutParams(layoutParams5);
        b0h.H(textView3, new ra(3, (Continuation) null, 7));
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(xgc.oneme_login_confirm_resend_code);
        oneMeButton.setText(nlc.oneme_login_confirm_resend);
        oneMeButton.setMode(zpa.o);
        oneMeButton.setAppearance(xpa.a);
        oneMeButton.setSize(aqa.a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams6);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        j0();
        this.w0 = null;
        f0().setListener((hg3) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        phf phf = view instanceof phf ? (phf) view : null;
        if (phf != null) {
            phf.onThemeChanged(fu4.k.f(view));
        }
        KProperty[] kPropertyArr = A0;
        KProperty kProperty = kPropertyArr[3];
        Context context = getContext();
        int i = nlc.oneme_login_confirm_description;
        KProperty kProperty2 = kPropertyArr[1];
        ((TextView) this.X.getValue(this, kProperty)).setText(context.getString(i, new Object[]{(String) this.o.a(this)}));
        ct.G(e0(), 300, new x4(27, (Object) this));
        f0().setOnAnimationEnded(new ff3(this, 1));
        bs0.K(new ps5(h0().w0, new jf3(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(h0().y0, new kf3(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(new on2(h0().z0, 28), new lf3(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(h0().v0, new zw(14, (Object) this), 5), getViewLifecycleScope());
        wf3 h0 = h0();
        wt6 wt6 = (wt6) ((bfe) h0.Y.getValue());
        wt6.h = h0.c;
        wt6.b();
    }

    public ConfirmPhoneScreen(String str, String str2, int i) {
        this(o54.f(TuplesKt.to("screen:confirm_phone:verify_token", str), TuplesKt.to("screen:confirm_phone:phone", str2), TuplesKt.to("screen:confirm_phone:code_length", Integer.valueOf(i))));
    }
}
