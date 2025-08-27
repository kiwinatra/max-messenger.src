package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;

/* renamed from: cp1  reason: default package */
public final class cp1 implements d14 {
    public final Lazy a;

    public cp1(Lazy lazy, Lazy lazy2) {
        this.a = LazyKt.lazy(new bp1(lazy, lazy2, 0));
    }

    public final CoroutineContext U() {
        return (CoroutineContext) this.a.getValue();
    }
}
