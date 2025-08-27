package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xh0  reason: default package */
public final class xh0 implements lz7 {
    public final long a;
    public final List b;

    public xh0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh0)) {
            return false;
        }
        xh0 xh0 = (xh0) obj;
        return this.a == xh0.a && Intrinsics.areEqual((Object) this.b, (Object) xh0.b);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int i() {
        return 0;
    }

    public final String toString() {
        return "BannerViewPagerListItem(itemId=" + this.a + ", items=" + this.b + ")";
    }
}
