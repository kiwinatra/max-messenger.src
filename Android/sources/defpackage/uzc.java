package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uzc  reason: default package */
public final class uzc implements CoroutineContext.Key {
    public final xz9 a;

    public uzc(xz9 xz9) {
        this.a = xz9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzc) && Intrinsics.areEqual((Object) this.a, (Object) ((uzc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}
