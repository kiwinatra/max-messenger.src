package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;

/* renamed from: d1f  reason: default package */
public final class d1f extends jj0 {
    public final z3a v;

    public d1f(z3a z3a) {
        super((j4b) w63.P);
        this.v = z3a;
    }

    public final int l(int i) {
        return ((avf) ((ov) this.o).f.get(i)).b();
    }

    public final void s(pzc pzc, int i) {
        boolean z = pzc instanceof c1f;
        int i2 = 8;
        boolean z2 = false;
        ov ovVar = (ov) this.o;
        if (z) {
            zuf zuf = (zuf) ovVar.f.get(i);
            c1f c1f = (c1f) pzc;
            boolean z3 = i == ovVar.f.size();
            c1f.K0 = zuf;
            CharSequence charSequence = zuf.d;
            boolean z4 = charSequence == null || charSequence.length() == 0;
            boolean z5 = !z4;
            int i3 = z5 ? 0 : 8;
            TextView textView = c1f.E0;
            textView.setVisibility(i3);
            TextView textView2 = c1f.D0;
            CharSequence charSequence2 = zuf.d;
            CharSequence charSequence3 = zuf.c;
            if (z4) {
                textView2.setText(charSequence3);
                textView.setText(charSequence2);
            } else {
                int ordinal = zuf.g.ordinal();
                if (ordinal == 0) {
                    textView2.setText(charSequence3);
                    textView.setText(charSequence2);
                } else if (ordinal == 1) {
                    textView2.setText(charSequence2);
                    textView.setText(charSequence3);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            scf N = c1f.N();
            textView2.setTextColor(z4 ? N.G : N.N);
            int i4 = z5 ? 0 : 8;
            ImageView imageView = c1f.G0;
            imageView.setVisibility(i4);
            imageView.setImageDrawable(c1f.J0);
            if (zuf.e != null) {
                i2 = 0;
            }
            c1f.F0.setVisibility(i2);
            ct.G(imageView, 300, new y0f(c1f.L0, zuf, 2));
            View view = c1f.a;
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            pj3 pj3 = new pj3();
            pj3.d(constraintLayout);
            View view2 = c1f.H0;
            if (z3 && !z4) {
                pj3.e(view2.getId(), 6, view.getId(), 6);
            } else if (z4) {
                pj3.e(view2.getId(), 6, textView2.getId(), 6);
            } else {
                pj3.e(view2.getId(), 6, textView.getId(), 6);
            }
            pj3.a(constraintLayout);
            c1f.M();
            ct.G(pzc.a, 300, new y0f(this, zuf, 0));
        } else if (pzc instanceof b1f) {
            b1f b1f = (b1f) pzc;
            if (((yuf) ovVar.f.get(i)).b == c2f.b) {
                z2 = true;
            }
            View view3 = b1f.a;
            ImageView imageView2 = b1f.E0;
            TextView textView3 = b1f.D0;
            if (z2) {
                textView3.setText(view3.getContext().getString(qad.U9));
                imageView2.setImageDrawable(b1f.G0);
            } else {
                textView3.setText(view3.getContext().getString(qad.V9));
                imageView2.setImageDrawable(b1f.F0);
            }
            if (h88.L(view3)) {
                int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                if (layoutParams != null) {
                    fj3 fj3 = (fj3) layoutParams;
                    fj3.topMargin = roundToInt;
                    fj3.bottomMargin = roundToInt;
                    textView3.setLayoutParams(fj3);
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        fj3 fj32 = (fj3) layoutParams2;
                        fj32.topMargin = roundToInt;
                        fj32.bottomMargin = roundToInt;
                        imageView2.setLayoutParams(fj32);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                int roundToInt2 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                if (layoutParams3 != null) {
                    fj3 fj33 = (fj3) layoutParams3;
                    fj33.topMargin = roundToInt2;
                    fj33.bottomMargin = roundToInt2;
                    textView3.setLayoutParams(fj33);
                    ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                    if (layoutParams4 != null) {
                        fj3 fj34 = (fj3) layoutParams4;
                        fj34.topMargin = roundToInt2;
                        fj34.bottomMargin = roundToInt2;
                        imageView2.setLayoutParams(fj34);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            ct.G(pzc.a, 300, new dte(2, this));
        } else if (pzc instanceof z0f) {
            zuf zuf2 = (zuf) ovVar.f.get(i);
            z0f z0f = (z0f) pzc;
            CharSequence charSequence4 = zuf2.d;
            if (!(charSequence4 == null || charSequence4.length() == 0)) {
                i2 = 0;
            }
            TextView textView4 = z0f.D0;
            textView4.setVisibility(i2);
            textView4.setText(zuf2.d);
            z0f.E0.setText(zuf2.c);
            ct.G(pzc.a, 300, new y0f(this, zuf2, 1));
        } else {
            boolean z6 = pzc instanceof a1f;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == 312) {
            return new z0f(viewGroup);
        }
        if (i == 634) {
            zaf zaf = new zaf(viewGroup.getContext(), (AttributeSet) null);
            zaf.setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density)));
            float f = (float) 6;
            zaf.setPadding(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
            return new pzc(zaf);
        } else if (i == 878) {
            return new c1f(this, viewGroup);
        } else {
            if (i == 969) {
                return new b1f(viewGroup);
            }
            throw new IllegalStateException("No such viewType");
        }
    }
}
