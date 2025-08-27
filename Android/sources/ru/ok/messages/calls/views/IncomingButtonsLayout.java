package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

public class IncomingButtonsLayout extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public final kag a = kag.h(this, Float.MAX_VALUE, new ee7(this));
    public de7 b;

    public IncomingButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.a.g()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public View getCapturedView() {
        return this.a.r;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!((IncomingCallControlsView) this.b).z0) {
            return this.a.q(motionEvent);
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.k(motionEvent);
        return !((IncomingCallControlsView) this.b).z0;
    }

    public void setListener(de7 de7) {
        this.b = de7;
    }
}
