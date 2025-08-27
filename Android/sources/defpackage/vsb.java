package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vsb  reason: default package */
public final class vsb {
    public final String a;
    public final Long b;

    public vsb(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsb)) {
            return false;
        }
        vsb vsb = (vsb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vsb.a) && Intrinsics.areEqual((Object) this.b, (Object) vsb.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
