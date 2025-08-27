package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ce2  reason: default package */
public final class ce2 implements fe2 {
    public final List a;

    public ce2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce2) && Intrinsics.areEqual((Object) this.a, (Object) ((ce2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("Remove(messageIds="), this.a, ")");
    }
}
