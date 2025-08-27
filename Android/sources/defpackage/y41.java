package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y41  reason: default package */
public final class y41 implements a51 {
    public final Set a;

    public y41(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y41) && Intrinsics.areEqual((Object) this.a, (Object) ((y41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContacts(contactIds=" + this.a + ")";
    }
}
