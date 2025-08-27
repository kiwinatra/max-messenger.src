package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t82  reason: default package */
public final class t82 {
    public static final t82 c = new t82(CollectionsKt.emptyList(), SetsKt.emptySet());
    public final Set a;
    public final List b;

    public t82(List list, Set set) {
        this.a = set;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t82)) {
            return false;
        }
        t82 t82 = (t82) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) t82.a) && Intrinsics.areEqual((Object) this.b, (Object) t82.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatFolders(allFilterExclude=" + this.a + ", folders=" + this.b + ")";
    }
}
