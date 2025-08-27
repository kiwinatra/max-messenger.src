package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ho9  reason: default package */
public final class ho9 implements jo9 {
    public final long a;
    public final String b;

    public ho9(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho9)) {
            return false;
        }
        ho9 ho9 = (ho9) obj;
        return this.a == ho9.a && Intrinsics.areEqual((Object) this.b, (Object) ho9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleted(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
