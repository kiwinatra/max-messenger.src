package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: asc  reason: default package */
public final class asc {
    public final String a;
    public final long b;
    public final List c;

    public asc(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asc)) {
            return false;
        }
        asc asc = (asc) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) asc.a) && this.b == asc.b && Intrinsics.areEqual((Object) this.c, (Object) asc.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wzf.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsSectionEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", reactions=");
        return tr1.l(sb, this.c, ")");
    }
}
