package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: fwd  reason: default package */
public final class fwd {
    public static final List j = Arrays.asList(new Integer[]{1, 5, 3});
    public final List a;
    public final dc0 b;
    public final List c;
    public final List d;
    public final List e;
    public final dwd f;
    public final bx1 g;
    public final int h;
    public final InputConfiguration i;

    public fwd(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, bx1 bx1, dwd dwd, InputConfiguration inputConfiguration, int i2, dc0 dc0) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = dwd;
        this.g = bx1;
        this.i = inputConfiguration;
        this.h = i2;
        this.b = dc0;
    }

    public static fwd a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        pz9 c2 = pz9.c();
        ArrayList arrayList5 = new ArrayList();
        uz9 a2 = uz9.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        c5b a3 = c5b.a(c2);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        return new fwd(arrayList, arrayList2, arrayList3, arrayList4, new bx1(arrayList6, a3, -1, false, arrayList7, false, new a9f(arrayMap), (it1) null), (dwd) null, (InputConfiguration) null, 0, (dc0) null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (dc0 dc0 : this.a) {
            arrayList.add(dc0.a);
            for (lk4 add : dc0.b) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
