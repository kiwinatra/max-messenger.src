package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* renamed from: mv2  reason: default package */
public final class mv2 extends AbstractCoroutineContextElement implements s04 {
    public final /* synthetic */ ov2 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mv2(defpackage.ov2 r2) {
        /*
            r1 = this;
            r04 r0 = defpackage.r04.a
            r1.a = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv2.<init>(ov2):void");
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            z68.f(this.a.H0, "Exception when search chats/messages", th);
        }
    }
}
