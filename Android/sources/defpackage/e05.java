package defpackage;

/* renamed from: e05  reason: default package */
public final class e05 {
    public final ir8 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final o05 g;

    public e05(ir8 ir8, boolean z, boolean z2, boolean z3, long j, int i, o05 o05) {
        n79.m("Audio and video cannot both be removed", !z || !z2);
        this.a = ir8;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = i;
        this.g = o05;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d05, java.lang.Object] */
    public final d05 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final long b(long j) {
        long j2;
        boolean z = this.b;
        o05 o05 = this.g;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            lx5 r = o05.a.listIterator(0);
            j2 = j;
            while (r.hasNext()) {
                j2 = ((m60) r.next()).f(j2);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            lx5 r2 = o05.b.listIterator(0);
            while (r2.hasNext()) {
                ((hh8) r2.next()).getClass();
            }
        }
        return Math.max(j2, j);
    }
}
