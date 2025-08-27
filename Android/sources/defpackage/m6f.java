package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m6f  reason: default package */
public final class m6f {
    public final ra3 a;

    public m6f(sa3 sa3) {
        this.a = sa3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6f) && Intrinsics.areEqual((Object) this.a, (Object) ((m6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncFlushSignal(completableDeferred=" + this.a + ")";
    }
}
