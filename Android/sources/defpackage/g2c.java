package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g2c  reason: default package */
public final class g2c extends j91 {
    public final String b;

    public g2c(String str) {
        super(11);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2c) && Intrinsics.areEqual((Object) this.b, (Object) ((g2c) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("SendLink(link="), this.b, ")");
    }
}
