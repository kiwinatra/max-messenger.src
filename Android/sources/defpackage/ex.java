package defpackage;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ex  reason: default package */
public final class ex extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ gx a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ex(defpackage.gx r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.<init>(gx):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        gx gxVar = this.a;
        kn5 kn5 = gxVar.c;
        if (kn5 != null) {
            int identityHashCode = System.identityHashCode(gxVar);
            kn5.c("failed " + coroutineContext + " with " + th + " @" + identityHashCode);
        }
        gxVar.g.m0(th, coroutineContext);
    }
}
