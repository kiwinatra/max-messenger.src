package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: v81  reason: default package */
public final class v81 extends Drawable implements Animatable {
    public static final /* synthetic */ KProperty[] y = {rae.s(v81.class, "backgroundColor", "getBackgroundColor$calls_ui_release()Lone/me/calls/ui/animation/CallIndicatorWaveDrawable$Companion$BackgroundColor;", 0)};
    public final Context a;
    public final Path b = new Path();
    public final pg c;
    public final ObjectAnimator o;
    public final Lazy v;
    public final o7e w;
    public final bl x;

    public v81(Context context) {
        this.a = context;
        pg pgVar = new pg("waveX", 0);
        this.c = pgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, new int[]{0, context.getResources().getDisplayMetrics().widthPixels});
        ofInt.setDuration(1200);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new z00(4, (Object) this));
        this.o = ofInt;
        this.v = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(22, this));
        o7e a2 = a();
        this.w = a2;
        Delegates delegates = Delegates.INSTANCE;
        u81 u81 = u81.a;
        this.x = new bl(this);
        o7e a3 = a();
        a2.getClass();
        KProperty[] kPropertyArr = o7e.y0;
        KProperty kProperty = kPropertyArr[0];
        a3.getClass();
        KProperty kProperty2 = kPropertyArr[0];
        a3.y.setValue(a3, kProperty2, (l7e) a2.y.getValue(a2, kProperty));
    }

    public final o7e a() {
        return (o7e) this.v.getValue();
    }

    public final void draw(Canvas canvas) {
        pg pgVar = this.c;
        int save = canvas.save();
        try {
            if (this.o.isRunning()) {
                canvas.translate(-((float) pgVar.a), c44.DEFAULT_ASPECT_RATIO);
                Path path = this.b;
                canvas.clipOutPath(path);
                canvas.translate((float) getBounds().width(), c44.DEFAULT_ASPECT_RATIO);
                canvas.clipOutPath(path);
                canvas.translate(((float) pgVar.a) - ((float) getBounds().width()), c44.DEFAULT_ASPECT_RATIO);
                int ordinal = ((u81) this.x.getValue(this, y[0])).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        canvas.drawColor(l2b.d.i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            a().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
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
        return a().isRunning() || this.o.isRunning();
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        float width = (float) rect.width();
        float height = (float) rect.height();
        int max = Math.max(rect.height(), rect.width());
        o7e a2 = a();
        a2.w0.setValue(a2, o7e.y0[6], Integer.valueOf(max / 2));
        a().setBounds(new Rect(0, 0, rect.width(), max));
        float f = (float) 15;
        float f2 = (float) 2;
        float roundToInt = height - (((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)) / f2);
        Path path = this.b;
        path.rewind();
        path.moveTo(c44.DEFAULT_ASPECT_RATIO, roundToInt);
        float f3 = width / 3.0f;
        float f4 = f3 * f2;
        path.cubicTo(f3, height - ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f)), f4, height, width, height - (((float) MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)) / f2));
        path.lineTo(width, height);
        path.lineTo(c44.DEFAULT_ASPECT_RATIO, height);
        path.lineTo(c44.DEFAULT_ASPECT_RATIO, roundToInt);
    }

    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        a().a(l2b.a);
        a().start();
        this.o.start();
    }

    public final void stop() {
        a().a(l2b.a);
        a().stop();
        this.o.cancel();
    }
}
