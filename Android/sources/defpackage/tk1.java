package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: tk1  reason: default package */
public final class tk1 extends kbe implements kl1 {
    public final ll1 D0;

    public tk1(rk1 rk1, ll1 ll1) {
        super(rk1);
        this.D0 = ll1;
    }

    public final void M(lz7 lz7) {
        vc1 vc1 = (vc1) lz7;
        ll1 ll1 = this.D0;
        ll1.a.add(this);
        r(ll1.b);
        rk1 rk1 = (rk1) this.a;
        rk1.setOpponents(vc1.b);
        rk1.S(vc1.c, vc1.o);
        r(ll1.b);
    }

    public final void N(lz7 lz7, Object obj) {
        vc1 vc1 = (vc1) lz7;
        uc1 uc1 = obj instanceof uc1 ? (uc1) obj : null;
        View view = this.a;
        if (uc1 != null) {
            BitSet bitSet = (BitSet) uc1.a;
            if (bitSet.get(0)) {
                ((rk1) view).setOpponents(vc1.b);
            }
            if (bitSet.get(1)) {
                ((rk1) view).S(vc1.c, vc1.o);
                return;
            }
            return;
        }
        ll1 ll1 = this.D0;
        ll1.a.add(this);
        r(ll1.b);
        rk1 rk1 = (rk1) view;
        rk1.setOpponents(vc1.b);
        rk1.S(vc1.c, vc1.o);
        r(ll1.b);
    }

    public final void r(jl1 jl1) {
        il1 il1 = jl1 != null ? jl1.a : null;
        int i = il1 == null ? -1 : sk1.$EnumSwitchMapping$0[il1.ordinal()];
        if (i != -1) {
            View view = this.a;
            if (i == 1) {
                ((rk1) view).setStatus((CharSequence) null);
                ((rk1) view).setTitle((CharSequence) null);
            } else if (i == 2) {
                ((rk1) view).setTitle(jl1.b);
                ((rk1) view).setStatus(jl1.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
