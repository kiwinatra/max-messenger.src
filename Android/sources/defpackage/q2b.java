package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q2b  reason: default package */
public final class q2b implements v2b, x2b {
    public final Function1 a;

    public q2b(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2b) && Intrinsics.areEqual((Object) this.a, (Object) ((q2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Close(onClick=" + this.a + ")";
    }
}
