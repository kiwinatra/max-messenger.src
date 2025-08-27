package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vpg  reason: default package */
public final class vpg {
    public String a;
    public xog b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpg)) {
            return false;
        }
        vpg vpg = (vpg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vpg.a) && this.b == vpg.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
