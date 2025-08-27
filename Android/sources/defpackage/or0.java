package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: or0  reason: default package */
public final class or0 extends fbf {
    public final boolean v = true;
    public final int w = 1;
    public final String x = or0.class.getName();

    public static final boolean g0(or0 or0, RecyclerView recyclerView, int i) {
        or0.getClass();
        tyc adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (i != adapter.j() - 1 || recyclerView.canScrollVertically(1)) {
                return false;
            }
        } else if (linearLayoutManager.X0() != i - 1) {
            return false;
        }
        return true;
    }

    public static final void h0(or0 or0, RecyclerView recyclerView, tyc tyc, int i) {
        if (!or0.v || i != tyc.j() - 1) {
            recyclerView.z0(tyc.j() - 1);
        } else {
            recyclerView.D0(tyc.j() - 1);
        }
    }

    public final vyc V(RecyclerView recyclerView, tyc tyc) {
        return new z65(this, recyclerView, tyc);
    }
}
