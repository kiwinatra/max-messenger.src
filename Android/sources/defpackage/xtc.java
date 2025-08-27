package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xtc  reason: default package */
public final class xtc extends i8b {
    public final CharSequence e;

    public xtc(CharSequence charSequence) {
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtc) && Intrinsics.areEqual((Object) this.e, (Object) ((xtc) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + this.e + ")";
    }
}
