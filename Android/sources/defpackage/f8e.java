package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f8e  reason: default package */
public final class f8e extends xo3 {
    public final ngf a;
    public final Function1 b;

    public f8e(igf igf, Function1 function1) {
        this.a = igf;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8e)) {
            return false;
        }
        f8e f8e = (f8e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) f8e.a) && Intrinsics.areEqual((Object) this.b, (Object) f8e.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", dismissListener=" + this.b + ")";
    }
}
