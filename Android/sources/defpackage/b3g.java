package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* renamed from: b3g  reason: default package */
public final class b3g implements l43 {
    public static final b3g k = new b3g(0, Uri.EMPTY, -1, -1, -1, Duration.Companion.m1456getZEROUwyO8pc(), (String) null, (Uri) null, (v3d) null, d20.a);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final Uri h;
    public final v3d i;
    public final d20 j;

    public b3g(long j2, Uri uri, int i2, int i3, int i4, long j3, String str, Uri uri2, v3d v3d, d20 d20) {
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j3;
        this.g = str;
        this.h = uri2;
        this.i = v3d;
        this.j = d20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3g)) {
            return false;
        }
        b3g b3g = (b3g) obj;
        return this.a == b3g.a && Intrinsics.areEqual((Object) this.b, (Object) b3g.b) && this.c == b3g.c && this.d == b3g.d && this.e == b3g.e && Duration.m1358equalsimpl0(this.f, b3g.f) && Intrinsics.areEqual((Object) this.g, (Object) b3g.g) && Intrinsics.areEqual((Object) this.h, (Object) b3g.h) && Intrinsics.areEqual((Object) this.i, (Object) b3g.i) && this.j == b3g.j;
    }

    public final int hashCode() {
        int r2 = (Duration.m1381hashCodeimpl(this.f) + rae.h(this.e, rae.h(this.d, rae.h(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31)) * 31;
        int i2 = 0;
        String str = this.g;
        int hashCode = (r2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.h;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        v3d v3d = this.i;
        if (v3d != null) {
            i2 = v3d.hashCode();
        }
        return this.j.hashCode() + ((hashCode2 + i2) * 31);
    }

    public final String j() {
        return this.g;
    }

    public final String toString() {
        String r0 = Duration.m1402toStringimpl(this.f);
        return "VideoAttachConfig(videoId=" + this.a + ", previewUri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", maxImageViewHeight=" + this.e + ", duration=" + r0 + ", attachId=" + this.g + ", lowResUri=" + this.h + ", previewResizeOptions=" + this.i + ", status=" + this.j + ")";
    }
}
