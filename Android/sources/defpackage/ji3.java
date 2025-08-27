package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ji3  reason: default package */
public final class ji3 {
    public final jx3 a;
    public final xme b;

    public ji3(sv0 sv0, gaf gaf, hxd hxd) {
        jx3 a2 = e14.a(((osa) gaf).c());
        this.a = a2;
        jxd jxd = (jxd) hxd;
        xme a3 = f6e.a(Integer.valueOf(jxd.h));
        this.b = a3;
        sv0.d(this);
        bs0.K(new ps5(kv0.h(jxd.e), new zw(a3, 15), 5), a2);
    }

    @oye
    public final void onEvent(sh3 sh3) {
        ev0.v(this.a, (CoroutineContext) null, (f14) null, new ii3(this, sh3, (Continuation) null), 3);
    }
}
