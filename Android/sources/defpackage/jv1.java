package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: jv1  reason: default package */
public final class jv1 {
    public static final jv1 b;
    public static final jv1 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new wt7(0));
        b = new jv1(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new wt7(1));
        c = new jv1(linkedHashSet2);
    }

    public jv1(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((ku1) it.next()).a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            ku1 ku1 = (ku1) it.next();
            if (ku1 instanceof wt7) {
                Integer valueOf = Integer.valueOf(((wt7) ku1).b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final su1 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((su1) it.next()).n());
        }
        List a2 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            su1 su1 = (su1) it2.next();
            if (a2.contains(su1.n())) {
                linkedHashSet2.add(su1);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (su1) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
