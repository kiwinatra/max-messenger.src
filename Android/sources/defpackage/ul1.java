package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: ul1  reason: default package */
public final /* synthetic */ class ul1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vl1 c;

    public /* synthetic */ ul1(Context context, vl1 vl1, int i) {
        this.a = i;
        this.b = context;
        this.c = vl1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                tl1 tl1 = new tl1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 68) * vo4.c().getDisplayMetrics().density));
                vl1 vl1 = this.c;
                vl1.setLayoutParams(layoutParams);
                float f = (float) 12;
                vl1.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density));
                vl1.removeAllViews();
                vl1.addView(tl1);
                return tl1;
            default:
                ql1 ql1 = new ql1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 54) * vo4.c().getDisplayMetrics().density));
                vl1 vl12 = this.c;
                vl12.setLayoutParams(layoutParams2);
                float f2 = (float) 12;
                float f3 = (float) 6;
                vl12.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
                vl12.removeAllViews();
                vl12.addView(ql1);
                return ql1;
        }
    }
}
