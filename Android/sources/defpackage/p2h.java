package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: p2h  reason: default package */
public abstract class p2h extends k2h implements List, RandomAccess {
    public static final m2h b = new m2h(q2h.v, 0);

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
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
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i++;
                        }
                    }
                    return true;
                }
                m2h m = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (m.hasNext()) {
                        if (!it.hasNext() || ((next = m.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int g(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
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

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public p2h subList(int i, int i2) {
        o54.U(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? q2h.v : new n2h(this, i, i3);
    }

    public final int lastIndexOf(Object obj) {
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

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: m */
    public final m2h listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? b : new m2h(this, i);
        }
        throw new IndexOutOfBoundsException(o54.V(i, size, "index"));
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
