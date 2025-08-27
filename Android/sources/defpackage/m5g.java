package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: m5g  reason: default package */
public final class m5g extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ n5g a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m5g(defpackage.n5g r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5g.<init>(n5g):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            z68.f(this.a.g, "Fetch video. Exception", th);
        }
    }
}
