package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n82  reason: default package */
public final class n82 {
    public final long a;
    public final long b;
    public final m72 c;
    public final long d;
    public final long e;
    public final long f;

    public n82(long j, long j2, m72 m72, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = m72;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n82)) {
            return false;
        }
        n82 n82 = (n82) obj;
        return this.a == n82.a && this.b == n82.b && Intrinsics.areEqual((Object) this.c, (Object) n82.c) && this.d == n82.d && this.e == n82.e && this.f == n82.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + wzf.i(wzf.i((this.c.hashCode() + wzf.i(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatEntity(id=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", chatData=");
        sb.append(this.c);
        sb.append(", favouriteIndex=");
        sb.append(this.d);
        sb.append(", sortTime=");
        sb.append(this.e);
        sb.append(", cid=");
        return wj6.m(sb, this.f, ")");
    }
}
