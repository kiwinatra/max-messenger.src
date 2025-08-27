package defpackage;

/* renamed from: zi4  reason: default package */
public final class zi4 extends nj4 implements Comparable {
    public final int v;
    public final int w = this.o.b();

    public zi4(int i, spf spf, int i2, ej4 ej4, int i3) {
        super(i, spf, i2);
        this.v = pk0.o(i3, ej4.t0) ? 1 : 0;
    }

    public final int a() {
        return this.v;
    }

    public final /* bridge */ /* synthetic */ boolean b(nj4 nj4) {
        zi4 zi4 = (zi4) nj4;
        return false;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.w, ((zi4) obj).w);
    }
}
