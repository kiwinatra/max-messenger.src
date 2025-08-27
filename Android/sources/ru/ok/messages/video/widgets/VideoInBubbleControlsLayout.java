package ru.ok.messages.video.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class VideoInBubbleControlsLayout extends LinearLayout {
    public final ro4 a;
    public final int b;

    public VideoInBubbleControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4 b2 = ro4.b();
        this.a = b2;
        this.b = b2.e;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        while (i5 < getChildCount()) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 0) {
                i5++;
            } else if (childAt.getLeft() < this.a.h) {
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt2 = getChildAt(i6);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                    int i7 = marginLayoutParams.leftMargin;
                    int i8 = this.b;
                    if (i7 > i8) {
                        marginLayoutParams.leftMargin = i8;
                    }
                    if (marginLayoutParams.rightMargin > i8) {
                        marginLayoutParams.rightMargin = i8;
                    }
                    childAt2.setLayoutParams(marginLayoutParams);
                }
                requestLayout();
                return;
            } else {
                return;
            }
        }
    }
}
