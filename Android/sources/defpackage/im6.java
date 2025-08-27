package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: im6  reason: default package */
public final class im6 implements nm6 {
    public final List a;

    public im6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im6) && Intrinsics.areEqual((Object) this.a, (Object) ((im6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("OnSelectionChanged(items="), this.a, ")");
    }
}
