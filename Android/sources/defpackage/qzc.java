package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: qzc  reason: default package */
public final class qzc extends v3 {
    public final rzc d;
    public final WeakHashMap e = new WeakHashMap();

    public qzc(rzc rzc) {
        this.d = rzc;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        v3 v3Var = (v3) this.e.get(view);
        return v3Var != null ? v3Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final grg b(View view) {
        v3 v3Var = (v3) this.e.get(view);
        return v3Var != null ? v3Var.b(view) : super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        v3 v3Var = (v3) this.e.get(view);
        if (v3Var != null) {
            v3Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, g4 g4Var) {
        rzc rzc = this.d;
        boolean Z = rzc.d.Z();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        if (!Z) {
            RecyclerView recyclerView = rzc.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().c0(view, g4Var);
                v3 v3Var = (v3) this.e.get(view);
                if (v3Var != null) {
                    v3Var.d(view, g4Var);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        v3 v3Var = (v3) this.e.get(view);
        if (v3Var != null) {
            v3Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        v3 v3Var = (v3) this.e.get(viewGroup);
        return v3Var != null ? v3Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        rzc rzc = this.d;
        if (!rzc.d.Z()) {
            RecyclerView recyclerView = rzc.d;
            if (recyclerView.getLayoutManager() != null) {
                v3 v3Var = (v3) this.e.get(view);
                if (v3Var != null) {
                    if (v3Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                hzc hzc = recyclerView.getLayoutManager().b.c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    public final void h(View view, int i) {
        v3 v3Var = (v3) this.e.get(view);
        if (v3Var != null) {
            v3Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        v3 v3Var = (v3) this.e.get(view);
        if (v3Var != null) {
            v3Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
