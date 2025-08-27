package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: df2  reason: default package */
public final class df2 extends mf2 {
    public final String b;

    public df2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df2) && Intrinsics.areEqual((Object) this.b, (Object) ((df2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CopyLink(link="), this.b, ")");
    }
}
