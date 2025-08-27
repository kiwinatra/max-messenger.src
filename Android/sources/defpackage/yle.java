package defpackage;

/* renamed from: yle  reason: default package */
public final class yle implements rnd {
    public final /* synthetic */ rnd a;
    public final /* synthetic */ jz2 b;

    public yle(jz2 jz2, rnd rnd) {
        this.b = jz2;
        this.a = rnd;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final pnd e(long j) {
        pnd e = this.a.e(j);
        vnd vnd = e.a;
        long j2 = vnd.a;
        long j3 = vnd.b;
        long j4 = this.b.b;
        vnd vnd2 = new vnd(j2, j3 + j4);
        vnd vnd3 = e.b;
        return new pnd(vnd2, new vnd(vnd3.a, vnd3.b + j4));
    }

    public final long f() {
        return this.a.f();
    }
}
