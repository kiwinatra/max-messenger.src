package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rd9  reason: default package */
public final class rd9 implements Serializable {
    public final long a;
    public final nd9 b;

    public rd9(long j, nd9 nd9) {
        this.a = j;
        this.b = nd9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd9)) {
            return false;
        }
        rd9 rd9 = (rd9) obj;
        return this.a == rd9.a && Intrinsics.areEqual((Object) this.b, (Object) rd9.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntry(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
