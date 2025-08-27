package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oba  reason: default package */
public final class oba extends ibf {
    public final long c;
    public final long o;
    public final pba v;
    public final b89 w;
    public final Set x;

    public oba(long j, long j2, pba pba, b89 b89, Set set) {
        this.c = j;
        this.o = j2;
        this.v = pba;
        this.w = b89;
        this.x = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oba)) {
            return false;
        }
        oba oba = (oba) obj;
        return this.c == oba.c && this.o == oba.o && this.v == oba.v && Intrinsics.areEqual((Object) this.w, (Object) oba.w) && Intrinsics.areEqual((Object) this.x, (Object) oba.x);
    }

    public final int hashCode() {
        int hashCode = (this.v.hashCode() + wzf.i(Long.hashCode(this.c) * 31, 31, this.o)) * 31;
        b89 b89 = this.w;
        return this.x.hashCode() + ((hashCode + (b89 == null ? 0 : b89.hashCode())) * 31);
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", userId=" + this.o + ", updateType=" + this.v + ", message=" + this.w + ", messageIds=" + this.x + ")";
    }
}
