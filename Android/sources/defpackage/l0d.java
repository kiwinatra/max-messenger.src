package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: l0d  reason: default package */
public final class l0d extends tb7 {
    public final /* synthetic */ m0d c;

    public l0d(m0d m0d) {
        this.c = m0d;
    }

    public final Object get(int i) {
        m0d m0d = this.c;
        b0h.g(i, m0d.x);
        int i2 = i * 2;
        int i3 = m0d.w;
        Object[] objArr = m0d.v;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.c.x;
    }
}
