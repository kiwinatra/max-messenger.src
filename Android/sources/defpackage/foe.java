package defpackage;

import kotlin.Lazy;
import one.me.rlottie.network.RLottieLoaderPipeline;

/* renamed from: foe  reason: default package */
public final class foe extends pz {
    public final Lazy c;
    public final Lazy d;
    public final ln5 e;
    public wx f;
    public final eoe g = new eoe(this);

    public foe(l20 l20, Lazy lazy, Lazy lazy2, ln5 ln5) {
        super(l20);
        this.c = lazy;
        this.d = lazy2;
        this.e = ln5;
    }

    public final void a() {
        b(this.f, new Exception("cancelled"));
    }

    public final jha d() {
        jha d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        wx wxVar = this.f;
        if (wxVar != null) {
            return wxVar;
        }
        this.f = new wx();
        f20 f20 = this.a.f;
        if (f20.j == 4) {
            RLottieLoaderPipeline.download(f20.l, true).withListener(this.g);
        } else {
            String str = f20.h;
            if (cvg.A(str)) {
                str = f20.b;
            }
            ((s97) this.d.getValue()).a(str, new ykb(6, this));
        }
        return this.f;
    }
}
