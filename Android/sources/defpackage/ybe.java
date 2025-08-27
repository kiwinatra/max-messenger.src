package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ybe  reason: default package */
public final class ybe implements t87 {
    public final long a;
    public final String b;
    public final p87 c;

    public ybe(long j, String str, p87 p87) {
        this.a = j;
        this.b = str;
        this.c = p87;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybe)) {
            return false;
        }
        ybe ybe = (ybe) obj;
        return this.a == ybe.a && Intrinsics.areEqual((Object) this.b, (Object) ybe.b) && Intrinsics.areEqual((Object) this.c, (Object) ybe.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "SingleImageAttach(messageId=" + this.a + ", attachId=" + this.b + ", imageAttach=" + this.c + ")";
    }
}
