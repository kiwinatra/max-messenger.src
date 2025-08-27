package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ydf  reason: default package */
public final class ydf {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public ydf(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydf)) {
            return false;
        }
        ydf ydf = (ydf) obj;
        return this.a == ydf.a && this.b == ydf.b && Intrinsics.areEqual((Object) this.c, (Object) ydf.c) && Intrinsics.areEqual((Object) this.d, (Object) ydf.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g63.d(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskFileFromWebAppDownloadData(requestId=");
        sb.append(this.a);
        sb.append(", botId=");
        sb.append(this.b);
        sb.append(", fileUrl=");
        sb.append(this.c);
        sb.append(", fileName=");
        return wj6.n(sb, this.d, ")");
    }
}
