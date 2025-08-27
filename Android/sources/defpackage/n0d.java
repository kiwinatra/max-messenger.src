package defpackage;

/* renamed from: n0d  reason: default package */
public final class n0d extends dc7 {
    public final transient wb7 o;
    public final transient tb7 v;

    public n0d(wb7 wb7, o0d o0d) {
        this.o = wb7;
        this.v = o0d;
    }

    public final tb7 b() {
        return this.v;
    }

    public final boolean contains(Object obj) {
        return this.o.get(obj) != null;
    }

    public final int d(int i, Object[] objArr) {
        return this.v.d(i, objArr);
    }

    public final boolean l() {
        return true;
    }

    public final wvf m() {
        return this.v.listIterator(0);
    }

    public final int size() {
        return this.o.size();
    }
}
