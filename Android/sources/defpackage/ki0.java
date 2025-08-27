package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ki0  reason: default package */
public final class ki0 {
    public final long a;
    public final qaf b;

    public ki0(long j, qaf qaf) {
        this.a = j;
        this.b = qaf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0 = (ki0) obj;
        return this.a == ki0.a && Intrinsics.areEqual((Object) this.b, (Object) ki0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
