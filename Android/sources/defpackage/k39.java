package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k39  reason: default package */
public final class k39 implements n39 {
    public final long a;
    public final ij2 b;
    public final Collection c;

    public k39(long j, ij2 ij2, Collection collection) {
        this.a = j;
        this.b = ij2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k39)) {
            return false;
        }
        k39 k39 = (k39) obj;
        return this.a == k39.a && this.b == k39.b && Intrinsics.areEqual((Object) this.c, (Object) k39.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Add(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
