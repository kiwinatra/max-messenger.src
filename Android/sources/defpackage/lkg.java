package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lkg  reason: default package */
public final class lkg {
    public static final kkg Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ lkg(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        gsg.G(i, 7, jkg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkg)) {
            return false;
        }
        lkg lkg = (lkg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) lkg.a) && Intrinsics.areEqual((Object) this.b, (Object) lkg.b) && Intrinsics.areEqual((Object) this.c, (Object) lkg.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageGetKeyResponse(requestId=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", value=");
        return wj6.n(sb, this.c, ")");
    }

    public lkg(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
