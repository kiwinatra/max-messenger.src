package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kif  reason: default package */
public final class kif implements dif {
    public final Object a;
    public final ThreadLocal b;
    public final mif c;

    public kif(Integer num, ThreadLocal threadLocal) {
        this.a = num;
        this.b = threadLocal;
        this.c = new mif(threadLocal);
    }

    public final void c(Object obj) {
        this.b.set(obj);
    }

    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        if (Intrinsics.areEqual((Object) this.c, (Object) key)) {
            return this;
        }
        return null;
    }

    public final CoroutineContext.Key getKey() {
        return this.c;
    }

    public final Object k0(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return Intrinsics.areEqual((Object) this.c, (Object) key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
