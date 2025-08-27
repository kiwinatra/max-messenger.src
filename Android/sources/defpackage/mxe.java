package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: mxe  reason: default package */
public abstract class mxe {
    public static final la0 a = new la0(Long.TYPE, (Object) null, "camera2.streamSpec.streamUseCase");
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            b0g b0g = b0g.b;
            hashSet.add(b0g);
            b0g b0g2 = b0g.w;
            hashSet.add(b0g2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(b0g);
            hashSet2.add(b0g2);
            hashSet2.add(b0g.c);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            b0g b0g3 = b0g.a;
            hashSet3.add(b0g3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            b0g b0g4 = b0g.o;
            hashSet4.add(b0g4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(b0g);
            hashSet5.add(b0g3);
            hashSet5.add(b0g4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(b0g);
            hashSet6.add(b0g4);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [wie, vs1] */
    public static vs1 a(je3 je3, long j) {
        la0 la0 = a;
        if (je3.u(la0) && ((Long) je3.n(la0)).longValue() == j) {
            return null;
        }
        pz9 d = pz9.d(je3);
        d.f(la0, Long.valueOf(j));
        return new wie(9, (Object) d);
    }

    public static boolean b(b0g b0g, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (b0g == b0g.v) {
            HashMap hashMap = c;
            if (!hashMap.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((b0g) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = b;
        return hashMap2.containsKey(Long.valueOf(j)) && ((Set) hashMap2.get(Long.valueOf(j))).contains(b0g);
    }

    public static boolean c(je3 je3, b0g b0g) {
        if (((Boolean) je3.k(zzf.p0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        la0 la0 = z87.b;
        if (!je3.u(la0)) {
            return false;
        }
        return b0g.ordinal() == 0 && ((Integer) je3.n(la0)).intValue() == 2;
    }
}
