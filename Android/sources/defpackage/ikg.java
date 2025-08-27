package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ikg  reason: default package */
public final class ikg {
    public static final hkg Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ikg(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        gsg.G(i, 7, gkg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikg)) {
            return false;
        }
        ikg ikg = (ikg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ikg.a) && Intrinsics.areEqual((Object) this.b, (Object) ikg.b) && Intrinsics.areEqual((Object) this.c, (Object) ikg.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + g63.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        return wj6.n(sb, this.c, ")");
    }
}
