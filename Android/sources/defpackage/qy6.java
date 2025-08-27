package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qy6  reason: default package */
public final class qy6 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public qy6(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy6)) {
            return false;
        }
        qy6 qy6 = (qy6) obj;
        return this.a == qy6.a && this.b == qy6.b && this.c == qy6.c && Intrinsics.areEqual((Object) this.d, (Object) qy6.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightMessage(ts=");
        sb.append(this.a);
        sb.append(", localId=");
        sb.append(this.b);
        sb.append(", serverId=");
        sb.append(this.c);
        sb.append(", highlight=");
        return tr1.l(sb, this.d, ")");
    }
}
