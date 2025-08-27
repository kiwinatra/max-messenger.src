package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: p87  reason: default package */
public final class p87 implements l43 {
    public static final p87 m = new p87(0, Uri.parse("error"), -1, -1, false, -1, (Uri) null, (v3d) null, false, (String) null, (Uri) null, 3328);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Uri g;
    public final v3d h;
    public final xdd i;
    public final boolean j;
    public final String k;
    public final Uri l;

    public p87(long j2, Uri uri, int i2, int i3, boolean z, int i4, Uri uri2, v3d v3d, boolean z2, String str, Uri uri3, int i5) {
        int i6 = i5;
        Uri uri4 = null;
        v3d v3d2 = (i6 & Uuid.SIZE_BITS) != 0 ? null : v3d;
        ydd ydd = ydd.m;
        String str2 = (i6 & 1024) != 0 ? null : str;
        uri4 = (i6 & 2048) == 0 ? uri3 : uri4;
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = uri2;
        this.h = v3d2;
        this.i = ydd;
        this.j = z2;
        this.k = str2;
        this.l = uri4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p87)) {
            return false;
        }
        p87 p87 = (p87) obj;
        return this.a == p87.a && Intrinsics.areEqual((Object) this.b, (Object) p87.b) && this.c == p87.c && this.d == p87.d && this.e == p87.e && this.f == p87.f && Intrinsics.areEqual((Object) this.g, (Object) p87.g) && Intrinsics.areEqual((Object) this.h, (Object) p87.h) && Intrinsics.areEqual((Object) this.i, (Object) p87.i) && this.j == p87.j && Intrinsics.areEqual((Object) this.k, (Object) p87.k) && Intrinsics.areEqual((Object) this.l, (Object) p87.l);
    }

    public final int hashCode() {
        int h2 = rae.h(this.f, g63.e(rae.h(this.d, rae.h(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31);
        int i2 = 0;
        Uri uri = this.g;
        int hashCode = (h2 + (uri == null ? 0 : uri.hashCode())) * 31;
        v3d v3d = this.h;
        int e2 = g63.e((this.i.hashCode() + ((hashCode + (v3d == null ? 0 : v3d.hashCode())) * 31)) * 31, 31, this.j);
        String str = this.k;
        int hashCode2 = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String j() {
        return this.k;
    }

    public final String toString() {
        return "ImageAttachConfig(photoId=" + this.a + ", uri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", isGif=" + this.e + ", maxImageViewHeight=" + this.f + ", lowResUri=" + this.g + ", resizeOptions=" + this.h + ", scaleType=" + this.i + ", isAutoLoadImageDisabled=" + this.j + ", attachId=" + this.k + ", gifUri=" + this.l + ")";
    }
}
