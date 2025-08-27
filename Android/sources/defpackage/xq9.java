package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xq9  reason: default package */
public final class xq9 {
    public final String a;
    public final String b;
    public final String c;

    public xq9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq9)) {
            return false;
        }
        xq9 xq9 = (xq9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xq9.a) && Intrinsics.areEqual((Object) this.b, (Object) xq9.b) && Intrinsics.areEqual((Object) this.c, (Object) xq9.c);
    }

    public final int hashCode() {
        int d = g63.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppData(title=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", queryId=");
        return wj6.n(sb, this.c, ")");
    }
}
