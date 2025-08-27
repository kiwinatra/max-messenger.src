package one.me.settings.privacy.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSafeModeOnboardingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeModeOnboardingScreen.kt\none/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ContextExt.kt\none/me/common/ext/ContextExtKt\n*L\n1#1,254:1\n1#2:255\n20#3:256\n21#3:285\n20#3:297\n21#3:329\n191#4:257\n186#4,7:258\n191#4:265\n186#4,7:266\n191#4:273\n186#4:274\n187#4,6:279\n186#4:298\n187#4:301\n186#4:302\n187#4:305\n186#4:306\n187#4:309\n186#4:310\n187#4:313\n186#4:314\n187#4:318\n186#4:319\n187#4:323\n186#4:324\n187#4:328\n24#5:275\n24#5:276\n24#5:277\n24#5:278\n24#5:286\n24#5:287\n24#5:288\n24#5:289\n24#5:290\n24#5:299\n24#5:300\n24#5:303\n24#5:304\n24#5:307\n24#5:308\n24#5:311\n24#5:312\n24#5:315\n24#5:316\n24#5:317\n24#5:320\n24#5:321\n24#5:322\n24#5:325\n24#5:326\n24#5:327\n20#6:291\n20#6:292\n20#6:293\n20#6:294\n20#6:295\n20#6:296\n*S KotlinDebug\n*F\n+ 1 SafeModeOnboardingScreen.kt\none/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen\n*L\n88#1:256\n88#1:285\n195#1:297\n195#1:329\n89#1:257\n89#1:258,7\n95#1:265\n95#1:266,7\n101#1:273\n101#1:274\n101#1:279,6\n196#1:298\n196#1:301\n204#1:302\n204#1:305\n212#1:306\n212#1:309\n217#1:310\n217#1:313\n222#1:314\n222#1:318\n227#1:319\n227#1:323\n232#1:324\n232#1:328\n102#1:275\n103#1:276\n104#1:277\n105#1:278\n120#1:286\n147#1:287\n148#1:288\n161#1:289\n162#1:290\n200#1:299\n201#1:300\n209#1:303\n210#1:304\n214#1:307\n215#1:308\n219#1:311\n220#1:312\n223#1:315\n224#1:316\n225#1:317\n228#1:320\n229#1:321\n230#1:322\n233#1:325\n234#1:326\n235#1:327\n174#1:291\n175#1:292\n182#1:293\n183#1:294\n190#1:295\n191#1:296\n*E\n"})
@SuppressLint({"ValidController"})
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final yh7 a = yh7.d;
    public final w28 b = new w28(jgd.SETTINGS_PRIVACY_SAFE_MODE);

    public SafeModeOnboardingScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        yh7 yh7 = yh7.c;
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setId(zhc.oneme_settings_privacy_onboarding_root);
        js9 js9 = fu4.k;
        constraintLayout.setBackgroundColor(js9.e(constraintLayout.getContext()).f().c().i);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipToOutline(false);
        h3b d = o54.d(constraintLayout.getContext(), (AttributeSet) null);
        d.setId(zhc.oneme_settings_privacy_onboarding_toolbar);
        d.setForm(z2b.a);
        d.setBackgroundColor(0);
        d.setLayoutParams(new fj3(-1, -2));
        d.setTranslationZ(1000.0f);
        d.setLeftActions(new p2b(new jkb(16, (Object) this)));
        constraintLayout.addView(d);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(zhc.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new fj3(-1, -2));
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(zhc.oneme_settings_privacy_onboarding_content);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(zhc.oneme_settings_privacy_onboarding_top_guideline);
        fj3 fj3 = new fj3(0, 0);
        fj3.a = MathKt.roundToInt(((float) 60) * vo4.c().getDisplayMetrics().density);
        fj3.V = 0;
        guideline.setLayoutParams(fj3);
        constraintLayout2.addView(guideline);
        View view = new View(context);
        view.setId(zhc.oneme_settings_privacy_onboarding_lock_background);
        fj3 fj32 = new fj3(0, 0);
        fj32.topMargin = ((fj3) guideline.getLayoutParams()).a;
        view.setLayoutParams(fj32);
        constraintLayout2.setClipToPadding(false);
        view.setClipToOutline(false);
        o7e o7e = new o7e(context);
        o7e.x0.setValue(o7e, o7e.y0[7], Boolean.FALSE);
        view.setBackground(o7e);
        constraintLayout2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(zhc.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new fj3(0, 0));
        imageView.setImageResource(dfc.oneme_settings_privacy_big_lock);
        constraintLayout2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(zhc.oneme_settings_privacy_onboarding_content_title);
        fj3 fj33 = new fj3(-2, -2);
        float f = (float) 32;
        fj33.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj33.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        textView.setLayoutParams(fj33);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        puf.c.b(textView, uy4.b);
        textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
        textView.setText(gmc.oneme_settings_privacy_screen_safe_mode);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(zhc.oneme_settings_privacy_onboarding_content_subtitle);
        fj3 fj34 = new fj3(-2, -2);
        fj34.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj34.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        textView2.setLayoutParams(fj34);
        textView2.setMaxLines(2);
        textView2.setTextAlignment(4);
        puf.m.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().f);
        textView2.setText(gmc.oneme_settings_privacy_onboarding_content_subtitle);
        constraintLayout2.addView(textView2);
        r1e r1e = new r1e(context, (AttributeSet) null);
        r1e.setId(zhc.oneme_settings_privacy_onboarding_item_1);
        r1e.setStartIcon(nad.A);
        r1e.setTitle((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_1_title, r1e.getContext()));
        r1e.setDescription((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_1_subtitle, r1e.getContext()));
        r1e.onThemeChanged(js9.e(context).f());
        constraintLayout2.addView(r1e);
        r1e r1e2 = new r1e(context, (AttributeSet) null);
        r1e2.setId(zhc.oneme_settings_privacy_onboarding_item_2);
        r1e2.setStartIcon(nad.q);
        r1e2.setTitle((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_2_title, r1e2.getContext()));
        r1e2.setDescription((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_2_subtitle, r1e2.getContext()));
        r1e2.onThemeChanged(js9.e(context).f());
        constraintLayout2.addView(r1e2);
        r1e r1e3 = new r1e(context, (AttributeSet) null);
        r1e3.setId(zhc.oneme_settings_privacy_onboarding_item_3);
        r1e3.setStartIcon(nad.l1);
        h3b h3b = d;
        r1e3.setTitle((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_3_title, r1e3.getContext()));
        r1e3.setDescription((CharSequence) q8.p(gmc.oneme_settings_privacy_onboarding_item_3_subtitle, r1e3.getContext()));
        r1e3.onThemeChanged(js9.e(context).f());
        constraintLayout2.addView(r1e3);
        pj3 h = ct.h(constraintLayout2);
        int id = view.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        float f2 = (float) HttpStatus.SC_MULTIPLE_CHOICES;
        ConstraintLayout constraintLayout3 = constraintLayout;
        h.j(id).d.Z = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        h.j(id).d.a0 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        h.j(id).d.y = "1:1";
        int id2 = imageView.getId();
        h.e(id2, 3, guideline.getId(), 3);
        h.e(id2, 6, view.getId(), 6);
        h.e(id2, 7, view.getId(), 7);
        h.e(id2, 4, view.getId(), 4);
        h.j(id2).d.Z = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        h.j(id2).d.a0 = MathKt.roundToInt(((float) 212) * vo4.c().getDisplayMetrics().density);
        int id3 = textView.getId();
        h.e(id3, 3, view.getId(), 4);
        h.e(id3, 6, 0, 6);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 6, id3, 4));
        h.e(id3, 7, 0, 7);
        new ila(h, 7, id3, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        int id4 = textView2.getId();
        h.e(id4, 3, textView.getId(), 4);
        h.e(id4, 6, 0, 6);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 6, id4, 4));
        h.e(id4, 7, 0, 7);
        new ila(h, 7, id4, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        int id5 = r1e.getId();
        h.e(id5, 3, textView2.getId(), 4);
        tr1.u((float) 36, vo4.c().getDisplayMetrics().density, new ila(h, 3, id5, 4));
        h.e(id5, 6, 0, 6);
        float f3 = (float) 12;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 6, id5, 4));
        h.e(id5, 7, 0, 7);
        new ila(h, 7, id5, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        int id6 = r1e2.getId();
        h.e(id6, 3, r1e.getId(), 4);
        float f4 = (float) 4;
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id6, 4));
        h.e(id6, 6, 0, 6);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 6, id6, 4));
        h.e(id6, 7, 0, 7);
        new ila(h, 7, id6, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        int id7 = r1e3.getId();
        h.e(id7, 3, r1e2.getId(), 4);
        tr1.u(f4, vo4.c().getDisplayMetrics().density, new ila(h, 3, id7, 4));
        h.e(id7, 6, 0, 6);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 6, id7, 4));
        h.e(id7, 7, 0, 7);
        new ila(h, 7, id7, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        h.a(constraintLayout2);
        scrollView.addView(constraintLayout2);
        ConstraintLayout constraintLayout4 = constraintLayout3;
        constraintLayout4.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout4.getContext(), (AttributeSet) null);
        oneMeButton.setId(zhc.oneme_settings_privacy_onboarding_set_pin_code_button);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setText(gmc.oneme_settings_privacy_onboarding_set_pin_code);
        oneMeButton.setLayoutParams(new fj3(0, -2));
        ct.G(oneMeButton, 300, new p71(5));
        constraintLayout4.addView(oneMeButton);
        pj3 h2 = ct.h(constraintLayout4);
        int id8 = h3b.getId();
        h2.e(id8, 3, 0, 3);
        h2.e(id8, 6, 0, 6);
        h2.e(id8, 7, 0, 7);
        int id9 = scrollView.getId();
        h2.e(id9, 3, 0, 3);
        h2.e(id9, 6, 0, 6);
        h2.e(id9, 7, 0, 7);
        int id10 = oneMeButton.getId();
        h2.e(id10, 6, 0, 6);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h2, 6, id10, 4));
        h2.e(id10, 7, 0, 7);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h2, 7, id10, 4));
        h2.e(id10, 4, 0, 4);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h2, 4, id10, 4));
        h2.j(id10).d.Z = MathKt.roundToInt(((float) 336) * vo4.c().getDisplayMetrics().density);
        h2.a(constraintLayout4);
        return constraintLayout4;
    }

    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        fu4.k.e(view.getContext()).f().c().getClass();
        window.setStatusBarColor(0);
    }

    public final void onViewCreated(View view) {
        b0h.H(view, new qrb((Object) view, (Continuation) null, 7));
    }
}
