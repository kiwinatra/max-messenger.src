package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d2c  reason: default package */
public final class d2c extends f2c {
    public final List a;

    public d2c(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2c) && Intrinsics.areEqual((Object) this.a, (Object) ((d2c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ShowMoreActions(actions="), this.a, ")");
    }
}
