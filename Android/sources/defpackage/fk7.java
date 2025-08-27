package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.math.MathKt;

/* renamed from: fk7  reason: default package */
public final class fk7 extends iwe implements phf {
    public final TextView o;

    public fk7(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
        appCompatTextView.setLayoutParams(new bzc(-1, -2));
        float f = (float) 12;
        appCompatTextView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        onThemeChanged(fu4.k.e(appCompatTextView.getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        ogf ogf = puf.n;
        TextView textView = this.o;
        ogf.b(textView, uy4.b);
        textView.setTextColor(k2b.getText().h);
        textView.setBackgroundColor(k2b.c().i);
    }
}
