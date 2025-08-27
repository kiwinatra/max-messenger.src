package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: wub  reason: default package */
public abstract class wub {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(tub.a, 0);
        hashMap.put(tub.b, 1);
        hashMap.put(tub.c, 2);
        for (tub tub : hashMap.keySet()) {
            a.append(((Integer) b.get(tub)).intValue(), tub);
        }
    }

    public static int a(tub tub) {
        Integer num = (Integer) b.get(tub);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + tub);
    }

    public static tub b(int i) {
        tub tub = (tub) a.get(i);
        if (tub != null) {
            return tub;
        }
        throw new IllegalArgumentException(wj6.h(i, "Unknown Priority for value "));
    }
}
