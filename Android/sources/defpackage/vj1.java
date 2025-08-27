package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: vj1  reason: default package */
public final class vj1 {
    public final zwd a;

    public vj1(zwd zwd) {
        this.a = zwd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj1) && Intrinsics.areEqual((Object) this.a, (Object) ((vj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemovedParams(roomId=" + this.a + ")";
    }
}
