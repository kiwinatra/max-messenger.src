package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s67  reason: default package */
public final class s67 extends m58 {
    public final CharSequence k;

    public s67(CharSequence charSequence) {
        this.k = charSequence;
    }

    public final boolean equals(Object obj) {
        s67 s67 = obj instanceof s67 ? (s67) obj : null;
        if (s67 == null) {
            return false;
        }
        if (this == s67) {
            return true;
        }
        return Intrinsics.areEqual((Object) this.k.toString(), (Object) s67.k.toString());
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
