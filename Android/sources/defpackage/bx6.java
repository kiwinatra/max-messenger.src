package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bx6  reason: default package */
public abstract class bx6 extends kbg {
    public ij3 c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public abstract int A(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4);

    public final void B(CoordinatorLayout coordinatorLayout, View view, int i2) {
        A(coordinatorLayout, view, i2, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f
            if (r0 != r3) goto L_0x0025
            return r4
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002c
            return r4
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.h
            if (r1 <= r5) goto L_0x0040
            r7.g = r0
            return r2
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x009f
            r7.f = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference r5 = r5.n
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0078
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0078
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L_0x0078
        L_0x0070:
            boolean r8 = r8.i(r9, r0, r1)
            if (r8 == 0) goto L_0x0078
            r8 = r2
            goto L_0x0079
        L_0x0078:
            r8 = r4
        L_0x0079:
            r7.e = r8
            if (r8 == 0) goto L_0x009f
            r7.g = r1
            int r8 = r10.getPointerId(r4)
            r7.f = r8
            android.view.VelocityTracker r8 = r7.i
            if (r8 != 0) goto L_0x008f
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.i = r8
        L_0x008f:
            android.widget.OverScroller r8 = r7.d
            if (r8 == 0) goto L_0x009f
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x009f
            android.widget.OverScroller r7 = r7.d
            r7.abortAnimation()
            return r2
        L_0x009f:
            android.view.VelocityTracker r7 = r7.i
            if (r7 == 0) goto L_0x00a6
            r7.addMovement(r10)
        L_0x00a6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx6.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(androidx.coordinatorlayout.widget.CoordinatorLayout r23, android.view.View r24, android.view.MotionEvent r25) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            r8 = r25
            int r0 = r25.getActionMasked()
            r9 = 0
            r10 = -1
            r11 = 1
            r12 = 0
            if (r0 == r11) goto L_0x0068
            r1 = 2
            if (r0 == r1) goto L_0x0034
            r1 = 3
            if (r0 == r1) goto L_0x00ed
            r1 = 6
            if (r0 == r1) goto L_0x001a
            goto L_0x0065
        L_0x001a:
            int r0 = r25.getActionIndex()
            if (r0 != 0) goto L_0x0022
            r0 = r11
            goto L_0x0023
        L_0x0022:
            r0 = r12
        L_0x0023:
            int r1 = r8.getPointerId(r0)
            r6.f = r1
            float r0 = r8.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.g = r0
            goto L_0x0065
        L_0x0034:
            int r0 = r6.f
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r10) goto L_0x003d
            return r12
        L_0x003d:
            float r0 = r8.getY(r0)
            int r0 = (int) r0
            int r1 = r6.g
            int r1 = r1 - r0
            r6.g = r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r2 = r0.getDownNestedScrollRange()
            int r2 = -r2
            int r0 = r0.getTopInset()
            int r4 = r0 + r2
            int r0 = r22.z()
            int r3 = r0 - r1
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r0.A(r1, r2, r3, r4, r5)
        L_0x0065:
            r0 = r12
            goto L_0x00fb
        L_0x0068:
            android.view.VelocityTracker r0 = r6.i
            if (r0 == 0) goto L_0x00ed
            r0.addMovement(r8)
            android.view.VelocityTracker r0 = r6.i
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r1)
            android.view.VelocityTracker r0 = r6.i
            int r1 = r6.f
            float r0 = r0.getYVelocity(r1)
            r1 = r7
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            int r2 = r1.getTotalScrollRange()
            int r2 = -r2
            ij3 r3 = r6.c
            if (r3 == 0) goto L_0x008f
            r7.removeCallbacks(r3)
            r6.c = r9
        L_0x008f:
            android.widget.OverScroller r3 = r6.d
            if (r3 != 0) goto L_0x009e
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            r6.d = r3
        L_0x009e:
            android.widget.OverScroller r13 = r6.d
            int r15 = r22.w()
            int r17 = java.lang.Math.round(r0)
            r19 = 0
            r21 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = r2
            r13.fling(r14, r15, r16, r17, r18, r19, r20, r21)
            android.widget.OverScroller r0 = r6.d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00d4
            ij3 r13 = new ij3
            r1 = 2
            r5 = 0
            r0 = r13
            r2 = r22
            r3 = r23
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.c = r13
            java.util.WeakHashMap r0 = defpackage.gag.a
            r7.postOnAnimation(r13)
            goto L_0x00eb
        L_0x00d4:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r2 = r23
            r0.K(r2, r1)
            boolean r0 = r1.x0
            if (r0 == 0) goto L_0x00eb
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(r23)
            boolean r0 = r1.h(r0)
            r1.g(r0)
        L_0x00eb:
            r0 = r11
            goto L_0x00ee
        L_0x00ed:
            r0 = r12
        L_0x00ee:
            r6.e = r12
            r6.f = r10
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x00fb
            r1.recycle()
            r6.i = r9
        L_0x00fb:
            android.view.VelocityTracker r1 = r6.i
            if (r1 == 0) goto L_0x0102
            r1.addMovement(r8)
        L_0x0102:
            boolean r1 = r6.e
            if (r1 != 0) goto L_0x010a
            if (r0 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r11 = r12
        L_0x010a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx6.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int z();
}
