package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: q93  reason: default package */
public final class q93 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ t93 b;

    public /* synthetic */ q93(t93 t93, int i) {
        this.a = i;
        this.b = t93;
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                t93 t93 = this.b;
                Map b2 = t93.b();
                if (b2 != null) {
                    return b2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = t93.d(entry.getKey());
                    if (d != -1 && cjf.n(t93.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                t93 t93 = this.b;
                Map b2 = t93.b();
                return b2 != null ? b2.entrySet().iterator() : new p93(t93, 1);
            default:
                t93 t932 = this.b;
                Map b3 = t932.b();
                return b3 != null ? b3.keySet().iterator() : new p93(t932, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                t93 t93 = this.b;
                Map b2 = t93.b();
                if (b2 != null) {
                    return b2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!t93.f()) {
                        int c = t93.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = t93.a;
                        Objects.requireNonNull(obj2);
                        int T = y7e.T(key, value, c, obj2, t93.h(), t93.i(), t93.j());
                        if (T != -1) {
                            t93.e(T, c);
                            t93.w--;
                            t93.v += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                t93 t932 = this.b;
                Map b3 = t932.b();
                return b3 != null ? b3.keySet().remove(obj) : t932.g(obj) != t93.X;
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return this.b.size();
        }
    }
}
