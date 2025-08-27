package defpackage;

/* renamed from: mde  reason: default package */
public final class mde extends dc7 {
    public final transient Object o;

    public mde(Object obj) {
        obj.getClass();
        this.o = obj;
    }

    public final tb7 b() {
        return tb7.t(this.o);
    }

    public final boolean contains(Object obj) {
        return this.o.equals(obj);
    }

    public final int d(int i, Object[] objArr) {
        objArr[i] = this.o;
        return i + 1;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final boolean l() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [im7, wvf] */
    public final wvf m() {
        ? wvf = new wvf(0);
        wvf.b = this.o;
        return wvf;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        return "[" + this.o.toString() + ']';
    }
}
