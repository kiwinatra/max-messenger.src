package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jj9  reason: default package */
public abstract class jj9 extends mg4 {
    public final ft o(lzc lzc, pzc pzc, int i, List list) {
        if (i == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                ni9 ni9 = null;
                ni9 ni92 = next instanceof ni9 ? (ni9) next : null;
                if (ni92 != null && (ni92.b || ni92.a || ni92.c != null)) {
                    ni9 = ni92;
                }
                if (ni9 != null) {
                    arrayList.add(ni9);
                }
            }
            if (!arrayList.isEmpty()) {
                return new gj9(arrayList);
            }
        }
        if (i == 4096 && (pzc instanceof mb9)) {
            mb9 mb9 = (mb9) pzc;
        }
        return super.o(lzc, pzc, i, list);
    }
}
