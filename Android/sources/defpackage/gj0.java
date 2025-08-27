package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.math.MathKt;

/* renamed from: gj0  reason: default package */
public abstract class gj0 extends LinearLayout implements phf {
    public gj0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        int roundToInt = MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        a93 l = fu4.k.e(getContext()).f().a().l();
        a(l.d.a, l.a.l);
    }

    public final void a(int i, int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
        gradientDrawable.setCornerRadius((float) MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
        gradientDrawable.setStroke(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density), i);
        Unit unit = Unit.INSTANCE;
        setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable}));
    }

    public void onThemeChanged(k2b k2b) {
        a93 l = fu4.k.e(getContext()).f().a().l();
        a(l.d.a, l.a.l);
    }
}
