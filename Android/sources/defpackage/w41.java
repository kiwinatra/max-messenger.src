package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w41  reason: default package */
public final class w41 implements a51 {
    public final nw7 a;

    public w41(nw7 nw7) {
        this.a = nw7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w41) && Intrinsics.areEqual((Object) this.a, (Object) ((w41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkInfo(info=" + this.a + ")";
    }
}
