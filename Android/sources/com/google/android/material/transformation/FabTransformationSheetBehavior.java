package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.HashMap;
import java.util.WeakHashMap;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    public final xe8 D(Context context, boolean z) {
        int i2 = z ? tcc.mtrl_fab_transformation_sheet_expand_spec : tcc.mtrl_fab_transformation_sheet_collapse_spec;
        xe8 xe8 = new xe8(12, false);
        xe8.b = pt9.b(i2, context);
        xe8.c = new Object();
        return xe8;
    }

    public final void w(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof wz3) && (((wz3) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        HashMap hashMap = this.i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.i.get(childAt)).intValue();
                            WeakHashMap weakHashMap = gag.a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    } else {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap2 = gag.a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.w(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
