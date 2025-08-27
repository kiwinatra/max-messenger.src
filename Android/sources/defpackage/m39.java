package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m39  reason: default package */
public final class m39 implements n39 {
    public final long a;
    public final ij2 b;
    public final Collection c;

    public m39(long j, ij2 ij2, Collection collection) {
        this.a = j;
        this.b = ij2;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m39)) {
            return false;
        }
        m39 m39 = (m39) obj;
        return this.a == m39.a && this.b == m39.b && Intrinsics.areEqual((Object) this.c, (Object) m39.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
