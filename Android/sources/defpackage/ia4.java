package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: ia4  reason: default package */
public final class ia4 implements ezc {
    public final RecyclerView a;
    public final GestureDetector b;
    public boolean c;
    public final Rect o = new Rect();

    public ia4(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = new GestureDetector(recyclerView.getContext(), new q00(8, this));
    }

    public final void a(MotionEvent motionEvent) {
        View view;
        int i = 0;
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.c = false;
        }
        GestureDetector gestureDetector = this.b;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.c) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            while (true) {
                RecyclerView recyclerView = this.a;
                if (i >= recyclerView.getChildCount()) {
                    view = null;
                    break;
                }
                int i2 = i + 1;
                view = recyclerView.getChildAt(i);
                if (view != null) {
                    a layoutManager = recyclerView.getLayoutManager();
                    Rect rect = this.o;
                    if (layoutManager != null) {
                        layoutManager.A(rect, view);
                    }
                    if (rect.contains((int) x, (int) y)) {
                        break;
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            if (view != null) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation((-motionEvent.getX()) + 1.0f, (-motionEvent.getY()) + ((float) (view.getMeasuredHeight() / 2)));
                view.dispatchTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r3 = r2.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(androidx.recyclerview.widget.RecyclerView r3, android.view.MotionEvent r4) {
        /*
            r2 = this;
            float r3 = r4.getX()
            float r0 = r4.getY()
            androidx.recyclerview.widget.RecyclerView r1 = r2.a
            android.view.View r3 = r1.H(r3, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0016
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0016
            return r0
        L_0x0016:
            android.view.GestureDetector r3 = r2.b
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.onTouchEvent(r4)
            r4 = 1
            if (r3 != r4) goto L_0x0026
            boolean r2 = r2.c
            if (r2 != 0) goto L_0x0026
            r0 = r4
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia4.c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public final void e(boolean z) {
    }
}
