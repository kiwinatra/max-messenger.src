package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Lazy;

/* renamed from: naf  reason: default package */
public final /* synthetic */ class naf implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ paf b;
    public final /* synthetic */ u6h c;

    public /* synthetic */ naf(paf paf, u6h u6h, int i) {
        this.a = i;
        this.b = paf;
        this.c = u6h;
    }

    public final void accept(Object obj) {
        u6h u6h = this.c;
        paf paf = this.b;
        switch (this.a) {
            case 0:
                oaf oaf = (oaf) obj;
                paf.getClass();
                boolean z = oaf.b;
                File file = oaf.a;
                if (z) {
                    z68.c("paf", "Has tam emoji font file", new Object[0]);
                    paf.d(file, u6h);
                    return;
                }
                z68.c("paf", "Hasn't tam emoji font file", new Object[0]);
                z68.c("paf", "Download font", new Object[0]);
                if (!jbd.d(paf.i)) {
                    z68.c("paf", "Font already downloading", new Object[0]);
                    return;
                }
                Lazy lazy = paf.g;
                ((rh3) lazy.getValue()).c(paf);
                if (((rh3) lazy.getValue()).b() != mi3.b) {
                    if (u6h != null) {
                        u6h.k();
                    }
                    z68.n("paf", (IOException) null, "Can't download now. Waiting for Wi-Fi", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                cia cia = new cia(new ki5(paf, file, 2), 0);
                gcf gcf = (gcf) paf.a.getValue();
                gcf.getClass();
                dka u = new yia(cia, new ecf(gcf, 5, 2), 6).u(5, m58.h);
                jbf jbf = (jbf) paf.e.getValue();
                jbf.getClass();
                pka x = u.x(((kbf) jbf).a());
                or7 or7 = new or7(new fkd(paf, file, u6h, 3), new naf(paf, u6h, 2), m58.e);
                x.a(or7);
                paf.i = or7;
                return;
            case 1:
                ((uta) ((m95) paf.f.getValue())).c(new Exception("Can't read emoji font", (Throwable) obj), true);
                if (u6h != null) {
                    u6h.k();
                }
                paf.j = null;
                return;
            default:
                ((uta) ((m95) paf.f.getValue())).c(new Exception("Can't download emoji font", (Throwable) obj), true);
                if (u6h != null) {
                    u6h.k();
                }
                ((rh3) paf.g.getValue()).d(paf);
                paf.j = null;
                return;
        }
    }
}
