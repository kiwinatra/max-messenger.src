package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.yalantis.ucrop.util.MatrixUtils;

/* renamed from: ik4  reason: default package */
public class ik4 implements bsg, Animator.AnimatorListener {
    public final Matrix X = new Matrix();
    public final Matrix Y = new Matrix();
    public final ata a;
    public asg b = null;
    public boolean c = false;
    public boolean o = false;
    public float v = 1.0f;
    public float w = 4.0f;
    public final RectF x = new RectF();
    public final RectF y = new RectF();
    public final RectF z = new RectF();

    public ik4(ata ata) {
        new Matrix();
        this.a = ata;
        ata.c = this;
    }

    public void a(float f, float f2) {
        float matrixScale = MatrixUtils.getMatrixScale(this.Y);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{matrixScale, ((double) matrixScale) <= 1.1d ? 2.5f : 1.0f});
        ofFloat.setDuration(250);
        ofFloat.addUpdateListener(new hk4(this, f, f2));
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public void b() {
        RectF rectF = this.z;
        rectF.set(this.y);
        Matrix matrix = this.Y;
        matrix.mapRect(rectF);
        float f = rectF.left;
        float width = rectF.width();
        RectF rectF2 = this.x;
        float width2 = rectF2.width() - width;
        float min = width2 > c44.DEFAULT_ASPECT_RATIO ? width2 / 2.0f : Math.min(Math.max(width2, f), c44.DEFAULT_ASPECT_RATIO);
        float f2 = rectF.top;
        float height = rectF2.height() - rectF.height();
        float min2 = height > c44.DEFAULT_ASPECT_RATIO ? height / 2.0f : Math.min(Math.max(height, f2), c44.DEFAULT_ASPECT_RATIO);
        float f3 = rectF.left;
        if (min != f3 || min2 != rectF.top) {
            matrix.postTranslate(min - f3, min2 - rectF.top);
            this.a.B();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.o = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.o = false;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.o = true;
    }

    public void reset() {
        ((o67) this.a.b).c();
        this.X.reset();
        this.Y.reset();
    }
}
