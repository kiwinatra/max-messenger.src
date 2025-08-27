package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p7a  reason: default package */
public final class p7a {
    public final long a;
    public final String b;
    public final Boolean c;

    public p7a(long j, String str, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7a)) {
            return false;
        }
        p7a p7a = (p7a) obj;
        return this.a == p7a.a && Intrinsics.areEqual((Object) this.b, (Object) p7a.b) && Intrinsics.areEqual((Object) this.c, (Object) p7a.c);
    }

    public final int hashCode() {
        int d = g63.d(Long.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        return d + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarInfo(id=" + this.a + ", url=" + this.b + ", default=" + this.c + ")";
    }
}
