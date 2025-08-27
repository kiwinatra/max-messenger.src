package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rb2  reason: default package */
public final class rb2 {
    public final long a;
    public final ta8 b;

    public rb2(long j, iz9 iz9) {
        this.a = j;
        this.b = iz9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb2)) {
            return false;
        }
        rb2 rb2 = (rb2) obj;
        return this.a == rb2.a && Intrinsics.areEqual((Object) this.b, (Object) rb2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
