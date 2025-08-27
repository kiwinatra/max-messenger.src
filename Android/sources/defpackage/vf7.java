package defpackage;

/* renamed from: vf7  reason: default package */
public final class vf7 extends m03 {
    public final n03 X;
    public fj Y;
    public long Z;
    public volatile boolean v0;

    public vf7(j74 j74, q74 q74, ea6 ea6, int i, Object obj, n03 n03) {
        super(j74, q74, 2, ea6, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.X = n03;
    }

    public final void a() {
        this.v0 = true;
    }

    public final void load() {
        hf4 hf4;
        boolean z;
        if (this.Z == 0) {
            ((ov0) this.X).b(this.Y, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            q74 b = this.b.b(this.Z);
            tne tne = this.z;
            hf4 = new hf4(tne, b.f, tne.G(b));
            do {
                if (!this.v0) {
                    int g = ((ov0) this.X).a.g(hf4, ov0.Y);
                    z = false;
                    n79.n(g != 1);
                    if (g == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.Z = hf4.o - this.b.f;
            b0h.l(this.z);
        } catch (Throwable th) {
            b0h.l(this.z);
            throw th;
        }
    }
}
