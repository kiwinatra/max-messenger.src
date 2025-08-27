package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r0d  reason: default package */
public final class r0d extends ic7 {
    public static final r0d x = new r0d(k0d.v, q5a.a);
    public final transient tb7 w;

    static {
        lx5 lx5 = tb7.b;
    }

    public r0d(tb7 tb7, Comparator comparator) {
        super(comparator);
        this.w = tb7;
    }

    public final tb7 b() {
        return this.w;
    }

    public final Object ceiling(Object obj) {
        int x2 = x(obj, true);
        tb7 tb7 = this.w;
        if (x2 == tb7.size()) {
            return null;
        }
        return tb7.get(x2);
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.w, obj, this.o) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof vx9) {
            collection = ((vx9) collection).h();
        }
        Comparator comparator = this.o;
        if (!o5a.E(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        wvf m = m();
        Iterator it = collection.iterator();
        r1 r1Var = (r1) m;
        if (!r1Var.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = r1Var.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!r1Var.hasNext()) {
                        return false;
                    }
                    next2 = r1Var.next();
                } else if (compare == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int d(int i, Object[] objArr) {
        return this.w.d(i, objArr);
    }

    public final Iterator descendingIterator() {
        return this.w.w().listIterator(0);
    }

    public final Object[] e() {
        return this.w.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ ClassCastException | NoSuchElementException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            tb7 r1 = r5.w
            int r1 = r1.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0019
            return r2
        L_0x0019:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x0020:
            java.util.Comparator r1 = r5.o
            boolean r3 = defpackage.o5a.E(r6, r1)
            if (r3 == 0) goto L_0x004c
            java.util.Iterator r6 = r6.iterator()
            wvf r5 = r5.m()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
        L_0x0030:
            r3 = r5
            r1 r3 = (defpackage.r1) r3     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            boolean r4 = r3.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r4 == 0) goto L_0x004a
            java.lang.Object r3 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r4 == 0) goto L_0x0049
            int r3 = r1.compare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r3 == 0) goto L_0x0030
        L_0x0049:
            return r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        L_0x004c:
            boolean r5 = r5.containsAll(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0d.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.w.f();
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.w.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int w2 = w(obj, true) - 1;
        if (w2 == -1) {
            return null;
        }
        return this.w.get(w2);
    }

    public final int g() {
        return this.w.g();
    }

    public final Object higher(Object obj) {
        int x2 = x(obj, false);
        tb7 tb7 = this.w;
        if (x2 == tb7.size()) {
            return null;
        }
        return tb7.get(x2);
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.w, obj, this.o);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public final boolean l() {
        return this.w.l();
    }

    public final Object last() {
        if (!isEmpty()) {
            tb7 tb7 = this.w;
            return tb7.get(tb7.size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int w2 = w(obj, false) - 1;
        if (w2 == -1) {
            return null;
        }
        return this.w.get(w2);
    }

    public final wvf m() {
        return this.w.listIterator(0);
    }

    public final int size() {
        return this.w.size();
    }

    public final r0d v(int i, int i2) {
        tb7 tb7 = this.w;
        if (i == 0 && i2 == tb7.size()) {
            return this;
        }
        Comparator comparator = this.o;
        return i < i2 ? new r0d(tb7.subList(i, i2), comparator) : ic7.t(comparator);
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.w, obj, this.o);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int x(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.w, obj, this.o);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
