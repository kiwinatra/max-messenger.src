package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: a68  reason: default package */
public final class a68 extends ibf {
    public LinkedHashMap c;

    public a68(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        ArrayList arrayList;
        str.getClass();
        if (!str.equals("locations")) {
            pf9.A();
            return;
        }
        LinkedHashMap linkedHashMap = null;
        if (pf9.n().a() == 8) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int y0 = pf9.y0();
            for (int i = 0; i < y0; i++) {
                Long valueOf = Long.valueOf(ryg.d0(pf9, 0));
                if (pf9.n().a() == 7) {
                    arrayList = new ArrayList();
                    int t0 = pf9.t0();
                    for (int i2 = 0; i2 < t0; i2++) {
                        arrayList.add(t58.a(pf9));
                    }
                } else {
                    pf9.A();
                    arrayList = null;
                }
                linkedHashMap2.put(valueOf, arrayList);
            }
            linkedHashMap = linkedHashMap2;
        } else {
            pf9.A();
        }
        this.c = linkedHashMap;
    }

    public final String toString() {
        LinkedHashMap linkedHashMap = this.c;
        return "Response{locations=" + linkedHashMap + "}";
    }
}
