package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: tj4  reason: default package */
public final class tj4 {
    public final String a;
    public final vs6 b;

    public tj4(Set set, vs6 vs6) {
        this.a = b(set);
        this.b = vs6;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            gb0 gb0 = (gb0) it.next();
            sb.append(gb0.a);
            sb.append('/');
            sb.append(gb0.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        vs6 vs6 = this.b;
        synchronized (((HashSet) vs6.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) vs6.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) vs6.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) vs6.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
