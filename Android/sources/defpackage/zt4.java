package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zt4  reason: default package */
public final class zt4 {
    public final Map a;
    public final Map b;

    public zt4(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt4)) {
            return false;
        }
        zt4 zt4 = (zt4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zt4.a) && Intrinsics.areEqual((Object) this.b, (Object) zt4.b);
    }

    public final int hashCode() {
        int i = 0;
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftUpdates(discarded=" + this.a + ", saved=" + this.b + ")";
    }
}
