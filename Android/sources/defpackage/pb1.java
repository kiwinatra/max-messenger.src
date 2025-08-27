package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pb1  reason: default package */
public final class pb1 implements sb1 {
    public final ngf a;

    public pb1(mgf mgf) {
        this.a = mgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb1) && Intrinsics.areEqual((Object) this.a, (Object) ((pb1) obj).a);
    }

    public final ngf getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("Error(text="), this.a, ")");
    }
}
