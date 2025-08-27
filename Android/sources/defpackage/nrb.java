package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* renamed from: nrb  reason: default package */
public abstract class nrb extends FrameLayout {
    public final kag a;
    public erb b;
    public int c;
    public boolean o = false;
    public boolean v = true;
    public ValueAnimator w;

    public nrb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f = -1.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, boc.PopupLayout);
            f = obtainStyledAttributes.getFloat(boc.PopupLayout_sensitivity, -1.0f);
            obtainStyledAttributes.recycle();
        }
        if (f > c44.DEFAULT_ASPECT_RATIO) {
            this.a = kag.h(this, f, new mrb(this, 0));
        } else {
            this.a = new kag(getContext(), this, new mrb(this, 0));
        }
        setOnClickListener(new u99(16, (Object) this));
        this.c = 0;
    }

    public static /* synthetic */ void b(nrb nrb, Float f) {
        nrb.getClass();
        nrb.setBackgroundAlpha(1.0f - f.floatValue());
    }

    public static /* synthetic */ void d(nrb nrb, Float f) {
        nrb.getClass();
        nrb.setBackgroundAlpha(f.floatValue());
        erb erb = nrb.b;
        nrb.getScrollStateOffset();
        erb.h();
    }

    public static /* synthetic */ void f(nrb nrb) {
        erb erb = nrb.b;
        nrb.getScrollStateOffset();
        erb.h();
    }

    /* access modifiers changed from: private */
    public int getScrollStateOffset() {
        int i = this.c;
        if (i == 0) {
            return this.b.c();
        }
        if (i == 1) {
            return this.b.b();
        }
        if (i == 2) {
            return this.b.a();
        }
        return 0;
    }

    public static /* synthetic */ void h(nrb nrb) {
        erb erb = nrb.b;
        nrb.getScrollStateOffset();
        erb.h();
    }

    /* access modifiers changed from: private */
    public void setBackgroundAlpha(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < c44.DEFAULT_ASPECT_RATIO) {
            f = 0.0f;
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (f * 255.0f));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.a.g()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public int getHalfScreenOffset() {
        return this.b.b();
    }

    public int getScrollState() {
        return this.c;
    }

    public final void k(int i, Runnable runnable, Runnable runnable2, grb grb) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.b.d().getTop(), i});
        this.w = ofInt;
        ofInt.setDuration(200);
        this.w.addUpdateListener(new bn(5, this, grb));
        this.w.addListener(new drb(this, runnable, runnable2));
        this.w.start();
    }

    public final void l(Runnable runnable, boolean z) {
        this.c = 0;
        if (this.b.d().getHeight() > 0) {
            int scrollStateOffset = getScrollStateOffset();
            this.b.g(scrollStateOffset, z);
            if (z) {
                k(scrollStateOffset, (Runnable) null, new sx8(23, this, runnable), new arb(this, 0));
            } else {
                this.b.d().offsetTopAndBottom(scrollStateOffset);
                this.b.f();
                if (runnable != null) {
                    runnable.run();
                }
                setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
        }
        invalidate();
    }

    public void m(Bundle bundle) {
        int i = bundle.getInt("ru.ok.tamtam.extra.SCROLL_STATE", 0);
        this.c = i;
        if (i == 0) {
            setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || !this.b.k(this.c)) {
            this.o = false;
        } else {
            this.o = true;
        }
        return this.a.q(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View d = this.b.d();
        int top = d.getHeight() > 0 ? d.getTop() : getScrollStateOffset();
        super.onLayout(z, i, i2, i3, i4);
        d.offsetTopAndBottom(top);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kag kag = this.a;
        if (kag.r == null) {
            super.onTouchEvent(motionEvent);
        }
        this.o = true;
        kag.k(motionEvent);
        return true;
    }

    public void p() {
        this.c = 2;
        if (this.b.d().getHeight() > 0) {
            k(getScrollStateOffset(), new crb(this, 2), (Runnable) null, new arb(this, 2));
        }
        invalidate();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        kag kag = this.a;
        int i = kag.a;
        if (i != 2 && i != 1) {
            kag.a();
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (this.c == 0) {
            setBackgroundAlpha(c44.DEFAULT_ASPECT_RATIO);
        } else {
            setBackgroundAlpha(1.0f);
        }
    }

    public void setCallback(erb erb) {
        this.b = erb;
    }

    public void setHalfScreen(boolean z) {
        setHalfScreen((grb) z ? new arb(this, 1) : null);
    }

    public void setStackFromBottom(boolean z) {
        this.v = z;
    }

    public void setHalfScreen(grb grb) {
        this.c = 1;
        if (this.b.d().getHeight() > 0) {
            k(getScrollStateOffset(), new crb(this, 0), new crb(this, 1), grb);
        }
        invalidate();
    }
}
