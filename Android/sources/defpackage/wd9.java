package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd9  reason: default package */
public final class wd9 {
    public final qqc a;
    public final int b;

    public wd9(qqc qqc, int i) {
        this.a = qqc;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd9)) {
            return false;
        }
        wd9 wd9 = (wd9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wd9.a) && this.b == wd9.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
