package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1c  reason: default package */
public final class l1c {
    public final Long a;
    public final ngf b;

    public l1c(Long l, ngf ngf) {
        this.a = l;
        this.b = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1c)) {
            return false;
        }
        l1c l1c = (l1c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l1c.a) && Intrinsics.areEqual((Object) this.b, (Object) l1c.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
