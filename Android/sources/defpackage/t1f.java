package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t1f  reason: default package */
public final class t1f {
    public final tze a;
    public final boolean b;

    public t1f(tze tze, boolean z) {
        this.a = tze;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1f)) {
            return false;
        }
        t1f t1f = (t1f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) t1f.a) && this.b == t1f.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
