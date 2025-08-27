package defpackage;

/* renamed from: nrf  reason: default package */
public final /* synthetic */ class nrf implements nma {
    public final /* synthetic */ orf a;
    public final /* synthetic */ int b;
    public final /* synthetic */ gu6 c;

    public /* synthetic */ nrf(orf orf, int i, gu6 gu6) {
        this.a = orf;
        this.b = i;
        this.c = gu6;
    }

    public final void b(e05 e05, long j, ea6 ea6, boolean z) {
        int i = this.b;
        gu6 gu6 = this.c;
        orf orf = this.a;
        if (orf.j.c) {
            synchronized (orf.j.l) {
                try {
                    if (!orf.j.m.A(orf.a) || i != 2) {
                        if (!((f05) orf.c.a.get(orf.a)).b) {
                            boolean z2 = true;
                            n79.m("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                            orf.i += j;
                            synchronized (orf.j.q) {
                                if (z) {
                                    try {
                                        prf prf = orf.j;
                                        prf.v--;
                                    } catch (Throwable th) {
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                                if (orf.j.v != 0) {
                                    z2 = false;
                                }
                                if (orf.i > orf.j.u || z2) {
                                    prf prf2 = orf.j;
                                    prf2.u = Math.max(orf.i, prf2.u);
                                    for (int i2 = 0; i2 < orf.j.k.size(); i2++) {
                                        ((msd) orf.j.k.get(i2)).j(orf.j.u, z2);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }
        gu6.b(e05, j, ea6, z);
    }
}
