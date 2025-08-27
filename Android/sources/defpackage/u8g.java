package defpackage;

/* renamed from: u8g  reason: default package */
public final class u8g implements jv0 {
    public final int a;
    public final int b;
    public final int c;
    public final float o;

    public u8g(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8g)) {
            return false;
        }
        u8g u8g = (u8g) obj;
        return this.a == u8g.a && this.b == u8g.b && this.c == u8g.c && this.o == u8g.o;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.o) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
