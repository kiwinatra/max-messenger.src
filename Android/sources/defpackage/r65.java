package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

/* renamed from: r65  reason: default package */
public final class r65 extends tyc {
    public final tyc o;
    public final /* synthetic */ EndlessRecyclerView v;

    public r65(EndlessRecyclerView endlessRecyclerView, tyc tyc) {
        this.v = endlessRecyclerView;
        this.o = tyc;
        C(tyc.b);
    }

    public final void A(vyc vyc) {
        super.A(vyc);
        this.o.A(vyc);
    }

    public final void D(vyc vyc) {
        super.D(vyc);
        this.o.D(vyc);
    }

    public final int j() {
        EndlessRecyclerView endlessRecyclerView = this.v;
        int i = 0;
        int i2 = (!endlessRecyclerView.b2 || endlessRecyclerView.e2 == null) ? 0 : 1;
        if (endlessRecyclerView.c2 && endlessRecyclerView.e2 != null) {
            i = 1;
        }
        return this.o.j() + i + i2;
    }

    public final long k(int i) {
        EndlessRecyclerView endlessRecyclerView = this.v;
        if (endlessRecyclerView.c2 && i == 0) {
            return -100;
        }
        if (endlessRecyclerView.b2 && i == j() - 1) {
            return -200;
        }
        tyc tyc = this.o;
        if (tyc.j() > 0) {
            return tyc.k(i - (endlessRecyclerView.c2 ? 1 : 0));
        }
        return -1;
    }

    public final int l(int i) {
        EndlessRecyclerView endlessRecyclerView = this.v;
        if ((endlessRecyclerView.c2 && i == 0) || (endlessRecyclerView.b2 && i == j() - 1)) {
            return -1;
        }
        tyc tyc = this.o;
        if (tyc.j() > 0) {
            return tyc.l(i - (endlessRecyclerView.c2 ? 1 : 0));
        }
        return -1;
    }

    public final void r(RecyclerView recyclerView) {
        this.o.r(recyclerView);
    }

    public final void s(pzc pzc, int i) {
        t(pzc, i, new ArrayList());
    }

    public final void t(pzc pzc, int i, List list) {
        if (!(pzc instanceof q65)) {
            tyc tyc = this.o;
            if (tyc.j() > 0) {
                tyc.t(pzc, i - (this.v.c2 ? 1 : 0), list);
            }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.o.u(viewGroup, i);
        }
        EndlessRecyclerView endlessRecyclerView = this.v;
        LayoutInflater from = LayoutInflater.from(endlessRecyclerView.getContext());
        Integer num = endlessRecyclerView.e2;
        if (num != null) {
            View inflate = from.inflate(num.intValue(), viewGroup, false);
            try {
                tk3 tk3 = endlessRecyclerView.f2;
                if (tk3 != null) {
                    tk3.accept(inflate);
                }
            } catch (Exception unused) {
            }
            return new pzc(inflate);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void v(RecyclerView recyclerView) {
        this.o.v(recyclerView);
    }

    public final boolean w(pzc pzc) {
        return (pzc instanceof q65) || this.o.w(pzc);
    }

    public final void x(pzc pzc) {
        if (!(pzc instanceof q65)) {
            this.o.x(pzc);
        }
    }

    public final void y(pzc pzc) {
        if (!(pzc instanceof q65)) {
            this.o.y(pzc);
        }
    }

    public final void z(pzc pzc) {
        if (!(pzc instanceof q65)) {
            this.o.z(pzc);
        }
    }
}
