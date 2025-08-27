package defpackage;

import android.net.Uri;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sm6  reason: default package */
public final class sm6 extends um6 {
    public final k48 b;
    public int c;
    public final long d;
    public final boolean e;
    public final Uri f;
    public final int g;
    public final Uri h;
    public final v3d i;
    public final p4g j;
    public final dfb k;
    public final long l;
    public final qa7 m;

    public sm6(k48 k48, int i2, long j2, boolean z, Uri uri, int i3, Uri uri2, v3d v3d, p4g p4g, dfb dfb) {
        super(10);
        this.b = k48;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = uri;
        this.g = i3;
        this.h = uri2;
        this.i = v3d;
        this.j = p4g;
        this.k = dfb;
        Long l2 = k48.x;
        this.l = l2 != null ? l2.longValue() : 0;
        ra7 d2 = ra7.d(uri2);
        d2.i = true;
        d2.d = v3d;
        if (i3 != 0) {
            d2.l = new efb(i3, 0);
        }
        if (uri != null) {
            d2.l = new o6b(uri);
        }
        this.m = d2.a();
    }

    public static sm6 b(sm6 sm6, int i2, Uri uri, int i3, Uri uri2, p4g p4g, dfb dfb, int i4) {
        sm6 sm62 = sm6;
        int i5 = i4;
        k48 k48 = sm62.b;
        int i6 = (i5 & 2) != 0 ? sm62.c : i2;
        long j2 = sm62.d;
        boolean z = sm62.e;
        Uri uri3 = (i5 & 16) != 0 ? sm62.f : uri;
        int i7 = (i5 & 32) != 0 ? sm62.g : i3;
        Uri uri4 = (i5 & 64) != 0 ? sm62.h : uri2;
        v3d v3d = sm62.i;
        p4g p4g2 = (i5 & 256) != 0 ? sm62.j : p4g;
        dfb dfb2 = (i5 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? sm62.k : dfb;
        sm6.getClass();
        return new sm6(k48, i6, j2, z, uri3, i7, uri4, v3d, p4g2, dfb2);
    }

    public final Long a() {
        return Long.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm6)) {
            return false;
        }
        sm6 sm6 = (sm6) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) sm6.b) && this.c == sm6.c && this.d == sm6.d && this.e == sm6.e && Intrinsics.areEqual((Object) this.f, (Object) sm6.f) && this.g == sm6.g && Intrinsics.areEqual((Object) this.h, (Object) sm6.h) && Intrinsics.areEqual((Object) this.i, (Object) sm6.i) && Intrinsics.areEqual((Object) this.j, (Object) sm6.j) && Intrinsics.areEqual((Object) this.k, (Object) sm6.k);
    }

    public final int hashCode() {
        int e2 = g63.e(wzf.i(rae.h(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
        int i2 = 0;
        Uri uri = this.f;
        int hashCode = (this.i.hashCode() + ((this.h.hashCode() + rae.h(this.g, (e2 + (uri == null ? 0 : uri.hashCode())) * 31, 31)) * 31)) * 31;
        p4g p4g = this.j;
        int hashCode2 = (hashCode + (p4g == null ? 0 : p4g.hashCode())) * 31;
        dfb dfb = this.k;
        if (dfb != null) {
            i2 = dfb.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        int i2 = this.c;
        return "Media(origin=" + this.b + ", selectionNumber=" + i2 + ", id=" + this.d + ", multiSelect=" + this.e + ", overlay=" + this.f + ", rotation=" + this.g + ", thumbnailUri=" + this.h + ", resizeOptions=" + this.i + ", videoConvertOptions=" + this.j + ", photoEditorOptions=" + this.k + ")";
    }
}
