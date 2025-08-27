package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q02  reason: default package */
public final class q02 {
    public final ngf a;
    public final Integer b;

    public q02(igf igf, Integer num) {
        this.a = igf;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q02)) {
            return false;
        }
        q02 q02 = (q02) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) q02.a) && Intrinsics.areEqual((Object) this.b, (Object) q02.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
