package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y29  reason: default package */
public final class y29 implements lz7 {
    public final boolean X;
    public final long a;
    public final CharSequence b;
    public final ngf c;
    public final String o;
    public final boolean v;
    public final long w;
    public final CharSequence x;
    public final hqc y;
    public final boolean z;

    public y29(long j, CharSequence charSequence, ngf ngf, String str, boolean z2, long j2, CharSequence charSequence2, hqc hqc, boolean z3, boolean z4) {
        this.a = j;
        this.b = charSequence;
        this.c = ngf;
        this.o = str;
        this.v = z2;
        this.w = j2;
        this.x = charSequence2;
        this.y = hqc;
        this.z = z3;
        this.X = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y29)) {
            return false;
        }
        y29 y29 = (y29) obj;
        return this.a == y29.a && Intrinsics.areEqual((Object) this.b, (Object) y29.b) && Intrinsics.areEqual((Object) this.c, (Object) y29.c) && Intrinsics.areEqual((Object) this.o, (Object) y29.o) && this.v == y29.v && this.w == y29.w && Intrinsics.areEqual((Object) this.x, (Object) y29.x) && Intrinsics.areEqual((Object) this.y, (Object) y29.y) && this.z == y29.z && this.X == y29.X;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int e = wj6.e(this.x, wzf.i(g63.e(g63.d(i2a.g(wj6.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.o), 31, this.v), 31, this.w), 31);
        hqc hqc = this.y;
        return Boolean.hashCode(this.X) + g63.e((e + (hqc == null ? 0 : hqc.hashCode())) * 31, 31, this.z);
    }

    public final int i() {
        return cwa.F;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (!(lz7 instanceof y29)) {
            return null;
        }
        hqc hqc = this.y;
        hqc hqc2 = ((y29) lz7).y;
        if (!Intrinsics.areEqual((Object) hqc, (Object) hqc2)) {
            return new x29(hqc2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.v);
        sb.append(", lastReadMark=");
        sb.append(this.w);
        sb.append(", abbreviation=");
        sb.append(this.x);
        sb.append(", reaction=");
        sb.append(this.y);
        sb.append(", isRead=");
        sb.append(this.z);
        sb.append(", isSelf=");
        return tr1.m(sb, this.X, ")");
    }
}
