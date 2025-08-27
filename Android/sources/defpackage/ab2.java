package defpackage;

/* renamed from: ab2  reason: default package */
public final class ab2 extends ij0 {
    public final String b;
    public final long c;
    public final int o;

    public ab2(int i, long j, long j2, String str) {
        super(j);
        this.b = str;
        this.c = j2;
        this.o = i;
    }

    public final String toString() {
        return "ChatJoinEvent{link='" + this.b + "', chatId=" + this.c + ", type=" + a81.B(this.o) + '}' + super.toString();
    }
}
