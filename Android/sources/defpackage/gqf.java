package defpackage;

/* renamed from: gqf  reason: default package */
public final class gqf {
    public static final gqf d = new gqf(new n70());
    public static final String e = Integer.toString(1, 36);
    public static final String f = Integer.toString(2, 36);
    public static final String g = Integer.toString(3, 36);
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i = v0g.a;
    }

    public gqf(n70 n70) {
        this.a = n70.a;
        this.b = n70.b;
        this.c = n70.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gqf.class != obj.getClass()) {
            return false;
        }
        gqf gqf = (gqf) obj;
        return this.a == gqf.a && this.b == gqf.b && this.c == gqf.c;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
