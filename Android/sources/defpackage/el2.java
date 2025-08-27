package defpackage;

import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: el2  reason: default package */
public final class el2 extends iwe implements phf {
    public final TextView o;

    public el2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new bzc(-1, -2));
        float f = (float) 16;
        float f2 = (float) 7;
        textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        puf.n.b(textView, uy4.b);
        onThemeChanged(fu4.k.e(textView.getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        int i = k2b.getText().h;
        TextView textView = this.o;
        textView.setTextColor(i);
        textView.setBackgroundColor(k2b.c().h);
    }
}
