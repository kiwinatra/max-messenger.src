package defpackage;

import android.view.MotionEvent;
import android.widget.SeekBar;

/* renamed from: vpb  reason: default package */
public final class vpb extends SeekBar {
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
