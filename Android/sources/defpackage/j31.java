package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j31  reason: default package */
public final class j31 implements l31 {
    public final pn1 a;

    public j31(pn1 pn1) {
        this.a = pn1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j31) && Intrinsics.areEqual((Object) this.a, (Object) ((j31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Active(state=" + this.a + ")";
    }
}
