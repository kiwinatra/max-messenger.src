package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sq0  reason: default package */
public final class sq0 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public sq0(String str, long j, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq0)) {
            return false;
        }
        sq0 sq0 = (sq0) obj;
        return this.a == sq0.a && Intrinsics.areEqual((Object) this.b, (Object) sq0.b) && Intrinsics.areEqual((Object) this.c, (Object) sq0.c) && Intrinsics.areEqual((Object) this.d, (Object) sq0.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int d2 = g63.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BotItem(botId=");
        sb.append(this.a);
        sb.append(", botTag=");
        sb.append(this.b);
        sb.append(", commandName=");
        sb.append(this.c);
        sb.append(", commandDescription=");
        return wj6.n(sb, this.d, ")");
    }
}
