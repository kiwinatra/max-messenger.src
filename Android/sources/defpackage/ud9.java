package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud9  reason: default package */
public final class ud9 implements Serializable {
    public final List a;
    public final int b;
    public final nd9 c;

    public ud9(ArrayList arrayList, int i, nd9 nd9) {
        this.a = arrayList;
        this.b = i;
        this.c = nd9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud9)) {
            return false;
        }
        ud9 ud9 = (ud9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ud9.a) && this.b == ud9.b && Intrinsics.areEqual((Object) this.c, (Object) ud9.c);
    }

    public final int hashCode() {
        int h = rae.h(this.b, this.a.hashCode() * 31, 31);
        nd9 nd9 = this.c;
        return h + (nd9 == null ? 0 : nd9.hashCode());
    }

    public final String toString() {
        return "MessageReactionInfo(counters=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
