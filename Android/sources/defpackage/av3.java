package defpackage;

/* renamed from: av3  reason: default package */
public final class av3 extends tj0 {
    public long A0;
    public volatile boolean B0;
    public boolean C0;
    public final int x0;
    public final long y0;
    public final nv0 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av3(h74 h74, p74 p74, ca6 ca6, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, nv0 nv0) {
        super(h74, p74, ca6, i, obj, j, j2, j3, j4, j5);
        this.x0 = i2;
        this.y0 = j6;
        this.z0 = nv0;
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

    public final void load() {
        gf4 gf4;
        boolean z;
        if (this.A0 == 0) {
            dm4 dm4 = this.v0;
            y64.k(dm4);
            long j = this.y0;
            for (icd icd : (icd[]) dm4.c) {
                if (icd.F != j) {
                    icd.F = j;
                    icd.z = true;
                }
            }
            nv0 nv0 = this.z0;
            long j2 = this.Y;
            long j3 = -9223372036854775807L;
            long j4 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.y0;
            long j5 = this.Z;
            if (j5 != -9223372036854775807L) {
                j3 = j5 - this.y0;
            }
            nv0.b(dm4, j4, j3);
        }
        try {
            p74 b = this.b.b(this.A0);
            sne sne = this.z;
            gf4 = new gf4(sne, b.f, sne.N(b));
            do {
                if (!this.B0) {
                    int i = this.z0.a.i(gf4, nv0.X);
                    y64.j(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.A0 = gf4.o - this.b.f;
            vzg.r(this.z);
            this.C0 = !this.B0;
        } catch (Throwable th) {
            vzg.r(this.z);
            throw th;
        }
    }
}
