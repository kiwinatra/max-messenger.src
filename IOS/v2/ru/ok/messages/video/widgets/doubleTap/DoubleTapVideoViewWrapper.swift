package ru.ok.messages.video.widgets.doubleTap;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Set;
import kotlin.collections.CollectionsKt;

public class DoubleTapVideoViewWrapper extends FrameLayout {
    public or4 a;

    public DoubleTapVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        ro4 b = ro4.b();
        jr4 jr4 = new jr4(getContext(), 1);
        jr4.setId(lic.double_tap_video_view_wrapper__arrows_view_left);
        jr4.setVisibility(8);
        int i = b.O;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i * 2);
        layoutParams.gravity = 8388627;
        super.addView(jr4, layoutParams);
        jr4 jr42 = new jr4(getContext(), 2);
        jr42.setId(lic.double_tap_video_view_wrapper__arrows_view_right);
        jr42.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(vo4.b((int) 100.0f), vo4.b((int) 200.0f));
        layoutParams2.gravity = 8388629;
        super.addView(jr42, layoutParams2);
    }

    public final void addView(View view) {
        super.addView(view, getChildCount() - 2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() <= 1;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s2a s2a = (s2a) this.a;
        m0a m0a = (m0a) CollectionsKt.firstOrNull((Set) s2a.a);
        if (m0a != null) {
            Rect rect = m0a.w;
            ((View) s2a.c).getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                qr4 qr4 = m0a.b;
                qr4.b.onTouchEvent(motionEvent);
                if (qr4.c > 0) {
                    return true;
                }
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                m0a.o.onTouchEvent(motionEvent);
            } else {
                qr4 qr42 = m0a.c;
                qr42.b.onTouchEvent(motionEvent);
                if (qr42.c > 0) {
                    return true;
                }
            }
        }
        getChildAt(0).dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setTouchEventListener(or4 or4) {
        this.a = or4;
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, getChildCount() - 2, layoutParams);
    }
}
