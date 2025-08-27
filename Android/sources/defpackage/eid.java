package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.ranges.RangesKt;

/* renamed from: eid  reason: default package */
public final class eid extends b59 {
    public final RecyclerView w;

    public eid(RecyclerView recyclerView) {
        this.w = recyclerView;
    }

    public final void z(Rect rect, Rect rect2) {
        if (rect.height() <= rect2.height()) {
            int i = rect.top;
            int i2 = rect2.top;
            boolean z = false;
            RecyclerView recyclerView = this.w;
            if (i < i2) {
                int i3 = i - i2;
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = computeVerticalScrollOffset + i3;
                if (computeVerticalScrollOffset > 0) {
                    recyclerView.scrollBy(0, i3);
                }
                if (i4 < 0) {
                    recyclerView.e0(Math.abs(i4));
                    recyclerView.a0();
                }
                rect.offset(0, -i3);
                return;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 > i6) {
                int i7 = i5 - i6;
                int coerceAtLeast = RangesKt.coerceAtLeast(recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()), 0);
                if (coerceAtLeast > 0) {
                    recyclerView.scrollBy(0, i7);
                }
                int i8 = coerceAtLeast - i7;
                a layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                tyc adapter = recyclerView.getAdapter();
                int j = (adapter != null ? adapter.j() : 1) - 1;
                boolean z2 = linearLayoutManager != null && linearLayoutManager.S0() == 0;
                if (linearLayoutManager != null && linearLayoutManager.W0() == j) {
                    z = true;
                }
                if (z2 && z) {
                    recyclerView.e0(-i7);
                } else if (i8 < 0) {
                    recyclerView.e0(i8);
                }
            }
        }
    }
}
