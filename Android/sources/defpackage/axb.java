package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: axb  reason: default package */
public final class axb extends hxb {
    public final String b;

    public axb(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axb) && Intrinsics.areEqual((Object) this.b, (Object) ((axb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CopyToClipboard(link="), this.b, ")");
    }
}
