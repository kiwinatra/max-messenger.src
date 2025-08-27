package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.jvm.functions.Function1;

/* renamed from: o8a  reason: default package */
public final class o8a extends fzc {
    public final t56 a;
    public final Function1 b;
    public boolean c;

    public o8a(t56 t56, hq7 hq7) {
        this.a = t56;
        this.b = hq7;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (!this.c) {
            a layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                int S0 = gridLayoutManager.S0();
                int W0 = gridLayoutManager.W0();
                t56 t56 = this.a;
                int j = t56.j();
                if (S0 != -1) {
                    this.b.invoke(W0 == j + -1 ? t56.L(W0) : t56.L(S0));
                }
            }
        }
    }
}
