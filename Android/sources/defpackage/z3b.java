package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3b  reason: default package */
public final class z3b extends v5a {
    public final long b;
    public final boolean c;
    public final String d;

    public z3b(long j, String str, boolean z) {
        super(Unit.INSTANCE);
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3b)) {
            return false;
        }
        z3b z3b = (z3b) obj;
        return this.b == z3b.b && this.c == z3b.c && Intrinsics.areEqual((Object) this.d, (Object) z3b.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g63.e(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenChatCall(chatId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        sb.append(this.c);
        sb.append(", link=");
        return wj6.n(sb, this.d, ")");
    }
}
