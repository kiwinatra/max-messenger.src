package defpackage;

import android.content.Context;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: xs1  reason: default package */
public final class xs1 implements c0g {
    public final hq4 b;

    public xs1(Context context) {
        this.b = hq4.b(context);
    }

    public final je3 a(b0g b0g, int i) {
        int i2;
        int i3;
        b0g b0g2 = b0g;
        int i4 = i;
        pz9 c = pz9.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        pz9 c2 = pz9.c();
        ArrayList arrayList = new ArrayList();
        uz9 a = uz9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = b0g.ordinal();
        if (ordinal != 0) {
            i2 = ordinal != 3 ? 1 : 3;
        } else {
            i2 = i4 == 2 ? 5 : 1;
        }
        la0 la0 = zzf.j0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        c5b a2 = c5b.a(c2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        c.f(la0, new fwd(arrayList5, arrayList6, arrayList7, arrayList8, new bx1(arrayList9, a2, i2, false, arrayList10, false, new a9f(arrayMap), (it1) null), (dwd) null, (InputConfiguration) null, 0, (dc0) null));
        c.f(zzf.l0, ws1.a);
        HashSet hashSet2 = new HashSet();
        pz9 c3 = pz9.c();
        ArrayList arrayList11 = new ArrayList();
        uz9 a3 = uz9.a();
        int ordinal2 = b0g.ordinal();
        if (ordinal2 != 0) {
            i3 = ordinal2 != 3 ? 1 : 3;
        } else {
            i3 = i4 == 2 ? 5 : 2;
        }
        la0 la02 = zzf.k0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        c5b a4 = c5b.a(c3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        a9f a9f2 = a9f.b;
        ArrayMap arrayMap2 = new ArrayMap();
        Map map2 = a3.a;
        for (String str2 : map2.keySet()) {
            arrayMap2.put(str2, map2.get(str2));
        }
        c.f(la02, new bx1(arrayList12, a4, i3, false, arrayList13, false, new a9f(arrayMap2), (it1) null));
        c.f(zzf.m0, b0g2 == b0g.a ? a97.c : ds1.a);
        b0g b0g3 = b0g.b;
        hq4 hq4 = this.b;
        if (b0g2 == b0g3) {
            c.f(x97.L, hq4.e());
        }
        c.f(x97.G, Integer.valueOf(hq4.c(true).getRotation()));
        if (b0g2 == b0g.o || b0g2 == b0g.v) {
            c.f(zzf.p0, Boolean.TRUE);
        }
        return c5b.a(c);
    }
}
