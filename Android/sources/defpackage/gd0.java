package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gd0  reason: default package */
public final class gd0 {
    public final long a;
    public final CharSequence b;

    public gd0(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd0)) {
            return false;
        }
        gd0 gd0 = (gd0) obj;
        return this.a == gd0.a && Intrinsics.areEqual((Object) this.b, (Object) gd0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarAbbreviationModel(sourceId=" + this.a + ", abbreviation=" + this.b + ")";
    }
}
