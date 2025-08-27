package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sgg  reason: default package */
public final class sgg {
    public static final rgg Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ sgg(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        gsg.G(i, 3, qgg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgg)) {
            return false;
        }
        sgg sgg = (sgg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) sgg.a) && Intrinsics.areEqual((Object) this.b, (Object) sgg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppDownloadFileResponse(requestId=");
        sb.append(this.a);
        sb.append(", status=");
        return wj6.n(sb, this.b, ")");
    }

    public sgg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
