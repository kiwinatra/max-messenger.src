package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: z1  reason: default package */
public final class z1 extends ayd {
    public final /* synthetic */ b2 a;

    public z1(b2 b2Var) {
        this.a = b2Var;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.a.c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new a2(this.a);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        x1 x1Var = this.a.o;
        Object key = entry.getKey();
        Map map = x1Var.o;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        x1Var.v -= size;
        return true;
    }

    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object remove : collection) {
                z |= remove(remove);
            }
            return z;
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(hd8.f(collection.size()));
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return this.a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.a.c.size();
    }
}
