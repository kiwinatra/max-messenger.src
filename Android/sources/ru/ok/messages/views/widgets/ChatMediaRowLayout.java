package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ChatMediaRowLayout extends FrameLayout {
    public final ro4 a = ro4.b();

    public ChatMediaRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getRootView().getMeasuredWidth();
        Rect H = iq.H(getRootView());
        if (H != null) {
            measuredWidth -= H.left + H.right;
        }
        this.a.getClass();
        int b = (measuredWidth - (vo4.b((int) 1.0f) * 2)) / 3;
        if (b < size) {
            i = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
        }
        super.onMeasure(i, i);
    }

    public void setListener(wf2 wf2) {
    }
}
