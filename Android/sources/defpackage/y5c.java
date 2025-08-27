package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y5c  reason: default package */
public final class y5c extends h6c {
    public final ngf a;

    public y5c(kgf kgf) {
        this.a = kgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5c) && Intrinsics.areEqual((Object) this.a, (Object) ((y5c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ExternalShareChannelLink(text="), this.a, ")");
    }
}
