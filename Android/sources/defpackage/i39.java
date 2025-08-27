package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: i39  reason: default package */
public final class i39 implements ojb {
    public final Lazy a;

    public i39(Lazy lazy) {
        this.a = lazy;
    }

    public final bs5 k(long j) {
        return bs0.L(new on2(((eu3) this.a.getValue()).c(j), 28), new h39(j, (Continuation) null));
    }
}
