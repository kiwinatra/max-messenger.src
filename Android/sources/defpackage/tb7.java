package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: tb7  reason: default package */
public abstract class tb7 extends kb7 implements List, RandomAccess {
    public static final lx5 b = new lx5((tb7) k0d.v, 0);

    public static k0d n(int i, Object[] objArr) {
        return i == 0 ? k0d.v : new k0d(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    public static qb7 o() {
        return new jb7(4);
    }

    public static tb7 p(Collection collection) {
        if (collection instanceof kb7) {
            tb7 b2 = ((kb7) collection).b();
            if (!b2.l()) {
                return b2;
            }
            Object[] array = b2.toArray(kb7.a);
            return n(array.length, array);
        }
        Object[] array2 = collection.toArray();
        f6e.g(array2.length, array2);
        return n(array2.length, array2);
    }

    public static k0d q(Object[] objArr) {
        if (objArr.length == 0) {
            return k0d.v;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        f6e.g(objArr2.length, objArr2);
        return n(objArr2.length, objArr2);
    }

    public static k0d s() {
        return k0d.v;
    }

    public static k0d t(Object obj) {
        Object[] objArr = {obj};
        f6e.g(1, objArr);
        return n(1, objArr);
    }

    public static k0d u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        f6e.g(2, objArr);
        return n(2, objArr);
    }

    public static k0d v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        f6e.g(5, objArr);
        return n(5, objArr);
    }

    public static k0d x(Comparator comparator, AbstractCollection abstractCollection) {
        comparator.getClass();
        if (!(abstractCollection instanceof Collection)) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        f6e.g(array.length, array);
        Arrays.sort(array, comparator);
        return n(array.length, array);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final tb7 b() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public int d(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (cjf.n(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object n : this) {
                    if (it.hasNext()) {
                        if (!cjf.n(n, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final wvf m() {
        return listIterator(0);
    }

    /* renamed from: r */
    public final lx5 listIterator(int i) {
        b0h.i(i, size());
        return isEmpty() ? b : new lx5(this, i);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public tb7 w() {
        return size() <= 1 ? this : new rb7(this);
    }

    /* renamed from: y */
    public tb7 subList(int i, int i2) {
        b0h.j(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? k0d.v : new sb7(this, i, i3);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
