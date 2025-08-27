package defpackage;

/* renamed from: v8g  reason: default package */
public final class v8g {
    public static final v8g e = new v8g(0, 0);
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i2 = v0g.a;
    }

    public v8g(int i2, int i3) {
        this(1.0f, i2, i3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8g)) {
            return false;
        }
        v8g v8g = (v8g) obj;
        return this.a == v8g.a && this.b == v8g.b && this.c == v8g.c && this.d == v8g.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }

    public v8g(float f2, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }
}
