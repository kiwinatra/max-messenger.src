package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: eu2  reason: default package */
public final class eu2 implements czc {
    public final RecyclerView a;
    public final Function0 b;

    public eu2(EndlessRecyclerView2 endlessRecyclerView2, uw2 uw2) {
        this.a = endlessRecyclerView2;
        this.b = uw2;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        pzc U = I == null ? null : recyclerView.U(I);
        if ((U instanceof tg5) || (U instanceof pg5)) {
            u3b.a(view, new du2(view, this, 0));
        } else if (U instanceof zr2) {
            u3b.a(view, new du2(view, this, 1));
        }
    }
}
