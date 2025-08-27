package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h91  reason: default package */
public final class h91 extends j91 {
    public final CharSequence b;

    public h91(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h91) && Intrinsics.areEqual((Object) this.b, (Object) ((h91) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + this.b + ")";
    }
}
