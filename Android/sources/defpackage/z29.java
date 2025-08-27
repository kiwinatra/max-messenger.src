package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z29  reason: default package */
public final class z29 implements lz7 {
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final ngf o;
    public final Uri v;
    public final ngf v0;
    public final CharSequence w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public z29(long j, CharSequence charSequence, CharSequence charSequence2, ngf ngf, Uri uri, CharSequence charSequence3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, ngf ngf2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = ngf;
        this.v = uri;
        this.w = charSequence3;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.X = z5;
        this.Y = z6;
        this.Z = i;
        this.v0 = ngf2;
    }

    public static z29 h(z29 z29, boolean z2) {
        z29 z292 = z29;
        return new z29(z292.a, z292.b, z292.c, z292.o, z292.v, z292.w, z292.x, z292.y, z2, z292.X, z292.Y, z292.Z, z292.v0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z29)) {
            return false;
        }
        z29 z29 = (z29) obj;
        return this.a == z29.a && Intrinsics.areEqual((Object) this.b, (Object) z29.b) && Intrinsics.areEqual((Object) this.c, (Object) z29.c) && Intrinsics.areEqual((Object) this.o, (Object) z29.o) && Intrinsics.areEqual((Object) this.v, (Object) z29.v) && Intrinsics.areEqual((Object) this.w, (Object) z29.w) && this.x == z29.x && this.y == z29.y && this.z == z29.z && this.X == z29.X && this.Y == z29.Y && this.Z == z29.Z && Intrinsics.areEqual((Object) this.v0, (Object) z29.v0);
    }

    public final boolean f(lz7 lz7) {
        return this.a == lz7.getItemId();
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int e = wj6.e(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int g = i2a.g((e + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o);
        Uri uri = this.v;
        int h = rae.h(this.Z, g63.e(g63.e(g63.e(g63.e(g63.e(wj6.e(this.w, (g + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.x), 31, this.y), 31, this.z), 31, this.X), 31, this.Y), 31);
        ngf ngf = this.v0;
        if (ngf != null) {
            i = ngf.hashCode();
        }
        return h + i;
    }

    public final int i() {
        return 1;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", subtitle=" + this.o + ", avatar=" + this.v + ", abbreviation=" + this.w + ", isVerified=" + this.x + ", isSelf=" + this.y + ", isOwner=" + this.z + ", isEnabled=" + this.X + ", isSelectable=" + this.Y + ", presence=" + this.Z + ", alias=" + this.v0 + ")";
    }
}
