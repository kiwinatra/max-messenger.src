package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: ub6  reason: default package */
public abstract class ub6 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View o;
    public tb6 v;
    public tb6 w;
    public boolean x;
    public int y;
    public final int[] z = new int[2];

    public ub6(View view) {
        this.o = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        tb6 tb6 = this.w;
        View view = this.o;
        if (tb6 != null) {
            view.removeCallbacks(tb6);
        }
        tb6 tb62 = this.v;
        if (tb62 != null) {
            view.removeCallbacks(tb62);
        }
    }

    public abstract s8e b();

    public abstract boolean c();

    public boolean d() {
        s8e b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r14 != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r4 != 3) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            boolean r13 = r12.x
            r0 = 3
            android.view.View r1 = r12.o
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L_0x0068
            s8e r4 = r12.b()
            if (r4 == 0) goto L_0x005c
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x0016
            goto L_0x005c
        L_0x0016:
            ax4 r4 = r4.i()
            if (r4 == 0) goto L_0x005c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0023
            goto L_0x005c
        L_0x0023:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.z
            r1.getLocationOnScreen(r6)
            r1 = r6[r3]
            float r1 = (float) r1
            r7 = r6[r2]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r3]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r2]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.y
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r2) goto L_0x0056
            if (r14 == r0) goto L_0x0056
            r14 = r2
            goto L_0x0057
        L_0x0056:
            r14 = r3
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            if (r14 == 0) goto L_0x005c
            goto L_0x0062
        L_0x005c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x0065
        L_0x0062:
            r14 = r2
            goto L_0x0113
        L_0x0065:
            r14 = r3
            goto L_0x0113
        L_0x0068:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L_0x0070
            goto L_0x00fd
        L_0x0070:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto L_0x00cf
            if (r4 == r2) goto L_0x00cb
            r5 = 2
            if (r4 == r5) goto L_0x007f
            if (r4 == r0) goto L_0x00cb
            goto L_0x00fd
        L_0x007f:
            int r0 = r12.y
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto L_0x00fd
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00b9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00b9
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00b9
            goto L_0x00fd
        L_0x00b9:
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
            boolean r14 = r12.c()
            if (r14 == 0) goto L_0x00fd
            r14 = r2
            goto L_0x00fe
        L_0x00cb:
            r12.a()
            goto L_0x00fd
        L_0x00cf:
            int r14 = r14.getPointerId(r3)
            r12.y = r14
            tb6 r14 = r12.v
            if (r14 != 0) goto L_0x00e1
            tb6 r14 = new tb6
            r0 = 0
            r14.<init>(r12, r0)
            r12.v = r14
        L_0x00e1:
            tb6 r14 = r12.v
            int r0 = r12.b
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            tb6 r14 = r12.w
            if (r14 != 0) goto L_0x00f5
            tb6 r14 = new tb6
            r0 = 1
            r14.<init>(r12, r0)
            r12.w = r14
        L_0x00f5:
            tb6 r14 = r12.w
            int r0 = r12.c
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        L_0x00fd:
            r14 = r3
        L_0x00fe:
            if (r14 == 0) goto L_0x0113
            long r6 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r6
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L_0x0113:
            r12.x = r14
            if (r14 != 0) goto L_0x011b
            if (r13 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r2 = r3
        L_0x011b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        this.x = false;
        this.y = -1;
        tb6 tb6 = this.v;
        if (tb6 != null) {
            this.o.removeCallbacks(tb6);
        }
    }
}
