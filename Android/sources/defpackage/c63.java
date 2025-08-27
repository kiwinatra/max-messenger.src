package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c63  reason: default package */
public final class c63 {
    public final List a;

    public c63(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c63) && Intrinsics.areEqual((Object) this.a, (Object) ((c63) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("CombinedError(errors="), this.a, ")");
    }
}
