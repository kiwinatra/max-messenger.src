package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: ot4  reason: default package */
public final class ot4 implements CoroutineContext {
    public final /* synthetic */ CoroutineContext a;
    public final Throwable b;

    public ot4(Throwable th, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = th;
    }

    public final Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.a.get(key);
    }

    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.a.minusKey(key);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.a.plus(coroutineContext);
    }
}
