package defpackage;

/* renamed from: mv0  reason: default package */
public final class mv0 implements zpf {
    public final int a;
    public final ea6 b;
    public final ip4 c = new ip4();
    public ea6 d;
    public zpf e;
    public long f;

    public mv0(int i, int i2, ea6 ea6) {
        this.a = i2;
        this.b = ea6;
    }

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        zpf zpf = this.e;
        int i4 = v0g.a;
        zpf.a(j, i, i2, i3, xpf);
    }

    public final void b(l8b l8b, int i, int i2) {
        zpf zpf = this.e;
        int i3 = v0g.a;
        zpf.b(l8b, i, 0);
    }

    public final int c(c74 c74, int i, boolean z) {
        zpf zpf = this.e;
        int i2 = v0g.a;
        return zpf.d(c74, i, z);
    }

    public final void e(ea6 ea6) {
        ea6 ea62 = this.b;
        if (ea62 != null) {
            ea6 = ea6.f(ea62);
        }
        this.d = ea6;
        zpf zpf = this.e;
        int i = v0g.a;
        zpf.e(ea6);
    }
}
