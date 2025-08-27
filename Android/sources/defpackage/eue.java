package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: eue  reason: default package */
public final class eue {
    public final long a;
    public final String b;

    public eue(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eue)) {
            return false;
        }
        eue eue = (eue) obj;
        return this.a == eue.a && Intrinsics.areEqual((Object) this.b, (Object) eue.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryState(marker=");
        sb.append(this.a);
        sb.append(", query=");
        return wj6.n(sb, this.b, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eue(String str, int i) {
        this(0, (i & 2) != 0 ? null : str);
    }
}
