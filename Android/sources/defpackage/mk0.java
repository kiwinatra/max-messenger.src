package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: mk0  reason: default package */
public abstract class mk0 extends ProgressBar {
    public static final int x0 = hnc.Widget_MaterialComponents_ProgressIndicator;
    public final nk0 a;
    public int b;
    public final boolean c;
    public final int o;
    public vh v;
    public final lk0 v0 = new lk0(this, 0);
    public boolean w = false;
    public final lk0 w0 = new lk0(this, 1);
    public int x = 4;
    public final kk0 y = new kk0(this, 0);
    public final kk0 z = new kk0(this, 1);

    /* JADX WARNING: type inference failed for: r9v4, types: [vh, java.lang.Object] */
    public mk0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(fh8.a(context, attributeSet, i, x0), attributeSet, i);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray d = vhf.d(context2, attributeSet, tnc.BaseProgressIndicator, i, i2, new int[0]);
        d.getInt(tnc.BaseProgressIndicator_showDelay, -1);
        this.o = Math.min(d.getInt(tnc.BaseProgressIndicator_minHideDelay, -1), 1000);
        d.recycle();
        this.v = new Object();
        this.c = true;
    }

    private qv4 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().Z;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().Z;
        }
    }

    public abstract nk0 a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.b = i;
            this.w = true;
            if (getIndeterminateDrawable().isVisible()) {
                vh vhVar = this.v;
                ContentResolver contentResolver = getContext().getContentResolver();
                vhVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != c44.DEFAULT_ASPECT_RATIO) {
                    getIndeterminateDrawable().v0.b0();
                    return;
                }
            }
            this.v0.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = gag.a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (true) {
                if (view.getVisibility() != 0) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                } else if (!(parent instanceof View)) {
                    break;
                } else {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().v0.Z(this.v0);
        }
        rm4 progressDrawable = getProgressDrawable();
        lk0 lk0 = this.w0;
        if (progressDrawable != null) {
            getProgressDrawable().c(lk0);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(lk0);
        }
        if (c()) {
            if (this.o > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.z);
        removeCallbacks(this.y);
        ((av4) getCurrentDrawable()).d(false, false, false);
        ue7 indeterminateDrawable = getIndeterminateDrawable();
        lk0 lk0 = this.w0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(lk0);
            getIndeterminateDrawable().v0.e0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(lk0);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onMeasure(int i, int i2) {
        try {
            qv4 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate != null) {
                setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z2 = i == 0;
        if (this.c) {
            ((av4) getCurrentDrawable()).d(c(), false, z2);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((av4) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(vh vhVar) {
        this.v = vhVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = vhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = vhVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z2) {
        try {
            if (z2 != isIndeterminate()) {
                av4 av4 = (av4) getCurrentDrawable();
                if (av4 != null) {
                    av4.d(false, false, false);
                }
                super.setIndeterminate(z2);
                av4 av42 = (av4) getCurrentDrawable();
                if (av42 != null) {
                    av42.d(c(), false, false);
                }
                if ((av42 instanceof ue7) && c()) {
                    ((ue7) av42).v0.d0();
                }
                this.w = false;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof ue7) {
            ((av4) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ld9.y(edc.colorPrimary, -1, getContext())};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.a.c = iArr;
            getIndeterminateDrawable().v0.R();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i) {
        nk0 nk0 = this.a;
        if (nk0.g != i) {
            nk0.g = i;
            nk0.a();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            b(i);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof rm4) {
            rm4 rm4 = (rm4) drawable;
            rm4.d(false, false, false);
            super.setProgressDrawable(rm4);
            rm4.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        nk0 nk0 = this.a;
        if (nk0.d != i) {
            nk0.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        nk0 nk0 = this.a;
        if (nk0.b != i) {
            nk0.b = Math.min(i, nk0.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        nk0 nk0 = this.a;
        if (nk0.a != i) {
            nk0.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public ue7 getIndeterminateDrawable() {
        return (ue7) super.getIndeterminateDrawable();
    }

    public rm4 getProgressDrawable() {
        return (rm4) super.getProgressDrawable();
    }
}
