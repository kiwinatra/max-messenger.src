package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: kba  reason: default package */
public final class kba extends ibf {
    public final long c;
    public final b32 o;
    public final b89 v;
    public final boolean w;
    public final long x;
    public final boolean y;

    public kba(long j, b32 b32, b89 b89, boolean z, long j2, boolean z2) {
        this.c = j;
        this.o = b32;
        this.v = b89;
        this.w = z;
        this.x = j2;
        this.y = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba)) {
            return false;
        }
        kba kba = (kba) obj;
        return this.c == kba.c && Intrinsics.areEqual((Object) this.o, (Object) kba.o) && Intrinsics.areEqual((Object) this.v, (Object) kba.v) && this.w == kba.w && this.x == kba.x && this.y == kba.y;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        b32 b32 = this.o;
        return Boolean.hashCode(this.y) + wzf.i(g63.e((this.v.hashCode() + ((hashCode + (b32 == null ? 0 : b32.hashCode())) * 31)) * 31, 31, this.w), 31, this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chatId=");
        sb.append(this.c);
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.v);
        sb.append(", isInvisible=");
        sb.append(this.w);
        sb.append(", prevMessageId=");
        sb.append(this.x);
        sb.append(", ttl=");
        return tr1.m(sb, this.y, ")");
    }
}
