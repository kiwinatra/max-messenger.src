package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: rg8  reason: default package */
public final class rg8 extends v3 {
    public final /* synthetic */ int d;

    public /* synthetic */ rg8(int i) {
        this.d = i;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, g4 g4Var) {
        int scrollRange;
        switch (this.d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
            case 1:
                this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
                g4Var.k(false);
                return;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate2 = this.a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = g4Var.a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
            default:
                this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                g4Var.h(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    g4Var.k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        g4Var.b(a4.g);
                        g4Var.b(a4.k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        g4Var.b(a4.f);
                        g4Var.b(a4.l);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r5 != 16908346) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 3: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r3 = super.g(r4, r5, r6)
            return r3
        L_0x000a:
            boolean r3 = super.g(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L_0x0013
            goto L_0x00a0
        L_0x0013:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L_0x001f
        L_0x001c:
            r6 = r0
            goto L_0x00a0
        L_0x001f:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L_0x003c
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L_0x003c
            int r3 = r1.height()
        L_0x003c:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L_0x0076
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r1) goto L_0x004f
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L_0x004f
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L_0x0076
            goto L_0x001c
        L_0x004f:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L_0x001c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
            goto L_0x00a0
        L_0x0076:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto L_0x001c
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.v(r0, r3, r6)
        L_0x00a0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg8.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
