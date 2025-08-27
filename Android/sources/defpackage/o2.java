package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o2  reason: default package */
public final class o2 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                ((x1) ((p2) this.b)).b();
                return;
            case 1:
                ((t93) this.b).clear();
                return;
            default:
                ((Map) this.b).clear();
                return;
        }
    }

    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                for (Collection contains : ((p2) this.b).a().values()) {
                    if (contains.contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return ((Map) this.b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((Map) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                x1 x1Var = (x1) ((p2) this.b);
                x1Var.getClass();
                return new y1(x1Var);
            case 1:
                t93 t93 = (t93) this.b;
                Map b2 = t93.b();
                return b2 != null ? b2.values().iterator() : new p93(t93, 2);
            default:
                return new irf(((Map) this.b).entrySet().iterator());
        }
    }

    public boolean remove(Object obj) {
        switch (this.a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = (Map) this.b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (cjf.n(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((x1) ((p2) this.b)).v;
            case 1:
                return ((t93) this.b).size();
            default:
                return ((Map) this.b).size();
        }
    }

    public o2(Map map) {
        this.a = 2;
        map.getClass();
        this.b = map;
    }
}
