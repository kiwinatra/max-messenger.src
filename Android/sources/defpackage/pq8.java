package defpackage;

/* renamed from: pq8  reason: default package */
public abstract class pq8 implements jv0 {
    public static final zc8 w = new zc8(24);
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean o;
    public final boolean v;

    static {
        new oq8().b();
    }

    public pq8(oq8 oq8) {
        this.a = oq8.a;
        this.b = oq8.b;
        this.c = oq8.c;
        this.o = oq8.d;
        this.v = oq8.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq8)) {
            return false;
        }
        pq8 pq8 = (pq8) obj;
        return this.a == pq8.a && this.b == pq8.b && this.c == pq8.c && this.o == pq8.o && this.v == pq8.v;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.v ? 1 : 0);
    }
}
