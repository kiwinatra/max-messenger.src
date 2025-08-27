package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g4b  reason: default package */
public final class g4b extends h4b {
    public final long a;
    public final String b;

    public g4b(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4b)) {
            return false;
        }
        g4b g4b = (g4b) obj;
        return this.a == g4b.a && Intrinsics.areEqual((Object) this.b, (Object) g4b.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
