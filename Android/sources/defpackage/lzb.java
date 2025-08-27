package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lzb  reason: default package */
public final class lzb implements mzb {
    public final Long a;
    public final ngf b;

    public lzb(Long l, ngf ngf) {
        this.a = l;
        this.b = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb)) {
            return false;
        }
        lzb lzb = (lzb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) lzb.a) && Intrinsics.areEqual((Object) this.b, (Object) lzb.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
