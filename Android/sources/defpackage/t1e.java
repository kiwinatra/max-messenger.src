package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.BitSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: t1e  reason: default package */
public final class t1e extends kbe {
    public j1e D0;

    public final void M(lz7 lz7) {
        ((r1e) this.a).setModelItem((i1e) lz7);
    }

    public final void O() {
        this.D0 = null;
    }

    /* renamed from: P */
    public final void N(i1e i1e, Object obj) {
        g1e g1e = obj instanceof g1e ? (g1e) obj : null;
        View view = this.a;
        if (g1e != null) {
            BitSet bitSet = (BitSet) g1e.a;
            bitSet.get(0);
            if (bitSet.get(1)) {
                ((r1e) view).setTitle(i1e.getTitle());
            }
            if (bitSet.get(2)) {
                ((r1e) view).setType(i1e.getType());
            }
            if (bitSet.get(3)) {
                ((r1e) view).setDescription(i1e.b());
            }
            if (bitSet.get(4)) {
                Integer a = i1e.a();
                if (a != null) {
                    ((r1e) view).setStartIcon(a.intValue());
                } else {
                    ((r1e) view).setStartIcon((Drawable) null);
                }
            }
            if (bitSet.get(5)) {
                r1e r1e = (r1e) view;
                r1e.setOnSwitchCheckedListener((n1e) null);
                r1e.setEndView(i1e.e());
                if (i1e.e() instanceof d1e) {
                    r1e.setOnSwitchCheckedListener((Function2<? super Long, ? super Boolean, Unit>) new r6(17, this));
                }
            }
            if (bitSet.get(6)) {
                ((r1e) view).setCounter(i1e.c());
            }
            if (bitSet.get(7)) {
                ((r1e) view).setUpperText(i1e.d());
            }
            if (bitSet.get(8)) {
                ((r1e) view).setStartIconPadding(i1e.p());
                return;
            }
            return;
        }
        ((r1e) view).setModelItem(i1e);
    }
}
