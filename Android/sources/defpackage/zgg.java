package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: zgg  reason: default package */
public final class zgg {
    public final Lazy a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public zgg(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.c = e14.a(((osa) ((gaf) lazy2.getValue())).a());
        ((sv0) lazy.getValue()).d(this);
    }

    public final void a(xgg xgg) {
        ev0.v(this.c, (CoroutineContext) null, (f14) null, new ygg(this, xgg, (Continuation) null), 3);
    }

    @oye
    public final void onEvent(dm5 dm5) {
        throw null;
    }

    @oye
    public final void onEvent(hj0 hj0) {
        a(new wgg(hj0.a));
    }

    @oye
    public final void onEvent(bm5 bm5) {
        a(new wgg(bm5.b));
    }

    @oye
    public final void onEvent(zl5 zl5) {
        a(new ugg(zl5.b));
    }

    @oye
    public final void onEvent(cm5 cm5) {
        a(new vgg(cm5.a));
    }
}
