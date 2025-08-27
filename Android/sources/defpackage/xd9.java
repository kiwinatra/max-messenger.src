package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xd9  reason: default package */
public final class xd9 {
    public final List a;
    public final int b;
    public final qqc c;

    public xd9(List list, int i, qqc qqc) {
        this.a = list;
        this.b = i;
        this.c = qqc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd9)) {
            return false;
        }
        xd9 xd9 = (xd9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xd9.a) && this.b == xd9.b && Intrinsics.areEqual((Object) this.c, (Object) xd9.c);
    }

    public final int hashCode() {
        int h = rae.h(this.b, this.a.hashCode() * 31, 31);
        qqc qqc = this.c;
        return h + (qqc == null ? 0 : qqc.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
