package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fxb  reason: default package */
public final class fxb extends hxb {
    public final List b;

    public fxb(List list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxb) && Intrinsics.areEqual((Object) this.b, (Object) ((fxb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ShowContextMenu(actions="), this.b, ")");
    }
}
