package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: jf2  reason: default package */
public final class jf2 extends mf2 {
    public final Long b;
    public final long c;
    public final boolean d;

    public jf2(Long l, long j, boolean z) {
        this.b = l;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2)) {
            return false;
        }
        jf2 jf2 = (jf2) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) jf2.b) && this.c == jf2.c && this.d == jf2.d;
    }

    public final int hashCode() {
        Long l = this.b;
        return Boolean.hashCode(this.d) + wzf.i((l == null ? 0 : l.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAttach(attachId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isForwardAttach=");
        return tr1.m(sb, this.d, ")");
    }
}
