package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dm  reason: default package */
public final class dm {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;

    public dm(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = map;
        if (!((map != null ? map.size() : 0) <= 10)) {
            Integer valueOf = map != null ? Integer.valueOf(map.size()) : null;
            throw new IllegalStateException(("counters size can't be greater than limit = 10, current=" + valueOf + ", event=" + str2).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return this.a == dmVar.a && this.b == dmVar.b && this.c == dmVar.c && Intrinsics.areEqual((Object) this.d, (Object) dmVar.d) && Intrinsics.areEqual((Object) this.e, (Object) dmVar.e) && Intrinsics.areEqual((Object) this.f, (Object) dmVar.f);
    }

    public final int hashCode() {
        int d2 = g63.d(g63.d(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Map map = this.f;
        return d2 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ApiLogEntry(time=" + this.a + ", userId=" + this.b + ", sessionId=" + this.c + ", type=" + this.d + ", event=" + this.e + ", params=" + this.f + ")";
    }
}
