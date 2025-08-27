package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: okd  reason: default package */
public final class okd implements qkd {
    public final hj0 a;

    public okd(hj0 hj0) {
        this.a = hj0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okd) && Intrinsics.areEqual((Object) this.a, (Object) ((okd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchError(event=" + this.a + ")";
    }
}
