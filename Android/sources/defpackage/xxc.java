package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.uuid.Uuid;

/* renamed from: xxc  reason: default package */
public final class xxc extends Drawable implements Animatable {
    public final pg a;
    public final ObjectAnimator b;
    public final pg c;
    public final ObjectAnimator o;
    public final Lazy v;
    public final Lazy w;

    public xxc() {
        pg pgVar = new pg("bgAlpha", KotlinVersion.MAX_COMPONENT_VALUE);
        this.a = pgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, pgVar, new int[]{KotlinVersion.MAX_COMPONENT_VALUE, Uuid.SIZE_BITS, KotlinVersion.MAX_COMPONENT_VALUE});
        ofInt.setDuration(2000);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new wxc(this, 0));
        this.b = ofInt;
        pg pgVar2 = new pg("indicatorAlpha", KotlinVersion.MAX_COMPONENT_VALUE);
        this.c = pgVar2;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, pgVar2, new int[]{KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE});
        ofInt2.setDuration(2000);
        ofInt2.setRepeatCount(-1);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.addUpdateListener(new wxc(this, 1));
        this.o = ofInt2;
        mxb mxb = new mxb(24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = LazyKt.lazy(lazyThreadSafetyMode, mxb);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new mxb(25));
    }

    public final void draw(Canvas canvas) {
        Lazy lazy = this.v;
        ((ShapeDrawable) lazy.getValue()).setAlpha(this.a.a);
        ((ShapeDrawable) lazy.getValue()).draw(canvas);
        Lazy lazy2 = this.w;
        int save = canvas.save();
        canvas.translate((float) ((getBounds().width() / 2) - (((ShapeDrawable) lazy2.getValue()).getBounds().width() / 2)), (float) ((getBounds().height() / 2) - (((ShapeDrawable) lazy2.getValue()).getBounds().height() / 2)));
        try {
            ((ShapeDrawable) lazy2.getValue()).setAlpha(this.c.a);
            ((ShapeDrawable) lazy2.getValue()).draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
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
        return this.b.isRunning() || this.o.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.v.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int min = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.w.getValue()).setBounds(0, 0, min, min);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.b.start();
        this.o.start();
    }

    public final void stop() {
        this.b.cancel();
        this.o.cancel();
    }
}
