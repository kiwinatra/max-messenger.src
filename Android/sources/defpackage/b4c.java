package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: b4c  reason: default package */
public final class b4c extends pae {
    public final a4c v;

    public b4c(ExecutorService executorService, a4c a4c) {
        super(executorService);
        this.v = a4c;
    }

    /* renamed from: L */
    public final void s(y0c y0c, int i) {
        tzb tzb = (tzb) ((lz7) E(i));
        y0c.M(tzb);
        if (tzb instanceof p7) {
            f7 f7Var = y0c instanceof f7 ? (f7) y0c : null;
            if (f7Var != null) {
                a4c a4c = this.v;
                ((r1e) f7Var.a).setOnSwitchCheckedListener((n1e) new p7d(1, (Object) new zqa(10, (Object) a4c), (Object) new hq7(14, (Object) a4c)));
            }
        }
    }

    public final int l(int i) {
        return ((tzb) ((lz7) E(i))).i();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (tf6.D(i2, 1024)) {
            return new f7(viewGroup.getContext());
        }
        if (tf6.D(i2, 2048)) {
            return new mnb(viewGroup.getContext(), 1);
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
