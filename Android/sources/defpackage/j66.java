package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j66  reason: default package */
public final class j66 {
    public final Map a;

    public j66(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j66) && Intrinsics.areEqual((Object) this.a, (Object) ((j66) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoldersCounters(counters=" + this.a + ")";
    }
}
