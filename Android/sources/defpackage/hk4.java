package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.yalantis.ucrop.util.MatrixUtils;

/* renamed from: hk4  reason: default package */
public final /* synthetic */ class hk4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ik4 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ hk4(ik4 ik4, float f, float f2) {
        this.a = ik4;
        this.b = f;
        this.c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ik4 ik4 = this.a;
        ik4.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = ik4.Y;
        float matrixScale = floatValue / MatrixUtils.getMatrixScale(matrix);
        matrix.postScale(matrixScale, matrixScale, this.b, this.c);
        ik4.X.set(matrix);
        ik4.b();
        asg asg = ik4.b;
        if (asg != null) {
            asg.b(matrix);
        }
    }
}
