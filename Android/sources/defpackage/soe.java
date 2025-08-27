package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: soe  reason: default package */
public final class soe {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;

    public soe(long j2, long j3, int i2, int i3, String str, long j4, String str2, String str3, String str4, List list, int i4, long j5, String str5, boolean z, int i5) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = j4;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i4;
        this.l = j5;
        this.m = str5;
        this.n = z;
        this.o = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soe)) {
            return false;
        }
        soe soe = (soe) obj;
        return this.a == soe.a && this.b == soe.b && this.c == soe.c && this.d == soe.d && Intrinsics.areEqual((Object) this.e, (Object) soe.e) && this.f == soe.f && Intrinsics.areEqual((Object) this.g, (Object) soe.g) && Intrinsics.areEqual((Object) this.h, (Object) soe.h) && Intrinsics.areEqual((Object) this.i, (Object) soe.i) && Intrinsics.areEqual((Object) this.j, (Object) soe.j) && this.k == soe.k && this.l == soe.l && Intrinsics.areEqual((Object) this.m, (Object) soe.m) && this.n == soe.n && this.o == soe.o;
    }

    public final int hashCode() {
        int h2 = rae.h(this.d, rae.h(this.c, wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        int i2 = 0;
        String str = this.e;
        int i3 = wzf.i((h2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int i4 = wzf.i((tr1.y(this.k) + rae.i(this.j, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31)) * 31, 31, this.l);
        String str5 = this.m;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return tr1.y(this.o) + g63.e((i4 + i2) * 31, 31, this.n);
    }

    public final String toString() {
        return "StickerEntity(id=" + this.a + ", stickerId=" + this.b + ", width=" + this.c + ", height=" + this.d + ", url=" + this.e + ", updateTime=" + this.f + ", mp4Url=" + this.g + ", firstUrl=" + this.h + ", previewUrl=" + this.i + ", tags=" + this.j + ", stickerType=" + rae.A(this.k) + ", setId=" + this.l + ", lottieUrl=" + this.m + ", audio=" + this.n + ", authorType=" + rae.z(this.o) + ")";
    }
}
