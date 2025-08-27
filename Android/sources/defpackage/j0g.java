package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j0g  reason: default package */
public final class j0g implements jm1 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final boolean d;
    public final String e;

    public j0g(long j, String str, CharSequence charSequence, boolean z, String str2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = z;
        this.e = str2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0g)) {
            return false;
        }
        j0g j0g = (j0g) obj;
        return this.a == j0g.a && Intrinsics.areEqual((Object) this.b, (Object) j0g.b) && Intrinsics.areEqual((Object) this.c, (Object) j0g.c) && this.d == j0g.d && Intrinsics.areEqual((Object) this.e, (Object) j0g.e);
    }

    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int e2 = g63.e(wj6.e(this.c, g63.d(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return e2 + (str == null ? 0 : str.hashCode());
    }

    public final CharSequence i() {
        return this.c;
    }

    public final String o() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(serverId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append(this.c);
        sb.append(", isUnknown=");
        sb.append(this.d);
        sb.append(", avatar=");
        return wj6.n(sb, this.e, ")");
    }
}
