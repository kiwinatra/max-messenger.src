package defpackage;

import android.app.Application;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: nh0  reason: default package */
public final class nh0 {
    public final Application a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;
    public final ddb d;
    public final ddb e;
    public final eh0 f;

    public nh0(Application application, sv0 sv0, gaf gaf) {
        this.a = application;
        this.c = e14.a(((osa) gaf).c().t0());
        this.d = new ddb(edb.f);
        this.e = new ddb(edb.k);
        this.f = new eh0(0, this);
        sv0.d(this);
    }

    @oye
    public final void onEvent(w88 w88) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new fh0(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(veb veb) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new gh0(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(zu3 zu3) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new hh0(this, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(jwf jwf) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new ih0(this, (Continuation) null), 3);
    }
}
