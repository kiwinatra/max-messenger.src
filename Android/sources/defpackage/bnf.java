package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: bnf  reason: default package */
public final class bnf extends fbf {
    public final bv1 v;

    public bnf(bv1 bv1) {
        this.v = bv1;
    }

    public static final void g0(bnf bnf, RecyclerView recyclerView) {
        bnf.getClass();
        a layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.V0() > 0) {
            return;
        }
        if (bnf.v.b) {
            recyclerView.D0(0);
        } else {
            recyclerView.z0(0);
        }
    }

    public final vyc V(RecyclerView recyclerView, tyc tyc) {
        return new lwe(this, recyclerView, 1);
    }
}
