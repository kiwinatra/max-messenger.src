package defpackage;

import java.util.Objects;

/* renamed from: o0d  reason: default package */
public final class o0d extends tb7 {
    public final transient Object[] c;
    public final transient int o;
    public final transient int v;

    public o0d(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.o = i;
        this.v = i2;
    }

    public final Object get(int i) {
        b0h.g(i, this.v);
        Object obj = this.c[(i * 2) + this.o];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final boolean l() {
        return true;
    }

    public final int size() {
        return this.v;
    }
}
