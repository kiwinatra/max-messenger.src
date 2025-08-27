package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ci  reason: default package */
public final class ci extends ei {
    public final String a;

    public ci(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && Intrinsics.areEqual((Object) this.a, (Object) ((ci) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Path(value="), this.a, ")");
    }
}
