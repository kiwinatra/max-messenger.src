package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l29  reason: default package */
public final class l29 extends m29 {
    public final boolean X;
    public final long a;
    public final long b;
    public final long c;
    public final Uri o;
    public final k29 v;
    public final Long w;
    public final String x;
    public final boolean y;
    public final Uri z;

    public l29(long j, long j2, long j3, Uri uri, k29 k29, Long l, String str, boolean z2, Uri uri2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = uri;
        this.v = k29;
        this.w = l;
        this.x = str;
        this.y = z2;
        this.z = uri2;
        this.X = z3;
        Parcelable.Creator<eg2> creator = eg2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l29)) {
            return false;
        }
        l29 l29 = (l29) obj;
        return this.a == l29.a && this.b == l29.b && this.c == l29.c && Intrinsics.areEqual((Object) this.o, (Object) l29.o) && this.v == l29.v && Intrinsics.areEqual((Object) this.w, (Object) l29.w) && Intrinsics.areEqual((Object) this.x, (Object) l29.x) && this.y == l29.y && Intrinsics.areEqual((Object) this.z, (Object) l29.z) && this.X == l29.X;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i2 = 0;
        Uri uri = this.o;
        int hashCode = (this.v.hashCode() + ((i + (uri == null ? 0 : uri.hashCode())) * 31)) * 31;
        Long l = this.w;
        int e = g63.e(g63.d((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.x), 31, this.y);
        Uri uri2 = this.z;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return Boolean.hashCode(this.X) + ((e + i2) * 31);
    }

    public final int i() {
        return 0;
    }

    public final long j() {
        return this.c;
    }

    public final long m() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoVideo(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUri=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.v);
        sb.append(", duration=");
        sb.append(this.w);
        sb.append(", attachLocalId=");
        sb.append(this.x);
        sb.append(", isInCollage=");
        sb.append(this.y);
        sb.append(", lowResUri=");
        sb.append(this.z);
        sb.append(", isAutoloadDisabled=");
        return tr1.m(sb, this.X, ")");
    }
}
