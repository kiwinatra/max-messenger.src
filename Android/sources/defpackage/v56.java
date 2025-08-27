package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v56  reason: default package */
public final class v56 implements x56 {
    public final long a;
    public final String b;

    public v56(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v56)) {
            return false;
        }
        v56 v56 = (v56) obj;
        return this.a == v56.a && Intrinsics.areEqual((Object) this.b, (Object) v56.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenApp(appId=");
        sb.append(this.a);
        sb.append(", startParam=");
        return wj6.n(sb, this.b, ")");
    }
}
