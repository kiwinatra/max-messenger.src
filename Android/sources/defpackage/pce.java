package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pce  reason: default package */
public final class pce extends uj0 {
    public boolean A0;
    public final int x0;
    public final ea6 y0;
    public long z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pce(j74 j74, q74 q74, ea6 ea6, int i, Object obj, long j, long j2, long j3, int i2, ea6 ea62) {
        super(j74, q74, ea6, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.x0 = i2;
        this.y0 = ea62;
    }

    public final void a() {
    }

    public final boolean c() {
        return this.A0;
    }

    public final void load() {
        tne tne = this.z;
        fj fjVar = this.v0;
        n79.o(fjVar);
        for (jcd jcd : (jcd[]) fjVar.c) {
            if (jcd.F != 0) {
                jcd.F = 0;
                jcd.z = true;
            }
        }
        zpf v = fjVar.v(this.x0);
        v.e(this.y0);
        try {
            long G = tne.G(this.b.b(this.z0));
            if (G != -1) {
                G += this.z0;
            }
            hf4 hf4 = new hf4(this.z, this.z0, G);
            for (int i = 0; i != -1; i = v.c(hf4, IntCompanionObject.MAX_VALUE, true)) {
                this.z0 += (long) i;
            }
            v.a(this.x, 1, (int) this.z0, 0, (xpf) null);
            b0h.l(tne);
            this.A0 = true;
        } catch (Throwable th) {
            b0h.l(tne);
            throw th;
        }
    }
}
