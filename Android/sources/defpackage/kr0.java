package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;

/* renamed from: kr0  reason: default package */
public final class kr0 extends ConstraintLayout implements phf {
    public final TextView E0;
    public final AppCompatImageView F0;
    public final wsa G0;
    public jr0 H0 = jr0.b;
    public final ir0 I0;
    public Function3 J0;

    public kr0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        textView.setId(dad.e);
        textView.setVisibility(0);
        textView.setLayoutParams(new fj3(-2, -2));
        puf.v.b(textView, uy4.b);
        this.E0 = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(dad.d);
        float f = (float) 28;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setVisibility(0);
        this.F0 = appCompatImageView;
        wsa wsa = new wsa(context);
        wsa.setId(dad.b);
        wsa.setLayoutParams(new fj3(-2, -2));
        wsa.setAppearance(qsa.o);
        wsa.setHasBackgroundStroke(true);
        wsa.setVisibility(8);
        this.G0 = wsa;
        ita ita = new ita(context);
        ita.setId(dad.c);
        float f2 = (float) 6;
        fj3 fj3 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        fj3.setMarginStart(MathKt.roundToInt(((float) 7) * vo4.c().getDisplayMetrics().density));
        ita.setLayoutParams(fj3);
        ita.setAppearance(hta.c);
        ita.setVisibility(8);
        ir0 ir0 = new ir0(0, this);
        this.I0 = ir0;
        this.J0 = ir0;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(appCompatImageView);
        addView(wsa);
        addView(ita);
        addView(textView);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 3, 0, 3);
        new ila(h, 3, id, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = textView.getId();
        h.e(id2, 6, 0, 6);
        h.e(id2, 7, 0, 7);
        h.e(id2, 3, appCompatImageView.getId(), 4);
        ila ila = new ila(h, 3, id2, 4);
        float f3 = (float) 2;
        ila.e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3));
        int id3 = wsa.getId();
        h.e(id3, 6, appCompatImageView.getId(), 6);
        new ila(h, 6, id3, 4).e(MathKt.roundToInt(((float) 14) * vo4.c().getDisplayMetrics().density));
        h.e(id3, 4, appCompatImageView.getId(), 4);
        new ila(h, 4, id3, 4).e(MathKt.roundToInt(((float) 9) * vo4.c().getDisplayMetrics().density));
        int id4 = ita.getId();
        h.e(id4, 3, appCompatImageView.getId(), 3);
        h.e(id4, 7, appCompatImageView.getId(), 7);
        new ila(h, 7, id4, 4).e(-MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        h.a(this);
    }

    public final void L() {
        int i;
        TextView textView = this.E0;
        jr0 jr0 = this.H0;
        js9 js9 = fu4.k;
        k2b f = js9.e(getContext()).f();
        int ordinal = jr0.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            f.getText().getClass();
            i = -16745729;
        } else if (ordinal == 1) {
            i = f.getText().f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextColor(i);
        Function3 function3 = this.J0;
        AppCompatImageView appCompatImageView = this.F0;
        if (this.H0 != jr0.a) {
            z = false;
        }
        function3.invoke(appCompatImageView, Boolean.valueOf(z), js9.e(getContext()).f());
        this.G0.f(js9.e(getContext()).f());
        invalidate();
    }

    public final void onThemeChanged(k2b k2b) {
        L();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        wsa wsa = this.G0;
        wsa.setVisibility(i2);
        wsa.g(i, true);
        if (i > 0) {
            L();
        }
    }

    public final void setIcon(int i) {
        this.F0.setImageDrawable(iq.D(getContext(), i));
        this.J0 = this.I0;
        L();
    }

    public void setSelected(boolean z) {
        this.H0 = z ? jr0.a : jr0.b;
        L();
        if (z) {
            Drawable drawable = this.F0.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.E0.setText(i);
    }

    public final void setText(CharSequence charSequence) {
        this.E0.setText(charSequence);
    }
}
