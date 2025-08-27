package defpackage;

/* renamed from: pkf  reason: default package */
public final class pkf implements a5d {
    public final long b;
    public final a5d c;

    public pkf(long j, a5d a5d) {
        bs0.m("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = a5d;
    }

    public final long a() {
        return this.b;
    }

    public final z4d b(gv1 gv1) {
        z4d b2 = this.c.b(gv1);
        long j = this.b;
        if (j <= 0) {
            return b2;
        }
        return gv1.b >= j - b2.a ? z4d.d : b2;
    }
}
