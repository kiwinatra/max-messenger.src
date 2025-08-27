package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.reflect.KProperty;

/* renamed from: jzd  reason: default package */
public final class jzd extends xag {
    public static final /* synthetic */ KProperty[] y0;
    public final wie X = o5a.U();
    public final wie Y = o5a.U();
    public final wie Z = o5a.U();
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final xme v;
    public final wie v0 = o5a.U();
    public final etc w;
    public final wie w0 = o5a.U();
    public final wie x = o5a.U();
    public final s85 x0 = new s85(0);
    public final wie y = o5a.U();
    public final wie z = o5a.U();

    static {
        Class<jzd> cls = jzd.class;
        y0 = new KProperty[]{rae.s(cls, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public jzd(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.v = a;
        this.w = new etc(a);
        xag.g(this, (CoroutineContext) null, (f14) null, new zyd(this, (Continuation) null), 3);
    }

    public static final Object j(jzd jzd, Continuation continuation) {
        Object I = ev0.I(((osa) ((gaf) jzd.b.getValue())).b(), new azd(jzd, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public static ngf m(int i, boolean z2) {
        igf igf;
        if (i == -1) {
            igf = z2 ? new igf(rza.b) : new igf(rza.c);
        } else if (i == 0) {
            igf = new igf(rza.a);
        } else if (i != 1) {
            return new mgf("");
        } else {
            igf = new igf(rza.g);
        }
        return igf;
    }

    public final pid k() {
        return (pid) this.c.getValue();
    }

    public final void l(int i) {
        int i2 = qza.m;
        KProperty[] kPropertyArr = y0;
        if (i == i2) {
            aje g = xag.g(this, (CoroutineContext) null, (f14) null, new czd(this, !((hq) k()).g.getBoolean("app.media.autoplay.gif", true), (Continuation) null), 3);
            this.v0.setValue(this, kPropertyArr[6], g);
        } else if (i == qza.j) {
            aje g2 = xag.g(this, (CoroutineContext) null, (f14) null, new bzd(this, !((rk) this.o.getValue()).a(), (Continuation) null), 3);
            this.w0.setValue(this, kPropertyArr[7], g2);
        } else if (i == qza.n) {
            aje g3 = xag.g(this, (CoroutineContext) null, (f14) null, new gzd(this, !k().m(), (Continuation) null), 3);
            this.Z.setValue(this, kPropertyArr[5], g3);
        } else {
            int i3 = qza.o;
            s85 s85 = this.x0;
            if (i == i3) {
                xag.h(s85, r2e.e);
            } else if (i == qza.s) {
                q(0);
            } else if (i == qza.u) {
                q(1);
            } else if (i == qza.t) {
                q(-1);
            } else if (i == qza.l) {
                xag.h(s85, r2e.f);
            } else if (i == qza.g) {
                o(0);
            } else if (i == qza.i) {
                o(1);
            } else if (i == qza.h) {
                o(-1);
            } else if (i == qza.k) {
                xag.h(s85, r2e.g);
            } else if (i == qza.a) {
                n(0);
            } else if (i == qza.c) {
                n(1);
            } else if (i == qza.b) {
                n(-1);
            } else if (i == qza.p) {
                xag.h(s85, r2e.h);
            } else if (i == qza.d) {
                r(0);
            } else if (i == qza.f) {
                r(1);
            } else if (i == qza.e) {
                r(-1);
            } else if (i == qza.r) {
                xag.h(s85, r2e.i);
            } else if (i == qza.v) {
                t(y3g.WITHOUT_COMPRESS);
            } else if (i == qza.x) {
                t(y3g.OPTIMAL);
            } else if (i == qza.w) {
                t(y3g.MAXIMUM);
            } else if (i == qza.q) {
                xag.h(s85, p2e.b);
            }
        }
    }

    public final void n(int i) {
        aje g = xag.g(this, (CoroutineContext) null, (f14) null, new dzd(this, i, (Continuation) null), 3);
        this.y.setValue(this, y0[1], g);
    }

    public final void o(int i) {
        aje g = xag.g(this, (CoroutineContext) null, (f14) null, new ezd(this, i, (Continuation) null), 3);
        this.z.setValue(this, y0[2], g);
    }

    public final void q(int i) {
        aje g = xag.g(this, (CoroutineContext) null, (f14) null, new fzd(this, i, (Continuation) null), 3);
        this.X.setValue(this, y0[3], g);
    }

    public final void r(int i) {
        aje g = xag.g(this, (CoroutineContext) null, (f14) null, new hzd(this, i, (Continuation) null), 3);
        this.x.setValue(this, y0[0], g);
    }

    public final void t(y3g y3g) {
        aje g = xag.g(this, (CoroutineContext) null, (f14) null, new izd(this, y3g, (Continuation) null), 3);
        this.Y.setValue(this, y0[4], g);
    }
}
