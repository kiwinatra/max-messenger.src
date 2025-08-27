package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ld2  reason: default package */
public final class ld2 {
    public final long a;
    public final long b;
    public final String c;
    public final sr4 d;
    public final boolean e;

    public ld2(long j, long j2, String str, sr4 sr4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = sr4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld2)) {
            return false;
        }
        ld2 ld2 = (ld2) obj;
        return this.a == ld2.a && this.b == ld2.b && Intrinsics.areEqual((Object) this.c, (Object) ld2.c) && this.d == ld2.d && this.e == ld2.e;
    }

    public final int hashCode() {
        int d2 = g63.d(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadData(msgId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", localAttachId=");
        sb.append(this.c);
        sb.append(", cause=");
        sb.append(this.d);
        sb.append(", completed=");
        return tr1.m(sb, this.e, ")");
    }
}
