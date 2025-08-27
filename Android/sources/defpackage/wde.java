package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.SeekBar;

/* renamed from: wde  reason: default package */
public abstract class wde extends wk0 {
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f1;
    }

    public int getFocusedThumbIndex() {
        return this.g1;
    }

    public int getHaloRadius() {
        return this.S0;
    }

    public ColorStateList getHaloTintList() {
        return this.p1;
    }

    public int getLabelBehavior() {
        return this.N0;
    }

    public float getStepSize() {
        return this.h1;
    }

    public float getThumbElevation() {
        return this.x1.a.n;
    }

    public int getThumbHeight() {
        return this.R0;
    }

    public int getThumbRadius() {
        return this.Q0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.x1.a.d;
    }

    public float getThumbStrokeWidth() {
        return this.x1.a.k;
    }

    public ColorStateList getThumbTintList() {
        return this.x1.a.c;
    }

    public int getThumbTrackGapSize() {
        return this.T0;
    }

    public int getThumbWidth() {
        return this.Q0;
    }

    public int getTickActiveRadius() {
        return this.k1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.q1;
    }

    public int getTickInactiveRadius() {
        return this.l1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.r1;
    }

    public ColorStateList getTickTintList() {
        if (this.r1.equals(this.q1)) {
            return this.q1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.s1;
    }

    public int getTrackHeight() {
        return this.O0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.t1;
    }

    public int getTrackInsideCornerSize() {
        return this.X0;
    }

    public int getTrackSidePadding() {
        return this.P0;
    }

    public int getTrackStopIndicatorSize() {
        return this.W0;
    }

    public ColorStateList getTrackTintList() {
        if (this.t1.equals(this.s1)) {
            return this.s1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.m1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.c1;
    }

    public float getValueTo() {
        return this.d1;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.e1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.g1 = i;
        this.y.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.S0) {
            this.S0 = i;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.S0);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.p1)) {
            this.p1 = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                Paint paint = this.o;
                paint.setColor(h(colorStateList));
                paint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(mr7 mr7) {
    }

    public void setStepSize(float f) {
        if (f < c44.DEFAULT_ASPECT_RATIO) {
            float f2 = this.c1;
            float f3 = this.d1;
            throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + f2 + ")-valueTo(" + f3 + ") range");
        } else if (this.h1 != f) {
            this.h1 = f;
            this.o1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.x1.k(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i != this.R0) {
            this.R0 = i;
            this.x1.setBounds(0, 0, this.Q0, i);
            Drawable drawable = this.y1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.z1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.x1.n(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(q8.j(i, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f) {
        bh8 bh8 = this.x1;
        bh8.a.k = f;
        bh8.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        bh8 bh8 = this.x1;
        if (!colorStateList.equals(bh8.a.c)) {
            bh8.l(colorStateList);
            invalidate();
        }
    }

    public void setThumbTrackGapSize(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [mz4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, j4e] */
    public void setThumbWidth(int i) {
        if (i != this.Q0) {
            this.Q0 = i;
            bh8 bh8 = this.x1;
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            ? obj4 = new Object();
            float f = ((float) this.Q0) / 2.0f;
            b59 i2 = o5a.i(0);
            ypg.d(i2);
            ypg.d(i2);
            ypg.d(i2);
            ypg.d(i2);
            d0 d0Var = new d0(f);
            d0 d0Var2 = new d0(f);
            d0 d0Var3 = new d0(f);
            d0 d0Var4 = new d0(f);
            ? obj5 = new Object();
            obj5.a = i2;
            obj5.b = i2;
            obj5.c = i2;
            obj5.d = i2;
            obj5.e = d0Var;
            obj5.f = d0Var2;
            obj5.g = d0Var3;
            obj5.h = d0Var4;
            obj5.i = obj;
            obj5.j = obj2;
            obj5.k = obj3;
            obj5.l = obj4;
            bh8.setShapeAppearanceModel(obj5);
            bh8.setBounds(0, 0, this.Q0, this.R0);
            Drawable drawable = this.y1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.z1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.k1 != i) {
            this.k1 = i;
            this.w.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.q1)) {
            this.q1 = colorStateList;
            this.w.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveRadius(int i) {
        if (this.l1 != i) {
            this.l1 = i;
            this.v.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.r1)) {
            this.r1 = colorStateList;
            this.v.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.s1)) {
            this.s1 = colorStateList;
            this.b.setColor(h(colorStateList));
            this.x.setColor(h(this.s1));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.O0 != i) {
            this.O0 = i;
            this.a.setStrokeWidth((float) i);
            this.b.setStrokeWidth((float) this.O0);
            y();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.t1)) {
            this.t1 = colorStateList;
            this.a.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.X0 != i) {
            this.X0 = i;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.W0 != i) {
            this.W0 = i;
            this.x.setStrokeWidth((float) i);
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.c1 = f;
        this.o1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.d1 = f;
        this.o1 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.y1 = newDrawable;
        this.z1.clear();
        postInvalidate();
    }
}
