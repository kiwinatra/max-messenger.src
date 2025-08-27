package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: e2  reason: default package */
public final class e2 extends h2 implements NavigableSet {
    public final /* synthetic */ x1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2(x1 x1Var, NavigableMap navigableMap) {
        super(x1Var, navigableMap);
        this.o = x1Var;
    }

    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    /* renamed from: d */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    public final Iterator descendingIterator() {
        return ((c2) descendingSet()).iterator();
    }

    public final NavigableSet descendingSet() {
        return new e2(this.o, b().descendingMap());
    }

    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    public final Object pollFirst() {
        a2 a2Var = (a2) iterator();
        if (!a2Var.hasNext()) {
            return null;
        }
        Object next = a2Var.next();
        a2Var.remove();
        return next;
    }

    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new e2(this.o, b().headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new e2(this.o, b().subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new e2(this.o, b().tailMap(obj, z));
    }
}
