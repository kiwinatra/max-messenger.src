package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.ImageView;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: ks6  reason: default package */
public final class ks6 extends ImageView {
    public final Paint a;
    public LinearGradient b;
    public final Matrix c = new Matrix();
    public js6 o = new js6(-1, 7000, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, 15.0f, 48);
    public float v;
    public ValueAnimator w;

    public ks6(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.a = paint;
    }

    public final void a() {
        this.v = -((float) getWidth());
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        js6 js6 = this.o;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-((float) getWidth()), (((float) getWidth()) * js6.e) + ((float) getWidth())});
        ofFloat.setDuration(js6.c);
        ofFloat.setStartDelay(js6.b);
        ofFloat.setRepeatCount(js6.a);
        ofFloat.setRepeatMode(1);
        ofFloat.addUpdateListener(new z00(11, (Object) this));
        ofFloat.start();
        this.w = ofFloat;
    }

    public final js6 getAnimConfig() {
        return this.o;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void onDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), (Paint) null);
        super.onDraw(canvas);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(this.o.d, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        matrix.postTranslate(this.v, c44.DEFAULT_ASPECT_RATIO);
        LinearGradient linearGradient = this.b;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), this.a);
        canvas.restoreToCount(saveLayer);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LinearGradient linearGradient = new LinearGradient(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, ((float) i) * this.o.e, c44.DEFAULT_ASPECT_RATIO, new int[]{0, j4b.l0(0.3f, -1), 0}, new float[]{c44.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        this.a.setShader(linearGradient);
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(new float[]{-((float) getWidth()), (((float) getWidth()) * this.o.e) + ((float) getWidth())});
        }
        this.v = -((float) getWidth());
    }

    public final void setAnimConfig(js6 js6) {
        this.o = js6;
    }
}
