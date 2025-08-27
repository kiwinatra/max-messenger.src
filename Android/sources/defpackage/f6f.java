package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: f6f  reason: default package */
public final class f6f extends FrameLayout {
    public final kag a = kag.h(this, 1.0f, new rr0(3, this));
    public boolean b;
    public ValueAnimator c;
    public e6f o;

    public f6f(Context context) {
        super(context, (AttributeSet) null);
    }

    public static Unit a(f6f f6f, float f) {
        f6f.setBackgroundAlpha(f);
        return Unit.INSTANCE;
    }

    public static Unit b(f6f f6f, float f, float f2) {
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            f6f.setBackgroundAlpha(((float) 1) - f);
        }
        return Unit.INSTANCE;
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (RangesKt.coerceIn(f, (float) c44.DEFAULT_ASPECT_RATIO, 1.0f) * ((float) KotlinVersion.MAX_COMPONENT_VALUE)));
        }
    }

    public final void c(int i, int i2, Function0 function0, Function0 function02, Function2 function2) {
        e6f e6f = this.o;
        if (e6f != null) {
            ValueAnimator valueAnimator = this.c;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : c44.DEFAULT_ASPECT_RATIO;
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                valueAnimator2.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new rf(e6f, function2, animatedFraction, 2));
            ofInt.addListener(new drb(function02, this, function0, 2));
            ofInt.start();
            this.c = ofInt;
        }
    }

    public final void computeScroll() {
        if (this.a.g()) {
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        e6f e6f = this.o;
        if (e6f != null) {
            i0b i0b = (i0b) e6f;
            if (i0b.b.getHeight() > 0) {
                c(i0b.b(), i0b.a(), new dle(13), new dle(14), new d6f(this, 1));
            }
            invalidate();
        }
    }

    public final e6f getCallback() {
        return this.o;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.q(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e6f e6f = this.o;
        if (e6f != null) {
            i0b i0b = (i0b) e6f;
            c1b c1b = i0b.b;
            int top = c1b.getHeight() > 0 ? c1b.getTop() : i0b.b();
            super.onLayout(z, i, i2, i3, i4);
            c1b.offsetTopAndBottom(top);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.k(motionEvent);
        return true;
    }

    public final void setCallback(e6f e6f) {
        this.o = e6f;
    }
}
