package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9a  reason: default package */
public final class a9a extends ij0 {
    public final long b;
    public final boolean c;
    public final long o;
    public final long v;
    public final Set w;

    public a9a(long j, boolean z, long j2, long j3, Set set) {
        this.b = j;
        this.c = z;
        this.o = j2;
        this.v = j3;
        this.w = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9a)) {
            return false;
        }
        a9a a9a = (a9a) obj;
        return this.b == a9a.b && this.c == a9a.c && this.o == a9a.o && this.v == a9a.v && Intrinsics.areEqual((Object) this.w, (Object) a9a.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + wzf.i(wzf.i(g63.e(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o), 31, this.v);
    }

    public final String toString() {
        return "NewReactionEvent(chatId=" + this.b + ", isOnSubscription=" + this.c + ", messageLocalId=" + this.o + ", messageTime=" + this.v + ", reactions=" + this.w + ")";
    }
}
