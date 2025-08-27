package defpackage;

/* renamed from: db2  reason: default package */
public final class db2 extends ij0 {
    public final long b;
    public final Long c;
    public final String o = null;

    public db2(long j, Long l) {
        this.b = j;
        this.c = l;
    }

    public final String toString() {
        String ij0 = super.toString();
        return "ChatLastReactionUpdatedEvent{chatId=" + this.b + "'lastReactionMessageId=" + this.c + "', lastReaction=" + this.o + "}" + ij0;
    }
}
