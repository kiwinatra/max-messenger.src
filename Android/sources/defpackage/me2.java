package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: me2  reason: default package */
public final class me2 extends pae {
    public final le2 v;

    public me2(ExecutorService executorService, le2 le2) {
        super(executorService);
        this.v = le2;
    }

    /* renamed from: L */
    public final void s(ne2 ne2, int i) {
        m29 m29 = (m29) ((lz7) E(i));
        boolean z = m29 instanceof i29;
        le2 le2 = this.v;
        if (z) {
            ne2.P(m29, new f(8, (Object) le2), new zw(3, (Object) le2));
        } else if (m29 instanceof j29) {
            kb2 kb2 = ne2 instanceof kb2 ? (kb2) ne2 : null;
            if (kb2 != null) {
                j29 j29 = (j29) m29;
                f fVar = new f(9, (Object) le2);
                zw zwVar = new zw(4, (Object) le2);
                f fVar2 = new f(10, (Object) le2);
                ke2 ke2 = (ke2) kb2.a;
                kb2.M(j29);
                ct.G(ke2, 300, new ib2(fVar, j29, 0));
                ke2.setOnLongClickListener(new jb2(zwVar, j29, kb2, 0));
                ke2.setLinkOnLongClickListener(new yb1(1, fVar2, j29));
                ke2.setOnLinkClickListener(new ib2(fVar2, j29, 1));
            }
        } else if (m29 instanceof l29) {
            ne2.P(m29, new f(11, (Object) le2), new zw(5, (Object) le2));
        } else if (m29 instanceof c29) {
            ne2.P(m29, new f(12, (Object) le2), new zw(6, (Object) le2));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int l(int i) {
        return ((m29) ((ov) this.o).f.get(i)).i();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int ordinal = ((eg2) eg2.o.get(i)).ordinal();
        if (ordinal == 0) {
            return new w32(new pf2(viewGroup.getContext(), (AttributeSet) null), 2);
        }
        if (ordinal == 1) {
            return new w32(new je2(viewGroup.getContext(), (AttributeSet) null), 1);
        }
        if (ordinal == 2) {
            return new pzc(new ke2(viewGroup.getContext(), (AttributeSet) null));
        }
        if (ordinal == 3) {
            return new w32(new rc2(viewGroup.getContext(), (AttributeSet) null), 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
