package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: xqf  reason: default package */
public final class xqf implements CoroutineContext.Element {
    public static final wqf c = new Object();
    public final ContinuationInterceptor a;
    public final AtomicInteger b = new AtomicInteger(0);

    public xqf(ContinuationInterceptor continuationInterceptor) {
        this.a = continuationInterceptor;
    }

    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    public final CoroutineContext.Key getKey() {
        return c;
    }

    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
