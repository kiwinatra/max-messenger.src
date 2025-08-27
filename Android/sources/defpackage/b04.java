package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b04  reason: default package */
public final class b04 implements c04 {
    public final ngf a;

    public b04(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b04) && Intrinsics.areEqual((Object) this.a, (Object) ((b04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("Success(message="), this.a, ")");
    }
}
