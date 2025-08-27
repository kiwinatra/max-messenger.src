package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: ts  reason: default package */
public final class ts extends qae implements Map {
    public os o;
    public qs v;
    public ss w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts(qae qae) {
        super(0);
        int i = qae.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(qae.f(i2), qae.i(i2));
            }
        } else if (i > 0) {
            ArraysKt___ArraysJvmKt.copyInto(qae.a, this.a, 0, 0, i);
            ArraysKt___ArraysJvmKt.copyInto((T[]) qae.b, (T[]) this.b, 0, 0, i << 1);
            this.c = i;
        }
    }

    public final Set entrySet() {
        os osVar = this.o;
        if (osVar != null) {
            return osVar;
        }
        os osVar2 = new os(this);
        this.o = osVar2;
        return osVar2;
    }

    public final boolean j(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.c;
        for (Object remove : collection) {
            super.remove(remove);
        }
        return i != this.c;
    }

    public final Set keySet() {
        qs qsVar = this.v;
        if (qsVar != null) {
            return qsVar;
        }
        qs qsVar2 = new qs(this);
        this.v = qsVar2;
        return qsVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.c;
    }

    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        ss ssVar = this.w;
        if (ssVar != null) {
            return ssVar;
        }
        ss ssVar2 = new ss(this);
        this.w = ssVar2;
        return ssVar2;
    }
}
