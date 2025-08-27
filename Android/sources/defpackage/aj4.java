package defpackage;

/* renamed from: aj4  reason: default package */
public final class aj4 implements Comparable {
    public final boolean a;
    public final boolean b;

    public aj4(ca6 ca6, int i) {
        this.a = (ca6.o & 1) == 0 ? false : true;
        this.b = rj4.d(i, false);
    }

    public final int compareTo(Object obj) {
        aj4 aj4 = (aj4) obj;
        return y93.a.d(this.b, aj4.b).d(this.a, aj4.a).f();
    }
}
