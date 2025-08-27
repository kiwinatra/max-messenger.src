package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;

/* renamed from: k05  reason: default package */
public final /* synthetic */ class k05 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ View v;

    public /* synthetic */ k05(View view, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.v = view;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        View view = this.v;
        switch (this.a) {
            case 0:
                n05 n05 = (n05) view;
                n05.getClass();
                Float f = (Float) valueAnimator.getAnimatedValue();
                int i = 0;
                while (true) {
                    float[] fArr = (float[]) obj3;
                    if (i < 9) {
                        fArr[i] = (f.floatValue() * ((float[]) obj)[i]) + ((1.0f - f.floatValue()) * ((float[]) obj2)[i]);
                        i++;
                    } else {
                        n05.o.setValues(fArr);
                        n05.invalidate();
                        return;
                    }
                }
            case 1:
                ((GestureCropImageView) view).lambda$animateTransform$0((float[]) obj3, (float[]) obj2, (float[]) obj, valueAnimator);
                return;
            default:
                int i2 = OverlayView.M0;
                OverlayView overlayView = (OverlayView) view;
                overlayView.getClass();
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                RectF rectF = overlayView.a;
                RectF rectF2 = (RectF) obj3;
                rectF2.set(rectF);
                RectF rectF3 = (RectF) obj2;
                float f3 = rectF3.left;
                RectF rectF4 = (RectF) obj;
                rectF.left = (f2.floatValue() * (rectF4.left - f3)) + f3;
                float f4 = rectF3.top;
                rectF.top = (f2.floatValue() * (rectF4.top - f4)) + f4;
                float f5 = rectF3.right;
                rectF.right = (f2.floatValue() * (rectF4.right - f5)) + f5;
                float f6 = rectF3.bottom;
                rectF.bottom = (f2.floatValue() * (rectF4.bottom - f6)) + f6;
                overlayView.b();
                q6b q6b = overlayView.K0;
                if (q6b != null) {
                    ((UCropView) q6b).a.setCropRectAdjustMatrix(rectF2, rectF);
                }
                overlayView.postInvalidateOnAnimation();
                return;
        }
    }
}
