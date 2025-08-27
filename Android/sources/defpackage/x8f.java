package defpackage;

/* renamed from: x8f  reason: default package */
public final class x8f implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public x8f(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
    }

    public final int compareTo(Object obj) {
        x8f x8f = (x8f) obj;
        int i = this.a - x8f.a;
        return i == 0 ? this.b - x8f.b : i;
    }
}
