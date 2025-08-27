package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: c5b  reason: default package */
public class c5b implements je3 {
    public static final oj4 b;
    public static final c5b c;
    public final TreeMap a;

    static {
        oj4 oj4 = new oj4(18);
        b = oj4;
        c = new c5b(new TreeMap(oj4));
    }

    public c5b(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static c5b a(je3 je3) {
        if (c5b.class.equals(je3.getClass())) {
            return (c5b) je3;
        }
        TreeMap treeMap = new TreeMap(b);
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

    public final void b(ba baVar) {
        for (Map.Entry entry : this.a.tailMap(new la0(Void.class, (Object) null, "camera2.captureRequest.option.")).entrySet()) {
            if (((la0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                la0 la0 = (la0) entry.getKey();
                je3 je3 = (je3) baVar.c;
                ((pz9) ((er7) baVar.b).b).e(la0, je3.v(la0), je3.n(la0));
            } else {
                return;
            }
        }
    }

    public final Object k(la0 la0, Object obj) {
        try {
            return n(la0);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    public final Set l() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public final Object n(la0 la0) {
        Map map = (Map) this.a.get(la0);
        if (map != null) {
            return map.get((ie3) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + la0);
    }

    public final Set o(la0 la0) {
        Map map = (Map) this.a.get(la0);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    public final Object q(la0 la0, ie3 ie3) {
        Map map = (Map) this.a.get(la0);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + la0);
        } else if (map.containsKey(ie3)) {
            return map.get(ie3);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + la0 + " with priority=" + ie3);
        }
    }

    public final boolean u(la0 la0) {
        return this.a.containsKey(la0);
    }

    public final ie3 v(la0 la0) {
        Map map = (Map) this.a.get(la0);
        if (map != null) {
            return (ie3) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + la0);
    }
}
