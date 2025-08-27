package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p2b  reason: default package */
public final class p2b implements v2b {
    public final Function1 a;

    public p2b(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2b) && Intrinsics.areEqual((Object) this.a, (Object) ((p2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Back(onClick=" + this.a + ")";
    }
}
