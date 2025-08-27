package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class SelectedBackgroundRelativeLayout extends RelativeLayout {
    public SelectedBackgroundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public View getView() {
        return this;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setObserver(hqd hqd) {
    }
}
