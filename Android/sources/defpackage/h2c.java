package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h2c  reason: default package */
public final class h2c extends j91 {
    public final String b;

    public h2c(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2c) && Intrinsics.areEqual((Object) this.b, (Object) ((h2c) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
