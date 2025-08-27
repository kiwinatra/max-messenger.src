package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: cw7  reason: default package */
public final class cw7 extends mk0 {
    public static final int y0 = hnc.Widget_MaterialComponents_LinearProgressIndicator;

    /* JADX WARNING: type inference failed for: r10v1, types: [nk0, dw7] */
    public final nk0 a(Context context, AttributeSet attributeSet) {
        int i = edc.linearProgressIndicatorStyle;
        int i2 = y0;
        ? nk0 = new nk0(context, attributeSet, i, i2);
        int[] iArr = tnc.LinearProgressIndicator;
        int i3 = edc.linearProgressIndicatorStyle;
        boolean z = false;
        vhf.a(context, attributeSet, i3, i2);
        vhf.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        nk0.h = obtainStyledAttributes.getInt(tnc.LinearProgressIndicator_indeterminateAnimationType, 1);
        nk0.i = obtainStyledAttributes.getInt(tnc.LinearProgressIndicator_indicatorDirectionLinear, 0);
        nk0.k = Math.min(obtainStyledAttributes.getDimensionPixelSize(tnc.LinearProgressIndicator_trackStopIndicatorSize, 0), nk0.a);
        obtainStyledAttributes.recycle();
        nk0.a();
        if (nk0.i == 1) {
            z = true;
        }
        nk0.j = z;
        return nk0;
    }

    public final void b(int i) {
        nk0 nk0 = this.a;
        if (nk0 == null || ((dw7) nk0).h != 0 || !isIndeterminate()) {
            super.b(i);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((dw7) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((dw7) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((dw7) this.a).k;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nk0 nk0 = this.a;
        dw7 dw7 = (dw7) nk0;
        boolean z2 = true;
        if (((dw7) nk0).i != 1) {
            WeakHashMap weakHashMap = gag.a;
            if (!((getLayoutDirection() == 1 && ((dw7) nk0).i == 2) || (getLayoutDirection() == 0 && ((dw7) nk0).i == 3))) {
                z2 = false;
            }
        }
        dw7.j = z2;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        ue7 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        rm4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        nk0 nk0 = this.a;
        if (((dw7) nk0).h != i) {
            if (!c() || !isIndeterminate()) {
                ((dw7) nk0).h = i;
                ((dw7) nk0).a();
                if (i == 0) {
                    ue7 indeterminateDrawable = getIndeterminateDrawable();
                    uv7 uv7 = new uv7((dw7) nk0);
                    indeterminateDrawable.v0 = uv7;
                    uv7.b = indeterminateDrawable;
                } else {
                    ue7 indeterminateDrawable2 = getIndeterminateDrawable();
                    wv7 wv7 = new wv7(getContext(), (dw7) nk0);
                    indeterminateDrawable2.v0 = wv7;
                    wv7.b = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((dw7) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        nk0 nk0 = this.a;
        ((dw7) nk0).i = i;
        dw7 dw7 = (dw7) nk0;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = gag.a;
            if (!((getLayoutDirection() == 1 && ((dw7) nk0).i == 2) || (getLayoutDirection() == 0 && i == 3))) {
                z = false;
            }
        }
        dw7.j = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((dw7) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        nk0 nk0 = this.a;
        if (((dw7) nk0).k != i) {
            ((dw7) nk0).k = Math.min(i, ((dw7) nk0).a);
            ((dw7) nk0).a();
            invalidate();
        }
    }
}
