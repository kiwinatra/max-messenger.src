package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w2b  reason: default package */
public final class w2b implements x2b {
    public final Function1 a;

    public w2b(Function1 function1) {
        this.a = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2b) && Intrinsics.areEqual((Object) this.a, (Object) ((w2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "More(onClick=" + this.a + ")";
    }
}
