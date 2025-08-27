package defpackage;

/* renamed from: oq8  reason: default package */
public final class oq8 {
    public long a;
    public long b = Long.MIN_VALUE;
    public boolean c;
    public boolean d;
    public boolean e;

    public qq8 a() {
        return new qq8(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [pq8, rq8] */
    public rq8 b() {
        return new pq8(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qq8, sq8] */
    public sq8 c() {
        return new qq8(this);
    }

    public void d(long j) {
        n79.g(j == Long.MIN_VALUE || j >= 0);
        this.b = j;
    }

    public void e(long j) {
        f(v0g.S(j));
    }

    public void f(long j) {
        n79.g(j >= 0);
        this.a = j;
    }

    public void g(boolean z) {
        this.e = z;
    }
}
