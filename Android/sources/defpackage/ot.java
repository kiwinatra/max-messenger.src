package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ot  reason: default package */
public final class ot {
    public final zwd a;

    public ot(zwd zwd) {
        this.a = zwd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot) && Intrinsics.areEqual((Object) this.a, (Object) ((ot) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
