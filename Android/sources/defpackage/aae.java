package defpackage;

/* renamed from: aae  reason: default package */
public final class aae {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public aae(z9e z9e) {
        this.a = z9e.a;
        this.b = z9e.b;
        this.c = z9e.c;
        this.e = z9e.e;
        this.d = z9e.d;
        this.f = z9e.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aae.class != obj.getClass()) {
            return false;
        }
        aae aae = (aae) obj;
        if (this.a == aae.a && this.b == aae.b && this.c == aae.c && this.d == aae.d && this.f == aae.f) {
            return this.e == aae.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
