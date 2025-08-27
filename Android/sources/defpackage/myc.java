package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: myc  reason: default package */
public final class myc implements k3g {
    public final wac b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARNING: type inference failed for: r10v1, types: [o5h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [aqg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v6, types: [ic3, java.lang.Object] */
    public myc(int i, qu1 qu1) {
        h65 h65;
        boolean z = i == 0 || i == 1;
        bs0.m("Not a supported video capabilities source: " + i, z);
        h65 p = qu1.p();
        ykb ykb = on4.a;
        p7d p7d = new p7d(qu1, p, ykb);
        if (i == 1) {
            yb0 yb0 = yb0.d;
            ArrayList arrayList = new ArrayList(yb0.l);
            Set<vy4> singleton = Collections.singleton(vy4.d);
            List r = qu1.r(34);
            es1 es1 = b5g.c;
            ? obj = new Object();
            obj.a = new HashMap();
            obj.b = new HashMap();
            for (vy4 vy4 : singleton) {
                if (!vy4.b()) {
                    throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + vy4);
                }
            }
            obj.c = p7d;
            obj.o = new HashSet(arrayList);
            obj.w = new HashSet(singleton);
            obj.v = new HashSet(r);
            obj.x = es1;
            p7d = obj;
        }
        ? obj2 = new Object();
        obj2.c = new HashMap();
        obj2.a = p7d;
        obj2.b = ykb;
        Iterator it = qu1.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                h65 = obj2;
                break;
            }
            vy4 vy42 = (vy4) it.next();
            if (Integer.valueOf(vy42.a).equals(3) && vy42.b == 10) {
                es1 es12 = b5g.c;
                ? obj3 = new Object();
                obj3.c = new HashMap();
                obj3.a = obj2;
                obj3.b = es12;
                h65 = obj3;
                break;
            }
        }
        this.b = new wac(qu1, h65, ykb);
        for (vy4 vy43 : qu1.b()) {
            xw1 xw1 = new xw1(new d19((h65) this.b, vy43));
            if (!new ArrayList(xw1.a.keySet()).isEmpty()) {
                this.c.put(vy43, xw1);
            }
        }
        qu1.d();
    }

    public final zc0 a(Size size, vy4 vy4) {
        xw1 d2 = d(vy4);
        if (d2 == null) {
            return null;
        }
        return d2.a(size);
    }

    public final zc0 b(yb0 yb0, vy4 vy4) {
        xw1 d2 = d(vy4);
        if (d2 == null) {
            return null;
        }
        return d2.b(yb0);
    }

    public final ArrayList c(vy4 vy4) {
        xw1 d2 = d(vy4);
        return d2 == null ? new ArrayList() : new ArrayList(d2.a.keySet());
    }

    public final xw1 d(vy4 vy4) {
        boolean z;
        Object obj;
        boolean b2 = vy4.b();
        HashMap hashMap = this.c;
        if (b2) {
            return (xw1) hashMap.get(vy4);
        }
        HashMap hashMap2 = this.d;
        if (hashMap2.containsKey(vy4)) {
            return (xw1) hashMap2.get(vy4);
        }
        Set keySet = hashMap.keySet();
        xw1 xw1 = null;
        if (vy4.b()) {
            z = keySet.contains(vy4);
        } else {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                vy4 vy42 = (vy4) obj;
                bs0.r("Fully specified range is not actually fully specified.", vy42.b());
                int i = vy4.b;
                if (i == 0 || i == vy42.b) {
                    bs0.r("Fully specified range is not actually fully specified.", vy42.b());
                    int i2 = vy4.a;
                    if (i2 != 0) {
                        int i3 = vy42.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = obj != null;
        }
        if (z) {
            xw1 = new xw1(new d19((h65) this.b, vy4));
        }
        hashMap2.put(vy4, xw1);
        return xw1;
    }
}
