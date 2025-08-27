package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb  reason: default package */
public final class cb {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public cb(int i, long j, long j2, String str) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.a == cbVar.a && this.b == cbVar.b && this.c == cbVar.c && Intrinsics.areEqual((Object) this.d, (Object) cbVar.d);
    }

    public final int hashCode() {
        int i = wzf.i(rae.h(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant(id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias=");
        return wj6.n(sb, this.d, ")");
    }
}
