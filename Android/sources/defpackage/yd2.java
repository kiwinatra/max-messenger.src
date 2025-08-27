package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: yd2  reason: default package */
public final class yd2 extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    public yd2(Context context) {
        super(context, (AttributeSet) null);
        ImageView imageView = new ImageView(context);
        float f = (float) 188;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        setGravity(1);
        b0h.H(imageView, new xd2(3, (Continuation) null, 0));
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        puf.d.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 4));
        this.b = textView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(17);
        setOrientation(1);
        addView(imageView);
        addView(textView);
    }

    public final void setIcon(int i) {
        this.a.setImageDrawable(ew3.b(getContext(), i));
    }

    public final void setTitle(int i) {
        this.b.setText(q8.p(i, getContext()));
    }
}
