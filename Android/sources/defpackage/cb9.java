package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb9  reason: default package */
public final class cb9 implements fb9 {
    public final Collection a;

    public cb9(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb9) && Intrinsics.areEqual((Object) this.a, (Object) ((cb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByIds(messageIds=" + this.a + ")";
    }
}
