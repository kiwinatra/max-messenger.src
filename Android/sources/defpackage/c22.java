package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c22  reason: default package */
public final class c22 extends d22 {
    public final Throwable a;

    public c22(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c22) {
            if (Intrinsics.areEqual((Object) this.a, (Object) ((c22) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
