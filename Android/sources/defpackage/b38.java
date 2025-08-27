package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: b38  reason: default package */
public final class b38 extends Drawable implements Animatable {
    public final Context a;
    public final int b;
    public final Lazy c;
    public final jg o;
    public final ObjectAnimator v;

    public b38(int i, int i2, Context context) {
        this.a = context;
        this.b = i2;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new of5((Object) this, i, 1));
        jg jgVar = new jg("rotation", c44.DEFAULT_ASPECT_RATIO);
        this.o = jgVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, jgVar, new float[]{c44.DEFAULT_ASPECT_RATIO, 359.0f});
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new z00(13, (Object) this));
        this.v = ofFloat;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.o.a, (float) getBounds().centerX(), (float) getBounds().centerY());
        ((Drawable) this.c.getValue()).draw(canvas);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.v.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.c.getValue()).setBounds(rect);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.v.start();
    }

    public final void stop() {
        this.v.cancel();
    }
}
