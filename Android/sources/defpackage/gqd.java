package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gqd  reason: default package */
public final class gqd {
    public final fqd a;
    public final rnb b;

    public gqd(fqd fqd, rnb rnb) {
        this.a = fqd;
        this.b = rnb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqd)) {
            return false;
        }
        gqd gqd = (gqd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gqd.a) && Intrinsics.areEqual((Object) this.b, (Object) gqd.b);
    }

    public final int hashCode() {
        fqd fqd = this.a;
        return this.b.hashCode() + ((fqd == null ? 0 : fqd.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
