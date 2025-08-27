package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e8e  reason: default package */
public final class e8e extends zs2 {
    public final ngf a;
    public final Function1 b;

    public e8e(igf igf, Function1 function1) {
        this.a = igf;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8e)) {
            return false;
        }
        e8e e8e = (e8e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e8e.a) && Intrinsics.areEqual((Object) this.b, (Object) e8e.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
