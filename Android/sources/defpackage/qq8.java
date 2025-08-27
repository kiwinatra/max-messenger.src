package defpackage;

/* renamed from: qq8  reason: default package */
public class qq8 {
    public static final qq8 h = new oq8().a();
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public qq8(oq8 oq8) {
        this.a = v0g.h0(oq8.a);
        this.c = v0g.h0(oq8.b);
        this.b = oq8.a;
        this.d = oq8.b;
        this.e = oq8.c;
        this.f = oq8.d;
        this.g = oq8.e;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [oq8, java.lang.Object] */
    public final oq8 a() {
        ? obj = new Object();
        obj.a = this.b;
        obj.b = this.d;
        obj.c = this.e;
        obj.d = this.f;
        obj.e = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq8)) {
            return false;
        }
        qq8 qq8 = (qq8) obj;
        return this.b == qq8.b && this.d == qq8.d && this.e == qq8.e && this.f == qq8.f && this.g == qq8.g;
    }

    public final int hashCode() {
        long j2 = this.b;
        long j3 = this.d;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
