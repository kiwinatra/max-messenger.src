package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7b  reason: default package */
public final class l7b implements n7b {
    public final Map a;

    public l7b(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7b) && Intrinsics.areEqual((Object) this.a, (Object) ((l7b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallHistoryPageState(callsHistory=" + this.a + ")";
    }
}
