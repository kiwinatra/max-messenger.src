package defpackage;

import java.util.Objects;

/* renamed from: jyg  reason: default package */
public final class jyg extends rxg {
    public final transient Object[] c;
    public final transient int o;
    public final transient int v;

    public jyg(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.o = i;
        this.v = i2;
    }

    public final boolean g() {
        return true;
    }

    public final Object get(int i) {
        vzg.N(i, this.v);
        Object obj = this.c[i + i + this.o];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.v;
    }
}
