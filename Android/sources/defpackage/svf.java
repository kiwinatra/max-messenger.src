package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.math.MathKt;

/* renamed from: svf  reason: default package */
public final class svf extends LinearLayout {
    public final hna a;
    public final hna b;

    public svf(Context context) {
        super(context);
        hna hna = new hna(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 8;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        layoutParams.weight = 1.0f;
        hna.setLayoutParams(layoutParams);
        hna.setAppearance(gna.a);
        hna.setText(bxa.d);
        this.a = hna;
        hna hna2 = new hna(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        hna2.setLayoutParams(layoutParams2);
        hna2.setAppearance(gna.b);
        hna2.setText(bxa.e);
        this.b = hna2;
        setOrientation(0);
        addView(hna);
        addView(hna2);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        ct.G(this.a, 300, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        ct.G(this.b, 300, onClickListener);
    }
}
