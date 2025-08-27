package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class OverwritingInputMerger extends og7 {
    public final t64 a(ArrayList arrayList) {
        xv1 xv1 = new xv1(15);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((t64) it.next()).a));
        }
        xv1.x(hashMap);
        return xv1.m();
    }
}
