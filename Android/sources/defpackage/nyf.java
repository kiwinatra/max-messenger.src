package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nyf  reason: default package */
public final class nyf {
    public final float a;
    public final long b;
    public final String c;

    public nyf(float f, long j, String str) {
        this.a = f;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyf)) {
            return false;
        }
        nyf nyf = (nyf) obj;
        return Float.compare(this.a, nyf.a) == 0 && this.b == nyf.b && Intrinsics.areEqual((Object) this.c, (Object) nyf.c);
    }

    public final int hashCode() {
        int i = wzf.i(Float.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadState(progress=");
        sb.append(this.a);
        sb.append(", fileSize=");
        sb.append(this.b);
        sb.append(", uploadToken=");
        return wj6.n(sb, this.c, ")");
    }
}
