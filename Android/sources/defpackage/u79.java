package defpackage;

/* renamed from: u79  reason: default package */
public final class u79 implements kcd {
    public final kcd a;
    public final long b;

    public u79(kcd kcd, long j) {
        this.a = kcd;
        this.b = j;
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int f(xe8 xe8, aa4 aa4, int i) {
        int f = this.a.f(xe8, aa4, i);
        if (f == -4) {
            aa4.w = Math.max(0, aa4.w + this.b);
        }
        return f;
    }
}
