package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: hc7  reason: default package */
public final class hc7 extends wb7 implements NavigableMap {
    public static final q5a y;
    public static final hc7 z;
    public final transient r0d v;
    public final transient tb7 w;
    public final transient hc7 x;

    static {
        q5a q5a = q5a.a;
        y = q5a;
        r0d t = ic7.t(q5a);
        lx5 lx5 = tb7.b;
        z = new hc7(t, k0d.v, (hc7) null);
    }

    public hc7(r0d r0d, tb7 tb7, hc7 hc7) {
        this.v = r0d;
        this.w = tb7;
        this.x = hc7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hc7 k(java.util.TreeMap r11) {
        /*
            java.util.Comparator r0 = r11.comparator()
            r1 = 1
            q5a r2 = y
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x000f
        L_0x000b:
            boolean r0 = r2.equals(r0)
        L_0x000f:
            java.util.Set r11 = r11.entrySet()
            java.util.Map$Entry[] r3 = defpackage.wb7.o
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L_0x001a
            goto L_0x0035
        L_0x001a:
            java.util.Iterator r11 = r11.iterator()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.getClass()
        L_0x0026:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r11.next()
            r4.add(r5)
            goto L_0x0026
        L_0x0034:
            r11 = r4
        L_0x0035:
            java.lang.Object[] r11 = r11.toArray(r3)
            java.util.Map$Entry[] r11 = (java.util.Map.Entry[]) r11
            int r3 = r11.length
            if (r3 == 0) goto L_0x00fa
            r4 = 0
            r5 = 0
            if (r3 == r1) goto L_0x00d6
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Object[] r7 = new java.lang.Object[r3]
            if (r0 == 0) goto L_0x0061
        L_0x0048:
            if (r4 >= r3) goto L_0x00c3
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            defpackage.m5a.l(r1, r0)
            r6[r4] = r1
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0061:
            ks3 r0 = new ks3
            r8 = 1
            r0.<init>(r8, r2)
            java.util.Arrays.sort(r11, r4, r3, r0)
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r8 = r0.getKey()
            r6[r4] = r8
            java.lang.Object r0 = r0.getValue()
            r7[r4] = r0
            r4 = r6[r4]
            defpackage.m5a.l(r4, r0)
        L_0x0080:
            if (r1 >= r3) goto L_0x00c3
            int r0 = r1 + -1
            r0 = r11[r0]
            java.util.Objects.requireNonNull(r0)
            r4 = r11[r1]
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r9 = r4.getKey()
            java.lang.Object r10 = r4.getValue()
            defpackage.m5a.l(r9, r10)
            r6[r1] = r9
            r7[r1] = r10
            int r8 = r2.compare(r8, r9)
            if (r8 == 0) goto L_0x00a7
            int r1 = r1 + 1
            r8 = r9
            goto L_0x0080
        L_0x00a7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Multiple entries with same key: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x00c3:
            hc7 r11 = new hc7
            r0d r0 = new r0d
            k0d r1 = defpackage.tb7.n(r3, r6)
            r0.<init>(r1, r2)
            k0d r1 = defpackage.tb7.n(r3, r7)
            r11.<init>(r0, r1, r5)
            goto L_0x00fe
        L_0x00d6:
            r11 = r11[r4]
            java.util.Objects.requireNonNull(r11)
            java.lang.Object r0 = r11.getKey()
            java.lang.Object r11 = r11.getValue()
            hc7 r1 = new hc7
            r0d r3 = new r0d
            k0d r0 = defpackage.tb7.t(r0)
            r2.getClass()
            r3.<init>(r0, r2)
            k0d r11 = defpackage.tb7.t(r11)
            r1.<init>(r3, r11, r5)
            r11 = r1
            goto L_0x00fe
        L_0x00fa:
            hc7 r11 = l(r2)
        L_0x00fe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc7.k(java.util.TreeMap):hc7");
    }

    public static hc7 l(Comparator comparator) {
        return q5a.a.equals(comparator) ? z : new hc7(ic7.t(comparator), k0d.v, (hc7) null);
    }

    public static hc7 o() {
        return z;
    }

    public final dc7 c() {
        if (!isEmpty()) {
            return new gc7(this);
        }
        int i = dc7.c;
        return q0d.X;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final Comparator comparator() {
        return this.v.o;
    }

    public final dc7 d() {
        throw new AssertionError("should never be called");
    }

    public final NavigableSet descendingKeySet() {
        return this.v.descendingSet();
    }

    public final NavigableMap descendingMap() {
        hc7 hc7 = this.x;
        if (hc7 != null) {
            return hc7;
        }
        boolean isEmpty = isEmpty();
        r0d r0d = this.v;
        return isEmpty ? l(f5b.a(r0d.o).b()) : new hc7((r0d) r0d.descendingSet(), this.w.w(), this);
    }

    public final kb7 e() {
        throw new AssertionError("should never be called");
    }

    public final Set entrySet() {
        return super.entrySet();
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(0);
    }

    public final Object firstKey() {
        return this.v.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final boolean g() {
        return this.v.w.l() || this.w.l();
    }

    public final Object get(Object obj) {
        int indexOf = this.v.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.w.get(indexOf);
    }

    public final dc7 h() {
        return this.v;
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final kb7 i() {
        return this.w;
    }

    public final Set keySet() {
        return this.v;
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(this.w.size() - 1);
    }

    public final Object lastKey() {
        return this.v.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    public final hc7 m(int i, int i2) {
        tb7 tb7 = this.w;
        if (i == 0 && i2 == tb7.size()) {
            return this;
        }
        r0d r0d = this.v;
        return i == i2 ? l(r0d.o) : new hc7(r0d.v(i, i2), tb7.subList(i, i2), (hc7) null);
    }

    /* renamed from: n */
    public final hc7 headMap(Object obj, boolean z2) {
        obj.getClass();
        return m(0, this.v.w(obj, z2));
    }

    public final NavigableSet navigableKeySet() {
        return this.v;
    }

    /* renamed from: p */
    public final hc7 subMap(Object obj, boolean z2, Object obj2, boolean z3) {
        obj.getClass();
        obj2.getClass();
        if (this.v.o.compare(obj, obj2) <= 0) {
            return headMap(obj2, z3).tailMap(obj, z2);
        }
        throw new IllegalArgumentException(tf6.Y("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final hc7 tailMap(Object obj, boolean z2) {
        obj.getClass();
        return m(this.v.x(obj, z2), this.w.size());
    }

    public final int size() {
        return this.w.size();
    }

    public final Collection values() {
        return this.w;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
