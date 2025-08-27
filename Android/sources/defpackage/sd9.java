package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sd9  reason: default package */
public final class sd9 {
    public final long a;
    public final hqc b;

    public sd9(long j, hqc hqc) {
        this.a = j;
        this.b = hqc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd9)) {
            return false;
        }
        sd9 sd9 = (sd9) obj;
        return this.a == sd9.a && Intrinsics.areEqual((Object) this.b, (Object) sd9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntryData(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
