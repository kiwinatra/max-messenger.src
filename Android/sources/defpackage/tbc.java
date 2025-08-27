package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tbc  reason: default package */
public final class tbc implements wbc {
    public final d48 a;
    public final int b;

    public tbc(d48 d48, int i) {
        this.a = d48;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbc)) {
            return false;
        }
        tbc tbc = (tbc) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tbc.a) && this.b == tbc.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFullScreenMedia(localMedia=" + this.a + ", position=" + this.b + ")";
    }
}
