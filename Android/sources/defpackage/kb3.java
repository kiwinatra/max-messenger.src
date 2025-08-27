package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kb3  reason: default package */
public final class kb3 {
    public final Object a;
    public final Function1 b;

    public kb3(Object obj, Function1 function1) {
        this.a = obj;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb3)) {
            return false;
        }
        kb3 kb3 = (kb3) obj;
        return Intrinsics.areEqual(this.a, kb3.a) && Intrinsics.areEqual((Object) this.b, (Object) kb3.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
