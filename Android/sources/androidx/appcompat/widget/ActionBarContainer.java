package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.IntCompanionObject;

public class ActionBarContainer extends FrameLayout {
    public boolean a;
    public View b;
    public View c;
    public Drawable o;
    public Drawable v;
    public Drawable w;
    public final boolean x;
    public boolean y;
    public final int z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new y6(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.ActionBar);
        this.o = obtainStyledAttributes.getDrawable(koc.ActionBar_background);
        this.v = obtainStyledAttributes.getDrawable(koc.ActionBar_backgroundStacked);
        this.z = obtainStyledAttributes.getDimensionPixelSize(koc.ActionBar_height, -1);
        boolean z2 = true;
        if (getId() == egc.split_action_bar) {
            this.x = true;
            this.w = obtainStyledAttributes.getDrawable(koc.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.x ? !(this.o == null && this.v == null) : this.w != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.o;
        if (drawable != null && drawable.isStateful()) {
            this.o.setState(getDrawableState());
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null && drawable2.isStateful()) {
            this.v.setState(getDrawableState());
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null && drawable3.isStateful()) {
            this.w.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(egc.action_bar);
        this.c = findViewById(egc.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.x) {
            Drawable drawable = this.w;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.o == null) {
                z3 = false;
            } else if (this.b.getVisibility() == 0) {
                this.o.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            } else {
                View view = this.c;
                if (view == null || view.getVisibility() != 0) {
                    this.o.setBounds(0, 0, 0, 0);
                } else {
                    this.o.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                }
            }
            this.y = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.z) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.o);
        }
        this.o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.b;
            if (view != null) {
                this.o.setBounds(view.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.x ? this.o == null && this.v == null : this.w == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.w);
        }
        this.w = drawable;
        boolean z2 = this.x;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.w) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? this.o == null && this.v == null : this.w == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.v);
        }
        this.v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.y && this.v != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.x ? this.o == null && this.v == null : this.w == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(mid mid) {
    }

    public void setTransitioning(boolean z2) {
        this.a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.w;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.o;
        boolean z2 = this.x;
        return (drawable == drawable2 && !z2) || (drawable == this.v && this.y) || ((drawable == this.w && z2) || super.verifyDrawable(drawable));
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
