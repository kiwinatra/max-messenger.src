package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h97  reason: default package */
public final class h97 {
    public static final h97 c = new h97("UNKNOWN", (String) null);
    public final String a;
    public final String b;

    public h97(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h97)) {
            return false;
        }
        h97 h97 = (h97) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) h97.a) && Intrinsics.areEqual((Object) this.b, (Object) h97.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
