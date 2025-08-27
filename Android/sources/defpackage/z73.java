package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z73  reason: default package */
public final class z73 implements j83 {
    public final List a;
    public final boolean b;
    public final Long c;

    public z73(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static z73 a(z73 z73, List list, int i) {
        boolean z = (i & 2) != 0 ? z73.b : false;
        Long l = z73.c;
        z73.getClass();
        return new z73(l, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73 = (z73) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z73.a) && this.b == z73.b && Intrinsics.areEqual((Object) this.c, (Object) z73.c);
    }

    public final int hashCode() {
        int e = g63.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return e + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
