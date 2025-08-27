package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: phg  reason: default package */
public final class phg {
    public static final ohg Companion = new Object();
    public final String a;

    public /* synthetic */ phg(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            gsg.G(i, 1, nhg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phg) && Intrinsics.areEqual((Object) this.a, (Object) ((phg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("WebAppOpenMaxLinkRequest(url="), this.a, ")");
    }
}
