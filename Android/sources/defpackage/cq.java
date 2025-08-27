package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: cq  reason: default package */
public final class cq extends mbf {
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v = LazyKt.lazy(new aq(this, 0));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq(Context context, Lazy lazy, Lazy lazy2, ipg ipg, Lazy lazy3, ed4 ed4, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9) {
        super(context, ed4, lazy2, lazy5, lazy6, lazy7, lazy8);
        Context context2 = context;
        ed4 ed42 = ed4;
        this.m = lazy9;
        this.n = lazy;
        this.o = lazy3;
        int i = ct.j;
        ipg ipg2 = ipg;
        zp zpVar = new zp(context, this, ed42, ipg);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.p = LazyKt.lazy(lazyThreadSafetyMode, zpVar);
        this.q = LazyKt.lazy(lazyThreadSafetyMode, new zp(context, this, ed42, 1));
        this.r = lazy4;
        this.s = LazyKt.lazy(lazyThreadSafetyMode, new zp(context, this, ed42, 2));
        this.t = LazyKt.lazy(lazyThreadSafetyMode, new zp(ed42, this, context));
        this.u = LazyKt.lazy(lazyThreadSafetyMode, new zp(context, this, ed42, 4));
    }

    public final boolean c() {
        if (nea.a(b().i(false).b)) {
            return false;
        }
        Lazy lazy = this.n;
        cud cud = ((ltb) lazy.getValue()).b;
        cud.getClass();
        int r2 = (int) cud.r(PmsKey.f94pushalerttimeout, (long) 604800);
        if (r2 <= 0) {
            return false;
        }
        return System.currentTimeMillis() - ((ltb) lazy.getValue()).a.g.getLong("app.last.push.alert.time", 0) > ((long) (r2 * 1000));
    }
}
