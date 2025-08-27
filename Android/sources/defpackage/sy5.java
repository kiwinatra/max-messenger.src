package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sy5  reason: default package */
public final class sy5 implements ty5 {
    public final List a;

    public sy5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy5) && Intrinsics.areEqual((Object) this.a, (Object) ((sy5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("OpenPicker(includes="), this.a, ")");
    }
}
