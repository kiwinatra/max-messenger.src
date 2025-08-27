package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ss  reason: default package */
public final class ss implements Collection {
    public final /* synthetic */ ts a;

    public ss(ts tsVar) {
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
        return this.a.a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new ps(this.a, 1);
    }

    public final boolean remove(Object obj) {
        ts tsVar = this.a;
        int a2 = tsVar.a(obj);
        if (a2 < 0) {
            return false;
        }
        tsVar.g(a2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        ts tsVar = this.a;
        int i = tsVar.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(tsVar.i(i2))) {
                tsVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        ts tsVar = this.a;
        int i = tsVar.c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(tsVar.i(i2))) {
                tsVar.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    public final int size() {
        return this.a.c;
    }

    public final Object[] toArray() {
        ts tsVar = this.a;
        int i = tsVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = tsVar.i(i2);
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
            objArr[i2] = tsVar.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
