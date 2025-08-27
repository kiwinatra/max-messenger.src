package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r32  reason: default package */
public final class r32 {
    public final long a;
    public final String b;

    public r32(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        r32 r32 = (r32) obj;
        return this.a == r32.a && Intrinsics.areEqual((Object) this.b, (Object) r32.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatAndFolderCrossRef(chatId=");
        sb.append(this.a);
        sb.append(", folderId=");
        return wj6.n(sb, this.b, ")");
    }
}
