package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xa2  reason: default package */
public final class xa2 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public xa2(String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2 = (xa2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xa2.a) && this.b == xa2.b && Intrinsics.areEqual((Object) this.c, (Object) xa2.c) && Intrinsics.areEqual((Object) this.d, (Object) xa2.d) && this.e == xa2.e && this.f == xa2.f && this.g == xa2.g;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + g63.e(g63.e(g63.d(g63.d(wzf.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatItemModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", chatName=");
        sb.append(this.c);
        sb.append(", chatLink=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", isPrivate=");
        sb.append(this.f);
        sb.append(", hasEditLinkPermission=");
        return tr1.m(sb, this.g, ")");
    }
}
