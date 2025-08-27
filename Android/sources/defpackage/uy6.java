package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uy6  reason: default package */
public final class uy6 {
    public final long a;
    public final List b;

    public uy6(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy6)) {
            return false;
        }
        uy6 uy6 = (uy6) obj;
        return this.a == uy6.a && Intrinsics.areEqual((Object) this.b, (Object) uy6.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "HighlightTextState(messageLocalId=" + this.a + ", highlights=" + this.b + ")";
    }
}
