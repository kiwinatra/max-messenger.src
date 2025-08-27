package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e01  reason: default package */
public final class e01 implements g01 {
    public final long a;
    public final boolean b;
    public final String c;

    public e01(long j, String str, boolean z) {
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01 = (e01) obj;
        return this.a == e01.a && this.b == e01.b && Intrinsics.areEqual((Object) this.c, (Object) e01.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        sb.append(this.b);
        sb.append(", link=");
        return wj6.n(sb, this.c, ")");
    }
}
