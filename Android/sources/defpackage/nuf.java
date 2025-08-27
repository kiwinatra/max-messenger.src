package defpackage;

/* renamed from: nuf  reason: default package */
public final class nuf extends ij0 {
    public final long b;
    public final String c;

    public nuf(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypingEvent{chatId=");
        sb.append(this.b);
        sb.append(", text='");
        return wj6.n(sb, this.c, "'}");
    }
}
