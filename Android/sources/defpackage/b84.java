package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: b84  reason: default package */
public final class b84 extends iwe implements phf {
    public final TextView o;
    public final GradientDrawable v;

    public b84(FrameLayout frameLayout, uy4 uy4) {
        super(frameLayout);
        this.o = (TextView) frameLayout.getChildAt(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = vo4.c().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        js9 js9 = fu4.k;
        gradientDrawable.setColors(js9.f(this.o).a().l().a.j);
        this.v = gradientDrawable;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = this.o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        layoutParams.topMargin = roundToInt;
        layoutParams.bottomMargin = roundToInt;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        tr2.f.b(textView, uy4);
        float f2 = (float) 12;
        float f3 = (float) 2;
        textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        textView.setBackground(textView.getBackground());
        onThemeChanged(js9.e(textView.getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        TextView textView = this.o;
        textView.setTextColor(js9.f(textView).a().l().b.a);
        int[] iArr = k2b.a().l().a.j;
        GradientDrawable gradientDrawable = this.v;
        gradientDrawable.setColors(iArr);
        textView.setBackground(gradientDrawable);
    }
}
