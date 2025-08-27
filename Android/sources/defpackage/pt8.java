package defpackage;

/* renamed from: pt8  reason: default package */
public class pt8 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public pt8(pt8 pt8) {
        this.a = pt8.a;
        this.b = pt8.b;
        this.c = pt8.c;
        this.d = pt8.d;
        this.e = pt8.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt8)) {
            return false;
        }
        pt8 pt8 = (pt8) obj;
        return this.a.equals(pt8.a) && this.b == pt8.b && this.c == pt8.c && this.d == pt8.d && this.e == pt8.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public pt8(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
