package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: l35  reason: default package */
public final class l35 extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ m35 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l35(defpackage.m35 r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l35.<init>(m35):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            z68.f(this.a.c, "Exception while loading emoji sprite", th);
        }
    }
}
