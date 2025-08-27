package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: ic7  reason: default package */
public abstract class ic7 extends dc7 implements NavigableSet, xfe {
    public final transient Comparator o;
    public transient ic7 v;

    public ic7(Comparator comparator) {
        this.o = comparator;
    }

    public static r0d t(Comparator comparator) {
        return q5a.a.equals(comparator) ? r0d.x : new r0d(k0d.v, comparator);
    }

    public final Comparator comparator() {
        return this.o;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        r0d r0d = (r0d) this;
        return r0d.v(0, r0d.w(obj, z));
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public final ic7 descendingSet() {
        ic7 ic7 = this.v;
        if (ic7 == null) {
            r0d r0d = (r0d) this;
            Comparator reverseOrder = Collections.reverseOrder(r0d.o);
            ic7 = r0d.isEmpty() ? t(reverseOrder) : new r0d(r0d.w.w(), reverseOrder);
            this.v = ic7;
            ic7.v = this;
        }
        return ic7;
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        r0d r0d = (r0d) this;
        return r0d.v(r0d.x(obj, z), r0d.w.size());
    }

    /* renamed from: u */
    public final r0d subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.o.compare(obj, obj2) <= 0) {
            r0d r0d = (r0d) this;
            r0d v2 = r0d.v(r0d.x(obj, z), r0d.w.size());
            return v2.v(0, v2.w(obj2, z2));
        }
        throw new IllegalArgumentException();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet headSet(Object obj) {
        obj.getClass();
        r0d r0d = (r0d) this;
        return r0d.v(0, r0d.w(obj, false));
    }

    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        r0d r0d = (r0d) this;
        return r0d.v(r0d.x(obj, true), r0d.w.size());
    }
}
