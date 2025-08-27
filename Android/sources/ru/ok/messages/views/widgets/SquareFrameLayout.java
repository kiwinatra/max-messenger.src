package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0) {
            size = Integer.MAX_VALUE;
        } else if (size2 == 0) {
            size2 = Integer.MAX_VALUE;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
