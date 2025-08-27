package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mhg  reason: default package */
public final class mhg {
    public static final lhg Companion = new Object();
    public final String a;

    public /* synthetic */ mhg(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            gsg.G(i, 1, khg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhg) && Intrinsics.areEqual((Object) this.a, (Object) ((mhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("WebAppOpenLinkRequest(url="), this.a, ")");
    }
}
