package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kxb  reason: default package */
public final class kxb {
    public final long a;
    public final CharSequence b;
    public final ngf c;
    public final String d;
    public final long e;
    public final CharSequence f;

    public kxb(long j, CharSequence charSequence, mgf mgf, String str, long j2, CharSequence charSequence2) {
        this.a = j;
        this.b = charSequence;
        this.c = mgf;
        this.d = str;
        this.e = j2;
        this.f = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxb)) {
            return false;
        }
        kxb kxb = (kxb) obj;
        return this.a == kxb.a && Intrinsics.areEqual((Object) this.b, (Object) kxb.b) && Intrinsics.areEqual((Object) this.c, (Object) kxb.c) && Intrinsics.areEqual((Object) this.d, (Object) kxb.d) && this.e == kxb.e && Intrinsics.areEqual((Object) this.f, (Object) kxb.f);
    }

    public final int hashCode() {
        int g = i2a.g(wj6.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + wzf.i(g63.e((g + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.e);
    }

    public final String toString() {
        return "ProfileContactCellItem(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarUrl=" + this.d + ", isOnline=false, avatarSourceId=" + this.e + ", abbreviation=" + this.f + ")";
    }
}
