package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: fmd  reason: default package */
public final class fmd extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public fmd(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r5) goto L_0x0023
            if (r2 == r3) goto L_0x0023
            r6 = 3
            if (r2 == r6) goto L_0x001b
            goto L_0x003e
        L_0x001b:
            boolean r2 = r8.f
            r8.f = r4
        L_0x001f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L_0x0040
        L_0x0023:
            boolean r2 = r8.f
            if (r2 == 0) goto L_0x001f
            android.graphics.Rect r6 = r8.d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x001f
            r5 = r2
            r2 = r4
            goto L_0x0040
        L_0x0032:
            android.graphics.Rect r2 = r8.b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x003e
            r8.f = r5
            r2 = r5
            goto L_0x0040
        L_0x003e:
            r2 = r5
            r5 = r4
        L_0x0040:
            if (r5 == 0) goto L_0x006d
            android.graphics.Rect r4 = r8.c
            android.view.View r8 = r8.a
            if (r2 == 0) goto L_0x005e
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L_0x005e
            int r0 = r8.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r8.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r9.setLocation(r0, r1)
            goto L_0x0069
        L_0x005e:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.setLocation(r0, r1)
        L_0x0069:
            boolean r4 = r8.dispatchTouchEvent(r9)
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmd.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
