package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.math.MathKt;

/* renamed from: yj7  reason: default package */
public final class yj7 extends LinearLayout implements phf {
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final RippleDrawable c;

    public yj7(Context context) {
        super(context, (AttributeSet) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        float f2 = (float) 18;
        layoutParams.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        puf.i.b(appCompatTextView, uy4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        js9 js9 = fu4.k;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(js9.e(getContext()).f().c().f), (Drawable) null, shapeDrawable);
        this.c = rippleDrawable;
        setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density)));
        setGravity(16);
        float f3 = (float) 12;
        setPadding(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(js9.e(getContext()).f());
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    public final void onThemeChanged(k2b k2b) {
        k2b.getText().getClass();
        this.a.setImageTintList(ColorStateList.valueOf(-16745729));
        k2b.getText().getClass();
        this.b.setTextColor(-16745729);
        this.c.setColor(ColorStateList.valueOf(k2b.b().a.f));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
