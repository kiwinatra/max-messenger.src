package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: xxd  reason: default package */
public final class xxd extends AbstractSet {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Set b;

    public xxd(Set set, dc7 dc7) {
        this.a = set;
        this.b = dc7;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    public final Iterator iterator() {
        return new em7(this);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.a) {
            if (this.b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
