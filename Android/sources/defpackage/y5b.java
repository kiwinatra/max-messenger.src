package defpackage;

/* renamed from: y5b  reason: default package */
public final class y5b {
    public final int a;
    public final long b;
    public final long c;

    public y5b(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutgoingMessageLink{type=");
        sb.append(wj6.v(this.a));
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return wj6.m(sb, this.c, "}");
    }
}
