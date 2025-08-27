package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nnb  reason: default package */
public final class nnb implements rnb {
    public final CharSequence a;
    public final long b;

    public nnb(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnb)) {
            return false;
        }
        nnb nnb = (nnb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nnb.a) && this.b == nnb.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + this.a + ", avatarSourceId=" + this.b + ")";
    }
}
