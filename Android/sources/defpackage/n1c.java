package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n1c  reason: default package */
public final class n1c implements p1c {
    public final Long a;

    public n1c(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1c) && Intrinsics.areEqual((Object) this.a, (Object) ((n1c) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "UpdateSuccess(requestId=" + this.a + ")";
    }
}
