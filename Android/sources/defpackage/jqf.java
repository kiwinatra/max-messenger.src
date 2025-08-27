package defpackage;

/* renamed from: jqf  reason: default package */
public class jqf implements jv0 {
    public final tb7 A0;
    public final tb7 B0;
    public final int C0;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final fqf G0;
    public final dc7 H0;
    public final int X;
    public final boolean Y;
    public final tb7 Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int v;
    public final int v0;
    public final int w;
    public final tb7 w0;
    public final int x;
    public final int x0;
    public final int y;
    public final int y0;
    public final int z;
    public final int z0;

    static {
        new jqf(new hqf());
    }

    public jqf(hqf hqf) {
        this.a = hqf.a;
        this.b = hqf.b;
        this.c = hqf.c;
        this.o = hqf.d;
        this.v = hqf.e;
        this.w = hqf.f;
        this.x = hqf.g;
        this.y = hqf.h;
        this.z = hqf.i;
        this.X = hqf.j;
        this.Y = hqf.k;
        this.Z = hqf.l;
        this.v0 = hqf.m;
        this.w0 = hqf.n;
        this.x0 = hqf.o;
        this.y0 = hqf.p;
        this.z0 = hqf.q;
        this.A0 = hqf.r;
        this.B0 = hqf.s;
        this.C0 = hqf.t;
        this.D0 = hqf.u;
        this.E0 = hqf.v;
        this.F0 = hqf.w;
        this.G0 = hqf.x;
        this.H0 = hqf.y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jqf jqf = (jqf) obj;
        return this.a == jqf.a && this.b == jqf.b && this.c == jqf.c && this.o == jqf.o && this.v == jqf.v && this.w == jqf.w && this.x == jqf.x && this.y == jqf.y && this.Y == jqf.Y && this.z == jqf.z && this.X == jqf.X && this.Z.equals(jqf.Z) && this.v0 == jqf.v0 && this.w0.equals(jqf.w0) && this.x0 == jqf.x0 && this.y0 == jqf.y0 && this.z0 == jqf.z0 && this.A0.equals(jqf.A0) && this.B0.equals(jqf.B0) && this.C0 == jqf.C0 && this.D0 == jqf.D0 && this.E0 == jqf.E0 && this.F0 == jqf.F0 && this.G0.equals(jqf.G0) && this.H0.equals(jqf.H0);
    }

    public int hashCode() {
        int hashCode = this.Z.hashCode();
        int hashCode2 = this.w0.hashCode();
        int hashCode3 = this.A0.hashCode();
        int hashCode4 = this.B0.hashCode();
        return ((this.G0.a.hashCode() + ((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + (this.Y ? 1 : 0)) * 31) + this.z) * 31) + this.X) * 31)) * 31) + this.v0) * 31)) * 31) + this.x0) * 31) + this.y0) * 31) + this.z0) * 31)) * 31)) * 31) + this.C0) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31)) * 31) + this.H0.hashCode();
    }
}
