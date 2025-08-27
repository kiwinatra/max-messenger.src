package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: qs  reason: default package */
public final class qs implements Set {
    public final /* synthetic */ ts a;

    public qs(ts tsVar) {
        this.a = tsVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.j(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
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

    public final int hashCode() {
        ts tsVar = this.a;
        int i = 0;
        for (int i2 = tsVar.c - 1; i2 >= 0; i2--) {
            Object f = tsVar.f(i2);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new ps(this.a, 0);
    }

    public final boolean remove(Object obj) {
        ts tsVar = this.a;
        int d = tsVar.d(obj);
        if (d < 0) {
            return false;
        }
        tsVar.g(d);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return this.a.k(collection);
    }

    public final boolean retainAll(Collection collection) {
        return this.a.l(collection);
    }

    public final int size() {
        return this.a.c;
    }

    public final Object[] toArray() {
        ts tsVar = this.a;
        int i = tsVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = tsVar.f(i2);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        ts tsVar = this.a;
        int i = tsVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = tsVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
