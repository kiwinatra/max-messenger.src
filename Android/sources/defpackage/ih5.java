package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: ih5  reason: default package */
public final class ih5 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ih5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int width;
        int width2;
        mo moVar;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                FastScroller fastScroller = (FastScroller) obj;
                fastScroller.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    int i = FastScroller.z0;
                    fastScroller.getClass();
                    fastScroller.x0 = true;
                    if (fastScroller.c()) {
                        float rawY = motionEvent.getRawY();
                        View view2 = fastScroller.o;
                        int[] iArr = {0, (int) view2.getY()};
                        ((View) view2.getParent()).getLocationInWindow(iArr);
                        f = rawY - ((float) iArr[1]);
                        width = fastScroller.getHeight();
                        width2 = fastScroller.o.getHeight();
                    } else {
                        float rawX = motionEvent.getRawX();
                        View view3 = fastScroller.o;
                        int[] iArr2 = {(int) view3.getX(), 0};
                        ((View) view3.getParent()).getLocationInWindow(iArr2);
                        f = rawX - ((float) iArr2[0]);
                        width = fastScroller.getWidth();
                        width2 = fastScroller.o.getWidth();
                    }
                    float f2 = f / ((float) (width - width2));
                    fastScroller.setScrollerPosition(f2);
                    fastScroller.setRecyclerViewPosition(f2);
                    return true;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    fastScroller.x0 = false;
                    fastScroller.getClass();
                    return true;
                }
            case 1:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                sz7 sz7 = (sz7) obj;
                if (action == 0 && (moVar = sz7.I0) != null && moVar.isShowing() && x >= 0 && x < sz7.I0.getWidth() && y >= 0 && y < sz7.I0.getHeight()) {
                    sz7.E0.postDelayed(sz7.A0, 250);
                } else if (action == 1) {
                    sz7.E0.removeCallbacks(sz7.A0);
                }
                return false;
            case 2:
                return ((cg9) obj).onTouchEvent(motionEvent);
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }

    public ih5(gg9 gg9, View view, fg9 fg9) {
        this.a = 2;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new t53(gg9, view, fg9));
        gestureDetector.setIsLongpressEnabled(true);
        this.b = gestureDetector;
    }
}
