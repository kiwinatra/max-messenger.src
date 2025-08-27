package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a8d  reason: default package */
public final class a8d implements ViewGroup.OnHierarchyChangeListener {
    public static final a8d a = new Object();
    public static final i04 b = new i04();

    public final void onChildViewAdded(View view, View view2) {
        for (ViewGroup.OnHierarchyChangeListener onChildViewAdded : b) {
            onChildViewAdded.onChildViewAdded(view, view2);
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.setOnHierarchyChangeListener(this);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewAdded(view2, viewGroup.getChildAt(i));
            }
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewRemoved(view2, viewGroup.getChildAt(i));
            }
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        for (ViewGroup.OnHierarchyChangeListener onChildViewRemoved : b) {
            onChildViewRemoved.onChildViewRemoved(view, view2);
        }
    }
}
