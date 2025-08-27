package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cu4  reason: default package */
public final class cu4 {
    public final tt4 a;
    public final String b;
    public final long c;
    public final xyf d;
    public final i20 e;

    public cu4(tt4 tt4, String str, long j, xyf xyf, i20 i20) {
        this.a = tt4;
        this.b = str;
        this.c = j;
        this.d = xyf;
        this.e = i20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu4)) {
            return false;
        }
        cu4 cu4 = (cu4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) cu4.a) && Intrinsics.areEqual((Object) this.b, (Object) cu4.b) && this.c == cu4.c && this.d == cu4.d && Intrinsics.areEqual((Object) this.e, (Object) cu4.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + wzf.i(g63.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        i20 i20 = this.e;
        return hashCode + (i20 == null ? 0 : i20.hashCode());
    }

    public final String toString() {
        return "DraftUploadDb(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + this.d + ", videoConvertOptions=" + this.e + ")";
    }
}
