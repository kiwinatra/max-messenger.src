package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qi6  reason: default package */
public final class qi6 {
    public final ConcurrentHashMap a;

    public /* synthetic */ qi6(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qi6)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((qi6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
