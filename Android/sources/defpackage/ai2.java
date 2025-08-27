package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ai2  reason: default package */
public final class ai2 {
    public static final ai2 c = new ai2((List) null, 3, 0);
    public final List a;
    public final int b;

    public ai2(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai2)) {
            return false;
        }
        ai2 ai2 = (ai2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ai2.a) && this.b == ai2.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaState(items=" + this.a + ", initialPosition=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai2(List list, int i, int i2) {
        this(-1, (i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
