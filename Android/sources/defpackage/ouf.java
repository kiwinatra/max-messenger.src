package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ouf  reason: default package */
public final class ouf {
    public final ya8 a;

    public ouf(ya8 ya8) {
        this.a = ya8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouf) && Intrinsics.areEqual((Object) this.a, (Object) ((ouf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypingState(typing=" + this.a + ")";
    }
}
