package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: x4d  reason: default package */
public final class x4d {
    public float a;
    public final Serializable b;

    public x4d() {
        this.b = new Random(System.currentTimeMillis());
        this.a = c44.DEFAULT_ASPECT_RATIO;
    }

    public long a(long j) {
        n79.g(j >= 0);
        Map.Entry firstEntry = ((hc7) this.b).tailMap(Long.valueOf(j), false).firstEntry();
        Long l = (Long) (firstEntry == null ? null : firstEntry.getKey());
        if (l != null) {
            return l.longValue();
        }
        return -9223372036854775807L;
    }

    public float b(long j) {
        n79.g(j >= 0);
        Map.Entry lastEntry = ((hc7) this.b).headMap(Long.valueOf(j), true).lastEntry();
        return lastEntry != null ? ((Float) lastEntry.getValue()).floatValue() : this.a;
    }

    public x4d(sp9 sp9) {
        float f;
        hc7 hc7;
        int i = 0;
        while (true) {
            qp9[] qp9Arr = sp9.a;
            if (i >= qp9Arr.length) {
                f = -3.4028235E38f;
                break;
            }
            qp9 qp9 = qp9Arr[i];
            if (qp9 instanceof dfe) {
                f = ((dfe) qp9).a;
                break;
            }
            i++;
        }
        float f2 = f == -3.4028235E38f ? 1.0f : f / 30.0f;
        this.a = f2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            qp9[] qp9Arr2 = sp9.a;
            if (i2 >= qp9Arr2.length) {
                break;
            }
            qp9 qp92 = qp9Arr2[i2];
            if (qp92 instanceof hee) {
                arrayList.addAll(((hee) qp92).a);
            }
            i2++;
        }
        k0d x = tb7.x(fee.o, arrayList);
        if (x.isEmpty()) {
            hc7 = hc7.o();
        } else {
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < x.size(); i3++) {
                fee fee = (fee) x.get(i3);
                treeMap.put(Long.valueOf(v0g.S(fee.a)), Float.valueOf(f2 / ((float) fee.c)));
            }
            for (int i4 = 0; i4 < x.size(); i4++) {
                long j = ((fee) x.get(i4)).b;
                if (!treeMap.containsKey(Long.valueOf(v0g.S(j)))) {
                    treeMap.put(Long.valueOf(v0g.S(j)), Float.valueOf(f2));
                }
            }
            hc7 = hc7.k(treeMap);
        }
        this.b = hc7;
    }
}
