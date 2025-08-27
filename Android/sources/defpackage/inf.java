package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: inf  reason: default package */
public final class inf extends zyc {
    public final int a;
    public final boolean b;

    public inf(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        tyc adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int S = RecyclerView.S(view);
            boolean z = this.b;
            int i = this.a;
            if (z) {
                rect.right = i;
            } else {
                rect.left = i;
            }
            if (S < adapter.j() - 1) {
                return;
            }
            if (z) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }
}
