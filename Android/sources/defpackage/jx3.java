package defpackage;

import kotlin.coroutines.CoroutineContext;

/* renamed from: jx3  reason: default package */
public final class jx3 implements d14 {
    public final CoroutineContext a;

    public jx3(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    public final CoroutineContext U() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
