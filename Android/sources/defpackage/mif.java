package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mif  reason: default package */
public final class mif implements CoroutineContext.Key {
    public final ThreadLocal a;

    public mif(ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mif) && Intrinsics.areEqual((Object) this.a, (Object) ((mif) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
