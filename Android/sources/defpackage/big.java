package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: big  reason: default package */
public final class big {
    public static final aig Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ big(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        gsg.G(i, 3, zhg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof big)) {
            return false;
        }
        big big = (big) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) big.a) && Intrinsics.areEqual((Object) this.b, (Object) big.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppRequestPhoneResponse(requestId=");
        sb.append(this.a);
        sb.append(", phone=");
        return wj6.n(sb, this.b, ")");
    }

    public big(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
