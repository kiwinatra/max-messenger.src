package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tt4  reason: default package */
public final class tt4 {
    public final long a;
    public final String b;

    public tt4(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt4)) {
            return false;
        }
        tt4 tt4 = (tt4) obj;
        return this.a == tt4.a && Intrinsics.areEqual((Object) this.b, (Object) tt4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftMediaUploadKeyDb(chatId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return wj6.n(sb, this.b, ")");
    }
}
