package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.math.MathKt;

/* renamed from: tqa  reason: default package */
public final class tqa extends LinearLayout implements phf, i5d {
    public final ShapeDrawable a = new ShapeDrawable();
    public final AppCompatTextView b;
    public final AppCompatTextView c;

    public tqa(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        puf.i.b(appCompatTextView, uy4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        puf.m.b(appCompatTextView2, uy4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(layoutParams.leftMargin, MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), layoutParams.rightMargin, layoutParams.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams);
        addView(appCompatTextView2, appCompatTextView2.getLayoutParams());
        this.c = appCompatTextView2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density));
        setOrientation(1);
        setGravity(16);
        float f = (float) 12;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final CharSequence getTextSubtitle() {
        return this.c.getText();
    }

    public final CharSequence getTextTitle() {
        return this.b.getText();
    }

    public final void onThemeChanged(k2b k2b) {
        this.b.setTextColor(k2b.getText().e);
        this.c.setTextColor(k2b.getText().f);
        setBackground(new RippleDrawable(ColorStateList.valueOf(k2b.b().a.f), (Drawable) null, this.a));
    }

    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }

    public final void setTextSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTextTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
