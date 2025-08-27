package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pd9  reason: default package */
public final class pd9 implements Serializable {
    public final nd9 a;
    public final int b;

    public pd9(nd9 nd9, int i) {
        this.a = nd9;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd9)) {
            return false;
        }
        pd9 pd9 = (pd9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pd9.a) && this.b == pd9.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionCounter(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
