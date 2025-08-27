package defpackage;

/* renamed from: rt8  reason: default package */
public final class rt8 {
    public final nz8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public rt8(nz8 nz8, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = true;
        n79.g(!z8 || z6);
        n79.g(!z7 || z6);
        if (z5 && (z6 || z7 || z8)) {
            z9 = false;
        }
        n79.g(z9);
        this.a = nz8;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    public final rt8 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new rt8(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final rt8 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new rt8(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rt8.class != obj.getClass()) {
            return false;
        }
        rt8 rt8 = (rt8) obj;
        return this.b == rt8.b && this.c == rt8.c && this.d == rt8.d && this.e == rt8.e && this.f == rt8.f && this.g == rt8.g && this.h == rt8.h && this.i == rt8.i && v0g.a(this.a, rt8.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
