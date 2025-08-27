package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eb9  reason: default package */
public final class eb9 implements fb9 {
    public final Collection a;

    public eb9(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) eb9.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((eb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(messageIds=" + this.a + ")";
    }
}
