package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.b;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* renamed from: o61  reason: default package */
public final class o61 extends pae {
    public final /* synthetic */ int v = 1;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public o61(ExecutorService executorService, hb8 hb8, ykb ykb) {
        super(executorService);
        this.w = executorService;
        this.x = hb8;
        this.y = ykb;
        this.z = new d6a(10, (Object) this);
    }

    public void J(kbe kbe, int i) {
        switch (this.v) {
            case 0:
                ((n61) kbe).D0.setOpponents((y4b) ((lz7) E(i)));
                return;
            default:
                super.s(kbe, i);
                return;
        }
    }

    public int j() {
        switch (this.v) {
            case 0:
                return ((ov) this.o).f.size();
            default:
                return super.j();
        }
    }

    public void s(pzc pzc, int i) {
        switch (this.v) {
            case 0:
                ((n61) pzc).D0.setOpponents((y4b) ((lz7) E(i)));
                return;
            default:
                super.s(pzc, i);
                return;
        }
    }

    public void t(pzc pzc, int i, List list) {
        switch (this.v) {
            case 0:
                n61 n61 = (n61) pzc;
                if (list.isEmpty()) {
                    n61.D0.setOpponents((y4b) ((lz7) E(i)));
                    return;
                }
                n61.N((y4b) ((ov) this.o).f.get(i), list);
                return;
            default:
                super.t(pzc, i, list);
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.v) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                f61 f61 = new f61(viewGroup.getContext(), (AttributeSet) null);
                f61.setId(kgc.call_opponents);
                f61.setParentSizeProvider((x51) this.w);
                f61.setVideoLayoutUpdatesControllerProvider((Function0) this.y);
                f61.setListener((e61) this.x);
                f61.setOpponentsViewPool((b) ((Function0) this.z).invoke());
                frameLayout.addView(f61, -1, -1);
                return new n61(frameLayout);
            default:
                return new qw3(viewGroup.getContext(), (hb8) this.x, (ExecutorService) ((Executor) this.w), (d6a) this.z);
        }
    }

    public o61(y35 y35, vs6 vs6, y51 y51, y51 y512) {
        super(sjd.a.t().a());
        this.w = y35;
        this.x = vs6;
        this.y = y51;
        this.z = y512;
    }
}
