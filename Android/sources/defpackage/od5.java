package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: od5  reason: default package */
public final class od5 extends TouchDelegate {
    public boolean a;
    public final Rect b;
    public final int c;
    public final Rect d;
    public final View e;

    public od5(Rect rect, View view) {
        super(rect, view);
        this.b = rect;
        this.e = view;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.d = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 0) {
            if (!(actionMasked == 1 || actionMasked == 2)) {
                if (actionMasked == 3) {
                    z = this.a;
                    this.a = false;
                } else if (!(actionMasked == 5 || actionMasked == 6)) {
                    z = false;
                }
            }
            boolean z3 = this.a;
            if (!z3 || this.d.contains(x, y)) {
                z = z3;
            } else {
                z = z3;
                z2 = false;
            }
        } else {
            z = this.b.contains(x, y);
            this.a = z;
        }
        if (!z) {
            return false;
        }
        View view = this.e;
        if (z2) {
            motionEvent.setLocation((float) (view.getWidth() / 2), (float) (view.getHeight() / 2));
        } else {
            float f = -((float) (this.c * 2));
            motionEvent.setLocation(f, f);
        }
        TouchDelegate touchDelegate = view.getTouchDelegate();
        view.setTouchDelegate((TouchDelegate) null);
        boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
        view.setTouchDelegate(touchDelegate);
        return dispatchTouchEvent;
    }
}
