package defpackage;

/* renamed from: ke7  reason: default package */
public final class ke7 extends ij0 {
    public final long b;
    public final long c;
    public final boolean o;
    public final bl4 v;
    public final boolean w;
    public final long x;

    public ke7(long j, long j2, boolean z, bl4 bl4, boolean z2, long j3) {
        this.b = j;
        this.c = j2;
        this.o = z;
        this.v = bl4;
        this.w = z2;
        this.x = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke7)) {
            return false;
        }
        ke7 ke7 = (ke7) obj;
        return this.b == ke7.b && this.c == ke7.c && this.o == ke7.o && this.v == ke7.v && this.w == ke7.w && this.x == ke7.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + g63.e((this.v.hashCode() + g63.e(wzf.i(Long.hashCode(this.b) * 31, 31, this.c), 31, this.o)) * 31, 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingMessageEvent(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", isInvisiblePush=");
        sb.append(this.o);
        sb.append(", itemType=");
        sb.append(this.v);
        sb.append(", isControl=");
        sb.append(this.w);
        sb.append(", sender=");
        return wj6.m(sb, this.x, ")");
    }
}
