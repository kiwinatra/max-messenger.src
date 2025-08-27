package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ii1  reason: default package */
public final class ii1 extends ji1 {
    public final u21 b;

    public ii1(u21 u21) {
        this.b = u21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii1) && Intrinsics.areEqual((Object) this.b, (Object) ((ii1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowOpponentInfo(contextInfo=" + this.b + ")";
    }
}
