package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3c  reason: default package */
public final class g3c extends s3c {
    public final CharSequence a;

    public g3c(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3c) && Intrinsics.areEqual((Object) this.a, (Object) ((g3c) obj).a);
    }

    public final long getItemId() {
        return (long) 8;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 8;
    }

    public final String toString() {
        return "ChatDescription(text=" + this.a + ")";
    }
}
