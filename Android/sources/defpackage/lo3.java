package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: lo3  reason: default package */
public final class lo3 implements tzb {
    public final long a;
    public final String b;
    public final ngf c;
    public final String o;
    public final boolean v;
    public final CharSequence w;
    public final eyb x;
    public final int y;
    public final boolean z;

    public lo3(long j, String str, ngf ngf, String str2, boolean z2, CharSequence charSequence, eyb eyb, int i, boolean z3, int i2) {
        i = (i2 & Uuid.SIZE_BITS) != 0 ? 32768 : i;
        z3 = (i2 & 256) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = ngf;
        this.o = str2;
        this.v = z2;
        this.w = charSequence;
        this.x = eyb;
        this.y = i;
        this.z = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3 = (lo3) obj;
        return this.a == lo3.a && Intrinsics.areEqual((Object) this.b, (Object) lo3.b) && Intrinsics.areEqual((Object) this.c, (Object) lo3.c) && Intrinsics.areEqual((Object) this.o, (Object) lo3.o) && this.v == lo3.v && Intrinsics.areEqual((Object) this.w, (Object) lo3.w) && this.x == lo3.x && tf6.D(this.y, lo3.y) && this.z == lo3.z;
    }

    public final boolean f(lz7 lz7) {
        return this.a == lz7.getItemId();
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int e = wj6.e(this.w, g63.e(g63.d(i2a.g(g63.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.v), 31);
        return Boolean.hashCode(this.z) + rae.h(this.y, (this.x.hashCode() + e) * 31, 31);
    }

    public final int i() {
        return this.y;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        String p0 = tf6.p0(this.y);
        StringBuilder sb = new StringBuilder("ContactInfoItem(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.v);
        sb.append(", abbreviation=");
        sb.append(this.w);
        sb.append(", type=");
        sb.append(this.x);
        sb.append(", itemViewType=");
        sb.append(p0);
        sb.append(", newPermissions=");
        return tr1.m(sb, this.z, ")");
    }
}
