package defpackage;

import java.util.Objects;

/* renamed from: q2h  reason: default package */
public final class q2h extends p2h {
    public static final q2h v = new q2h(new Object[0], 0);
    public final transient Object[] c;
    public final transient int o;

    public q2h(Object[] objArr, int i) {
        this.c = objArr;
        this.o = i;
    }

    public final Object[] b() {
        return this.c;
    }

    public final int d() {
        return 0;
    }

    public final int e() {
        return this.o;
    }

    public final boolean f() {
        return false;
    }

    public final int g(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.o;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final Object get(int i) {
        o54.T(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.o;
    }
}
