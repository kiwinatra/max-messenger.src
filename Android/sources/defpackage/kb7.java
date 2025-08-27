package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: kb7  reason: default package */
public abstract class kb7 extends AbstractCollection implements Serializable {
    public static final Object[] a = new Object[0];

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract tb7 b();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public int d(int i, Object[] objArr) {
        wvf m = iterator();
        while (m.hasNext()) {
            objArr[i] = m.next();
            i++;
        }
        return i;
    }

    public Object[] e() {
        return null;
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    /* renamed from: m */
    public abstract wvf iterator();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] e = e();
            if (e != null) {
                return Arrays.copyOfRange(e, g(), f(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(0, objArr);
        return objArr;
    }
}
