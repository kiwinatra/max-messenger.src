package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: svc  reason: default package */
public final class svc implements xvc {
    public final n2 a;

    public svc(n2 n2Var) {
        this.a = n2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svc) && Intrinsics.areEqual((Object) this.a, (Object) ((svc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediaMessageSend(media=" + this.a + ")";
    }
}
