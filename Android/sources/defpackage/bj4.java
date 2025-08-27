package defpackage;

/* renamed from: bj4  reason: default package */
public final class bj4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public bj4(int i, ea6 ea6) {
        this.a = (ea6.e & 1) == 0 ? false : true;
        this.b = pk0.o(i, false);
    }

    public final int compareTo(Object obj) {
        bj4 bj4 = (bj4) obj;
        return y93.a.d(this.b, bj4.b).d(this.a, bj4.a).f();
    }
}
