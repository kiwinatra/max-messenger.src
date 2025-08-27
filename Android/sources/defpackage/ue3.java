package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ue3  reason: default package */
public final class ue3 {
    public final String a;
    public final p7d b;
    public final Map c;
    public final n0g d;
    public final t82 e;

    public /* synthetic */ ue3(n0g n0g) {
        this((String) null, (p7d) null, (Map) null, n0g, (t82) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue3)) {
            return false;
        }
        ue3 ue3 = (ue3) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ue3.a) && Intrinsics.areEqual((Object) this.b, (Object) ue3.b) && Intrinsics.areEqual((Object) this.c, (Object) ue3.c) && Intrinsics.areEqual((Object) this.d, (Object) ue3.d) && Intrinsics.areEqual((Object) this.e, (Object) ue3.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        p7d p7d = this.b;
        int hashCode2 = (hashCode + (p7d == null ? 0 : p7d.hashCode())) * 31;
        Map map = this.c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        n0g n0g = this.d;
        int hashCode4 = (hashCode3 + (n0g == null ? 0 : n0g.hashCode())) * 31;
        t82 t82 = this.e;
        if (t82 != null) {
            i = t82.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb;
        Integer num = null;
        Map map = this.c;
        if (map == null || map.isEmpty()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                sb.append('#');
                sb.append(longValue);
                sb.append(':');
                sb.append((rp2) entry.getValue());
            }
            sb.append(']');
        }
        if (map != null) {
            num = Integer.valueOf(map.size());
        }
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + num + ", chats=" + sb + ", server=" + this.b;
    }

    public ue3(String str, p7d p7d, Map map, n0g n0g, t82 t82) {
        this.a = str;
        this.b = p7d;
        this.c = map;
        this.d = n0g;
        this.e = t82;
    }
}
