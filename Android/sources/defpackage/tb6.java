package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: tb6  reason: default package */
public final class tb6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub6 b;

    public /* synthetic */ tb6(ub6 ub6, int i) {
        this.a = i;
        this.b = ub6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.o.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                ub6 ub6 = this.b;
                ub6.a();
                View view = ub6.o;
                if (view.isEnabled() && !view.isLongClickable() && ub6.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    ub6.x = true;
                    return;
                }
                return;
        }
    }
}
