package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: hi  reason: default package */
public final class hi {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hi(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return this.a == hiVar.a && Intrinsics.areEqual((Object) this.b, (Object) hiVar.b) && Intrinsics.areEqual((Object) this.c, (Object) hiVar.c) && Intrinsics.areEqual((Object) this.d, (Object) hiVar.d) && Intrinsics.areEqual((Object) this.e, (Object) hiVar.e);
    }

    public final int hashCode() {
        int d2 = g63.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animoji(id=");
        sb.append(this.a);
        sb.append(", emoji=");
        sb.append(this.b);
        sb.append(", lottieUrl=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        return wj6.n(sb, this.e, ")");
    }
}
