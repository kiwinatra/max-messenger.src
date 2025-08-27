package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import kotlin.io.ConstantsKt;

/* renamed from: el0  reason: default package */
public final class el0 extends v3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ el0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2.c() > 1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 2: goto L_0x0047;
                case 7: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.c(r2, r3)
            return
        L_0x0009:
            super.c(r2, r3)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r3.setClassName(r2)
            java.lang.Object r1 = r1.e
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            q7b r2 = r1.v
            if (r2 == 0) goto L_0x0025
            int r2 = r2.c()
            r0 = 1
            if (r2 <= r0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L_0x0046
            q7b r2 = r1.v
            if (r2 == 0) goto L_0x0046
            int r2 = r2.c()
            r3.setItemCount(r2)
            int r2 = r1.w
            r3.setFromIndex(r2)
            int r1 = r1.w
            r3.setToIndex(r1)
        L_0x0046:
            return
        L_0x0047:
            super.c(r2, r3)
            java.lang.Object r1 = r1.e
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.o
            r3.setChecked(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el0.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    public final void d(View view, g4 g4Var) {
        int i = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g4Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((xr0) obj).Y) {
                    g4Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    return;
                }
                accessibilityNodeInfo2.setDismissable(false);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.v);
                accessibilityNodeInfo3.setChecked(checkableImageButton.o);
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, g4Var.a);
                int i2 = MaterialButtonToggleGroup.w0;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                g4Var.i(f4.a(((MaterialButton) view).A0, 0, 1, i, 1));
                return;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo4 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfo4.setHintText(materialCalendar.w1.getVisibility() == 0 ? materialCalendar.S1(ymc.mtrl_picker_toggle_to_year_selection) : materialCalendar.S1(ymc.mtrl_picker_toggle_to_day_selection));
                return;
            case 5:
                AccessibilityNodeInfo accessibilityNodeInfo5 = g4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCheckable(((NavigationMenuItemView) obj).z);
                return;
            case 6:
                etb etb = (etb) obj;
                etb.g.d(view, g4Var);
                RecyclerView recyclerView = etb.f;
                recyclerView.getClass();
                int S = RecyclerView.S(view);
                tyc adapter = recyclerView.getAdapter();
                if (adapter instanceof btb) {
                    ((btb) adapter).G(S);
                    return;
                }
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, g4Var.a);
                g4Var.h(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                q7b q7b = viewPager.v;
                if (q7b != null && q7b.c() > 1) {
                    z = true;
                }
                g4Var.k(z);
                if (viewPager.canScrollHorizontally(1)) {
                    g4Var.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    g4Var.a(ConstantsKt.DEFAULT_BUFFER_SIZE);
                    return;
                }
                return;
        }
    }

    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((efe) ((il0) this.e)).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    xr0 xr0 = (xr0) this.e;
                    if (xr0.Y) {
                        xr0.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 6:
                return ((etb) this.e).g.g(view, i, bundle);
            case 7:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.w - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.w + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
