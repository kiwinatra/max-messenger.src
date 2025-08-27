package defpackage;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: twf  reason: default package */
public final class twf extends ij0 {
    public final long b;
    public final long c;
    public final Set o;
    public final boolean v;

    public twf(long j, long j2) {
        this(0, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twf)) {
            return false;
        }
        twf twf = (twf) obj;
        return this.b == twf.b && this.c == twf.c && Intrinsics.areEqual((Object) this.o, (Object) twf.o) && this.v == twf.v;
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.b) * 31, 31, this.c);
        return Boolean.hashCode(this.v) + ((this.o.hashCode() + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", reactionsToAnimate=");
        sb.append(this.o);
        sb.append(", reactionsChanged=");
        return tr1.m(sb, this.v, ")");
    }

    public /* synthetic */ twf(int i, long j, long j2) {
        this(j, j2, SetsKt.emptySet(), false);
    }

    public twf(long j, long j2, Set set, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = set;
        this.v = z;
    }
}
