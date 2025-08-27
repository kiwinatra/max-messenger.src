package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: d2  reason: default package */
public final class d2 extends g2 implements NavigableMap {
    public final /* synthetic */ x1 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d2(x1 x1Var, NavigableMap navigableMap) {
        super(x1Var, navigableMap);
        this.x = x1Var;
    }

    public final SortedSet b() {
        return new e2(this.x, d());
    }

    public final SortedSet c() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return ((d2) descendingMap()).navigableKeySet();
    }

    public final NavigableMap descendingMap() {
        return new d2(this.x, d().descendingMap());
    }

    public final mb7 e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection d = this.x.d();
        d.addAll((Collection) entry.getValue());
        it.remove();
        return new mb7(entry.getKey(), Collections.unmodifiableList((List) d));
    }

    /* renamed from: f */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return e(((z1) entrySet()).iterator());
    }

    public final Map.Entry pollLastEntry() {
        return e(((z1) ((b2) descendingMap()).entrySet()).iterator());
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new d2(this.x, d().headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new d2(this.x, d().subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new d2(this.x, d().tailMap(obj, z));
    }
}
