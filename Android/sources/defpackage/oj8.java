package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oj8  reason: default package */
public final class oj8 implements vj8 {
    public final tqd a;

    public oj8(tqd tqd) {
        this.a = tqd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj8) && Intrinsics.areEqual((Object) this.a, (Object) ((oj8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
