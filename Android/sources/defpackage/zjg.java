package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zjg  reason: default package */
public final class zjg {
    public static final yjg Companion = new Object();
    public final String a;
    public final String b;

    public /* synthetic */ zjg(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        gsg.G(i, 3, xjg.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjg)) {
            return false;
        }
        zjg zjg = (zjg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zjg.a) && Intrinsics.areEqual((Object) this.b, (Object) zjg.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppStorageClearRequest(queryId=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wj6.n(sb, this.b, ")");
    }
}
