package ru.ok.messages.media.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MediaViewPager extends ViewPager {
    public float l1;

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.l1 = motionEvent.getX();
        } else if (motionEvent.getAction() == 2 && !ct.y(getContext()) && this.l1 < motionEvent.getX() && getCurrentItem() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
