package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: k1e  reason: default package */
public final class k1e extends pae {
    public final j1e v;

    public k1e(j1e j1e, ExecutorService executorService) {
        super(executorService);
        this.v = j1e;
    }

    /* renamed from: L */
    public final void s(t1e t1e, int i) {
        i1e i1e = (i1e) ((lz7) E(i));
        View view = t1e.a;
        ((r1e) view).setModelItem(i1e);
        j1e j1e = this.v;
        t1e.D0 = j1e;
        if (i1e.e() instanceof d1e) {
            ((r1e) view).setOnSwitchCheckedListener((Function2<? super Long, ? super Boolean, Unit>) new r6(18, j1e));
        } else {
            ((r1e) view).setOnSwitchCheckedListener((n1e) null);
        }
        ct.G(view, 300, new kqc(9, (Object) j1e, (Object) i1e));
    }

    public final void t(pzc pzc, int i, List list) {
        t1e t1e = (t1e) pzc;
        if (!list.isEmpty()) {
            j3h j3h = new j3h(7);
            for (Object next : list) {
                g1e g1e = next instanceof g1e ? (g1e) next : null;
                if (g1e != null) {
                    ((BitSet) j3h.a).or((BitSet) g1e.a);
                }
            }
            t1e.N((i1e) ((ov) this.o).f.get(i), j3h);
            return;
        }
        s(t1e, i);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
    }
}
