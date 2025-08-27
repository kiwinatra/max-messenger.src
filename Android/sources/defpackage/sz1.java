package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sz1  reason: default package */
public final class sz1 extends wz1 {
    public final ngf a;

    public sz1(mgf mgf) {
        this.a = mgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz1) && Intrinsics.areEqual((Object) this.a, (Object) ((sz1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ErrorWithLocalizedMessage(text="), this.a, ")");
    }
}
