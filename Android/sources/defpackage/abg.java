package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: abg  reason: default package */
public final class abg implements oh3 {
    public final Function1 a;
    public final Lazy b;
    public final n6e c;
    public final dtc o;

    public abg(Lazy lazy, Function1 function1) {
        this.a = function1;
        this.b = lazy;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.c = b2;
        this.o = new dtc(b2);
    }

    public final pm7 a(d14 d14, CoroutineContext coroutineContext, f14 f14, Function2 function2) {
        return ev0.u(d14, coroutineContext, f14, new zag(this, function2, (Continuation) null));
    }

    public final dtc e() {
        return this.o;
    }
}
