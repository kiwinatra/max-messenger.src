package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: l09  reason: default package */
public final /* synthetic */ class l09 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n09 b;

    public /* synthetic */ l09(n09 n09, int i) {
        this.a = i;
        this.b = n09;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Context context = ((ViewGroup) this.b.b).getContext();
                int i = cad.O1;
                l2b.f.getClass();
                return iq.E(i, -1, context);
            case 1:
                Context context2 = ((ViewGroup) this.b.b).getContext();
                int i2 = cad.O0;
                l2b.f.getClass();
                return iq.E(i2, -1, context2);
            case 2:
                Context context3 = ((ViewGroup) this.b.b).getContext();
                int i3 = cad.K0;
                l2b.f.getClass();
                return iq.E(i3, -1, context3);
            default:
                n09 n09 = this.b;
                ImageView imageView = new ImageView(((ViewGroup) n09.b).getContext());
                float f = (float) 52;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 17));
                int i4 = l2b.g.a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                l2b.d.getClass();
                iq.a0(shapeDrawable, -1728053248);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), shapeDrawable, (Drawable) null));
                int roundToInt = MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density);
                imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                imageView.setImageDrawable((Drawable) ((Lazy) n09.w).getValue());
                ct.G(imageView, 300, new xu3(28, (Object) n09));
                return imageView;
        }
    }
}
