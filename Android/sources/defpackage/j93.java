package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j93  reason: default package */
public final class j93 {
    public final i93 a;

    public j93(i93 i93) {
        this.a = i93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j93) && Intrinsics.areEqual((Object) this.a, (Object) ((j93) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "CommonStatesBackgroundActiveColors(action=" + this.a + ")";
    }
}
