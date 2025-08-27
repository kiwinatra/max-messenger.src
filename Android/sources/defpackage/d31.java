package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: d31  reason: default package */
public final class d31 extends ij0 {
    public final long b;
    public final String c;
    public final long o;
    public final String v;

    public d31(String str, String str2, long j, long j2) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d31)) {
            return false;
        }
        d31 d31 = (d31) obj;
        return this.b == d31.b && Intrinsics.areEqual((Object) this.c, (Object) d31.c) && this.o == d31.o && Intrinsics.areEqual((Object) this.v, (Object) d31.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + wzf.i(g63.d(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallCreateJoinLinkEvent(requestId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", peerId=");
        sb.append(this.o);
        sb.append(", joinLink=");
        return wj6.n(sb, this.v, ")");
    }
}
