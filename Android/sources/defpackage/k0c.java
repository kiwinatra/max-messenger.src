package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0c  reason: default package */
public final class k0c implements l0c {
    public final o54 a;

    public k0c(o54 o54) {
        this.a = o54;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0c) && Intrinsics.areEqual((Object) this.a, (Object) ((k0c) obj).a);
    }

    public final int hashCode() {
        o54 o54 = this.a;
        if (o54 == null) {
            return 0;
        }
        return o54.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
