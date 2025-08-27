package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: mwa  reason: default package */
public final /* synthetic */ class mwa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ owa c;

    public /* synthetic */ mwa(owa owa, Context context) {
        this.a = 4;
        this.c = owa;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(dad.a0);
                int i = 0;
                fj3 fj3 = new fj3(0, -2);
                fj3.t = 0;
                fj3.i = 0;
                owa owa = this.c;
                fj3.u = owa.J0.isInitialized() ? ((ImageView) owa.J0.getValue()).getId() : 0;
                Lazy lazy = owa.I0;
                if (lazy.isInitialized()) {
                    i = ((TextView) lazy.getValue()).getId();
                }
                fj3.k = i;
                int i2 = owa.G0;
                fj3.setMarginStart(i2);
                fj3.topMargin = MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
                fj3.setMarginEnd(i2);
                textView.setLayoutParams(fj3);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                fu4.k.e(textView.getContext()).f().getText().getClass();
                textView.setTextColor(-1);
                puf.y.b(textView, uy4.b);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(dad.Z);
                fj3 fj32 = new fj3(0, -2);
                fj32.t = 0;
                owa owa2 = this.c;
                fj32.j = owa2.H0.isInitialized() ? ((TextView) owa2.H0.getValue()).getId() : 0;
                Lazy lazy2 = owa2.J0;
                fj32.u = lazy2.isInitialized() ? ((ImageView) lazy2.getValue()).getId() : 0;
                fj32.l = 0;
                int i3 = owa2.G0;
                fj32.setMarginStart(i3);
                fj32.topMargin = owa2.E0;
                fj32.setMarginEnd(i3);
                fj32.bottomMargin = MathKt.roundToInt(((float) 26) * vo4.c().getDisplayMetrics().density);
                textView2.setLayoutParams(fj32);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                fu4.k.e(textView2.getContext()).f().getText().getClass();
                textView2.setTextColor(i8b.Y(0.7f, -1));
                puf.o.b(textView2, uy4.b);
                return textView2;
            case 2:
                return owa.L(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(dad.Y);
                float f = (float) 60;
                fj3 fj33 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                fj33.i = 0;
                fj33.v = 0;
                fj33.l = 0;
                fj33.setMarginEnd(MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
                frameLayout.setLayoutParams(fj33);
                frameLayout.setBackground(this.c.L0);
                return frameLayout;
            default:
                Drawable b2 = ew3.b(this.c.getContext(), lya.s);
                b2.setTint(a81.g(fu4.k, this.b).f);
                return b2;
        }
    }

    public /* synthetic */ mwa(Context context, owa owa, int i) {
        this.a = i;
        this.b = context;
        this.c = owa;
    }
}
