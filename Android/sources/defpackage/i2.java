package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: i2  reason: default package */
public abstract class i2 extends AbstractCollection {
    public final Object a;
    public Collection b;
    public final i2 c;
    public final Collection o;
    public final /* synthetic */ x1 v;

    public i2(x1 x1Var, Object obj, Collection collection, i2 i2Var) {
        this.v = x1Var;
        this.a = obj;
        this.b = collection;
        this.c = i2Var;
        this.o = i2Var == null ? null : i2Var.b;
    }

    public final boolean add(Object obj) {
        d();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.v.v++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.v.v += this.b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        i2 i2Var = this.c;
        if (i2Var != null) {
            i2Var.b();
        } else {
            this.v.o.put(this.a, this.b);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            this.v.v -= size;
            e();
        }
    }

    public final boolean contains(Object obj) {
        d();
        return this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        d();
        return this.b.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        i2 i2Var = this.c;
        if (i2Var != null) {
            i2Var.d();
            if (i2Var.b != this.o) {
                throw new ConcurrentModificationException();
            }
        } else if (this.b.isEmpty() && (collection = (Collection) this.v.o.get(this.a)) != null) {
            this.b = collection;
        }
    }

    public final void e() {
        i2 i2Var = this.c;
        if (i2Var != null) {
            i2Var.e();
        } else if (this.b.isEmpty()) {
            this.v.o.remove(this.a);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.b.equals(obj);
    }

    public final int hashCode() {
        d();
        return this.b.hashCode();
    }

    public final Iterator iterator() {
        d();
        return new a2(this);
    }

    public final boolean remove(Object obj) {
        d();
        boolean remove = this.b.remove(obj);
        if (remove) {
            x1 x1Var = this.v;
            x1Var.v--;
            e();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.v.v += this.b.size() - size;
            e();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.v.v += this.b.size() - size;
            e();
        }
        return retainAll;
    }

    public final int size() {
        d();
        return this.b.size();
    }

    public final String toString() {
        d();
        return this.b.toString();
    }
}
