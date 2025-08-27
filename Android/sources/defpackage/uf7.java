package defpackage;

/* renamed from: uf7  reason: default package */
public final class uf7 extends k03 {
    public final nv0 X;
    public dm4 Y;
    public long Z;
    public volatile boolean v0;

    public uf7(h74 h74, p74 p74, ca6 ca6, int i, Object obj, nv0 nv0) {
        super(h74, p74, 2, ca6, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.X = nv0;
    }

    public final void a() {
        this.v0 = true;
    }

    public final void load() {
        gf4 gf4;
        boolean z;
        if (this.Z == 0) {
            this.X.b(this.Y, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            p74 b = this.b.b(this.Z);
            sne sne = this.z;
            gf4 = new gf4(sne, b.f, sne.N(b));
            do {
                if (!this.v0) {
                    int i = this.X.a.i(gf4, nv0.X);
                    z = false;
                    y64.j(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.Z = gf4.o - this.b.f;
            vzg.r(this.z);
        } catch (Throwable th) {
            vzg.r(this.z);
            throw th;
        }
    }
}
