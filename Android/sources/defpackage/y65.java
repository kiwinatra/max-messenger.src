package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: y65  reason: default package */
public final class y65 extends fzc {
    public final u65 a;
    public int b = 1;
    public x65 c;
    public final /* synthetic */ EndlessRecyclerView2 d;

    public y65(EndlessRecyclerView2 endlessRecyclerView2, u65 u65) {
        this.d = endlessRecyclerView2;
        this.a = u65;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        x65 x65 = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = this.d;
        if (x65 != null) {
            endlessRecyclerView2.removeCallbacks(x65);
        }
        x65 x652 = new x65(this, i, i2);
        this.c = x652;
        endlessRecyclerView2.post(x652);
    }
}
