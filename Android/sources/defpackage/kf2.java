package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kf2  reason: default package */
public final class kf2 extends mf2 {
    public final String b;

    public kf2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf2) && Intrinsics.areEqual((Object) this.b, (Object) ((kf2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ShareLink(link="), this.b, ")");
    }
}
