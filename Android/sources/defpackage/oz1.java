package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: oz1  reason: default package */
public class oz1 extends FrameLayout implements dy3 {
    public int a;

    public final void a(zx3 zx3, zx3 zx32, boolean z) {
        this.a++;
    }

    public final void b(zx3 zx3, zx3 zx32, boolean z) {
        this.a--;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a > 0 || super.onInterceptTouchEvent(motionEvent);
    }
}
