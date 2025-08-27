package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pkd  reason: default package */
public final class pkd implements qkd {
    public final sk2 a;

    public pkd(sk2 sk2) {
        this.a = sk2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkd) && Intrinsics.areEqual((Object) this.a, (Object) ((pkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchResult(result=" + this.a + ")";
    }
}
