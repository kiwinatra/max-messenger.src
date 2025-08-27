package defpackage;

/* renamed from: nz8  reason: default package */
public final class nz8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public nz8(Object obj) {
        this(obj, -1);
    }

    public final nz8 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new nz8(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz8)) {
            return false;
        }
        nz8 nz8 = (nz8) obj;
        return this.a.equals(nz8.a) && this.b == nz8.b && this.c == nz8.c && this.d == nz8.d && this.e == nz8.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public nz8(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public nz8(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public nz8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
