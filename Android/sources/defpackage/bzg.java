package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bzg  reason: default package */
public abstract class bzg extends AbstractList implements x0h {
    public boolean a;

    public bzg(boolean z) {
        this.a = z;
    }

    public boolean add(Object obj) {
        b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        b();
        return super.addAll(i, collection);
    }

    public final void b() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        b();
        super.clear();
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }
}
