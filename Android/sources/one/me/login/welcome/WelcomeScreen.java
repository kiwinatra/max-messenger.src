package one.me.login.welcome;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/welcome/WelcomeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWelcomeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeScreen.kt\none/me/login/welcome/WelcomeScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,283:1\n255#2,9:284\n8#3:293\n8#3:294\n24#4:295\n24#4:297\n24#4:298\n24#4:299\n24#4:300\n24#4:302\n24#4:303\n1#5:296\n23#6:301\n17#6:304\n17#6:305\n17#6:306\n*S KotlinDebug\n*F\n+ 1 WelcomeScreen.kt\none/me/login/welcome/WelcomeScreen\n*L\n71#1:284,9\n79#1:293\n80#1:294\n99#1:295\n110#1:297\n128#1:298\n142#1:299\n143#1:300\n160#1:302\n175#1:303\n149#1:301\n211#1:304\n212#1:305\n213#1:306\n*E\n"})
@SuppressLint({"ValidController"})
public final class WelcomeScreen extends Widget {
    public static final /* synthetic */ KProperty[] X;
    public final yh7 a = new yh7((jdb) null, new nr0(jdb.b, mr0.a, false), 1);
    public final w28 b = new w28(new i2g(10), (Function0) null, 6);
    public final Lazy c = m1571getSharedViewModelcp94BC8("LoginScope", k98.class, (Function0) null);
    public final Lazy o = rjd.P;
    public final ReadOnlyProperty v = viewBinding(xgc.oneme_login_welcome_placeholder);
    public final ReadOnlyProperty w = viewBinding(xgc.oneme_login_welcome_terms);
    public final Lazy x;
    public final Lazy y;
    public final l2b z;

    static {
        Class<WelcomeScreen> cls = WelcomeScreen.class;
        X = new KProperty[]{wj6.p(cls, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wj6.p(cls, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    }

    public WelcomeScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        lce lce = new lce(19, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = LazyKt.lazy(lazyThreadSafetyMode, lce);
        this.y = LazyKt.lazy(lazyThreadSafetyMode, new i2g(11));
        this.z = l2b.a;
    }

    public static final void c0(WelcomeScreen welcomeScreen, String str) {
        welcomeScreen.getClass();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            welcomeScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            z68.f("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", (Throwable) null);
            e0b e0b = new e0b((Widget) welcomeScreen);
            e0b.i(welcomeScreen.getContext().getString(qad.B5));
            e0b.j();
        }
    }

    public final void d0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan) {
        int l = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + l;
        spannableString.setSpan(clickableSpan, l, length, 33);
        this.z.getClass();
        spannableString.setSpan(new ForegroundColorSpan(l2b.i.e), l, length, 33);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        g4e g4e = new g4e(constraintLayout.getContext());
        fj3 fj3 = new fj3(-1, -1);
        fj3.i = 0;
        fj3.t = 0;
        fj3.v = 0;
        fj3.l = 0;
        g4e.setLayoutParams(fj3);
        constraintLayout.addView(g4e);
        View view = new View(constraintLayout.getContext());
        view.setId(xgc.oneme_login_welcome_toolbar);
        fj3 fj32 = new fj3(0, MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density));
        fj32.i = 0;
        fj32.t = 0;
        fj32.v = 0;
        view.setLayoutParams(fj32);
        h88.g(view);
        constraintLayout.addView(view);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xgc.oneme_login_welcome_title);
        fj3 fj33 = new fj3(-2, -2);
        float f = (float) 16;
        fj33.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        fj33.j = xgc.oneme_login_welcome_toolbar;
        fj33.t = 0;
        fj33.v = 0;
        fj33.k = xgc.oneme_login_welcome_description;
        fj33.K = 2;
        textView.setLayoutParams(fj33);
        textView.setGravity(17);
        l2b l2b = this.z;
        l2b.getClass();
        xef xef = l2b.i;
        textView.setTextColor(xef.e);
        puf.w.b(textView, uy4.b);
        textView.setText(nlc.oneme_login_welcome_title);
        Lazy lazy = this.y;
        ((vpa) lazy.getValue()).getClass();
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xgc.oneme_login_welcome_description);
        fj3 fj34 = new fj3(-2, -2);
        float f2 = (float) 12;
        fj34.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        fj34.j = xgc.oneme_login_welcome_title;
        fj34.t = 0;
        fj34.v = 0;
        fj34.k = xgc.oneme_login_welcome_placeholder;
        textView2.setLayoutParams(fj34);
        textView2.setTextColor(xef.g);
        puf.l.b(textView2, uy4.b);
        textView2.setText(nlc.oneme_login_welcome_description);
        ((vpa) lazy.getValue()).getClass();
        constraintLayout.addView(textView2);
        ks6 ks6 = new ks6(constraintLayout.getContext());
        ks6.setId(xgc.oneme_login_welcome_placeholder);
        float f3 = (float) 234;
        fj3 fj35 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        fj35.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0);
        fj35.j = xgc.oneme_login_welcome_title;
        fj35.k = xgc.oneme_login_welcome_continue_btn;
        fj35.t = 0;
        fj35.v = 0;
        ks6.setLayoutParams(fj35);
        ks6.setImageDrawable(ew3.b(getContext(), uec.welcome_logo));
        ((vpa) lazy.getValue()).getClass();
        constraintLayout.addView(ks6);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(xgc.oneme_login_welcome_continue_btn);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(nlc.oneme_login_welcome_continue_btn);
        fj3 fj36 = new fj3(0, -2);
        fj36.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj36.k = xgc.oneme_login_welcome_terms;
        fj36.t = 0;
        fj36.v = 0;
        oneMeButton.setLayoutParams(fj36);
        ct.G(oneMeButton, 300, new dte(9, this));
        oneMeButton.setCustomTheme(l2b);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(xgc.oneme_login_welcome_terms);
        textView3.setGravity(1);
        fj3 fj37 = new fj3(-1, -2);
        fj37.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        fj37.l = 0;
        fj37.t = 0;
        fj37.v = 0;
        textView3.setLayoutParams(fj37);
        puf.o.b(textView3, uy4.b);
        textView3.setTextColor(xef.f);
        constraintLayout.addView(textView3);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        KProperty[] kPropertyArr = X;
        KProperty kProperty = kPropertyArr[1];
        ReadOnlyProperty readOnlyProperty = this.w;
        String p = q8.p(nlc.oneme_login_welcome_terms, getContext());
        String p2 = q8.p(nlc.oneme_login_welcome_privacy_policy_clickable_part, getContext());
        String p3 = q8.p(nlc.oneme_login_welcome_user_agreement_clickable_part, getContext());
        SpannableString spannableString = new SpannableString(p);
        d0(p, p2, spannableString, new umg(this, 0));
        d0(p, p3, spannableString, new umg(this, 1));
        ((TextView) readOnlyProperty.getValue(this, kProperty)).setText(spannableString);
        ((TextView) readOnlyProperty.getValue(this, kPropertyArr[1])).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
