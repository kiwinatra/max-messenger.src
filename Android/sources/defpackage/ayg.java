package defpackage;

import java.util.Objects;

/* renamed from: ayg  reason: default package */
public final class ayg extends rxg {
    public static final ayg v = new ayg(new Object[0], 0);
    public final transient Object[] c;
    public final transient int o;

    public ayg(Object[] objArr, int i) {
        this.c = objArr;
        this.o = i;
    }

    public final int b(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.o;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int d() {
        return this.o;
    }

    public final int e() {
        return 0;
    }

    public final boolean g() {
        return false;
    }

    public final Object get(int i) {
        vzg.N(i, this.o);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] l() {
        return this.c;
    }

    public final int size() {
        return this.o;
    }
}
