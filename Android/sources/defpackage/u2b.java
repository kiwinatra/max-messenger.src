package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u2b  reason: default package */
public final class u2b implements x2b {
    public final d3b a;
    public final d3b b;

    public u2b(d3b d3b, d3b d3b2) {
        this.a = d3b;
        this.b = d3b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2b)) {
            return false;
        }
        u2b u2b = (u2b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u2b.a) && Intrinsics.areEqual((Object) this.b, (Object) u2b.b);
    }

    public final int hashCode() {
        int i = 0;
        d3b d3b = this.a;
        int hashCode = (d3b == null ? 0 : d3b.hashCode()) * 31;
        d3b d3b2 = this.b;
        if (d3b2 != null) {
            i = d3b2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ")";
    }
}
