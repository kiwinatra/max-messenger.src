package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: ff7  reason: default package */
public final /* synthetic */ class ff7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ hf7 c;

    public /* synthetic */ ff7(Context context, hf7 hf7, int i) {
        this.a = i;
        this.b = context;
        this.c = hf7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                xob xob = new xob(this.b);
                xob.setListener(this.c);
                return xob;
            default:
                ImageView imageView = new ImageView(this.b);
                int i = cad.b2;
                int i2 = l2b.f.f;
                Drawable b2 = ew3.b(imageView.getContext(), i);
                iq.a0(b2, i2);
                imageView.setImageDrawable(b2);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(l2b.g.a.f), (Drawable) null, (Drawable) null));
                int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                ct.G(imageView, 300, new gf7(this.c, 1));
                return imageView;
        }
    }
}
