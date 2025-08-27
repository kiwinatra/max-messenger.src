package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae2  reason: default package */
public final class ae2 implements fe2 {
    public final long a;
    public final String b;

    public ae2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae2)) {
            return false;
        }
        ae2 ae2 = (ae2) obj;
        return this.a == ae2.a && Intrinsics.areEqual((Object) this.b, (Object) ae2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadComplete(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
