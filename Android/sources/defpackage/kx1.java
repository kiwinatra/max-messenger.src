package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: kx1  reason: default package */
public final class kx1 {
    public final bx1 a;

    public kx1() {
        HashSet hashSet = new HashSet();
        pz9 c = pz9.c();
        ArrayList arrayList = new ArrayList();
        uz9 a2 = uz9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        c5b a3 = c5b.a(c);
        ArrayList arrayList3 = new ArrayList(arrayList);
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        this.a = new bx1(arrayList2, a3, -1, false, arrayList3, false, new a9f(arrayMap), (it1) null);
    }
}
