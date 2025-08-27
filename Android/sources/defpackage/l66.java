package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: l66  reason: default package */
public final class l66 extends pae implements ql7 {
    public final Function1 v;
    public final Function3 w;
    public final e4 x;

    public l66(ExecutorService executorService, f fVar, mu0 mu0, e4 e4Var) {
        super(executorService);
        this.v = fVar;
        this.w = mu0;
        this.x = e4Var;
    }

    /* renamed from: L */
    public final void s(i0g i0g, int i) {
        g0g g0g = (g0g) ((lz7) E(i));
        View view = i0g.a;
        h0g h0g = (h0g) view;
        h0g.setType(g0g.b);
        ngf ngf = g0g.c;
        ngf.getClass();
        CharSequence b = ngf.b(view.getContext().getResources());
        if (b == null) {
            b = "";
        }
        h0g.setTitle(b);
        i0g.D0 = this.x;
        f0g f0g = f0g.a;
        f0g f0g2 = g0g.b;
        if (f0g2 == f0g) {
            ((h0g) view).setOnClickListener((View.OnClickListener) null);
        } else {
            ct.G(view, 300, new v36(this.v, g0g, 1));
        }
        if (f0g2 == f0g.b) {
            h0g h0g2 = (h0g) view;
            h0g2.setOnDragIconTouchListener(new r6(23, i0g));
            h0g2.setActionMenuIconClickListener(new ep1(this.w, g0g, i0g, 15));
        }
    }

    public final void M(int i, int i2) {
        boolean z = false;
        boolean z2 = ((g0g) ((lz7) E(i2))).b == f0g.b;
        if (i2 <= 0 || i2 >= j()) {
            z = true;
        }
        if (z2 && !z) {
            List mutableList = CollectionsKt.toMutableList(((ov) this.o).f);
            cjf.G(mutableList, i, i2);
            H(mutableList, new kh1(this, i, i2, mutableList));
        }
    }

    public final int l(int i) {
        int ordinal = ((g0g) ((lz7) E(i))).b.ordinal();
        if (ordinal == 0) {
            return gua.h;
        }
        if (ordinal == 1) {
            return gua.p;
        }
        if (ordinal == 2) {
            return gua.i;
        }
        if (ordinal == 3) {
            return gua.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        f0g f0g;
        if (i == gua.h) {
            f0g = f0g.a;
        } else if (i == gua.p) {
            f0g = f0g.b;
        } else if (i == gua.i) {
            f0g = f0g.c;
        } else if (i == gua.l) {
            f0g = f0g.o;
        } else {
            throw new IllegalStateException(wj6.h(i, "Unknown viewtype in "));
        }
        return new pzc(new h0g(f0g, viewGroup.getContext()));
    }
}
