package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d6c  reason: default package */
public final class d6c extends h6c {
    public final List a;

    public d6c(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d6c) && Intrinsics.areEqual((Object) this.a, (Object) ((d6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ShowMoreMenu(actions="), this.a, ")");
    }
}
