package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: l95  reason: default package */
public final class l95 implements s04 {
    public final /* synthetic */ k95 a = k95.a;

    public final boolean equals(Object obj) {
        return (obj instanceof l95) || (obj instanceof k95);
    }

    public Object fold(Object obj, Function2 function2) {
        return this.a.fold(obj, function2);
    }

    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.a.get(key);
    }

    public CoroutineContext.Key getKey() {
        return this.a.getKey();
    }

    public final int hashCode() {
        return k95.a.hashCode();
    }

    public void m0(Throwable th, CoroutineContext coroutineContext) {
        this.a.getClass();
        synchronized (k95.b) {
        }
    }

    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.a.minusKey(key);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.a.plus(coroutineContext);
    }
}
