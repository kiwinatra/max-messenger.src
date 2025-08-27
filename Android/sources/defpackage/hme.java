package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: hme  reason: default package */
public final class hme {
    public final long a;
    public final r78 b;
    public final n78 c;
    public final boolean d;

    public hme(long j, n78 n78, r78 r78, boolean z) {
        this.a = j;
        this.b = r78;
        this.c = n78;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hme)) {
            return false;
        }
        hme hme = (hme) obj;
        return this.a == hme.a && this.b == hme.b && Intrinsics.areEqual((Object) this.c, (Object) hme.c) && this.d == hme.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(this.d) + ((hashCode2 + ((hashCode + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatEntity(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", isCritical=");
        return tr1.m(sb, this.d, ")");
    }
}
