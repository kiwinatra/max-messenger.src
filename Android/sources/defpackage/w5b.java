package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5b  reason: default package */
public final class w5b extends ij0 {
    public final long b;
    public final long c;
    public final long o;
    public final String v;
    public final long w;
    public final bl4 x;

    public w5b(long j, long j2, long j3, String str, long j4, bl4 bl4) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = str;
        this.w = j4;
        this.x = bl4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5b)) {
            return false;
        }
        w5b w5b = (w5b) obj;
        return this.b == w5b.b && this.c == w5b.c && this.o == w5b.o && Intrinsics.areEqual((Object) this.v, (Object) w5b.v) && this.w == w5b.w && this.x == w5b.x;
    }

    public final int hashCode() {
        int i = wzf.i(wzf.i(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o);
        String str = this.v;
        return this.x.hashCode() + wzf.i((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.w);
    }

    public final String toString() {
        return "OutgoingMessageEvent(chatId=" + this.b + ", cid=" + this.c + ", messageId=" + this.o + ", tag=" + this.v + ", sender=" + this.w + ", itemType=" + this.x + ")";
    }
}
