package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: gk9  reason: default package */
public final class gk9 implements czc {
    public final RecyclerView a;
    public final Function0 b;

    public gk9(EndlessRecyclerView2 endlessRecyclerView2, gn9 gn9) {
        this.a = endlessRecyclerView2;
        this.b = gn9;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        if ((I == null ? null : recyclerView.U(I)) instanceof hg9) {
            u3b.a(view, new tj7(13, view, this));
        }
    }
}
