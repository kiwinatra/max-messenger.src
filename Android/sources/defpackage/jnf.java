package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jnf  reason: default package */
public final class jnf extends ld8 {
    public final CharSequence v0;

    public jnf(CharSequence charSequence) {
        this.v0 = charSequence;
    }

    public final CharSequence P() {
        return this.v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnf) && Intrinsics.areEqual((Object) this.v0, (Object) ((jnf) obj).v0);
    }

    public final int hashCode() {
        CharSequence charSequence = this.v0;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Connected(text=" + this.v0 + ")";
    }
}
