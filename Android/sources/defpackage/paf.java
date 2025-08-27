package defpackage;

import java.io.File;
import kotlin.Lazy;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: paf  reason: default package */
public final class paf implements qh3 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public ao1 h;
    public or7 i;
    public u6h j;
    public int k;
    public long l;

    public paf(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
    }

    public final void a() {
    }

    public final void b() {
        if (((rh3) this.g.getValue()).b() != mi3.b) {
            jbd.c(this.i);
            u6h u6h = this.j;
            if (u6h != null) {
                int i2 = this.k;
                z68.c(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i2));
                ((LoadEmojiFontWorker) u6h.b).state = new f28(i2);
                return;
            }
            return;
        }
        c(this.j);
    }

    public final void c(u6h u6h) {
        z68.c("paf", "Load font", new Object[0]);
        this.j = u6h;
        if (!jbd.d(this.h)) {
            z68.c("paf", "Font already loading", new Object[0]);
            return;
        }
        mka mka = new mka(2, new h5(20, this));
        jbf jbf = (jbf) this.e.getValue();
        jbf.getClass();
        fce j2 = mka.n(((kbf) jbf).a()).j(xfd.d);
        ao1 ao1 = new ao1(3, new naf(this, u6h, 0), new naf(this, u6h, 1));
        j2.l(ao1);
        this.h = ao1;
    }

    public final void d(File file, u6h u6h) {
        z68.c("paf", "Tam emoji font loaded", new Object[0]);
        a96 a96 = new a96(new srd(file, this.e, this.f));
        if (u6h != null) {
            z68.c(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontSuccess %s", a96);
            ((LoadEmojiFontWorker) u6h.b).state = new g28(a96);
        }
        ((rh3) this.g.getValue()).d(this);
        this.j = null;
    }
}
