package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w29  reason: default package */
public final class w29 {
    public final List a;
    public final List b;

    public w29(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w29)) {
            return false;
        }
        w29 w29 = (w29) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) w29.a) && Intrinsics.areEqual((Object) this.b, (Object) w29.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemberListActionsWrapper(topActions=" + this.a + ", bottomActions=" + this.b + ")";
    }
}
