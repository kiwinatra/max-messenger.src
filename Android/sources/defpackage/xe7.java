package defpackage;

/* renamed from: xe7  reason: default package */
public final class xe7 implements znd {
    public final long a;
    public final pa8 b;
    public final pa8 c;
    public long d;

    public xe7(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        pa8 pa8 = new pa8(0);
        this.b = pa8;
        pa8 pa82 = new pa8(0);
        this.c = pa82;
        pa8.a(0);
        pa82.a(j2);
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(t0g.d(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        pa8 pa8 = this.b;
        return j - pa8.b(pa8.b - 1) < 100000;
    }

    public final pnd e(long j) {
        pa8 pa8 = this.b;
        int d2 = t0g.d(pa8, j);
        long b2 = pa8.b(d2);
        pa8 pa82 = this.c;
        vnd vnd = new vnd(b2, pa82.b(d2));
        if (b2 == j || d2 == pa8.b - 1) {
            return new pnd(vnd, vnd);
        }
        int i = d2 + 1;
        return new pnd(vnd, new vnd(pa8.b(i), pa82.b(i)));
    }

    public final long f() {
        return this.d;
    }
}
