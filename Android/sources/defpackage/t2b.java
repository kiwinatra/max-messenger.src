package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: t2b  reason: default package */
public final class t2b implements v2b {
    public final d3b a;

    public t2b(a3b a3b) {
        this.a = a3b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2b) && Intrinsics.areEqual((Object) this.a, (Object) ((t2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
