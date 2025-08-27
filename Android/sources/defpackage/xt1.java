package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* renamed from: xt1  reason: default package */
public final class xt1 extends FrameLayout {
    public static final /* synthetic */ int y0 = 0;
    public ecc a;
    public ValueAnimator b;
    public final IntEvaluator c = new IntEvaluator();
    public final FloatEvaluator o = new FloatEvaluator();
    public int v;
    public final cnf v0;
    public int w;
    public wt1 w0;
    public float x;
    public boolean x0;
    public int y;
    public int z;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.ViewOutlineProvider, cnf] */
    public xt1(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? viewOutlineProvider = new ViewOutlineProvider();
        viewOutlineProvider.a = 0;
        viewOutlineProvider.b = 0;
        this.v0 = viewOutlineProvider;
        setOutlineProvider(viewOutlineProvider);
    }

    public static final void b(xt1 xt1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        Integer evaluate = xt1.c.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        IntEvaluator intEvaluator = xt1.c;
        Integer evaluate2 = intEvaluator.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float evaluate3 = xt1.o.evaluate(f3, Float.valueOf(f), Float.valueOf(f2));
        Integer evaluate4 = intEvaluator.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer evaluate5 = intEvaluator.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        xt1.getLayoutParams().width = evaluate.intValue();
        xt1.getLayoutParams().height = evaluate2.intValue();
        xt1.setLayoutParams(xt1.getLayoutParams());
        xt1.setTranslationY(evaluate3.floatValue());
        int intValue = evaluate4.intValue();
        cnf cnf = xt1.v0;
        cnf.a = intValue;
        cnf.b = evaluate5.intValue();
        xt1.invalidateOutline();
    }

    public final void a(boolean z2, boolean z3) {
        boolean z4 = z2;
        if (this.x0 != z4) {
            this.x0 = z4;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ecc ecc = this.a;
            if (ecc == null) {
                ecc = null;
            }
            boolean z5 = this.x0;
            if (ecc.b != z5) {
                ecc.b = z5;
                ValueAnimator valueAnimator2 = ecc.c;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float alpha = ecc.y.getAlpha();
                float f = z5 ? 0.0f : 1.0f;
                float alpha2 = ecc.B0.getAlpha();
                float f2 = z5 ? 1.0f : 0.0f;
                if (z3) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                    ecc.c = ofFloat;
                    ofFloat.addUpdateListener(new ybc(ecc, alpha, f, alpha2, f2));
                    ofFloat.setStartDelay(z5 ? 50 : 0);
                    ofFloat.setDuration(150);
                    ofFloat.start();
                } else {
                    ecc.b(ecc, alpha, f, alpha2, f2, 1.0f);
                }
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredWidth2 = this.x0 ? f6e.r(this).getMeasuredWidth() : this.v;
            int measuredHeight2 = this.x0 ? f6e.r(this).getMeasuredHeight() : this.w;
            float translationY = getTranslationY();
            boolean z6 = this.x0;
            float f3 = z6 ? 0.0f : this.x;
            cnf cnf = this.v0;
            int i = cnf.a;
            int i2 = 0;
            int i3 = z6 ? 0 : this.y;
            int i4 = cnf.b;
            if (!z6) {
                i2 = this.z;
            }
            if (z3) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                this.b = ofFloat2;
                ofFloat2.addUpdateListener(new vt1(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2));
                ofFloat2.setDuration(200);
                ofFloat2.start();
                return;
            }
            b(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2, 1.0f);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof ecc) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalArgumentException("child must be QuickCameraView instance".toString());
    }

    public final wt1 getListener() {
        return this.w0;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.x0;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y2 = motionEvent.getY();
        cnf cnf = this.v0;
        boolean z2 = true;
        boolean z3 = y2 <= ((float) cnf.a);
        if (motionEvent.getY() < ((float) (getMeasuredHeight() - cnf.b))) {
            z2 = false;
        }
        if (this.x0 || (!z3 && !z2)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(wt1 wt1) {
        this.w0 = wt1;
    }

    public final void setPreviewTranslationY(float f) {
        this.x = f;
        if (!this.x0) {
            setTranslationY(f);
        }
    }
}
