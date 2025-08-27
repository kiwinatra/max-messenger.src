package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: yt7  reason: default package */
public final class yt7 extends LinearLayout {
    public boolean a = true;
    public final ks6 b;
    public final ImageView c;

    public yt7(Context context) {
        super(context, (AttributeSet) null);
        ks6 ks6 = new ks6(context);
        ks6.setAnimConfig(new js6(0, 0, 1500, c44.DEFAULT_ASPECT_RATIO, 16));
        this.b = ks6;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        ks6.setImageResource(uec.max_image_logo);
        float f = (float) 32;
        ks6.setLayoutParams(new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)));
        imageView.setImageResource(uec.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(((float) 58) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.setMarginStart(MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(ks6);
        addView(imageView);
        setGravity(17);
        post(new y86(19, (Object) this));
        b0h.H(this, new sa(3, (Continuation) null, 16));
    }
}
