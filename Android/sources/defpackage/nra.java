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

/* renamed from: nra  reason: default package */
public final /* synthetic */ class nra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ pra c;

    public /* synthetic */ nra(pra pra, Context context) {
        this.a = 4;
        this.c = pra;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(dad.p);
                int i = 0;
                fj3 fj3 = new fj3(0, -2);
                fj3.t = 0;
                fj3.i = 0;
                pra pra = this.c;
                fj3.u = pra.K0.isInitialized() ? ((ImageView) pra.K0.getValue()).getId() : 0;
                Lazy lazy = pra.J0;
                if (lazy.isInitialized()) {
                    i = ((TextView) lazy.getValue()).getId();
                }
                fj3.k = i;
                int i2 = pra.G0;
                fj3.setMarginStart(i2);
                fj3.topMargin = i2;
                fj3.setMarginEnd(i2);
                textView.setLayoutParams(fj3);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                puf.z.b(textView, uy4.b);
                fu4.k.e(textView.getContext()).f().getText().getClass();
                textView.setTextColor(-1);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(dad.o);
                fj3 fj32 = new fj3(0, -2);
                fj32.t = 0;
                pra pra2 = this.c;
                fj32.j = pra2.I0.isInitialized() ? ((TextView) pra2.I0.getValue()).getId() : 0;
                Lazy lazy2 = pra2.K0;
                fj32.u = lazy2.isInitialized() ? ((ImageView) lazy2.getValue()).getId() : 0;
                fj32.l = 0;
                int i3 = pra2.G0;
                fj32.setMarginStart(i3);
                fj32.topMargin = pra2.E0;
                fj32.setMarginEnd(i3);
                fj32.bottomMargin = i3;
                textView2.setLayoutParams(fj32);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                puf.o.b(textView2, uy4.b);
                fu4.k.e(textView2.getContext()).f().getText().getClass();
                textView2.setTextColor(i8b.Y(0.7f, -1));
                return textView2;
            case 2:
                return pra.L(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(dad.n);
                float f = (float) pra.Y0;
                fj3 fj33 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                fj33.i = 0;
                fj33.v = 0;
                fj33.l = 0;
                fj33.setMarginEnd(MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
                frameLayout.setLayoutParams(fj33);
                frameLayout.setBackground(this.c.M0);
                return frameLayout;
            default:
                Drawable b2 = ew3.b(this.c.getContext(), lya.s);
                b2.setTint(a81.g(fu4.k, this.b).f);
                return b2;
        }
    }

    public /* synthetic */ nra(Context context, pra pra, int i) {
        this.a = i;
        this.b = context;
        this.c = pra;
    }
}
