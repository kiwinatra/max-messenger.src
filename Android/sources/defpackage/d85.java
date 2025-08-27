package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: d85  reason: default package */
public final class d85 {
    public static final z75 Companion = new Object();
    public final String a;
    public final c85 b;

    public /* synthetic */ d85(int i, String str, c85 c85) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = c85;
            return;
        }
        gsg.G(i, 3, y75.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d85)) {
            return false;
        }
        d85 d85 = (d85) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) d85.a) && Intrinsics.areEqual((Object) this.b, (Object) d85.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public d85(String str, c85 c85) {
        this.a = str;
        this.b = c85;
    }
}
