package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yhg  reason: default package */
public final class yhg {
    public static final xhg Companion = new Object();
    public final String a;

    public /* synthetic */ yhg(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            gsg.G(i, 1, whg.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhg) && Intrinsics.areEqual((Object) this.a, (Object) ((yhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("WebAppRequestPhoneRequest(requestId="), this.a, ")");
    }
}
