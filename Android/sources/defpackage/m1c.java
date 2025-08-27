package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m1c  reason: default package */
public final class m1c implements p1c {
    public final Long a;
    public final ngf b;

    public m1c(Long l, ngf ngf) {
        this.a = l;
        this.b = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1c)) {
            return false;
        }
        m1c m1c = (m1c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) m1c.a) && Intrinsics.areEqual((Object) this.b, (Object) m1c.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
