package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ko4  reason: default package */
public final class ko4 {
    public static final ntd f;
    public final voc a;
    public final jbb b;
    public List c = Collections.emptyList();
    public Map d = Collections.emptyMap();
    public boolean e = false;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ntd] */
    static {
        ? obj = new Object();
        f = obj;
        obj.a = true;
    }

    public ko4(voc voc, mvf mvf) {
        this.a = voc;
        this.b = mvf;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, ntd] */
    public final void a(List list) {
        List<o41> emptyList = this.e ? Collections.emptyList() : this.c;
        HashMap hashMap = new HashMap();
        for (o41 o41 : emptyList) {
            hashMap.put(o41.a, o41);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o41 o412 = (o41) it.next();
            hashMap2.put(o412.a, o412);
        }
        ArrayList arrayList = new ArrayList();
        for (ln1 ln1 : hashMap2.keySet()) {
            o41 o413 = (o41) hashMap.get(ln1);
            o41 o414 = (o41) hashMap2.get(ln1);
            if (o414 != null && (o413 == null || !o413.b.equals(o414.b))) {
                ln1 ln12 = o414.a;
                y4g y4g = o414.b;
                ? obj = new Object();
                int i = 1;
                if (y4g.c != 1) {
                    i = 2;
                }
                obj.d = i;
                obj.b = y4g.a;
                obj.c = y4g.b;
                obj.a = false;
                arrayList.add(new otd(ln12, obj));
            }
        }
        for (ln1 ln13 : hashMap.keySet()) {
            o41 o415 = (o41) hashMap.get(ln13);
            if (o415 != null && !hashMap2.containsKey(ln13)) {
                arrayList.add(new otd(o415.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            kwf kwf = new kwf(arrayList, z);
            q9d B = ((mvf) this.b).z0.B();
            jo4 jo4 = new jo4(this, 0);
            jo4 jo42 = new jo4(this, 1);
            o9d o9d = new o9d((n9d) kwf);
            o9d.c = jo4;
            o9d.d = jo42;
            B.d(new o9d(o9d));
        }
        this.c = list;
        HashMap hashMap3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            o41 o416 = (o41) it2.next();
            ue1 ue1 = o416.a.b;
            Set set = (Set) hashMap3.get(ue1);
            if (set == null) {
                set = new HashSet();
                hashMap3.put(ue1, set);
            }
            set.add(o416.a);
        }
        this.d = hashMap3;
        this.e = false;
    }
}
