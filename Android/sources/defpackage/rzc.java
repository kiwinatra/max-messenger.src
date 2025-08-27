package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: rzc  reason: default package */
public class rzc extends v3 {
    public final RecyclerView d;
    public final qzc e;

    public rzc(RecyclerView recyclerView) {
        this.d = recyclerView;
        v3 j = j();
        if (j == null || !(j instanceof qzc)) {
            this.e = new qzc(this);
        } else {
            this.e = (qzc) j;
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().Z(accessibilityEvent);
            }
        }
    }

    public final void d(View view, g4 g4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, g4Var.a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            a layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.a0(recyclerView2.c, recyclerView2.q1, g4Var);
        }
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.o0(recyclerView2.c, recyclerView2.q1, i, bundle);
    }

    public v3 j() {
        return this.e;
    }
}
