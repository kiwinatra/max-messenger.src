package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: tr9  reason: default package */
public final class tr9 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, phf {
    public static final int[] X = {-16724737, -16767233, -5963578};
    public static final int[] Y = {-2500135, 14277081};
    public static final int[] z = {-16724737, -16767233, -5963578};
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient o;
    public final int[] v;
    public final Path w;
    public final Paint x;
    public final Lazy y;

    public tr9() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.v = z;
        this.w = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.x = paint2;
        this.y = LazyKt.lazy(LazyThreadSafetyMode.NONE, new c28(13, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getBounds().width(), c44.DEFAULT_ASPECT_RATIO, iArr, new float[]{c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.o = linearGradient;
        this.a.setShader(linearGradient);
    }

    public final void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(new RectF(getBounds()), (Paint) null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.w, this.x);
        canvas.restoreToCount(saveLayer);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return ((ValueAnimator) this.y.getValue()).isRunning();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(floatValue, c44.DEFAULT_ASPECT_RATIO);
        LinearGradient linearGradient = this.o;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.v);
        this.b.setShader(new LinearGradient(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getBounds().height(), Y, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.y.getValue()).setFloatValues(new float[]{((float) getBounds().width()) * 2.0f, 0.0f});
        int height = getBounds().height();
        Path path = this.w;
        path.reset();
        float width = ((float) getBounds().width()) / 2.0f;
        float f = vo4.c().getDisplayMetrics().density * 24.0f;
        float f2 = (float) height;
        path.addOval(c44.DEFAULT_ASPECT_RATIO - width, (f2 - (vo4.c().getDisplayMetrics().density * 187.0f)) + f, ((float) getBounds().width()) + width, f2 + f, Path.Direction.CW);
    }

    public final void onThemeChanged(k2b k2b) {
        a(k2b instanceof l2b ? X : z);
        this.x.setColor(k2b.c().i);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.x.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.x.setColorFilter(colorFilter);
    }

    public final void start() {
        Lazy lazy = this.y;
        if (!((ValueAnimator) lazy.getValue()).isRunning()) {
            ((ValueAnimator) lazy.getValue()).start();
        }
    }

    public final void stop() {
        ((ValueAnimator) this.y.getValue()).cancel();
    }
}
