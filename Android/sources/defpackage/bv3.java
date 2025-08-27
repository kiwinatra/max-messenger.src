package defpackage;

/* renamed from: bv3  reason: default package */
public final class bv3 extends uj0 {
    public long A0;
    public volatile boolean B0;
    public boolean C0;
    public final int x0;
    public final long y0;
    public final n03 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv3(j74 j74, q74 q74, ea6 ea6, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, n03 n03) {
        super(j74, q74, ea6, i, obj, j, j2, j3, j4, j5);
        this.x0 = i2;
        this.y0 = j6;
        this.z0 = n03;
    }

    public final void a() {
        this.B0 = true;
    }

    public final long b() {
        return this.X + ((long) this.x0);
    }

    public final boolean c() {
        return this.C0;
    }

    public final void e(fj fjVar) {
        ea6 ea6 = this.o;
        if (vq9.i(ea6.m)) {
            int i = ea6.I;
            int i2 = ea6.J;
            if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                zpf v = fjVar.v(4);
                int i3 = i * i2;
                long j = (this.y - this.x) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    v.b(new l8b(), 0, 0);
                    v.a(((long) i4) * j, 0, 0, 0, (xpf) null);
                }
            }
        }
    }

    public final void load() {
        hf4 hf4;
        fj fjVar = this.v0;
        n79.o(fjVar);
        if (this.A0 == 0) {
            long j = this.y0;
            for (jcd jcd : (jcd[]) fjVar.c) {
                if (jcd.F != j) {
                    jcd.F = j;
                    jcd.z = true;
                }
            }
            n03 n03 = this.z0;
            long j2 = this.Y;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.y0;
            long j4 = this.Z;
            ((ov0) n03).b(fjVar, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.y0);
        }
        try {
            q74 b = this.b.b(this.A0);
            tne tne = this.z;
            hf4 = new hf4(tne, b.f, tne.G(b));
            while (!this.B0) {
                int g = ((ov0) this.z0).a.g(hf4, ov0.Y);
                n79.n(g != 1);
                if (!(g == 0)) {
                    break;
                }
            }
            e(fjVar);
            this.A0 = hf4.o - this.b.f;
            b0h.l(this.z);
            this.C0 = !this.B0;
        } catch (Throwable th) {
            b0h.l(this.z);
            throw th;
        }
    }
}
