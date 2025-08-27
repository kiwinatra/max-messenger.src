package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ei1  reason: default package */
public final class ei1 extends ji1 {
    public final String b;

    public ei1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei1) && Intrinsics.areEqual((Object) this.b, (Object) ((ei1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ShareLinkToChat(link="), this.b, ")");
    }
}
