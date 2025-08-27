package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: keb  reason: default package */
public final class keb extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ meb a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public keb(defpackage.meb r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keb.<init>(meb):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            ((uta) this.a.c).c(th, false);
        }
    }
}
