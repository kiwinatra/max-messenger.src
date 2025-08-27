package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uba  reason: default package */
public final class uba extends ibf {
    public final b32 c;
    public final Set o;
    public final boolean v;

    public uba(b32 b32, Set set, boolean z) {
        this.c = b32;
        this.o = set;
        this.v = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uba)) {
            return false;
        }
        uba uba = (uba) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) uba.c) && Intrinsics.areEqual((Object) this.o, (Object) uba.o) && this.v == uba.v;
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode();
        return Boolean.hashCode(this.v) + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chat=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(this.o);
        sb.append(", isTtl=");
        return tr1.m(sb, this.v, ")");
    }
}
