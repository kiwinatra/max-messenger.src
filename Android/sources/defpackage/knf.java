package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: knf  reason: default package */
public final class knf extends ld8 {
    public final CharSequence v0;

    public knf(String str) {
        this.v0 = str;
    }

    public final CharSequence P() {
        return this.v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knf) && Intrinsics.areEqual((Object) this.v0, (Object) ((knf) obj).v0);
    }

    public final int hashCode() {
        CharSequence charSequence = this.v0;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "LostConnection(text=" + this.v0 + ")";
    }
}
