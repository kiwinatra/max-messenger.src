package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xz7  reason: default package */
public final class xz7 {
    public final Float a;
    public final boolean b;

    public xz7(Float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz7)) {
            return false;
        }
        xz7 xz7 = (xz7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xz7.a) && this.b == xz7.b;
    }

    public final int hashCode() {
        Float f = this.a;
        return Boolean.hashCode(this.b) + ((f == null ? 0 : f.hashCode()) * 31);
    }

    public final String toString() {
        return "ListeningState(progress=" + this.a + ", isPlaying=" + this.b + ")";
    }
}
