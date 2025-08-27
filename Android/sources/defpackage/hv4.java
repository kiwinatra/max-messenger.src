package defpackage;

import android.animation.ValueAnimator;

/* renamed from: hv4  reason: default package */
public final class hv4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ up6 a;
    public final /* synthetic */ iv4 b;

    public hv4(iv4 iv4, up6 up6) {
        this.b = iv4;
        this.a = up6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            iv4 iv4 = this.b;
            if (i < 8) {
                float f = iv4.b[i] * floatValue;
                iv4.c[i] = f + ((1.0f - floatValue) * iv4.a[i]);
                i++;
            } else {
                ((sp6) this.a.getHierarchy()).n(b9d.b(iv4.c));
                return;
            }
        }
    }
}
