package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.io.ConstantsKt;

/* renamed from: m2c  reason: default package */
public final class m2c extends pae {
    public final l2c v;

    public m2c(ExecutorService executorService, l2c l2c) {
        super(executorService);
        this.v = l2c;
    }

    /* renamed from: L */
    public final void s(p6c p6c, int i) {
        t3c t3c = (t3c) ((lz7) E(i));
        p6c.M(t3c);
        pzc pzc = null;
        if (t3c instanceof p3c) {
            if (p6c instanceof vj7) {
                pzc = (vj7) p6c;
            }
            if (pzc != null) {
                ct.G(pzc.a, 300, new e7(12, new vra(12, this, (p3c) t3c)));
            }
        } else if (t3c instanceof h3c) {
            boolean z = p6c instanceof lb2;
            lb2 lb2 = z ? (lb2) p6c : null;
            if (lb2 != null) {
                ct.G(lb2.a, 300, new e7(4, new k2c(this, 0)));
            }
            if (z) {
                pzc = (lb2) p6c;
            }
            if (pzc != null) {
                ((hb2) pzc.a).setOnMoreActionsClickListener(new k2c(this, 1));
            }
        }
    }

    public final int l(int i) {
        return ((t3c) ((lz7) E(i))).i();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (hi7.l(i2, ConstantsKt.DEFAULT_BUFFER_SIZE)) {
            return new pzc(new r1e(viewGroup.getContext(), (AttributeSet) null));
        }
        if (hi7.l(i2, 4)) {
            return new p20(viewGroup.getContext());
        }
        if (hi7.l(i2, 16384)) {
            return new pzc(new hb2(viewGroup.getContext(), (AttributeSet) null));
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
