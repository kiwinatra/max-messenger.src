package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sxe  reason: default package */
public final class sxe {
    public final List a;

    public sxe(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxe) && Intrinsics.areEqual((Object) this.a, (Object) ((sxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("SkipAnyOf(containsAnyOf="), this.a, ")");
    }
}
