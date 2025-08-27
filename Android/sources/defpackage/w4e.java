package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w4e  reason: default package */
public final class w4e implements o00 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final p87 f;
    public final long g;

    public w4e(long j, String str, String str2, String str3, String str4, p87 p87, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = p87;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4e)) {
            return false;
        }
        w4e w4e = (w4e) obj;
        return this.a == w4e.a && Intrinsics.areEqual((Object) this.b, (Object) w4e.b) && Intrinsics.areEqual((Object) this.c, (Object) w4e.c) && Intrinsics.areEqual((Object) this.d, (Object) w4e.d) && Intrinsics.areEqual((Object) this.e, (Object) w4e.e) && Intrinsics.areEqual((Object) this.f, (Object) w4e.f) && this.g == w4e.g;
    }

    public final int hashCode() {
        int d2 = g63.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        p87 p87 = this.f;
        if (p87 != null) {
            i = p87.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttachModel(shareId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", host=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", previewConfig=");
        sb.append(this.f);
        sb.append(", messageId=");
        return wj6.m(sb, this.g, ")");
    }
}
