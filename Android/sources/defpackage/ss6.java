package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ss6  reason: default package */
public final class ss6 extends ykd {
    public final mtb X;
    public final fo3 Y;
    public final List Z;
    public final long c;
    public final CharSequence o;
    public final isb v;
    public final boolean v0 = false;
    public final isb w;
    public final int w0 = hra.p;
    public final boolean x;
    public final long x0;
    public final boolean y;
    public final Uri z;

    public ss6(long j, String str, isb isb, isb isb2, boolean z2, boolean z3, Uri uri, mtb mtb, fo3 fo3, List list) {
        super(xkd.o, list);
        this.c = j;
        this.o = str;
        this.v = isb;
        this.w = isb2;
        this.x = z2;
        this.y = z3;
        this.z = uri;
        this.X = mtb;
        this.Y = fo3;
        this.Z = list;
        this.x0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss6)) {
            return false;
        }
        ss6 ss6 = (ss6) obj;
        return this.c == ss6.c && Intrinsics.areEqual((Object) this.o, (Object) ss6.o) && Intrinsics.areEqual((Object) this.v, (Object) ss6.v) && Intrinsics.areEqual((Object) this.w, (Object) ss6.w) && this.x == ss6.x && this.y == ss6.y && Intrinsics.areEqual((Object) this.z, (Object) ss6.z) && Intrinsics.areEqual((Object) this.X, (Object) ss6.X) && Intrinsics.areEqual((Object) this.Y, (Object) ss6.Y) && Intrinsics.areEqual((Object) this.Z, (Object) ss6.Z) && this.v0 == ss6.v0;
    }

    public final long getItemId() {
        return this.x0;
    }

    public final boolean h(ykd ykd) {
        return Intrinsics.areEqual((Object) this, (Object) (ss6) ykd);
    }

    public final int hashCode() {
        int e = g63.e(g63.e((this.w.hashCode() + ((this.v.hashCode() + wj6.e(this.o, Long.hashCode(this.c) * 31, 31)) * 31)) * 31, 31, this.x), 31, this.y);
        Uri uri = this.z;
        int hashCode = uri == null ? 0 : uri.hashCode();
        int hashCode2 = this.X.hashCode();
        return Boolean.hashCode(this.v0) + rae.i(this.Z, (this.Y.hashCode() + ((hashCode2 + ((e + hashCode) * 31)) * 31)) * 31, 31);
    }

    public final int i() {
        return this.w0;
    }

    public final boolean n(ykd ykd) {
        return this.x0 == ykd.getItemId();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalContactSearchModel(id=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.v);
        sb.append(", subtitle=");
        sb.append(this.w);
        sb.append(", isOnline=");
        sb.append(this.x);
        sb.append(", isVerified=");
        sb.append(this.y);
        sb.append(", avatar=");
        sb.append(this.z);
        sb.append(", presence=");
        sb.append(this.X);
        sb.append(", contactInfo=");
        sb.append(this.Y);
        sb.append(", contactHighlights=");
        sb.append(this.Z);
        sb.append(", selected=");
        return tr1.m(sb, this.v0, ")");
    }
}
