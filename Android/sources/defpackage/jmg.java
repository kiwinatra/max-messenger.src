package defpackage;

/* renamed from: jmg  reason: default package */
public final class jmg implements Comparable {
    public final int a;
    public final bmg b;

    public jmg(int i, bmg bmg) {
        this.a = i;
        this.b = bmg;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((jmg) obj).a);
    }
}
