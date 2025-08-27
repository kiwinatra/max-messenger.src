package defpackage;

/* renamed from: cge  reason: default package */
public final class cge implements Comparable {
    public final int a;
    public final int b;

    public cge(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int compareTo(Object obj) {
        return this.a - ((cge) obj).a;
    }
}
