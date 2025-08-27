package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gid  reason: default package */
public final class gid {
    public final long a;
    public final long b;
    public final hqc c;

    public gid(long j, long j2, hqc hqc) {
        this.a = j;
        this.b = j2;
        this.c = hqc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gid)) {
            return false;
        }
        gid gid = (gid) obj;
        return this.a == gid.a && this.b == gid.b && Intrinsics.areEqual((Object) this.c, (Object) gid.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ReactionInfo(messageServerId=" + this.a + ", messageTime=" + this.b + ", reaction=" + this.c + ")";
    }
}
