package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: v5f  reason: default package */
public final class v5f extends fqc {
    public int h;
    public int i = -1;
    public final /* synthetic */ SwipeDismissBehavior j;

    public v5f(SwipeDismissBehavior swipeDismissBehavior) {
        this.j = swipeDismissBehavior;
    }

    public final void F(View view, int i2) {
        this.i = i2;
        this.h = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.j;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    public final void G(int i2) {
        wie wie = this.j.b;
        if (wie != null) {
            il0 il0 = (il0) wie.b;
            if (i2 == 0) {
                qpg.l().u(il0.u);
            } else if (i2 == 1 || i2 == 2) {
                qpg.l().r(il0.u);
            }
        }
    }

    public final void H(View view, int i2, int i3, int i4) {
        SwipeDismissBehavior swipeDismissBehavior = this.j;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.g;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.h;
        float abs = (float) Math.abs(i2 - this.h);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        } else {
            view.setAlpha(Math.min(Math.max(c44.DEFAULT_ASPECT_RATIO, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.h) >= java.lang.Math.round(((float) r9.getWidth()) * r3.f)) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.i = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.j
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.util.WeakHashMap r5 = defpackage.gag.a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L_0x0021
            goto L_0x0052
        L_0x0021:
            if (r6 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            goto L_0x0052
        L_0x002a:
            if (r1 <= 0) goto L_0x0066
            goto L_0x0052
        L_0x002d:
            if (r6 != r2) goto L_0x0066
            if (r5 == 0) goto L_0x0034
            if (r1 <= 0) goto L_0x0066
            goto L_0x0052
        L_0x0034:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0066
            goto L_0x0052
        L_0x0039:
            int r1 = r9.getLeft()
            int r5 = r8.h
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L_0x0066
        L_0x0052:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x0061
            int r10 = r9.getLeft()
            int r0 = r8.h
            if (r10 >= r0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            int r0 = r0 + r11
            goto L_0x0069
        L_0x0061:
            int r8 = r8.h
            int r0 = r8 - r11
            goto L_0x0069
        L_0x0066:
            int r0 = r8.h
            r2 = r4
        L_0x0069:
            kag r8 = r3.a
            int r10 = r9.getTop()
            boolean r8 = r8.p(r0, r10)
            if (r8 == 0) goto L_0x0080
            vr1 r8 = new vr1
            r8.<init>((com.google.android.material.behavior.SwipeDismissBehavior) r3, (android.view.View) r9, (boolean) r2)
            java.util.WeakHashMap r10 = defpackage.gag.a
            r9.postOnAnimation(r8)
            goto L_0x0089
        L_0x0080:
            if (r2 == 0) goto L_0x0089
            wie r8 = r3.b
            if (r8 == 0) goto L_0x0089
            r8.j0(r9)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5f.I(android.view.View, float, float):void");
    }

    public final boolean Q(View view, int i2) {
        int i3 = this.i;
        return (i3 == -1 || i3 == i2) && this.j.w(view);
    }

    public final int f(View view, int i2) {
        int i3;
        int i4;
        int width;
        WeakHashMap weakHashMap = gag.a;
        boolean z = view.getLayoutDirection() == 1;
        int i5 = this.j.e;
        if (i5 != 0) {
            if (i5 != 1) {
                i4 = this.h - view.getWidth();
                i3 = this.h + view.getWidth();
            } else if (z) {
                i4 = this.h;
                width = view.getWidth();
            } else {
                i4 = this.h - view.getWidth();
                i3 = this.h;
            }
            return Math.min(Math.max(i4, i2), i3);
        } else if (z) {
            i4 = this.h - view.getWidth();
            i3 = this.h;
            return Math.min(Math.max(i4, i2), i3);
        } else {
            i4 = this.h;
            width = view.getWidth();
        }
        i3 = width + i4;
        return Math.min(Math.max(i4, i2), i3);
    }

    public final int g(View view, int i2) {
        return view.getTop();
    }

    public final int t(View view) {
        return view.getWidth();
    }
}
