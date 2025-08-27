package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sf1  reason: default package */
public final class sf1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public sf1(long j, long j2, String str, String str2, String str3, boolean z, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf1)) {
            return false;
        }
        sf1 sf1 = (sf1) obj;
        return this.a == sf1.a && this.b == sf1.b && Intrinsics.areEqual((Object) this.c, (Object) sf1.c) && Intrinsics.areEqual((Object) this.d, (Object) sf1.d) && Intrinsics.areEqual((Object) this.e, (Object) sf1.e) && this.f == sf1.f && Intrinsics.areEqual((Object) this.g, (Object) sf1.g);
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int e2 = g63.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return e2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallPush(callerId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", conversationId=");
        sb.append(this.c);
        sb.append(", callerName=");
        sb.append(this.d);
        sb.append(", avatar=");
        sb.append(this.e);
        sb.append(", isVideo=");
        sb.append(this.f);
        sb.append(", conversationParams=");
        return wj6.n(sb, this.g, ")");
    }
}
