package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dj  reason: default package */
public final class dj {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;

    public dj(long j, long j2, String str, String str2, String str3, Long l, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return this.a == djVar.a && this.b == djVar.b && Intrinsics.areEqual((Object) this.c, (Object) djVar.c) && Intrinsics.areEqual((Object) this.d, (Object) djVar.d) && Intrinsics.areEqual((Object) this.e, (Object) djVar.e) && Intrinsics.areEqual((Object) this.f, (Object) djVar.f) && Intrinsics.areEqual((Object) this.g, (Object) djVar.g);
    }

    public final int hashCode() {
        int d2 = g63.d(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimojiEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", lottieUrl=");
        sb.append(this.d);
        sb.append(", lottiePlayUrl=");
        sb.append(this.e);
        sb.append(", setId=");
        sb.append(this.f);
        sb.append(", iconUrl=");
        return wj6.n(sb, this.g, ")");
    }
}
