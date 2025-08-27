package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y73  reason: default package */
public final class y73 implements i83 {
    public final List a;
    public final boolean b;
    public final Long c;

    public y73(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static y73 b(y73 y73, List list, int i) {
        if ((i & 1) != 0) {
            list = y73.a;
        }
        boolean z = (i & 2) != 0 ? y73.b : false;
        Long l = y73.c;
        y73.getClass();
        return new y73(l, list, z);
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y73)) {
            return false;
        }
        y73 y73 = (y73) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y73.a) && this.b == y73.b && Intrinsics.areEqual((Object) this.c, (Object) y73.c);
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
