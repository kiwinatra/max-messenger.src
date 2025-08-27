package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pm6  reason: default package */
public final class pm6 {
    public final wk6 a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Integer g;
    public final int h;
    public final v3d i;
    public final qa7 j;
    public final jnb k;

    public pm6(wk6 wk6, boolean z, String str, String str2, String str3, Uri uri, Integer num, int i2, v3d v3d) {
        qa7 qa7;
        this.a = wk6;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = uri;
        this.g = num;
        this.h = i2;
        this.i = v3d;
        jnb jnb = null;
        if (uri != null) {
            ra7 d2 = ra7.d(uri);
            if (!(num == null || num.intValue() == 0)) {
                d2.l = new efb(num.intValue(), 0);
            }
            d2.d = v3d;
            qa7 = d2.a();
        } else {
            qa7 = null;
        }
        this.j = qa7;
        if (qa7 != null) {
            knb a2 = ld9.p.get();
            a2.e = qa7;
            jnb = a2.a();
        }
        this.k = jnb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm6)) {
            return false;
        }
        pm6 pm6 = (pm6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pm6.a) && this.b == pm6.b && Intrinsics.areEqual((Object) this.c, (Object) pm6.c) && Intrinsics.areEqual((Object) this.d, (Object) pm6.d) && Intrinsics.areEqual((Object) this.e, (Object) pm6.e) && Intrinsics.areEqual((Object) this.f, (Object) pm6.f) && Intrinsics.areEqual((Object) this.g, (Object) pm6.g) && this.h == pm6.h && Intrinsics.areEqual((Object) this.i, (Object) pm6.i);
    }

    public final int hashCode() {
        int d2 = g63.d(g63.d(g63.d(g63.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i2 = 0;
        Uri uri = this.f;
        int hashCode = (d2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Integer num = this.g;
        if (num != null) {
            i2 = num.hashCode();
        }
        return this.i.hashCode() + rae.h(this.h, (hashCode + i2) * 31, 31);
    }

    public final String toString() {
        return "GalleryUiAlbum(origin=" + this.a + ", selected=" + this.b + ", title=" + this.c + ", emptyStateTitle=" + this.d + ", emptyStateSubtitle=" + this.e + ", coverUri=" + this.f + ", coverOrientation=" + this.g + ", textColor=" + this.h + ", resizeOptions=" + this.i + ")";
    }
}
