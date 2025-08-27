package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gj8  reason: default package */
public final class gj8 {
    public final ej8 a;
    public final fj8 b;

    public gj8() {
        ej8 ej8 = new ej8();
        fj8 fj8 = new fj8();
        this.a = ej8;
        this.b = fj8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj8)) {
            return false;
        }
        gj8 gj8 = (gj8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gj8.a) && Intrinsics.areEqual((Object) this.b, (Object) gj8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
