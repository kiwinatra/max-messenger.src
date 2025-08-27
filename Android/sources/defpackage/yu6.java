package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yu6  reason: default package */
public final class yu6 {
    public final List a;

    public yu6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu6) && Intrinsics.areEqual((Object) this.a, (Object) ((yu6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("GridModeState(opponentsPages="), this.a, ")");
    }
}
