package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zkg  reason: default package */
public final class zkg {
    public static final ykg Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ zkg(int i, String str, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        gsg.G(i, 15, xkg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkg)) {
            return false;
        }
        zkg zkg = (zkg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zkg.a) && Intrinsics.areEqual((Object) this.b, (Object) zkg.b) && Intrinsics.areEqual((Object) this.c, (Object) zkg.c) && Intrinsics.areEqual((Object) this.d, (Object) zkg.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int d2 = g63.d(g63.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageSaveKeyRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", value=");
        return wj6.n(sb, this.d, ")");
    }
}
