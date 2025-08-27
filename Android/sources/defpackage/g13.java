package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: g13  reason: default package */
public abstract class g13 extends mk0 {
    public static final int y0 = hnc.Widget_MaterialComponents_CircularProgressIndicator;

    public final nk0 a(Context context, AttributeSet attributeSet) {
        return new h13(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((h13) this.a).j;
    }

    public int getIndicatorInset() {
        return ((h13) this.a).i;
    }

    public int getIndicatorSize() {
        return ((h13) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((h13) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        nk0 nk0 = this.a;
        if (((h13) nk0).i != i) {
            ((h13) nk0).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        nk0 nk0 = this.a;
        if (((h13) nk0).h != max) {
            ((h13) nk0).h = max;
            ((h13) nk0).a();
            requestLayout();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((h13) this.a).a();
    }
}
