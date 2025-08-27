package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tfg  reason: default package */
public final class tfg {
    public final long a;
    public final String b;
    public final kfg c;
    public final n22 d;
    public final String e = null;

    public tfg(long j, String str, kfg kfg, n22 n22) {
        this.a = j;
        this.b = str;
        this.c = kfg;
        this.d = n22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfg)) {
            return false;
        }
        tfg tfg = (tfg) obj;
        return this.a == tfg.a && Intrinsics.areEqual((Object) this.b, (Object) tfg.b) && this.c == tfg.c && Intrinsics.areEqual((Object) this.d, (Object) tfg.d) && Intrinsics.areEqual((Object) this.e, (Object) tfg.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppAnalyticsParam(botId=");
        sb.append(this.a);
        sb.append(", webAppName=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", sourceType=");
        sb.append(this.d);
        sb.append(", label=");
        return wj6.n(sb, this.e, ")");
    }
}
