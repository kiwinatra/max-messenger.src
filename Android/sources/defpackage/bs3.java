package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bs3  reason: default package */
public final class bs3 extends ykd {
    public final boolean X = false;
    public final CharSequence Y;
    public final int Z;
    public final long c;
    public final CharSequence o;
    public final CharSequence v;
    public final long v0;
    public final boolean w;
    public final boolean x;
    public final List y;
    public final Uri z;

    public bs3(long j, CharSequence charSequence, CharSequence charSequence2, boolean z2, boolean z3, List list, Uri uri, CharSequence charSequence3) {
        super(xkd.c, list);
        this.c = j;
        this.o = charSequence;
        this.v = charSequence2;
        this.w = z2;
        this.x = z3;
        this.y = list;
        this.z = uri;
        this.Y = charSequence3;
        this.Z = hra.m;
        this.v0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs3)) {
            return false;
        }
        bs3 bs3 = (bs3) obj;
        return this.c == bs3.c && Intrinsics.areEqual((Object) this.o, (Object) bs3.o) && Intrinsics.areEqual((Object) this.v, (Object) bs3.v) && this.w == bs3.w && this.x == bs3.x && Intrinsics.areEqual((Object) this.y, (Object) bs3.y) && Intrinsics.areEqual((Object) this.z, (Object) bs3.z) && this.X == bs3.X && Intrinsics.areEqual((Object) this.Y, (Object) bs3.Y);
    }

    public final long getItemId() {
        return this.v0;
    }

    public final boolean h(ykd ykd) {
        return Intrinsics.areEqual((Object) this, (Object) (bs3) ykd);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.v;
        int i2 = rae.i(this.y, g63.e(g63.e((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.w), 31, this.x), 31);
        Uri uri = this.z;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.Y.hashCode() + g63.e((i2 + i) * 31, 31, this.X);
    }

    public final int i() {
        return this.Z;
    }

    public final boolean n(ykd ykd) {
        return this.v0 == ykd.getItemId();
    }

    public final String toString() {
        return "ContactSearchModel(id=" + this.c + ", title=" + this.o + ", subtitle=" + this.v + ", isOnline=" + this.w + ", isVerified=" + this.x + ", contactHighlights=" + this.y + ", avatar=" + this.z + ", selected=" + this.X + ", abbreviation=" + this.Y + ")";
    }
}
