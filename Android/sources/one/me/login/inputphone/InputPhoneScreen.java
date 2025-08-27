package one.me.login.inputphone;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Ly14;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nInputPhoneScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputPhoneScreen.kt\none/me/login/inputphone/InputPhoneScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 9 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,589:1\n235#2,10:590\n419#2:600\n410#2,8:609\n410#2,8:617\n410#2,8:628\n5#3:601\n1#4:602\n24#5:603\n24#5:604\n24#5:605\n24#5:606\n24#5:607\n24#5:608\n24#5:637\n17#6:625\n17#6:626\n17#6:627\n254#7:636\n256#7,2:638\n135#8,3:640\n138#8,8:657\n33#9,14:643\n*S KotlinDebug\n*F\n+ 1 InputPhoneScreen.kt\none/me/login/inputphone/InputPhoneScreen\n*L\n106#1:590,10\n114#1:600\n358#1:609,8\n362#1:617,8\n447#1:628,8\n131#1:601\n168#1:603\n235#1:604\n252#1:605\n267#1:606\n292#1:607\n306#1:608\n517#1:637\n380#1:625\n381#1:626\n382#1:627\n492#1:636\n530#1:638,2\n281#1:640,3\n281#1:657,8\n281#1:643,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class InputPhoneScreen extends Widget implements y14 {
    public static final /* synthetic */ KProperty[] D0;
    public final Lazy A0;
    public final Lazy B0;
    public final ne1 C0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final /* synthetic */ bk3 a = new Object();
    public final yh7 b = new yh7((jdb) null, new nr0(jdb.b, mr0.c, false), 1);
    public final w28 c = new w28(new a46(27), (Function0) null, 6);
    public final Lazy o = createViewModelLazy(rh7.class, new i76(4, new a46(28)));
    public final is v = new is(String.class, "", "screen:input_phone:phone");
    public AppCompatTextView v0;
    public final String w = "LoginScope";
    public final Lazy w0;
    public final Lazy x;
    public ij7 x0;
    public final ReadOnlyProperty y;
    public final Lazy y0;
    public final ReadOnlyProperty z;
    public final Lazy z0;

    static {
        Class<InputPhoneScreen> cls = InputPhoneScreen.class;
        D0 = new KProperty[]{rae.s(cls, "phone", "getPhone()Ljava/lang/String;", 0), wj6.p(cls, "containerView", "getContainerView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), wj6.p(cls, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), wj6.p(cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, bk3] */
    public InputPhoneScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        n88 n88 = n88.a;
        this.x = n88.getAccessor().h(nd.class);
        this.y = viewBinding(xgc.oneme_login_input_constraint_layout);
        this.z = viewBinding(xgc.oneme_login_input_gradient_bg);
        this.X = viewBinding(xgc.oneme_login_input_continue_button);
        this.Y = viewBinding(xgc.oneme_login_input_phone_number_input);
        this.Z = viewBinding(xgc.oneme_login_input_help_button);
        this.w0 = n88.getAccessor().h(aeb.class);
        this.y0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ah7(this, 0));
        this.z0 = fdb.a.c();
        this.A0 = n88.getAccessor().h(r80.class);
        this.B0 = n88.getAccessor().h(vpa.class);
        this.C0 = new ne1(this, 5);
    }

    public static final void c0(InputPhoneScreen inputPhoneScreen, String str) {
        inputPhoneScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            z68.f("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            e0b e0b = new e0b((Widget) inputPhoneScreen);
            e0b.i(inputPhoneScreen.getContext().getString(qad.B5));
            e0b.j();
        }
    }

    public static final void d0(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        int i = 0;
        if (inputPhoneScreen.v0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inputPhoneScreen.getContext(), (AttributeSet) null);
            puf.o.b(appCompatTextView, uy4.b);
            fj3 fj3 = new fj3(0, -2);
            float f = (float) 24;
            fj3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
            fj3.j = xgc.oneme_login_input_phone_number_input;
            fj3.t = 0;
            fj3.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(fj3);
            b0h.H(appCompatTextView, new xg5(3, (Continuation) null, 1));
            ((ConstraintLayout) inputPhoneScreen.y.getValue(inputPhoneScreen, D0[1])).addView(appCompatTextView);
            inputPhoneScreen.v0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inputPhoneScreen.v0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inputPhoneScreen.v0;
        if (appCompatTextView3 != null) {
            if (!(!(charSequence == null || charSequence.length() == 0))) {
                i = 8;
            }
            appCompatTextView3.setVisibility(i);
        }
    }

    public static void h0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan, k2b k2b) {
        int l = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + l;
        spannableString.setSpan(clickableSpan, l, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(k2b.getText().e), l, length, 33);
    }

    public final void D(ysa ysa) {
        g0().w0.setValue(ysa);
    }

    public final OneMeButton e0() {
        return (OneMeButton) this.X.getValue(this, D0[3]);
    }

    public final zwa f0() {
        return (zwa) this.Y.getValue(this, D0[4]);
    }

    public final rh7 g0() {
        return (rh7) this.o.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1553getScopeIdIluPPks() {
        return this.w;
    }

    public final pgd getScreenDelegate() {
        return this.c;
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        xag.h(g0().X, Unit.INSTANCE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(scrollView.getContext());
        constraintLayout.setId(xgc.oneme_login_input_constraint_layout);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        b0h.H(constraintLayout, new ch7(this, (Continuation) null, 0));
        View view = new View(constraintLayout.getContext());
        view.setId(xgc.oneme_login_input_gradient_bg);
        fj3 fj3 = new fj3(-1, MathKt.roundToInt(((float) 283) * vo4.c().getDisplayMetrics().density));
        fj3.i = 0;
        fj3.t = 0;
        fj3.v = 0;
        view.setLayoutParams(fj3);
        tr9 tr9 = new tr9();
        tr9.setAlpha(127);
        view.setBackground(tr9);
        b0h.H(view, new ch7(this, (Continuation) null, 1));
        constraintLayout.addView(view);
        h3b d = o54.d(constraintLayout.getContext(), (AttributeSet) null);
        d.setId(xgc.oneme_login_input_toolbar);
        fj3 fj32 = new fj3(-1, -2);
        fj32.i = 0;
        fj32.t = 0;
        fj32.v = 0;
        d.setLayoutParams(fj32);
        d.setForm(z2b.a);
        d.setRightActions(new u2b((d3b) null, new b3b(lya.B, jya.F, new wk(18, d, this), 6)));
        ((vpa) this.B0.getValue()).getClass();
        jdb jdb = jdb.b;
        jdb jdb2 = anf.a;
        h88.f(d, new yh7(jdb, (nr0) null, 2), (Function1) null);
        constraintLayout.addView(d);
        yt7 yt7 = new yt7(constraintLayout.getContext());
        yt7.setId(xgc.oneme_login_input_logo);
        fj3 fj33 = new fj3(-1, 0);
        fj33.i = 0;
        fj33.t = 0;
        fj33.v = 0;
        fj33.l = xgc.oneme_login_input_toolbar;
        yt7.setLayoutParams(fj33);
        h88.f(yt7, new yh7(jdb, (nr0) null, 2), (Function1) null);
        constraintLayout.addView(yt7);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xgc.oneme_login_input_title);
        puf.c.b(textView, uy4.b);
        textView.setText(nlc.oneme_login_input_title);
        fj3 fj34 = new fj3(0, -2);
        float f = (float) 28;
        float f2 = (float) 24;
        fj34.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        fj34.j = xgc.oneme_login_input_toolbar;
        fj34.t = 0;
        fj34.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(fj34);
        b0h.H(textView, new ra(3, (Continuation) null, 15));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xgc.oneme_login_input_description);
        puf.l.b(textView2, uy4.b);
        textView2.setText(nlc.oneme_login_input_description);
        fj3 fj35 = new fj3(0, -2);
        float f3 = (float) 12;
        fj35.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        fj35.j = xgc.oneme_login_input_title;
        fj35.t = 0;
        fj35.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(fj35);
        b0h.H(textView2, new ra(3, (Continuation) null, 14));
        constraintLayout.addView(textView2);
        zwa zwa = new zwa(constraintLayout.getContext());
        zwa.setId(xgc.oneme_login_input_phone_number_input);
        fj3 fj36 = new fj3(0, -2);
        fj36.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        fj36.j = xgc.oneme_login_input_description;
        fj36.t = 0;
        fj36.v = 0;
        zwa.setLayoutParams(fj36);
        zwa.setPhoneFormatterProvider(new ib4(24, this, zwa));
        zwa.setOnCountryViewClickListener(new ah7(this, 1));
        constraintLayout.addView(zwa);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(xgc.oneme_login_input_continue_button);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setAppearance(xpa.o);
        fj3 fj37 = new fj3(0, -2);
        float f4 = (float) 16;
        fj37.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        fj37.j = xgc.oneme_login_input_phone_number_input;
        fj37.k = xgc.oneme_login_input_help_button;
        fj37.t = 0;
        fj37.v = 0;
        fj37.F = 1.0f;
        oneMeButton.setLayoutParams(fj37);
        oneMeButton.setText(nlc.oneme_login_input_continue);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(xgc.oneme_login_input_help_button);
        textView3.setGravity(1);
        fj3 fj38 = new fj3(-1, -2);
        fj38.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), 0, MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        fj38.l = 0;
        fj38.t = 0;
        fj38.v = 0;
        textView3.setLayoutParams(fj38);
        puf.o.b(textView3, uy4.b);
        b0h.H(textView3, new x2(this, (Continuation) null, 12));
        constraintLayout.addView(textView3);
        scrollView.addView(constraintLayout);
        return scrollView;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.v0 = null;
        zwa f0 = f0();
        f0.z.removeTextChangedListener(this.x0);
        this.x0 = null;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        fu4.k.e(view.getContext()).f().c().getClass();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        KProperty[] kPropertyArr = D0;
        Drawable background = ((View) this.z.getValue(this, kPropertyArr[2])).getBackground();
        tr9 tr9 = background instanceof tr9 ? (tr9) background : null;
        if (tr9 != null) {
            tr9.start();
        }
        ((TextView) this.Z.getValue(this, kPropertyArr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        zwa f0 = f0();
        boolean z2 = false;
        KProperty kProperty = kPropertyArr[0];
        is isVar = this.v;
        f0.setText((String) isVar.a(this));
        OneMeButton e0 = e0();
        KProperty kProperty2 = kPropertyArr[0];
        if (((String) isVar.a(this)).length() > 0) {
            z2 = true;
        }
        e0.setEnabled(z2);
        ct.G(e0(), 300, new xu3(18, (Object) this));
        f0().z.addTextChangedListener(this.C0);
        bs0.K(new ps5(g0().y, new bh7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(g0().Y, new fh7((Continuation) null, this), 5), getViewLifecycleScope());
        bs5 bs5 = g0().z0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(bs5, getViewLifecycleOwner().getLifecycle(), iu7), new dh7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().X, getViewLifecycleOwner().getLifecycle(), iu7), new eh7((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().x0, getViewLifecycleOwner().getLifecycle(), iu7), new hh7((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
