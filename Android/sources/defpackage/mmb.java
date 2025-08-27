package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: mmb  reason: default package */
public final class mmb {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, lmb lmb) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(lmb);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(lmb, obj);
        }
        List list = (List) obj;
        if (!list.contains(viewGroup)) {
            list.add(viewGroup);
            if (viewGroup.getMeasuredWidth() != 0 && viewGroup.getMeasuredHeight() != 0) {
                c();
            }
        }
    }

    public final List b(lmb lmb) {
        ArrayList arrayList;
        List list = (List) this.b.get(lmb);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                View view = (View) next;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    public final void c() {
        int i = 0;
        int i2 = 0;
        for (View height : b(lmb.a)) {
            i2 += height.getHeight();
        }
        for (View height2 : b(lmb.b)) {
            i += height2.getHeight();
        }
        nmb nmb = new nmb(i2, i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rk1) ((kmb) it.next())).R(nmb);
        }
    }
}
