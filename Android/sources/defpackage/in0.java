package defpackage;

/* renamed from: in0  reason: default package */
public final class in0 implements rnd {
    public final ln0 a;
    public final long b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public in0(ln0 ln0, long j, long j2, long j3, long j4, long j5) {
        this.a = ln0;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    public final boolean c() {
        return true;
    }

    public final pnd e(long j) {
        vnd vnd = new vnd(j, kn0.a(this.a.a(j), this.c, this.d, this.e, this.f, this.g));
        return new pnd(vnd, vnd);
    }

    public final long f() {
        return this.b;
    }
}
