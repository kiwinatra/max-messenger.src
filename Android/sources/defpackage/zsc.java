package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: zsc  reason: default package */
public final class zsc extends iwe implements phf {
    public final TextView o;

    public zsc(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.o = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        layoutParams.topMargin = roundToInt;
        layoutParams.bottomMargin = roundToInt;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        puf.n.b(textView, uy4.b);
        int roundToInt2 = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        textView.setPadding(roundToInt3, roundToInt2, roundToInt3, roundToInt2);
        onThemeChanged(fu4.k.e(textView.getContext()).f());
    }

    public final void onThemeChanged(k2b k2b) {
        this.o.setTextColor(k2b.getText().h);
        this.a.setBackgroundColor(k2b.c().f);
    }
}
