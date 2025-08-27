package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: tpa  reason: default package */
public final /* synthetic */ class tpa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ upa b;

    public /* synthetic */ tpa(upa upa, int i) {
        this.a = i;
        this.b = upa;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Context context = this.b.a;
                return cvg.b();
            default:
                Context context2 = this.b.a;
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
                return Integer.valueOf(f > 800.0f ? a81.e((float) 100, vo4.c().getDisplayMetrics().density, h88.A(context2).getWidth()) : f > 360.0f ? MathKt.roundToInt(((float) 291) * vo4.c().getDisplayMetrics().density) : MathKt.roundToInt(((float) 248) * vo4.c().getDisplayMetrics().density));
        }
    }
}
