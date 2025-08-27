package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: y2d  reason: default package */
public final class y2d {
    public ex0 a;
    public final m57 b;
    public final String c;
    public final lx6 d;
    public final hd8 e;
    public final Map f;

    public y2d(m57 m57, String str, lx6 lx6, hd8 hd8, Map map) {
        this.b = m57;
        this.c = str;
        this.d = lx6;
        this.e = hd8;
        this.f = map;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hr6] */
    public final hr6 a() {
        ? obj = new Object();
        obj.v = new LinkedHashMap();
        obj.a = this.b;
        obj.b = this.c;
        obj.o = this.e;
        Map map = this.f;
        obj.v = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        obj.c = this.d.e();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        lx6 lx6 = this.d;
        if (lx6.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : lx6) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) next;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
