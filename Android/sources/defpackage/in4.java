package defpackage;

/* renamed from: in4  reason: default package */
public final class in4 {
    public static final in4 e = new he3(0).b();
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        int i2 = v0g.a;
    }

    public in4(he3 he3) {
        this.a = he3.a;
        this.b = he3.b;
        this.c = he3.c;
        this.d = (String) he3.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in4)) {
            return false;
        }
        in4 in4 = (in4) obj;
        return this.a == in4.a && this.b == in4.b && this.c == in4.c && v0g.a(this.d, in4.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
