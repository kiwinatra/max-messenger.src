package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class b extends v3 {
    public final /* synthetic */ AppBarLayout d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout.BaseBehavior f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f = baseBehavior;
        this.d = appBarLayout;
        this.e = coordinatorLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r0 = r4.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.view.View r5, defpackage.g4 r6) {
        /*
            r4 = this;
            android.view.View$AccessibilityDelegate r0 = r4.a
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.a
            r0.onInitializeAccessibilityNodeInfo(r5, r1)
            java.lang.Class<android.widget.ScrollView> r5 = android.widget.ScrollView.class
            java.lang.String r5 = r5.getName()
            r6.h(r5)
            com.google.android.material.appbar.AppBarLayout r5 = r4.d
            int r0 = r5.getTotalScrollRange()
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = r4.f
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r4.e
            android.view.View r4 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.C(r0, r4)
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r1 = r5.getChildCount()
            r2 = 0
        L_0x0029:
            if (r2 >= r1) goto L_0x0076
            android.view.View r3 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            dn r3 = (defpackage.dn) r3
            int r3 = r3.a
            if (r3 == 0) goto L_0x0073
            int r1 = r0.z()
            int r2 = r5.getTotalScrollRange()
            int r2 = -r2
            r3 = 1
            if (r1 == r2) goto L_0x004d
            a4 r1 = defpackage.a4.f
            r6.b(r1)
            r6.k(r3)
        L_0x004d:
            int r0 = r0.z()
            if (r0 == 0) goto L_0x0072
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 == 0) goto L_0x006a
            int r4 = r5.getDownNestedPreScrollRange()
            int r4 = -r4
            if (r4 == 0) goto L_0x0072
            a4 r4 = defpackage.a4.g
            r6.b(r4)
            r6.k(r3)
            goto L_0x0072
        L_0x006a:
            a4 r4 = defpackage.a4.g
            r6.b(r4)
            r6.k(r3)
        L_0x0072:
            return
        L_0x0073:
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.b.d(android.view.View, g4):void");
    }

    public final boolean g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        } else if (i != 8192) {
            return super.g(view, i, bundle);
        } else {
            AppBarLayout.BaseBehavior baseBehavior = this.f;
            if (baseBehavior.z() != 0) {
                View C = AppBarLayout.BaseBehavior.C(baseBehavior, this.e);
                if (C.canScrollVertically(-1)) {
                    int i2 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        AppBarLayout appBarLayout2 = this.d;
                        this.f.o(this.e, appBarLayout2, C, 0, i2, new int[]{0, 0}, 1);
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
    }
}
