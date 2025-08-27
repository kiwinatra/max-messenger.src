package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: smf  reason: default package */
public final class smf {
    public final ngf a;
    public final ngf b;

    public smf(kgf kgf, igf igf) {
        this.a = kgf;
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smf)) {
            return false;
        }
        smf smf = (smf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) smf.a) && Intrinsics.areEqual((Object) this.b, (Object) smf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
