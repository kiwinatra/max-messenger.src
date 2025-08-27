package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;

/* renamed from: f61  reason: default package */
public final class f61 extends ConstraintLayout {
    public final CallGridLayoutManager E0;
    public final RecyclerView F0;
    public final wd1 G0;
    public e61 H0;
    public final Lazy I0;
    public y4b J0 = y4b.o;
    public Function0 K0;

    public f61(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new v4(context, 8));
        setLayoutParams(new fj3(-1, -1));
        wd1 wd1 = new wd1(vag.o, new rt6(7, (Object) this), new c61(this, 0), (nk1) null, new c61(this, 1), 18);
        this.G0 = wd1;
        float f = (float) 2;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), new ni0((Object) this, (getScreenInfo().f || getScreenInfo().e) ? 2 : 3, 2));
        callGridLayoutManager.K = new d61(this, 0);
        this.E0 = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(kgc.call_grid_opponents_view);
        recyclerView.setAdapter(wd1);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.j(new w51(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0));
        this.F0 = recyclerView;
        addView(recyclerView, -1, -1);
        pj3 h = ct.h(this);
        int id = recyclerView.getId();
        h.e(id, 4, 0, 4);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        h.e(id, 3, 0, 3);
        h.a(this);
    }

    private final wgd getScreenInfo() {
        return (wgd) this.I0.getValue();
    }

    public final void setListener(e61 e61) {
        this.H0 = e61;
    }

    public final void setOpponents(y4b y4b) {
        int i = y4b.a;
        RecyclerView recyclerView = this.F0;
        List list = y4b.c;
        if (i != 0 || list.size() <= 2 || getHeight() == -2) {
            int i2 = y4b.a;
            if (i2 == 0 && list.size() <= 2 && getHeight() != -1) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    recyclerView.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (i2 > 0 && getHeight() != -1) {
                ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    recyclerView.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = -2;
                recyclerView.setLayoutParams(layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.J0 = y4b;
        this.G0.G(list);
    }

    public final void setOpponentsViewPool(b bVar) {
        this.F0.setRecycledViewPool(bVar);
    }

    public final void setParentSizeProvider(x51 x51) {
        this.E0.P = x51;
    }

    public final void setVideoLayoutUpdatesControllerProvider(Function0<p6g> function0) {
        this.K0 = function0;
    }
}
