package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: etc  reason: default package */
public final class etc implements ome, nw1, lj6 {
    public final /* synthetic */ ome a;

    public etc(ome ome) {
        this.a = ome;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        return this.a.e(ds5, continuation);
    }

    public final bs5 f(CoroutineContext coroutineContext, int i, cu0 cu0) {
        return (((i < 0 || i >= 2) && i != -2) || cu0 != cu0.b) ? m5a.y(this, coroutineContext, i, cu0) : this;
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}
