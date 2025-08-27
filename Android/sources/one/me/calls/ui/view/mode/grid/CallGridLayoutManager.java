package one.me.calls.ui.view.mode.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/view/mode/grid/CallGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "x51", "ni0", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallGridLayoutManager extends GridLayoutManager {
    public final Context M;
    public final int N;
    public final ni0 O;
    public x51 P = new xv1(7, (Object) this);

    public CallGridLayoutManager(Context context, int i, ni0 ni0) {
        super(2);
        this.M = context;
        this.N = i;
        this.O = ni0;
    }

    public final void B1(wu6 wu6) {
        int d = this.P.d();
        ni0 ni0 = this.O;
        wu6.height = ((d - (ni0.m() * this.N)) + 1) / ni0.m();
    }

    public final boolean g(bzc bzc) {
        bzc s = s();
        return (bzc instanceof wu6) && s.width == bzc.width && s.height == bzc.height;
    }

    public final bzc s() {
        bzc s = super.s();
        B1((wu6) s);
        return s;
    }

    public final bzc t(Context context, AttributeSet attributeSet) {
        bzc t = super.t(context, attributeSet);
        B1((wu6) t);
        return t;
    }

    public final bzc u(ViewGroup.LayoutParams layoutParams) {
        bzc u = super.u(layoutParams);
        B1((wu6) u);
        return u;
    }
}
