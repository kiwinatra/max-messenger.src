package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: xn4  reason: default package */
public final class xn4 extends gj0 {
    public Function0 a = new qr3(12);
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final pb8 o;

    public xn4(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        float f = (float) 8;
        appCompatTextView.setPadding(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(getTitleColor());
        puf.i.b(appCompatTextView, uy4.b);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        appCompatTextView2.setTextColor(getSubtitleColor());
        puf.m.b(appCompatTextView2, uy4.b);
        this.c = appCompatTextView2;
        pb8 pb8 = new pb8(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        pb8.setPadding(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        pb8.setLayoutParams(layoutParams2);
        pb8.setTextAlignment(4);
        ct.G(pb8, 300, new xu3(4, (Object) this));
        this.o = pb8;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(pb8);
        onThemeChanged(fu4.k.e(context).f());
    }

    private final int getSubtitleColor() {
        return fu4.k.e(getContext()).f().getText().f;
    }

    private final int getTitleColor() {
        return fu4.k.e(getContext()).f().getText().e;
    }

    public final void onThemeChanged(k2b k2b) {
        super.onThemeChanged(k2b);
        this.b.setTextColor(getTitleColor());
        this.c.setTextColor(getSubtitleColor());
    }
}
