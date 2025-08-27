package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b6c  reason: default package */
public final class b6c extends h6c {
    public final ngf a;
    public final Function1 b;

    public b6c(ngf ngf, Function1 function1) {
        this.a = ngf;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6c)) {
            return false;
        }
        b6c b6c = (b6c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) b6c.a) && Intrinsics.areEqual((Object) this.b, (Object) b6c.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
