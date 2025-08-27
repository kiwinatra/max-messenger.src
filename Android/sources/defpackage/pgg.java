package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pgg  reason: default package */
public final class pgg {
    public static final ogg Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ pgg(String str, int i, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        gsg.G(i, 7, ngg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgg)) {
            return false;
        }
        pgg pgg = (pgg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pgg.a) && Intrinsics.areEqual((Object) this.b, (Object) pgg.b) && Intrinsics.areEqual((Object) this.c, (Object) pgg.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileRequest(requestId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fileName=");
        return wj6.n(sb, this.c, ")");
    }
}
