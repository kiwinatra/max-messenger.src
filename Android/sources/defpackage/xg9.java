package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xg9  reason: default package */
public final class xg9 implements bh9 {
    public final CharSequence a;

    public xg9(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg9) && Intrinsics.areEqual((Object) this.a, (Object) ((xg9) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "FinishEditMessage(text=" + this.a + ")";
    }
}
