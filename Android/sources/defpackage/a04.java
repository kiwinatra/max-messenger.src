package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a04  reason: default package */
public final class a04 implements c04 {
    public final ngf a;

    public a04(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a04) && Intrinsics.areEqual((Object) this.a, (Object) ((a04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("Failed(message="), this.a, ")");
    }
}
