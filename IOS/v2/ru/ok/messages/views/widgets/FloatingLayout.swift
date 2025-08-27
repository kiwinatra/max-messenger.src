package ru.ok.messages.views.widgets;

import android.content.res.Configuration;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

public class FloatingLayout extends FrameLayout {
    private int getTargetXAnimateToEdge() {
        throw null;
    }

    public int getBottomMargin() {
        return 0;
    }

    public int getLeftMargin() {
        return 0;
    }

    public int getRightMargin() {
        return 0;
    }

    public int getTopMargin() {
        throw null;
    }

    public int getWindowHeight() {
        throw null;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return null;
    }

    public int getWindowWidth() {
        throw null;
    }

    public int getXPos() {
        throw null;
    }

    public int getYPos() {
        throw null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getContext();
        throw null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setListener(vr5 vr5) {
    }

    @Keep
    public void setX(int i) {
        throw null;
    }

    @Keep
    public void setY(int i) {
        throw null;
    }
}
