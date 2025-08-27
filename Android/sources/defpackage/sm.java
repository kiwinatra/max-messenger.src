package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sm  reason: default package */
public final class sm {
    public final String a;
    public final String b;

    public sm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm)) {
            return false;
        }
        sm smVar = (sm) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) smVar.a) && Intrinsics.areEqual((Object) this.b, (Object) smVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(token=");
        sb.append(this.a);
        sb.append(", apiEndpoint=");
        return wj6.n(sb, this.b, ")");
    }
}
