package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: dbd  reason: default package */
public final /* synthetic */ class dbd implements za3, ice {
    public final /* synthetic */ d14 a = ys6.a;
    public final /* synthetic */ CoroutineContext b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ dbd(CoroutineContext coroutineContext, b8f b8f) {
        this.b = coroutineContext;
        this.c = b8f;
    }

    public void b(pa3 pa3) {
        cbd cbd = new cbd(o04.b(this.a, this.b), pa3, 0);
        qq4.d(pa3, new mw1((Object) new bbd(cbd)));
        cbd.j0(f14.a, cbd, this.c);
    }

    public void h(pbe pbe) {
        cbd cbd = new cbd(o04.b(this.a, this.b), pbe, 1);
        qq4.d(pbe, new mw1((Object) new bbd(cbd)));
        cbd.j0(f14.a, cbd, this.c);
    }

    public /* synthetic */ dbd(CoroutineContext coroutineContext, Function2 function2) {
        this.b = coroutineContext;
        this.c = function2;
    }
}
