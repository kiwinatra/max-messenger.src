package defpackage;

import java.util.Objects;

/* renamed from: k0d  reason: default package */
public final class k0d extends tb7 {
    public static final k0d v = new k0d(new Object[0], 0);
    public final transient Object[] c;
    public final transient int o;

    public k0d(Object[] objArr, int i) {
        this.c = objArr;
        this.o = i;
    }

    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.o;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object[] e() {
        return this.c;
    }

    public final int f() {
        return this.o;
    }

    public final int g() {
        return 0;
    }

    public final Object get(int i) {
        b0h.g(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final boolean l() {
        return false;
    }

    public final int size() {
        return this.o;
    }
}
