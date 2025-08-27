package defpackage;

import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: qy2  reason: default package */
public final class qy2 extends iwe implements phf {
    public final TextView o;

    public qy2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new bzc(-1, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density)));
        textView.setGravity(16);
        float f = (float) 12;
        textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        onThemeChanged(fu4.k.e(textView.getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        ogf ogf = puf.q;
        TextView textView = this.o;
        ogf.b(textView, uy4.b);
        textView.setTextColor(k2b.getText().h);
        textView.setBackgroundColor(k2b.c().i);
    }
}
