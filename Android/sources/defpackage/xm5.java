package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: xm5  reason: default package */
public final /* synthetic */ class xm5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zm5 c;

    public /* synthetic */ xm5(Context context, zm5 zm5, int i) {
        this.a = i;
        this.b = context;
        this.c = zm5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                fm5 fm5 = new fm5(this.b);
                this.c.addView(fm5);
                return fm5;
            case 1:
                ImageView imageView = new ImageView(this.b);
                float f = (float) 44;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                zm5 zm5 = this.c;
                imageView.setBackground(zm5.J0);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setTranslationZ(Float.MAX_VALUE);
                zm5.addView(imageView);
                return imageView;
            case 2:
                s87 s87 = new s87(this.b);
                this.c.addView(s87);
                return s87;
            default:
                m3g m3g = new m3g(this.b);
                m3g.setBackgroundEnabled(true);
                this.c.addView(m3g);
                return m3g;
        }
    }
}
