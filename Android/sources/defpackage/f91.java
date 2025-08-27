package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f91  reason: default package */
public final class f91 extends j91 {
    public final CharSequence b;

    public f91(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f91) && Intrinsics.areEqual((Object) this.b, (Object) ((f91) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CopyLink(link=" + this.b + ")";
    }
}
