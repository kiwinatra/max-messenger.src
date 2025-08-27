package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zd9  reason: default package */
public final class zd9 {
    public final List a;
    public final xd9 b;
    public final sd9 c;
    public final long d;

    public zd9(List list, xd9 xd9, sd9 sd9, long j) {
        this.a = list;
        this.b = xd9;
        this.c = sd9;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd9)) {
            return false;
        }
        zd9 zd9 = (zd9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zd9.a) && Intrinsics.areEqual((Object) this.b, (Object) zd9.b) && Intrinsics.areEqual((Object) this.c, (Object) zd9.c) && this.d == zd9.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        xd9 xd9 = this.b;
        int hashCode2 = (hashCode + (xd9 == null ? 0 : xd9.hashCode())) * 31;
        sd9 sd9 = this.c;
        if (sd9 != null) {
            i = sd9.hashCode();
        }
        return Long.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
