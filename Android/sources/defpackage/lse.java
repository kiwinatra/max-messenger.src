package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: lse  reason: default package */
public final class lse extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public lse(Context context) {
        super(context, (AttributeSet) null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int roundToInt = MathKt.roundToInt(((float) 21) * vo4.c().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int roundToInt2 = MathKt.roundToInt(((float) 188) * vo4.c().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(roundToInt2, roundToInt2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        layoutParams.leftMargin = roundToInt;
        layoutParams.rightMargin = roundToInt;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        puf.d.b(textView, uy4.b);
        b0h.H(textView, new w36(3, (Continuation) null, 1));
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        layoutParams2.leftMargin = roundToInt;
        layoutParams2.rightMargin = roundToInt;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        puf.m.b(textView2, uy4.b);
        b0h.H(textView2, new w36(3, (Continuation) null, 2));
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(num.intValue());
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
