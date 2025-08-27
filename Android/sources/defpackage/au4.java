package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: au4  reason: default package */
public final class au4 {
    public final st4 a;
    public final String b;
    public final long c;
    public final xyf d;
    public final p4g e;

    public au4(st4 st4, String str, long j, xyf xyf, p4g p4g) {
        this.a = st4;
        this.b = str;
        this.c = j;
        this.d = xyf;
        this.e = p4g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au4)) {
            return false;
        }
        au4 au4 = (au4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) au4.a) && Intrinsics.areEqual((Object) this.b, (Object) au4.b) && this.c == au4.c && this.d == au4.d && Intrinsics.areEqual((Object) this.e, (Object) au4.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + wzf.i(g63.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        p4g p4g = this.e;
        return hashCode + (p4g == null ? 0 : p4g.hashCode());
    }

    public final String toString() {
        return "DraftUpload(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + this.d + ", videoConvertOptions=" + this.e + ")";
    }
}
