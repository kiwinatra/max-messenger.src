package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y61  reason: default package */
public final class y61 implements a71 {
    public final d31 a;

    public y61(d31 d31) {
        this.a = d31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y61) && Intrinsics.areEqual((Object) this.a, (Object) ((y61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateJoinLinkEvent(event=" + this.a + ")";
    }
}
