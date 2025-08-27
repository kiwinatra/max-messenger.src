package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: mz1  reason: default package */
public final class mz1 extends LinearLayout implements phf {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final OneMeButton o;

    public mz1(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        puf.d.b(textView, uy4.b);
        textView.setGravity(1);
        textView.setText(gmc.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        puf.l.b(textView2, uy4.b);
        textView2.setText(gmc.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setText(qad.wa);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        ct.G(oneMeButton, 300, new xu3(11, (Object) forgotPinCodeDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        switch (this.a) {
            case 0:
                this.b.setTextColor(k2b.getText().e);
                this.c.setTextColor(k2b.getText().f);
                this.o.e();
                return;
            default:
                this.b.setTextColor(k2b.getText().e);
                this.c.setTextColor(k2b.getText().f);
                this.o.e();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz1(ChangeDisabledDialog changeDisabledDialog, Context context) {
        super(context);
        js9 js9;
        int i = 0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        puf.d.b(textView, uy4.b);
        textView.setGravity(1);
        textView.setText(gmc.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        puf.l.b(textView2, uy4.b);
        int i2 = ChangeDisabledDialog.w0;
        SpannableString valueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(gmc.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        akd akd = (akd) ((bud) e3e.a.getAccessor().h(bud.class).getValue());
        akd.getClass();
        String u = akd.u(PmsKey.f110supportaccount, "max.ru/support");
        int length = uRLSpanArr.length;
        while (true) {
            js9 = fu4.k;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                valueOf.removeSpan(uRLSpan);
                js9.e(textView2.getContext()).f().getText().getClass();
                ms1 ms1 = new ms1(5, changeDisabledDialog);
                ky7 ky7 = new ky7(u, -16745729);
                ky7.c = ms1;
                te8.B(valueOf, ky7, spanStart, spanEnd);
                break;
            }
            i++;
        }
        textView2.setText(valueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setText(qad.E3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        ct.G(oneMeButton, 300, new x4(20, (Object) changeDisabledDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(js9.e(getContext()).f());
    }
}
