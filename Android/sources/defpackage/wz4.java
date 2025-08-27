package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wz4  reason: default package */
public final class wz4 {
    public final azb a;
    public final List b;

    public wz4(azb azb, List list) {
        this.a = azb;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz4)) {
            return false;
        }
        wz4 wz4 = (wz4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wz4.a) && Intrinsics.areEqual((Object) this.b, (Object) wz4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(appBarState=" + this.a + ", items=" + this.b + ")";
    }
}
