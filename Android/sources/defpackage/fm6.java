package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fm6  reason: default package */
public final class fm6 implements gm6 {
    public final tqd a;

    public fm6(tqd tqd) {
        this.a = tqd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm6) && Intrinsics.areEqual((Object) this.a, (Object) ((fm6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
