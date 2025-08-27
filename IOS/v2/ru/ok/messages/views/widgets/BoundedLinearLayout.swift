package ru.ok.messages.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.IntCompanionObject;

public class BoundedLinearLayout extends LinearLayout {
    public final int a = -1;
    public final int b = -1;

    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = -1;
        if (attributeSet == null) {
            this.a = -1;
            this.b = -1;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wnc.BoundedLinearLayout);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wnc.BoundedLinearLayout_boundedWidth, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(wnc.BoundedLinearLayout_boundedHeight, -1);
        obtainStyledAttributes.recycle();
        this.a = dimensionPixelSize <= 0 ? -1 : dimensionPixelSize;
        this.b = dimensionPixelSize2 > 0 ? dimensionPixelSize2 : i;
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.a;
        int i4 = IntCompanionObject.MIN_VALUE;
        if (i3 != -1 && size > i3) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == 0) {
                mode = Integer.MIN_VALUE;
            }
            i = View.MeasureSpec.makeMeasureSpec(this.a, mode);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.b;
        if (i5 != -1 && size2 > i5) {
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 != 0) {
                i4 = mode2;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(this.b, i4);
        }
        super.onMeasure(i, i2);
    }
}
