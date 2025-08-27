package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ayd  reason: default package */
public abstract class ayd extends AbstractSet {
    public boolean removeAll(Collection<Object> collection) {
        collection.getClass();
        if (collection instanceof vx9) {
            collection = ((vx9) collection).h();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            for (Object remove : collection) {
                z |= remove(remove);
            }
        } else {
            Iterator it = iterator();
            collection.getClass();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
