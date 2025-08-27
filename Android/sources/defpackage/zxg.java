package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: zxg  reason: default package */
public abstract class zxg extends lxg implements Set {
    public transient rxg b;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public rxg f() {
        rxg rxg = this.b;
        if (rxg != null) {
            return rxg;
        }
        rxg m = m();
        this.b = m;
        return m;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public rxg m() {
        Object[] array = toArray(lxg.a);
        nxg nxg = rxg.b;
        int length = array.length;
        return length == 0 ? ayg.v : new ayg(array, length);
    }
}
