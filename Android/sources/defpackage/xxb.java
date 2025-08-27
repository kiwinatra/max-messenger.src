package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xxb  reason: default package */
public final class xxb implements yxb {
    public final ngf a;
    public final Integer b;

    public xxb(igf igf, Integer num) {
        this.a = igf;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxb)) {
            return false;
        }
        xxb xxb = (xxb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xxb.a) && Intrinsics.areEqual((Object) this.b, (Object) xxb.b);
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
