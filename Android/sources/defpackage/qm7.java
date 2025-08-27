package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: qm7  reason: default package */
public class qm7 extends qn7 implements va3 {
    public final boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qm7(pm7 pm7) {
        super(true);
        boolean z = true;
        O(pm7);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qn7.b;
        hz2 hz2 = (hz2) atomicReferenceFieldUpdater.get(this);
        iz2 iz2 = hz2 instanceof iz2 ? (iz2) hz2 : null;
        if (iz2 != null) {
            qn7 qn7 = iz2.o;
            qn7 qn72 = qn7 == null ? null : qn7;
            if (qn72 != null) {
                while (true) {
                    if (!qn72.J()) {
                        hz2 hz22 = (hz2) atomicReferenceFieldUpdater.get(qn72);
                        iz2 iz22 = hz22 instanceof iz2 ? (iz2) hz22 : null;
                        if (iz22 != null) {
                            qn72 = iz22.o;
                            if (qn72 == null) {
                                qn72 = null;
                                continue;
                            }
                            if (qn72 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        z = false;
        this.c = z;
    }

    public final boolean J() {
        return this.c;
    }

    public final boolean K() {
        return true;
    }

    public final boolean h0() {
        return R(Unit.INSTANCE);
    }
}
