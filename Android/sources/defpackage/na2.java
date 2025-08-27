package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: na2  reason: default package */
public final class na2 extends ij0 {
    public final long b;
    public final long c;
    public final long o;
    public final long v;
    public final int w;
    public final bl4 x;
    public final List y;

    public na2(long j, long j2, long j3, long j4, int i, bl4 bl4, List list) {
        super(j);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = j4;
        this.w = i;
        this.x = bl4;
        this.y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na2)) {
            return false;
        }
        na2 na2 = (na2) obj;
        return this.b == na2.b && this.c == na2.c && this.o == na2.o && this.v == na2.v && this.w == na2.w && this.x == na2.x && Intrinsics.areEqual((Object) this.y, (Object) na2.y);
    }

    public final int hashCode() {
        int h = rae.h(this.w, wzf.i(wzf.i(wzf.i(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.v), 31);
        return this.y.hashCode() + ((this.x.hashCode() + h) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEvent(requestId=");
        sb.append(this.b);
        sb.append(", chatId=");
        sb.append(this.c);
        sb.append(", startTime=");
        sb.append(this.o);
        sb.append(", endTime=");
        sb.append(this.v);
        sb.append(", count=");
        sb.append(this.w);
        sb.append(", itemType=");
        sb.append(this.x);
        sb.append(", messageIds=");
        return tr1.l(sb, this.y, ")");
    }
}
