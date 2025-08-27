package defpackage;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: uh7  reason: default package */
public final class uh7 implements View.OnTouchListener {
    public final Dialog a;
    public final int b;
    public final int c;

    public uh7(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.c;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.a.onTouchEvent(obtain);
    }
}
