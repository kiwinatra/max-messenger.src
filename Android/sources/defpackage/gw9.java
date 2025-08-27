package defpackage;

/* renamed from: gw9  reason: default package */
public final class gw9 extends hj0 implements gea {
    public final long c;

    public gw9(long j, qaf qaf, long j2) {
        super(j, qaf);
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final String toString() {
        return i2a.j(new StringBuilder("MsgSendError{chatId="), this.c, '}');
    }
}
