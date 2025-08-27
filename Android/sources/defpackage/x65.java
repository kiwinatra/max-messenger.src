package defpackage;

import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: x65  reason: default package */
public final class x65 implements Runnable {
    public final /* synthetic */ y65 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public x65(y65 y65, int i, int i2) {
        this.a = y65;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        y65 y65 = this.a;
        u65 u65 = y65.a;
        if (!(this.b == 0 && this.c == 0)) {
            u65.p();
        }
        EndlessRecyclerView2 endlessRecyclerView2 = y65.d;
        int X0 = endlessRecyclerView2.getLinearLayoutManager().X0();
        tyc adapter = endlessRecyclerView2.getAdapter();
        if ((adapter != null ? adapter.j() : 0) - X0 <= y65.b && ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.Z1) && u65.E1())) {
            endlessRecyclerView2.setRefreshingNext(true);
            u65.u1();
        }
        int V0 = endlessRecyclerView2.getLinearLayoutManager().V0();
        if (V0 >= 0 && V0 <= y65.b) {
            if ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.a2) && u65.B()) {
                endlessRecyclerView2.setRefreshingPrev(true);
                u65.E0();
            }
        }
    }
}
