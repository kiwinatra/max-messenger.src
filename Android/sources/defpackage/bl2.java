package defpackage;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bl2  reason: default package */
public final class bl2 {
    public final Map a;
    public final int b;

    static {
        MapsKt.emptyMap();
    }

    public bl2(int i, Map map) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl2)) {
            return false;
        }
        bl2 bl2 = (bl2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) bl2.a) && this.b == bl2.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        Map map = this.a;
        int size = map.size();
        StringBuilder sb = new StringBuilder("ChatNotificationsDataRepositoryResult(notificationsSize=");
        sb.append(size);
        sb.append(", notifications=");
        sb.append(map);
        sb.append(", totalUnreadMessagesCount=");
        return wj6.l(sb, this.b, ")");
    }
}
