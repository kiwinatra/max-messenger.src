package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: bb  reason: default package */
public final class bb implements lz7 {
    public final long a;
    public final CharSequence b;
    public final ngf c;
    public final String o;
    public final CharSequence v;
    public final boolean w;
    public final long x;

    public bb(long j, String str, ngf ngf, String str2, CharSequence charSequence, boolean z) {
        this.a = j;
        this.b = str;
        this.c = ngf;
        this.o = str2;
        this.v = charSequence;
        this.w = z;
        this.x = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && Intrinsics.areEqual((Object) this.b, (Object) bbVar.b) && Intrinsics.areEqual((Object) this.c, (Object) bbVar.c) && Intrinsics.areEqual((Object) this.o, (Object) bbVar.o) && Intrinsics.areEqual((Object) this.v, (Object) bbVar.v) && this.w == bbVar.w;
    }

    public final long getItemId() {
        return this.x;
    }

    public final int hashCode() {
        int e = wj6.e(this.b, Long.hashCode(this.a) * 31, 31);
        ngf ngf = this.c;
        return Boolean.hashCode(this.w) + wj6.e(this.v, g63.d((e + (ngf == null ? 0 : ngf.hashCode())) * 31, 31, this.o), 31);
    }

    public final int i() {
        return 0;
    }

    public final String toString() {
        return "AdminFromContactsItem(id=" + this.a + ", name=" + this.b + ", subtitle=" + this.c + ", avatar=" + this.o + ", abbreviation=" + this.v + ", isVerified=" + this.w + ")";
    }
}
