package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io9  reason: default package */
public final class io9 implements jo9 {
    public final long a;
    public final String b;

    public io9(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io9)) {
            return false;
        }
        io9 io9 = (io9) obj;
        return this.a == io9.a && Intrinsics.areEqual((Object) this.b, (Object) io9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFailed(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
