package defpackage;

/* renamed from: kmg  reason: default package */
public final class kmg implements Comparable {
    public final int a;
    public final cmg b;

    public kmg(int i, cmg cmg) {
        this.a = i;
        this.b = cmg;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((kmg) obj).a);
    }
}
