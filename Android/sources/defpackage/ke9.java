package defpackage;

/* renamed from: ke9  reason: default package */
public final class ke9 extends ne9 {
    public final long c;

    public ke9(long j) {
        super(j, 3);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke9) && this.c == ((ke9) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChatId(chatId="), this.c, ")");
    }
}
