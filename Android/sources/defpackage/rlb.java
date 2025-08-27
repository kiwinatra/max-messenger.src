package defpackage;

import android.animation.ValueAnimator;
import kotlin.KotlinVersion;

/* renamed from: rlb  reason: default package */
public final /* synthetic */ class rlb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tlb b;

    public /* synthetic */ rlb(tlb tlb, int i) {
        this.a = i;
        this.b = tlb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb = this.b;
                tlb.y.setAlpha((int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * floatValue));
                if (floatValue == c44.DEFAULT_ASPECT_RATIO) {
                    tlb.x = false;
                }
                tlb.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb2 = this.b;
                tlb2.o = floatValue2;
                tlb2.invalidate();
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb3 = this.b;
                tlb3.v0 = floatValue3;
                tlb3.invalidate();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb4 = this.b;
                tlb4.w0 = floatValue4;
                tlb4.invalidate();
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb5 = this.b;
                tlb5.z0 = floatValue5;
                tlb5.invalidate();
                return;
            default:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tlb tlb6 = this.b;
                tlb6.A0 = floatValue6;
                tlb6.invalidate();
                return;
        }
    }
}
