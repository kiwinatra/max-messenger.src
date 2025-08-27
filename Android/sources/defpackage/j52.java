package defpackage;

/* renamed from: j52  reason: default package */
public final class j52 extends ij0 {
    public final long b;

    public j52(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j52) && this.b == ((j52) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("ChatClearEvent(chatId="), this.b, ")");
    }
}
