package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: xag  reason: default package */
public abstract class xag {
    public final jx3 a;

    public xag() {
        q2f b = kr7.b();
        bi4 bi4 = dq4.a;
        this.a = e14.a(CoroutineContext.Element.DefaultImpls.plus(b, lc8.a.t0()));
    }

    public static aje g(xag xag, CoroutineContext coroutineContext, f14 f14, Function2 function2, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            f14 = f14.a;
        }
        return ev0.u(xag.a, coroutineContext, f14, function2);
    }

    public static void h(s85 s85, Object obj) {
        s85.b.d(obj);
    }

    public void i() {
    }
}
