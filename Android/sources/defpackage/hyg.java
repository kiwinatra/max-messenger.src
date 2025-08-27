package defpackage;

import java.util.Iterator;

/* renamed from: hyg  reason: default package */
public final class hyg extends zxg {
    public final transient yxg c;
    public final transient rxg o;

    public hyg(yxg yxg, jyg jyg) {
        this.c = yxg;
        this.o = jyg;
    }

    public final int b(Object[] objArr) {
        return this.o.b(objArr);
    }

    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    public final rxg f() {
        return this.o;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.o.listIterator(0);
    }

    public final int size() {
        return ((kyg) this.c).w;
    }
}
