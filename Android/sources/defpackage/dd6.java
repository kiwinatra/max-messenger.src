package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: dd6  reason: default package */
public final class dd6 implements bd6 {
    public final /* synthetic */ c a;

    public dd6(c cVar) {
        this.a = cVar;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.a;
        xe0 xe0 = (xe0) a81.h(1, cVar.d);
        cVar.h = xe0;
        Iterator it = xe0.a.iterator();
        while (it.hasNext()) {
            a aVar = ((md6) it.next()).b;
            if (aVar != null) {
                aVar.w0 = true;
            }
        }
        boolean W = cVar.W(arrayList, arrayList2, -1, 0);
        if (!cVar.n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c.G((xe0) it2.next()));
            }
            Iterator it3 = cVar.n.iterator();
            while (it3.hasNext()) {
                rae.w(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    a aVar2 = (a) it4.next();
                    throw null;
                }
            }
        }
        return W;
    }
}
