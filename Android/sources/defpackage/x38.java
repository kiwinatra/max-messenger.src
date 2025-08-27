package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: x38  reason: default package */
public final class x38 extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ y38 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x38(defpackage.y38 r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x38.<init>(y38):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            z68.f(this.a.b, "Can't load frames", th);
        }
    }
}
