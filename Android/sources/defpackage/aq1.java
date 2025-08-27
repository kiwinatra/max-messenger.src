package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: aq1  reason: default package */
public final class aq1 {
    public final List a;
    public final boolean b;

    public aq1(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1 = (aq1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) aq1.a) && this.b == aq1.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallsHistoryState(tabs=" + this.a + ", isGroupCallAvailable=" + this.b + ")";
    }
}
