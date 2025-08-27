package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w4b  reason: default package */
public final class w4b {
    public final y4b a;

    public w4b(y4b y4b) {
        this.a = y4b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4b) && Intrinsics.areEqual((Object) this.a, (Object) ((w4b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentPayload(page=" + this.a + ")";
    }
}
