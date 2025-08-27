package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x39  reason: default package */
public final class x39 implements z39 {
    public final Collection a;

    public x39(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x39) && Intrinsics.areEqual((Object) this.a, (Object) ((x39) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalDeleteMembers(ids=" + this.a + ")";
    }
}
