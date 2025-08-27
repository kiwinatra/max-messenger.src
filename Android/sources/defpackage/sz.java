package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.reflect.KProperty;

/* renamed from: sz  reason: default package */
public final class sz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final rz b;
    public final hs7 c;

    public sz(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78) {
        this.b = new rz(hs72, hs73, hs74, hs75, hs76, hs78, hs77);
        this.c = hs7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    public final srd a(l20 l20) {
        Object obj;
        Object sk5;
        ? obj2 = new Object();
        obj2.a(l20);
        w28 c2 = obj2.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < c2.G(); i++) {
            l20 F = c2.F(i);
            String str = F.q;
            pz pzVar = (pz) this.a.get(str);
            if (pzVar == null || pzVar.b) {
                rz rzVar = this.b;
                rzVar.getClass();
                g20 g20 = F.a;
                int i2 = g20 == null ? -1 : qz.$EnumSwitchMapping$0[g20.ordinal()];
                hs7 hs7 = rzVar.b;
                if (i2 != 1) {
                    KProperty[] kPropertyArr = rz.h;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            KProperty kProperty = kPropertyArr[0];
                            KProperty kProperty2 = kPropertyArr[2];
                            KProperty kProperty3 = kPropertyArr[3];
                            sk5 = new sk5(F, (rl) rzVar.c.get(), (uk5) rzVar.e.get(), (sv0) rzVar.f.get());
                        } else if (i2 == 4) {
                            KProperty kProperty4 = kPropertyArr[2];
                            KProperty kProperty5 = kPropertyArr[3];
                            sk5 = new w20(F, (uk5) rzVar.e.get(), (sv0) rzVar.f.get());
                        } else if (i2 != 5) {
                            obj = null;
                        } else {
                            Lazy lazy = LazyKt.lazy(new al2(rzVar.a, 1));
                            Lazy lazy2 = LazyKt.lazy(new al2(hs7, 1));
                            KProperty kProperty6 = kPropertyArr[4];
                            sk5 = new foe(F, lazy, lazy2, (ln5) rzVar.g.get());
                        }
                        obj = sk5;
                    } else {
                        KProperty kProperty7 = kPropertyArr[0];
                        KProperty kProperty8 = kPropertyArr[1];
                        KProperty kProperty9 = kPropertyArr[2];
                        KProperty kProperty10 = kPropertyArr[3];
                        obj = new d3g(F, (rl) rzVar.c.get(), (x23) rzVar.d.get(), (uk5) rzVar.e.get(), (sv0) rzVar.f.get());
                    }
                } else {
                    obj = new afb(F, LazyKt.lazy(new al2(hs7, 1)));
                }
                if (obj != null) {
                    this.a.put(str, obj);
                    arrayList2.add(obj);
                    arrayList.add(str);
                }
            } else {
                arrayList2.add(pzVar);
                arrayList.add(str);
            }
        }
        return new srd(this.c, arrayList2, arrayList);
    }
}
