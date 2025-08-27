package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j0c  reason: default package */
public final class j0c implements l0c {
    public final c63 a;

    public j0c(c63 c63) {
        this.a = c63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0c) && Intrinsics.areEqual((Object) this.a, (Object) ((j0c) obj).a);
    }

    public final int hashCode() {
        c63 c63 = this.a;
        if (c63 == null) {
            return 0;
        }
        return c63.a.hashCode();
    }

    public final String toString() {
        return "LastNamePayload(errorText=" + this.a + ")";
    }
}
