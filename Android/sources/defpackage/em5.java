package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: em5  reason: default package */
public final /* synthetic */ class em5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fm5 b;

    public /* synthetic */ em5(fm5 fm5, int i) {
        this.a = i;
        this.b = fm5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = cad.w0;
                fm5 fm5 = this.b;
                Drawable b2 = ew3.b(fm5.getContext(), i);
                b2.setCallback(fm5);
                return b2;
            case 1:
                int i2 = cad.n0;
                fm5 fm52 = this.b;
                Drawable b3 = ew3.b(fm52.getContext(), i2);
                b3.setCallback(fm52);
                return b3;
            default:
                a10 a10 = new a10();
                fm5 fm53 = this.b;
                a10.a = (Drawable) fm53.v.getValue();
                a10.invalidateSelf();
                a10.b(fm53.a);
                a10.e = true;
                a10.invalidateSelf();
                a10.c = MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density);
                a10.b = true;
                a10.invalidateSelf();
                a10.setCallback(fm53);
                return a10;
        }
    }
}
