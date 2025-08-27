package defpackage;

/* renamed from: e60  reason: default package */
public final class e60 extends ij0 {
    public final long b;
    public final int c;
    public final long o;

    public e60(int i, long j, long j2) {
        this.c = i;
        this.b = j;
        this.o = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaybackEvent{type=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", chatId=");
        return i2a.j(sb, this.o, '}');
    }
}
