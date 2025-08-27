package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: st4  reason: default package */
public final class st4 {
    public final long a;
    public final String b;

    public st4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st4)) {
            return false;
        }
        st4 st4 = (st4) obj;
        return this.a == st4.a && Intrinsics.areEqual((Object) this.b, (Object) st4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKey(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
