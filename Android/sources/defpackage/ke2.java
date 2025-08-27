package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: ke2  reason: default package */
public final class ke2 extends ConstraintLayout implements phf {
    public final TextView E0;
    public final TextView F0;
    public final TextView G0;
    public final OneMeAvatarView H0;
    public final LinearLayout I0;

    public ke2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        fj3 fj3 = new fj3(-1, -2);
        float f = (float) 4;
        fj3.bottomMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(fj3);
        puf.i.b(textView, uy4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.E0 = textView;
        TextView textView2 = new TextView(context);
        fj3 fj32 = new fj3(-1, -2);
        fj32.bottomMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(fj32);
        ogf ogf = puf.m;
        ogf.b(textView2, uy4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.F0 = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new fj3(-1, -2));
        ogf.b(textView3, uy4.b);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        js9 js9 = fu4.k;
        int i = js9.e(textView3.getContext()).f().b().a.f;
        textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        this.G0 = textView3;
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        oneMeAvatarView.setId(jxa.i0);
        float f2 = (float) 48;
        oneMeAvatarView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        oneMeAvatarView.setAvatarShape(ioa.a);
        this.H0 = oneMeAvatarView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(jxa.h0);
        linearLayout.setLayoutParams(new fj3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.I0 = linearLayout;
        setLayoutParams(new fj3(-1, -2));
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        int i2 = js9.e(getContext()).f().b().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, new ColorDrawable(-1)));
        addView(oneMeAvatarView);
        addView(linearLayout);
        onThemeChanged(js9.e(getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        this.E0.setTextColor(k2b.getText().e);
        this.F0.setTextColor(k2b.getText().f);
        k2b.getText().getClass();
        this.G0.setTextColor(-16745729);
        this.H0.onThemeChanged(k2b);
    }

    public final void setLink(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.G0.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        gd0 gd0 = new gd0(this.E0.getText(), 9223372036854775806L);
        OneMeAvatarView oneMeAvatarView = this.H0;
        oneMeAvatarView.f(gd0, false);
        oneMeAvatarView.setAvatarUrl(str);
        pj3 h = ct.h(this);
        ni0 ni0 = new ni0((Object) h, oneMeAvatarView.getId(), 4);
        ni0.P(0);
        ni0.R(0);
        ni0.b(0);
        ni0 ni02 = new ni0((Object) h, this.I0.getId(), 4);
        ni02.R(0);
        ni02.b(0);
        ni02.t(0);
        ni02.O(oneMeAvatarView.getId()).e(MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        ct.G(this.G0, 300, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.F0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }
}
