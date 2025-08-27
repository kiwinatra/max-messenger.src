package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zh1  reason: default package */
public final class zh1 extends ji1 {
    public final CharSequence b;

    public zh1(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh1) && Intrinsics.areEqual((Object) this.b, (Object) ((zh1) obj).b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "RecordStart(name=" + this.b + ")";
    }
}
