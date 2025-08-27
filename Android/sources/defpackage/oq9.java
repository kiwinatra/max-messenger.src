package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;

/* renamed from: oq9  reason: default package */
public final class oq9 extends Drawable implements Animatable {
    public final Context a;
    public final Lazy b;
    public final Lazy c;
    public final pg o;
    public final ObjectAnimator v;
    public final jg w;
    public final ObjectAnimator x;
    public final Path y = new Path();
    public float z = 0.7f;

    public oq9(Context context) {
        this.a = context;
        c28 c28 = new c28(11, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, c28);
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new h49(7));
        pg pgVar = new pg("waveX", 0);
        this.o = pgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, new int[]{0, getBounds().width()});
        ofInt.setDuration(1000);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new nq9(this, 0));
        this.v = ofInt;
        jg jgVar = new jg("volume", c44.DEFAULT_ASPECT_RATIO);
        this.w = jgVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, jgVar, new float[]{c44.DEFAULT_ASPECT_RATIO, 0.7f});
        ofFloat.setDuration(150);
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new nq9(this, 1));
        this.x = ofFloat;
    }

    public final void a(Path path) {
        float width = (float) getBounds().width();
        float height = (float) getBounds().height();
        float f = height - (this.w.a * height);
        float f2 = (float) 4;
        float roundToInt = f + ((float) (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2) / 2));
        path.rewind();
        path.moveTo(c44.DEFAULT_ASPECT_RATIO, roundToInt);
        float f3 = width / 3.0f;
        float f4 = f3 * ((float) 2);
        path.cubicTo(f3, f + ((float) (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2) / 2)), f4, f, width, f + ((float) (MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density) / 2)));
        path.lineTo(width, height);
        path.lineTo(c44.DEFAULT_ASPECT_RATIO, height);
        path.lineTo(c44.DEFAULT_ASPECT_RATIO, roundToInt);
    }

    public final void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(new RectF(getBounds()), (Paint) null);
        Lazy lazy = this.b;
        ((Drawable) lazy.getValue()).draw(canvas);
        pg pgVar = this.o;
        canvas.translate(-((float) pgVar.a), c44.DEFAULT_ASPECT_RATIO);
        Path path = this.y;
        Lazy lazy2 = this.c;
        canvas.drawPath(path, (Paint) lazy2.getValue());
        canvas.translate((float) ((Drawable) lazy.getValue()).getIntrinsicWidth(), c44.DEFAULT_ASPECT_RATIO);
        canvas.drawPath(path, (Paint) lazy2.getValue());
        canvas.translate(((float) pgVar.a) - ((float) ((Drawable) lazy.getValue()).getIntrinsicWidth()), c44.DEFAULT_ASPECT_RATIO);
        canvas.restoreToCount(saveLayer);
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.v.isRunning() || this.x.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.b.getValue()).setBounds(rect);
        pg pgVar = this.o;
        this.v.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(pgVar, new int[]{0, rect.width()})});
        a(this.y);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.v.start();
        this.x.start();
    }

    public final void stop() {
        this.v.cancel();
        this.x.cancel();
    }
}
