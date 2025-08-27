package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

/* renamed from: s65  reason: default package */
public final /* synthetic */ class s65 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t65 c;
    public final /* synthetic */ EndlessRecyclerView o;

    public /* synthetic */ s65(int i, int i2, t65 t65, EndlessRecyclerView endlessRecyclerView) {
        this.a = i;
        this.b = i2;
        this.c = t65;
        this.o = endlessRecyclerView;
    }

    public final void run() {
        int i = this.a;
        t65 t65 = this.c;
        if (!(i == 0 && this.b == 0)) {
            ((u65) t65.c).p();
        }
        EndlessRecyclerView endlessRecyclerView = this.o;
        int R0 = endlessRecyclerView.R0();
        tyc adapter = endlessRecyclerView.getAdapter();
        if (adapter != null) {
            int j = adapter.j() - R0;
            int i2 = t65.b;
            u65 u65 = (u65) t65.c;
            if (j <= i2 && ((endlessRecyclerView.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView.b2) && u65.E1())) {
                if (endlessRecyclerView.e2 != null) {
                    endlessRecyclerView.getRefreshingNextDelegate();
                    endlessRecyclerView.setRefreshingNext(true);
                }
                u65.u1();
            }
            a layoutManager = endlessRecyclerView.getLayoutManager();
            int i3 = 0;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int i4 = staggeredGridLayoutManager.p;
                int[] iArr = new int[i4];
                for (int i5 = 0; i5 < staggeredGridLayoutManager.p; i5++) {
                    vie vie = staggeredGridLayoutManager.q[i5];
                    boolean z = vie.f.w;
                    ArrayList arrayList = vie.a;
                    iArr[i5] = z ? vie.e(arrayList.size() - 1, -1, true, false) : vie.e(0, arrayList.size(), true, false);
                }
                i3 = iArr[i4 - 1];
            } else if (layoutManager instanceof LinearLayoutManager) {
                i3 = ((LinearLayoutManager) layoutManager).V0();
            }
            if (i3 >= 0 && i3 <= t65.b) {
                if ((endlessRecyclerView.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView.c2) && u65.B()) {
                    if (endlessRecyclerView.e2 != null) {
                        endlessRecyclerView.setRefreshingPrev(true);
                    }
                    u65.E0();
                }
            }
        }
    }
}
