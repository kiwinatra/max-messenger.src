package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: nk0  reason: default package */
public abstract class nk0 {
    public int a;
    public int b;
    public int[] c = new int[0];
    public int d;
    public int e;
    public int f;
    public int g;

    public nk0(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(iec.mtrl_progress_track_thickness);
        int[] iArr = tnc.BaseProgressIndicator;
        vhf.a(context, attributeSet, i, i2);
        vhf.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = m5a.D(context, obtainStyledAttributes, tnc.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(m5a.D(context, obtainStyledAttributes, tnc.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = obtainStyledAttributes.getInt(tnc.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = obtainStyledAttributes.getInt(tnc.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(tnc.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!obtainStyledAttributes.hasValue(tnc.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{ld9.y(edc.colorPrimary, -1, context)};
        } else if (obtainStyledAttributes.peekValue(tnc.BaseProgressIndicator_indicatorColor).type != 1) {
            this.c = new int[]{obtainStyledAttributes.getColor(tnc.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(tnc.BaseProgressIndicator_indicatorColor, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(tnc.BaseProgressIndicator_trackColor)) {
            this.d = obtainStyledAttributes.getColor(tnc.BaseProgressIndicator_trackColor, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f2 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.d = ld9.l(this.d, (int) (f2 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
