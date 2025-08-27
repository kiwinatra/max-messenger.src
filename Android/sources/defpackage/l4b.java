package defpackage;

import kotlin.Unit;

/* renamed from: l4b  reason: default package */
public final class l4b extends v5a {
    public final long b;
    public final boolean c;

    public l4b(long j, boolean z) {
        super(Unit.INSTANCE);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4b)) {
            return false;
        }
        l4b l4b = (l4b) obj;
        return this.b == l4b.b && this.c == l4b.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOneToOneCall(opponentId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        return tr1.m(sb, this.c, ")");
    }
}
