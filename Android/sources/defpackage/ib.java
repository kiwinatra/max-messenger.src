package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: ib  reason: default package */
public final class ib implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ d14 b;
    public final /* synthetic */ CoroutineContext c;
    public final /* synthetic */ Object o;

    public ib(jx3 jx3, CoroutineContext coroutineContext, lb lbVar) {
        f14 f14 = f14.a;
        this.b = jx3;
        this.c = coroutineContext;
        this.o = lbVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                hb hbVar = new hb(obj, (Continuation) null, (lb) this.o);
                return ev0.c(this.b, this.c, f14.a, hbVar);
            default:
                g59 g59 = new g59(obj, (Continuation) null, (pjb) this.o);
                return ev0.c(this.b, this.c, f14.a, g59);
        }
    }

    public ib(jx3 jx3, CoroutineContext coroutineContext, pjb pjb) {
        f14 f14 = f14.a;
        this.b = jx3;
        this.c = coroutineContext;
        this.o = pjb;
    }
}
