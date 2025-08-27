package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g91  reason: default package */
public final class g91 extends j91 {
    public final CharSequence b;

    public g91(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g91) && Intrinsics.areEqual((Object) this.b, (Object) ((g91) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SendToChatLink(link=" + this.b + ")";
    }
}
