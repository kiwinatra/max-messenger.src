package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: om  reason: default package */
public final class om {
    public final String a;
    public final String b;
    public final String c;

    public om(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) omVar.a) && Intrinsics.areEqual((Object) this.b, (Object) omVar.b) && Intrinsics.areEqual((Object) this.c, (Object) omVar.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionKey=");
        sb.append(this.a);
        sb.append(", sessionSecret=");
        sb.append(this.b);
        sb.append(", apiEndpoint=");
        return wj6.n(sb, this.c, ")");
    }
}
