package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: pz9  reason: default package */
public final class pz9 extends c5b implements yy9 {
    /* JADX WARNING: type inference failed for: r0v0, types: [c5b, pz9] */
    public static pz9 c() {
        return new c5b(new TreeMap(c5b.b));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [c5b, pz9] */
    public static pz9 d(je3 je3) {
        TreeMap treeMap = new TreeMap(c5b.b);
        for (la0 la0 : je3.l()) {
            Set<ie3> o = je3.o(la0);
            ArrayMap arrayMap = new ArrayMap();
            for (ie3 ie3 : o) {
                arrayMap.put(ie3, je3.q(la0, ie3));
            }
            treeMap.put(la0, arrayMap);
        }
        return new c5b(treeMap);
    }

    public final void e(la0 la0, ie3 ie3, Object obj) {
        ie3 ie32;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(la0);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(la0, arrayMap);
            arrayMap.put(ie3, obj);
            return;
        }
        ie3 ie33 = (ie3) Collections.min(map.keySet());
        if (!Objects.equals(map.get(ie33), obj) && ie33 == (ie32 = ie3.c) && ie3 == ie32) {
            throw new IllegalArgumentException("Option values conflicts: " + la0.a + ", existing value (" + ie33 + ")=" + map.get(ie33) + ", conflicting (" + ie3 + ")=" + obj);
        }
        map.put(ie3, obj);
    }

    public final void f(la0 la0, Object obj) {
        e(la0, ie3.o, obj);
    }
}
