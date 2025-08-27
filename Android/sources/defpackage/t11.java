package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: t11  reason: default package */
public final class t11 extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int o = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
    public final int v = MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density);
    public final int w = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
    public final TextView x;
    public final u11 y;

    public t11(Context context) {
        super(context, (AttributeSet) null);
        int roundToInt = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        this.a = roundToInt;
        int roundToInt2 = MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density);
        this.b = roundToInt2;
        int roundToInt3 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        this.c = roundToInt3;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(q8.p(ykc.call_change_mode_text_hint, context));
        textView.setGravity(17);
        textView.setTextColor(l2b.i.f);
        puf.p.b(textView, uy4.b);
        this.x = textView;
        u11 u11 = new u11(context, 0);
        u11.setLayoutParams(new LinearLayout.LayoutParams(roundToInt, roundToInt2));
        u11.setPadding(roundToInt3, roundToInt3, roundToInt3, roundToInt3);
        this.y = u11;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(u11);
    }
}
